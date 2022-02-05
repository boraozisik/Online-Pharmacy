package com.boraozisik.pharmacy;

public class CreditCard {
		private String creditCardNumber;
		private String securityCode;
		private String expirationDate;
		private int balance;
		
		public CreditCard(String creditCardNumber, String securityCode, String expirationDate,int balance) {
			super();
			this.creditCardNumber = creditCardNumber;
			this.securityCode = securityCode;
			this.expirationDate = expirationDate;
			this.balance = balance;
		}

		public String getCreditCardNumber() {
			return creditCardNumber;
		}

		public void setCreditCardNumber(String creditCardNumber) {
			this.creditCardNumber = creditCardNumber;
		}

		public String getSecurityCode() {
			return securityCode;
		}

		public void setSecurityCode(String securityCode) {
			this.securityCode = securityCode;
		}

		public String getExpirationDate() {
			return expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		
		
}
