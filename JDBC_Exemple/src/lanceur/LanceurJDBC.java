package lanceur;


import entites.Contact;
import util.DButil;

public class LanceurJDBC {

	
	public static void main(String[] args) {
	Contact contact=new Contact(15,"Blanc","Xavier","reda@mail.com");
	DButil dbu=new DButil();
	dbu.saveContact(contact);
	dbu.getListContacts();
	}
}
