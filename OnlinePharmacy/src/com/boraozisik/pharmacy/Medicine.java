package com.boraozisik.pharmacy;

public class Medicine {
		
	private String medicineName;
	private int medicinePrice;
	private String ýnstructions;
	
	
	public Medicine(String medicineName, int medicinePrice, String ýnstructions) {
		super();
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		this.ýnstructions = ýnstructions;
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
		return ýnstructions;
	}


	public void setInstructions(String ýnstructions) {
		this.ýnstructions = ýnstructions;
	}
	
	public void showMedicineFeatures() {
		System.out.println("Medicine Name:" +this.medicineName);
		System.out.println("Medicine Price:" +this.medicinePrice);
		System.out.println("Medicine Instructions:" +this.ýnstructions);
	}
	
}
