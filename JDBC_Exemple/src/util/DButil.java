package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entites.Contact;

public class DButil {

	public void saveContact(final Contact contact) {
		System.out.println("L'employe " + contact.getPrenom() + " " + contact.getNom()
				+ "est sur le point d'�tre cr�er en base de donn�es ");

		String driver = "com.mysql.jdbc.Driver";
		String mysqlUser = "root";
		String mysqlPassword = "root";
		Connection cn = null;
		Statement st = null;

		try {
			/*
			 * 1.Chargement d'un driver Mysql
			 */
			Class.forName(driver);

			/*
			 * 2.Le driverManager tente d'instancier une connexion vers la base,
			 * en utilisant le driver instanci� pr�c�demment
			 */
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ContactSimple", mysqlUser, mysqlPassword);

			/*
			 * 3.Cr�ation d'un objet Statement
			 */
			st = cn.createStatement();

			/*
			 * 4.L'objet statement ex�cute la requ�te et retourne les r�sultats
			 * dans un objet ResultSet
			 */
			int i = st.executeUpdate("insert into Contacts (id, nom, prenom, email)" + "values (" + contact.getId()
					+ ", '" + contact.getNom() + "', '" + contact.getPrenom() + "', '" + contact.getEmail() + "');");
			System.out.println("Nombre de ligne(s) ins�r�e(s) dans la BDD: " + i);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				/*
				 * Lib�ration des ressources
				 */
				if (st != null) {
					st.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void getListContacts() {

		System.out.println("Affichage des contacts de ");
		String driver = "com.mysql.jdbc.Driver";
		String mysqlUser = "root";
		String mysqlPassword = "root";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			/*
			 * 1.Chargement d'un driver Mysql
			 */
			Class.forName(driver);

			/*
			 * 2.Le driverManager tente d'instancier une connexion vers la base,
			 * en utilisant le driver instanci� pr�c�demment
			 */
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ContactSimple", mysqlUser, mysqlPassword);

			/*
			 * 3.Cr�ation d'un objet Statement
			 */
			st = cn.createStatement();

			/*
			 * 4.L'objet statement ex�cute la requ�te et retourne les r�sultats
			 * dans un objet ResultSet
			 */
			rs = st.executeQuery("SELECT * from Contacts");

			Contact contact = new Contact();

			while (rs.next()) {

				contact.setId(rs.getInt("id"));
				contact.setNom(rs.getString("nom"));
				contact.setPrenom(rs.getString("prenom"));
				contact.setEmail(rs.getString("email"));

				System.out.println(contact);
			}

		} catch (SQLException e) {
			/*
			 * Traitement des erreurs SQL (connection � la base, ex�cution de la requ�te ...)
			 */
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			/*
			 * Traitement des erreurs li�es au Class.forName(), par exemple si
			 * la classe pass�e en param�tre n'existe pas ou n'est pas dans le classpath
			 */
			e.printStackTrace();
		} finally {
			/*
			 * Lib�ration des ressources
			 */
			try {
				/*
				 * S'il y a eu une erreur/exception, il faut quand m�me lib�rer les
				 * ressources mais elles peuvent d�j� l'�tre (�tre null) d'o� le test
				 */
				if (st != null) {
					st.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (SQLException e) {
				/*
				 * Erreur lors de la lib�ration des ressources
				 */
				e.printStackTrace();
			}
		}
	}
}