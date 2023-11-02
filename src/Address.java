
public class Address {
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String state;
    private String pin;
    public Address(String addressString) {
        String[] addressParts = addressString.split("\\$");
        if (addressParts.length == 6) {
            this.line1 = addressParts[0];
            this.line2 = addressParts[1];
            this.line3 = addressParts[2];
            this.city = addressParts[3];
            this.state = addressParts[4];
            this.pin = addressParts[5];
        } else {
            System.err.println("Invalid address string format");
        }
    }
    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return line1 + "$" + line2 + "$" + line3 + "$" + city + "$" + state + "$" + pin;
    }

    public static void main(String[] args) {
        String inputAddress = "123 Main St$Apt 4B$Some Town$New York$NY$10001";
        Address address = new Address(inputAddress);

        System.out.println("Line 1: " + address.getLine1());
        System.out.println("Line 2: " + address.getLine2());
        System.out.println("Line 3: " + address.getLine3());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Pin: " + address.getPin());

        System.out.println("Full Address: " + address.toString());
    }
}