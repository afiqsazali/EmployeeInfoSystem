public class Spouse {

		String spouseName, spouseEmployer;
		int spouseNumber;

		public Spouse(String spouseName, String spouseEmployer, int spouseNumber) {

				this.spouseName = spouseName;
				this.spouseEmployer = spouseEmployer;
				this.spouseNumber = spouseNumber;
		}

		public String getSpouseName() {
				return spouseName;
		}

		public void setSpouseName(String spouseName) {
				this.spouseName = spouseName;
		}

		public String getSpouseEmployer() {
				return spouseEmployer;
		}

		public void setSpouseEmployer(String spouseEmployer) {
				this.spouseEmployer = spouseEmployer;
		}

		public int getSpouseNumber() {
				return spouseNumber;
		}

		public void setSpouseNumber(int spouseNumber) {
				this.spouseNumber = spouseNumber;
		}

}
