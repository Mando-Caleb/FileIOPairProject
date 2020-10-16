package contacts;

public class ContactInfo {
    private String name;
    private int number;

    protected ContactInfo(String aName, int aNumber) {
        this.name = aName;
        this.number = aNumber;
    }

    public String getName() {return this.name;}
    public int getNumber() {return this.number;}



}
