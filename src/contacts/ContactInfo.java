package contacts;

public class ContactInfo {
    private String name;
    private String number;

    protected ContactInfo(String aName, String aNumber) {
        this.name = aName;
        this.number = aNumber;
    }

    public String getName() {return this.name;}
    public String getNumber() {return this.number;}

    public void setName(String contactName) {
        this.name = contactName;
    }
    public void setNumber(String contactNumber) {
        this.number = contactNumber;
    }


}
