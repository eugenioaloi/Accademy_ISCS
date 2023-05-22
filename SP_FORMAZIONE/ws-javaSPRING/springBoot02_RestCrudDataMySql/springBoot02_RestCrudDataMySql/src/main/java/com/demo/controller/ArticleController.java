package com.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.demo.entity.Article;
import com.demo.service.IArticleService;

@RestController
@RequestMapping(path= "springboot02")
public class ArticleController {
	
	@Autowired
	private IArticleService articleService;
	
	//Fetches article by id
	@GetMapping(value= "article/{id}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArticleInfo> getArticleById(@PathVariable("id") Integer id) {
		ArticleInfo ob = new ArticleInfo();
		if (!articleService.existsById(id)) {
			return new ResponseEntity<ArticleInfo>(ob, HttpStatus.NOT_FOUND);
		}
		BeanUtils.copyProperties(articleService.getArticleById(id), ob);
		return new ResponseEntity<ArticleInfo>(ob, HttpStatus.OK);
	}
	
	//Fetches article by id XML
	@GetMapping(value= "articleXml/{id}", produces= { MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Article> getArticleByIdXml(@PathVariable("id") Integer id) {
		Article article = new Article();
		article = articleService.getArticleById(id);
		if (!articleService.existsById(id)) {
			return new ResponseEntity<Article>(article, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}
	
	//Fetches article by id XML 
	@GetMapping(value= "articleXmlPlain/{id}", produces= { MediaType.APPLICATION_XML_VALUE})
	public Article getArticleByIdXmlPlain(@PathVariable("id") Integer id) {
		return articleService.getArticleById(id);
	}
	
	//Fetches article by id Text 
	@GetMapping("articleText/{id}")
	public String getArticleByIdText(@PathVariable("id") Integer id) {
		return articleService.getArticleById(id).toString();
	}
	
	@GetMapping(value = "pdf/{fileName}", produces= { MediaType.APPLICATION_PDF_VALUE})
    public ResponseEntity<InputStreamResource> getPdf(@PathVariable("fileName") String fileName) 
    		                                           throws FileNotFoundException {

        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
        headers.add("content-disposition", "inline; filename=" +fileName);
        
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        return ResponseEntity.ok()
                .headers(headers)
 //             .contentType(MediaType.parseMediaType("application/pdf"))  
                .contentLength(file.length())
                .body(resource);
    }	
	
	@GetMapping(value = "pdf2/{fileName}", produces= { MediaType.APPLICATION_PDF_VALUE})
    public ResponseEntity<InputStreamResource> getPdf2(@PathVariable("fileName") String fileName) 
    		            throws FileNotFoundException {

        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
        headers.add("content-disposition", "inline; filename=" +fileName);
        
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        return ResponseEntity
        		.status(HttpStatus.OK)
                .headers(headers)
                .contentType(MediaType.parseMediaType("application/pdf"))  // Sconsigliato!!
                .contentLength(file.length())
                .body(resource);
    }	
	
	@GetMapping(value = "pdf3/{fileName}", produces= { MediaType.APPLICATION_PDF_VALUE})
    public ResponseEntity<InputStreamResource> getPdf3(@PathVariable("fileName") String fileName) 
    		            throws FileNotFoundException {

        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
        headers.add("content-disposition", "inline; filename=" +fileName);
        
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        return ResponseEntity
        		.status(HttpStatus.OK)
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .contentLength(file.length())
                .body(resource);
    }	
	
	@GetMapping("pdf4/{fileName}")
    public ResponseEntity<InputStreamResource> getPdf4(@PathVariable("fileName") String fileName) 
    		throws FileNotFoundException {

        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
//      headers.add("content-disposition", "inline; filename=" +fileName);
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" +fileName);
        
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        return ResponseEntity
        		.status(HttpStatus.OK)
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .contentLength(file.length())
                .body(resource);
    }	

	@GetMapping(value = "pdf5/{fileName}", produces= { MediaType.APPLICATION_PDF_VALUE})
    public ResponseEntity<ByteArrayResource> getPdf5(@PathVariable("fileName") String fileName) 
    		throws IOException {

        File filePdf = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
        headers.add("content-disposition", "inline; filename=" +fileName);
        
        // Load pdf in array di bytes
        byte[] pdfBytes = Files.readAllBytes(filePdf.toPath());
        ByteArrayResource resource = new ByteArrayResource(pdfBytes);

        return ResponseEntity
        		.status(HttpStatus.OK)
                .headers(headers)
                .contentLength(filePdf.length())
                .body(resource)
                ;
    }	

	@GetMapping(value = "pdf6/{fileName}", produces= { MediaType.APPLICATION_PDF_VALUE})
    public ResponseEntity<byte[]> getPdf6(@PathVariable("fileName") String fileName) 
    		throws IOException {

        File filePdf = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
        headers.add("content-disposition", "inline; filename=" +fileName);
        
        // Load pdf in array di bytes
        byte[] pdfBytes = Files.readAllBytes(filePdf.toPath());
        ByteArrayResource resource = new ByteArrayResource(pdfBytes);

        return ResponseEntity
        		.status(HttpStatus.OK)
                .headers(headers)
                .contentLength(filePdf.length())
                .body(pdfBytes)
                ;
    }	

	@GetMapping(value = "pdfDownload/{fileName}")
    public ResponseEntity<InputStreamResource> getPdfDownload(@PathVariable("fileName") String fileName) 
    		throws FileNotFoundException {

        File file = new File(fileName);
        HttpHeaders headers = new HttpHeaders();      
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
       
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
         
        return ResponseEntity
        		.status(HttpStatus.OK)
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .contentLength(file.length())
                .body(resource);
    }	
	
	//Fetches all articles 
	@GetMapping(value= "articles", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<ArticleInfo>> getAllArticles() {
		List<ArticleInfo> responseArticleList = new ArrayList<>();
		List<Article> articleList = articleService.getAllArticles();
		for (int i = 0; i < articleList.size(); i++) {
			ArticleInfo ob = new ArticleInfo();
		    BeanUtils.copyProperties(articleList.get(i), ob);
		    responseArticleList.add(ob);    
		}
		return new ResponseEntity<List<ArticleInfo>>(responseArticleList, HttpStatus.OK);
	}
	
	//Creates a new article
	@PostMapping(value= "article", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> addArticle(@RequestBody ArticleInfo articleInfo
			                                         , UriComponentsBuilder builder) {
		Article article = new Article();
		BeanUtils.copyProperties(articleInfo, article);
		boolean flag = articleService.addArticle(article);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/article/{id}")
			   .buildAndExpand(article.getArticleId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	//Updates article
	@PutMapping(value= "article", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArticleInfo> updateArticle(@RequestBody ArticleInfo articleInfo) {
		Article article = new Article();
		BeanUtils.copyProperties(articleInfo, article);		
		ArticleInfo ob = new ArticleInfo();
		BeanUtils.copyProperties(article, ob);
		if (!articleService.existsById(articleInfo.getArticleId())) {
			return new ResponseEntity<ArticleInfo>(ob, HttpStatus.NOT_FOUND);
		}	
		articleService.updateArticle(article);		
		return new ResponseEntity<ArticleInfo>(ob, HttpStatus.OK);
	}
	
	//Deletes article by id
	@DeleteMapping(value= "article/{id}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id, UriComponentsBuilder builder) {
		if (!articleService.existsById(id)) {
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(builder.path("/article/{id}").buildAndExpand(id).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.NOT_FOUND);
		}
		articleService.deleteArticle(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
} 