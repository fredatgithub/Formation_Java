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
				+ "est sur le point d'être créer en base de données ");

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
			 * en utilisant le driver instancié précédemment
			 */
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ContactSimple", mysqlUser, mysqlPassword);

			/*
			 * 3.Création d'un objet Statement
			 */
			st = cn.createStatement();

			/*
			 * 4.L'objet statement exécute la requête et retourne les résultats
			 * dans un objet ResultSet
			 */
			int i = st.executeUpdate("insert into Contacts (id, nom, prenom, email)" + "values (" + contact.getId()
					+ ", '" + contact.getNom() + "', '" + contact.getPrenom() + "', '" + contact.getEmail() + "');");
			System.out.println("Nombre de ligne(s) insérée(s) dans la BDD: " + i);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				/*
				 * Libération des ressources
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
			 * en utilisant le driver instancié précédemment
			 */
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ContactSimple", mysqlUser, mysqlPassword);

			/*
			 * 3.Création d'un objet Statement
			 */
			st = cn.createStatement();

			/*
			 * 4.L'objet statement exécute la requête et retourne les résultats
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
			 * Traitement des erreurs SQL (connection à la base, exécution de la requête ...)
			 */
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			/*
			 * Traitement des erreurs liées au Class.forName(), par exemple si
			 * la classe passée en paramètre n'existe pas ou n'est pas dans le classpath
			 */
			e.printStackTrace();
		} finally {
			/*
			 * Libération des ressources
			 */
			try {
				/*
				 * S'il y a eu une erreur/exception, il faut quand même libérer les
				 * ressources mais elles peuvent déjà l'être (être null) d'où le test
				 */
				if (st != null) {
					st.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (SQLException e) {
				/*
				 * Erreur lors de la libération des ressources
				 */
				e.printStackTrace();
			}
		}
	}
}