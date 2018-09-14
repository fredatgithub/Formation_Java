package domaine;


import junit.framework.TestCase;

public class TestUrlParser extends TestCase {

	UrlParser parserA = null;
	
	protected void setUp() throws Exception {
		parserA = new UrlParser("http://www.google.fr/search?q=NetBeans+JUnit&hl=fr&lr=&client=firefox-a");
	}

	protected void tearDown() throws Exception {
	}

	public void testUrlParser() {
		//fail("Not yet implemented");
	}

	public void testGetUrl() {
		//fail("Not yet implemented");
		//GetUrl doit nous renvoyer la même URL que celle
		//utilisée dans le constructeur
		String str = "http://www.google.fr/search?q=NetBeans+JUnit&hl=fr&lr=&client=firefox-a";
		assertEquals(str , parserA.getUrl());
	}

	public void testSetUrl() {
		//fail("Not yet implemented");
	}

	public void testParseParam() {
		//fail("Not yet implemented");
		java.util.Hashtable result = parserA.parseParam();
		//la hashtable ne doit pas être vide
		assertTrue( ! result.isEmpty() );
		// la hashtable doit contenir une clé :"lr"
		assertTrue( result.containsKey("lr") );
		// la hashtable doit contenir 4 paramètres
		assertEquals(4, result.size() );
		// la valeur de la clé "client" doit être égale à "firefox-a"
		assertEquals("firefox-a", result.get("client"));
	}
}