package logicielJdR.web.viewmodel;

public class SignInViewModel {

	private String nom, prenom, mail, mailConfirm, login, password;


	/**
	 * Constructeur vide
	 */
	public SignInViewModel() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMailConfirm() {
		return mailConfirm;
	}

	public void setMailConfirm(String mailConfirm) {
		this.mailConfirm = mailConfirm;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
