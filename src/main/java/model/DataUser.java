package model;

import model.User;

public class DataUser {
	private int idDataUser;
	private int fkUser;
	private String nmCPF;
	private String nmCreditCard;
	private String nmCod;
	private User user;
	
	public String getIdDataUser() {
		return String.valueOf(idDataUser);
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


	public String getFkUser() {
		return String.valueOf(fkUser);
	}


	public void setFkUser(int fkUser) {
		this.fkUser = fkUser;
	}
	
	public void printStatus() {
		System.out.println("\nid: " + this.getIdDataUser() +
						   "\nfk: " + this.getFkUser() +
						   "\ncpf: " + this.getNmCPF() +
						   "\ncartao: "+ this.getNmCreditCard()+
						   "\ncod: " + this.getNmCod()
				);
	 }
}
