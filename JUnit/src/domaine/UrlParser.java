package domaine;

import java.net.URL;
import java.util.Hashtable;

/**
 * URL parser.
 *
 */
public class UrlParser {
	/**
	 * The URL that can be parsed
	 */	
	private String url = null;

	/**
	 * Constructor
	 * @param url the url to parse
	 */
	public UrlParser(String url) {
		this.setUrl(url);
	}

	/**
	 * URL Getter
	 * @return the URL
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * URL Setter
	 * @param url the new URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * <b>Parse a URL:</b>
	 * Look for parameters into the URL
	 * Parameter format is : <i>parameter name</i>=<i>parameter value</i>
	 * Parameters are separated by the character '&' delimiter
	 * @return a Hashtable <br> The Hashtable contains:
	 * 	<li>parameters's name as key</li>
	 * 	<li>parameters's value as value</li>
	 * <br> Return null in case the URL is not well-formed
	 */
	public Hashtable parseParam() {
		//Hastable creation
		Hashtable params = new Hashtable();
		URL aURL = null;
		//URL creation
		try {
			aURL = new URL(url);
		} catch (java.net.MalformedURLException e) {
			//In case the URL is not well-formed return value is null
			return null;
		}
		String querry = aURL.getQuery();
		if (querry == null) {
			return params;
		}
		//Split the URL by '&' character
		String[] paramList = querry.split("&");
		for (int i = 0, n = paramList.length; i < n; i++) {
			String paramString = paramList[i];
			String[] keyEgalValue = paramString.split("=");
			String key = "";
			String value = "";
			if (keyEgalValue.length == 2) {
				key = keyEgalValue[0];
				value = keyEgalValue[1];
				params.put(key, value);
			}
			if (keyEgalValue.length == 1) {
				key = keyEgalValue[0];
				params.put(key, value);
			}
		}
		
		return params;
	}
}