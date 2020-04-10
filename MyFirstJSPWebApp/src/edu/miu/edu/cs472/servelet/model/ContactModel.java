package edu.miu.edu.cs472.servelet.model;

public class ContactModel {
		private String customerName;
		private String gender;
		private String category;
		private String message;

		public ContactModel() {
			
		}

		public ContactModel(String customerName, String gender, String category, String message) {
			super();
			this.customerName = customerName;
			this.gender = gender;
			this.category = category;
			this.message = message;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return String.format("ContactMessage [customerName=%s, gender=%s, category=%s, message=%s]", customerName,
					gender, category, message);
		}
		

}
