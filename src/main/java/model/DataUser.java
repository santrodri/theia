package model;

public class DataUser {
	private int idDataUser;
	private int fkUser;
	private String nmCPF;
	private String nmCreditCard;
	private String nmCod;
	
	
	public int getIdDataUser() {
		return idDataUser;
	}


	public void setIdDataUser(int idDataUser) {
		this.idDataUser = idDataUser;
	}


	public String getNmCPF() {
		return nmCPF;
	}


	public void setNmCPF(String nmCPF) {
		this.nmCPF = nmCPF;
	}


	public String getNmCreditCard() {
		return nmCreditCard;
	}


	public void setNmCreditCard(String nmCreditCard) {
		this.nmCreditCard = nmCreditCard;
	}


	public String getNmCod() {
		return nmCod;
	}


	public void setNmCod(String nmCod) {
		this.nmCod = nmCod;
	}


	public int getFkUser() {
		return fkUser;
	}


	public void setFkUser(int fkUser) {
		this.fkUser = fkUser;
	}

}
