public class Roi {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        sbi.getRateOfInterest();
        icici.getRateOfInterest();
        axis.getRateOfInterest();

    }
}

class SBI extends Bank {
    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of interest is 7%");
    }
}

class ICICI extends Bank {
    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of interest is 7.5%");
    }
}

class AXIS extends Bank {
    @Override
    public void getRateOfInterest() {
        System.out.println("Rate of interest is 8.5%");
    }
}

class Bank {
    public void getRateOfInterest() {
        System.out.println("Rate of interest is 8%");
    }
}