package test;

import org.apache.log4j.Logger;

import prefecture.Voiture;

public class Lanceur {

	//private static Logger log = Logger.getLogger(Voiture.class);
	
	public static void main(String[] args) {
		Voiture v = new Voiture();
		
		System.out.println("exo5-Voiture de " + v.getPuissance() + " chevaux");
		
//		System.out.println("Classpath: [" + System.getProperty( "java.class.path" ) + "]" );
//	    System.out.println("Found logging configuration files:");
//	    System.out.println("  log4j.xml: " + Logger.getRootLogger().getClass().getResource( "/log4j.xml" ) );
//	    System.out.println("  log4j.properties: " + Logger.getRootLogger().getClass().getResource( "/log4j.properties" ) );
	  
	}
}