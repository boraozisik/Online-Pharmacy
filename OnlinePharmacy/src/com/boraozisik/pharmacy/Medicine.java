package com.boraozisik.pharmacy;

public class Medicine {
		
	private String medicineName;
	private int medicinePrice;
	private String �nstructions;
	
	
	public Medicine(String medicineName, int medicinePrice, String �nstructions) {
		super();
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		this.�nstructions = �nstructions;
	}


	public String getMedicineName() {
		return medicineName;
	}


	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}


	public int getMedicinePrice() {
		return medicinePrice;
	}


	public void setMedicinePrice(int medicinePrice) {
		this.medicinePrice = medicinePrice;
	}


	public String getInstructions() {
		return �nstructions;
	}


	public void setInstructions(String �nstructions) {
		this.�nstructions = �nstructions;
	}
	
	public void showMedicineFeatures() {
		System.out.println("Medicine Name:" +this.medicineName);
		System.out.println("Medicine Price:" +this.medicinePrice);
		System.out.println("Medicine Instructions:" +this.�nstructions);
	}
	
}
