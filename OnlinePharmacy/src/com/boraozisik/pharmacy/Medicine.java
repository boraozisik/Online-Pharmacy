package com.boraozisik.pharmacy;

public class Medicine {
		
	private String medicineName;
	private int medicinePrice;
	private String żnstructions;
	
	
	public Medicine(String medicineName, int medicinePrice, String żnstructions) {
		super();
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		this.żnstructions = żnstructions;
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
		return żnstructions;
	}


	public void setInstructions(String żnstructions) {
		this.żnstructions = żnstructions;
	}
	
	public void showMedicineFeatures() {
		System.out.println("Medicine Name:" +this.medicineName);
		System.out.println("Medicine Price:" +this.medicinePrice);
		System.out.println("Medicine Instructions:" +this.żnstructions);
	}
	
}
