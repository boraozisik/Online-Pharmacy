package com.boraozisik.pharmacy;

import java.util.ArrayList;



public class Patient {
	private String patientName;
	private String patientPassword;
	private String patientIdentityNumber;
	private Prescription prescription;
	private CreditCard patientCreditCard;
	private boolean isOnline;
	private ArrayList<Medicine> orderedMedicines;
	private int totalPrice;
	private boolean isOrdered;
	
	public Patient(String patientName,String patientPassword, String patientIdentityNumber, Prescription prescription,CreditCard creditCard) {
		super();
		this.patientName = patientName;
		this.patientPassword = patientPassword;
		this.patientIdentityNumber = patientIdentityNumber;
		this.prescription = prescription;
		this.patientCreditCard = creditCard;
		this.orderedMedicines = new ArrayList<Medicine>();
		this.totalPrice = 0;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public Prescription getPrescription() {
		return prescription;
	}


	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}
	
	
	public String getPatientPassword() {
		return patientPassword;
	}


	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}


	public String getPatientIdentityNumber() {
		return patientIdentityNumber;
	}


	public void setPatientIdentityNumber(String patientIdentityNumber) {
		this.patientIdentityNumber = patientIdentityNumber;
	}


	public CreditCard getPatientCreditCard() {
		return patientCreditCard;
	}


	public void setPatientCreditCard(CreditCard patientCreditCard) {
		this.patientCreditCard = patientCreditCard;
	}


	public boolean isOnline() {
		return isOnline;
	}


	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}


	public ArrayList<Medicine> getOrderedMedicines() {
		return orderedMedicines;
	}


	public void setOrderedMedicines(ArrayList<Medicine> orderedMedicines) {
		this.orderedMedicines = orderedMedicines;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public boolean loginToSystem(String patientName, String patientIdentityNumber,String patientPassword) {  
    	if(isOnline == true) {
    		System.out.println("You are already logged in...");
	}
    	else if(patientName.equals(this.patientName) & patientIdentityNumber.equals(this.patientIdentityNumber) & patientPassword.equals(this.patientPassword)) { 
    		isOnline = true;
    		System.out.println("Login successful , Welcome!!!");
    	}
    	else {
    		System.out.println(" Login unsuccessful , wrong password or username or identity number...");
    	}
    	return this.isOnline;
    }
	
	public void addToOrderedMedicines(Medicine medicine) {
		this.orderedMedicines.add(medicine);
	}
	public void showOrderedMedicines() {
		for(Medicine medicine: this.orderedMedicines) {
			medicine.showMedicineFeatures();
		}
	}
	
	public void orderYourPrescription() {
		if(this.isOnline == false) {
			System.out.println("You must login to system first!");
		}
		else {
			for(Medicine medicine: this.prescription.getMedicines()) {			
				this.totalPrice += medicine.getMedicinePrice();												
			}
			if(this.patientCreditCard.getBalance() < this.totalPrice ) {
				System.out.println("Insufficient Balance!!!");
			}
			else {
				for(Medicine medicine: prescription.getMedicines()) {			
					this.addToOrderedMedicines(medicine);										
				}
			}
		}
	}
	

}
