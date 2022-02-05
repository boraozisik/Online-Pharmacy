package com.boraozisik.pharmacy;

public class Test {

	public static void main(String[] args) {
		Medicine medicine1 = new Medicine("Apranax", 18, "1 dose in the morning-1 dose at the night");
		Medicine medicine2 = new Medicine("Majezik", 17, "1 dose in the morning-1 dose at the night");
		Medicine medicine3 = new Medicine("Dolarex", 18, "1 dose in the morning-1 dose at the night");
		Medicine medicine4 = new Medicine("Parol", 19, "1 dose in the morning-1 dose at the night");
		Medicine medicine5 = new Medicine("Novalgin", 18, "1 dose in the morning-1 dose at the night");
		Prescription prescription1 = new Prescription("123456", medicine1, medicine2, medicine3, medicine4, medicine5);
		CreditCard creditCard = new CreditCard("4567890345", "123", "11.12.2026", 100);
		Patient patient1 = new Patient("Bora", "123", "123456789", prescription1, creditCard);
		
		patient1.loginToSystem("Bora", "123456789", "123");
		patient1.orderYourPrescription();
		patient1.showOrderedMedicines();
	}

}
