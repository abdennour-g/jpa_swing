package jpa_swing.ent;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
@Table(name = "person")
public class Person implements Serializable {
	public Person(int cin,  String nom, String prenom, String tel,String email) {
		super();
		this.cin = cin;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}


	@Override
	public String toString() {
		return  nom + " " + prenom ;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int cin;

	private String email;

	private String nom;

	private String prenom;
	
	private String tel;

	public Person(int cin, String nom, String prenom) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}


	public Person() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}