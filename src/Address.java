public class Address {

		String fullAddress, street, aptUnit, city, state, zipCode;

		public Address(String street, String aptUnit, String city, String state, String zipCode) {
				this.street = street;
				this.aptUnit = aptUnit;
				this.city = city;
				this.state = state;
				this.zipCode = zipCode;
		}

		public String getFullAddress() {
				return fullAddress;
		}

		public void setFullAddress(String fullAddress) {
				this.fullAddress = fullAddress;
		}

		public String getStreet() {
				return street;
		}

		public void setStreet(String street) {
				this.street = street;
		}

		public String getAptUnit() {
				return aptUnit;
		}

		public void setAptUnit(String aptUnit) {
				this.aptUnit = aptUnit;
		}

		public String getCity() {
				return city;
		}

		public void setCity(String city) {
				this.city = city;
		}

		public String getState() {
				return state;
		}

		public void setState(String state) {
				this.state = state;
		}

		public String getZipCode() {
				return zipCode;
		}

		public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
		}

}
