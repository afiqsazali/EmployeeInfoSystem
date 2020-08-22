public class EmployeeData {

    Name name;
    Address address;
    Contact phone;
    String email;
    String govID;
    String bDay;
    String martialSts;
    Spouse spouse;

    public EmployeeData(String firstname,String lastname,String street,String aptUnit,String city, String state, String zipCode, String email,String govID,String bDay, String martialSts,String spouseName, String spouseEmployer, String spouseNumber) {

      this.name = new Name(firstname,lastname);
      this.address = new Address(street,aptUnit,city,state,zipCode);
      this.email = email;
      this.govID = govID;
      this.bDay = bDay;
      this.martialSts = martialSts;
      this.spouse = new Spouse(spouseName,spouseEmployer,spouseNumber);

    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getGovID() {
      return govID;
    }

    public void setGovID(String govID) {
      this.govID = govID;
    }

    public String getbDay() {
      return bDay;
    }

    public void setbDay(String bDay) {
      this.bDay = bDay;
    }

    public String getMartialSts() {
      return martialSts;
    }

    public void setMartialSts(String martialSts) {
      this.martialSts = martialSts;
    }

}
