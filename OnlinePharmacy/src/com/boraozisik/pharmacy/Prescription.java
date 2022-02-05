package com.boraozisik.pharmacy;

import java.util.ArrayList;

public class Prescription {
	private String prescriptionNumber;
	private ArrayList<Medicine> medicines;

	public Prescription(String prescriptionNumber,Medicine medicine1,Medicine medicine2,Medicine medicine3,Medicine medicine4,Medicine medicine5) {
		this.prescriptionNumber = prescriptionNumber;
		this.medicines = new ArrayList<Medicine>();
		this.medicines.add(medicine1);
		this.medicines.add(medicine2);
		this.medicines.add(medicine3);
		this.medicines.add(medicine4);
		this.medicines.add(medicine5);
	}

	public ArrayList<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(ArrayList<Medicine> medicines) {
		this.medicines = medicines;
	}
	
	public int getPrescriptionSize() {
		return this.medicines.size();
	}
	public String getPrescriptionNumber() {
		return prescriptionNumber;
	}

	public void setPrescriptionNumber(String prescriptionNumber) {
		this.prescriptionNumber = prescriptionNumber;
	}

	
	
	public void showPrescription() {
		for(Medicine medicine: this.medicines) {
			medicine.showMedicineFeatures();
		}
	}
	
}
