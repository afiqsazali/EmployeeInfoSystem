public class Name {

		String firstname;
		String lastname;

		public Name(String firstname, String lastname) {
				this.firstname = firstname;
				this.lastname = lastname;
		}

		public String getFullname() {

				String fullname;

				fullname = firstname + " " + lastname;

				return fullname;
		}

		public String getFirsname() {
				return firstname;
		}

		public void setFirsname(String firsname) {
				this.firstname = firsname;
		}

		public String getLastname() {
				return lastname;
		}

		public void setLastname(String lastname) {
				this.lastname = lastname;
		}



}
