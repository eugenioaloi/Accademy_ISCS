package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  
@ConfigurationProperties(prefix = "database")
@PropertySource(value = { "classpath:database.properties" })
public class Database {
	private String url;
	private String username;
	private String password;	
    private List<String> mySqlMail;
    private Map<String, String> additionalInfo;
	private ServerNested serverNested;
    
    
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getMySqlMail() {
		return mySqlMail;
	}
	public void setMySqlMail(List<String> mySqlMail) {
		this.mySqlMail = mySqlMail;
	}
	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public ServerNested getServerNested() {
		return serverNested;
	}
	public void setServerNested(ServerNested serverNested) {
		this.serverNested = serverNested;
	}	
}
