package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import controller.GestioneAccount;
import model.User;

public class GestioneAccountTest {
	
	GestioneAccount ga = new GestioneAccount("userAccount.txt");
	int asc = 0;
	int desc = 1;
	
	@Test
	public void testAddUser() {
		assertTrue(ga.addUser("idTest01","Gianni", "Giannini", "via da qui 3"));
	}
	 
	@Test
	public void testAddMail() {
		assertTrue(ga.addMail("U056", "t.test@test.com"));
	}
	
	@Test
	public void testExistsUser() {
		assertTrue(ga.existsUser("U056"));
	}
	
	@Test
	public void testUserHasMail() {
		assertTrue(ga.userHasMail("U056"));
	}
	
	@Test
	public void testOptional() {
		
		
	}
	
	@Test
	public void arrayIdUsers() {
		//ordine crescente
		String [] idUserASC = {"U001", "U020", "U022", "U033", "U056"};
		assertArrayEquals(idUserASC, ga.idUsers(asc));
		
		//ordine decrescente
		String [] idUserDESC = {"U056", "U033", "U022", "U020", "U001"};
		assertArrayEquals(idUserDESC, ga.idUsers(desc));
	}
	
	public void arrayUsersMails() {
		String [] userMails = {"giorgio.poggi@libero.it", "giorgio.poggi@google.com", "giorgio.poggi@spformazione.com"};
		assertArrayEquals(userMails, ga.userMails("U022"));
	}
	
	@Test
	public void testArrayUser() {
		//mi devo far passare l'array con gli users
		
		
	}
	
	@Test
	public void testFirstUser() {
		User user = ga.firstUser();
		assertEquals("Alberto",user.getNome());
	}
	
	@Test
	public void testLastUser() {
		User user = ga.lastUser();
		assertEquals("Giorgio",user.getNome());
	}
	
	@Test
	public void testArrayFirstUser() {
		
	}
	@Test
	public void testArrayLastUser() {
		
	}
	
	@Test
	public void testArrayRowDiscard() {
		
	}
	@Test
	public void testArrayAllMail() {
		
	}

}
