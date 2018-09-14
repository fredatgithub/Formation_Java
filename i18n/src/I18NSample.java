import java.util.*;

import javax.swing.JOptionPane;

public class I18NSample {

    static public void main(String[] args) {

        String language = null;
        String country = null;

        try{
	        language = JOptionPane.showInputDialog("Langue (Anglais = en)");
	        country = JOptionPane.showInputDialog("Pays (Angleterre = GB)");
	
	        Locale currentLocale = null;
	        ResourceBundle messages = null;
	
	        currentLocale = new Locale(language, country);
	
	        messages = ResourceBundle.getBundle("i18n/MessagesBundle", currentLocale);
	        System.out.println( messages.getString("greetings") );
	        System.out.println( messages.getString("inquiry") );
	        System.out.println( messages.getString("farewell") );
	        
        }catch(MissingResourceException e){
        	System.out.println("Cette langue n'est pas support\u00e9 !");
        }
    }
}