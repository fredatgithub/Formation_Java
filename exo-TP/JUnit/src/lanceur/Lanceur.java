package lanceur;

import java.util.Enumeration;
import java.util.Hashtable;

import domaine.UrlParser;

public class Lanceur {
	
	public static void main(String args[])
	{
		String urlA = "http://www.google.fr/search?q=NetBeans+JUnit&hl=fr&lr&client=firefox-a";
		//Parser creation
		UrlParser parser = new UrlParser(urlA);
		//Parse the URL
		Hashtable result = parser.parseParam();
		//Get the hastable and display the content
		Enumeration e = result.keys();
		while(e.hasMoreElements())
		{
			String key = (String)e.nextElement();
			String value = (String)result.get(key);
			System.out.println(key +" = "+ value);
		}
	}
	
}
