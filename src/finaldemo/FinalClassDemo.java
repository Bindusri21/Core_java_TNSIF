package finaldemo;

// Government ID generator
class AadhaarGenerator {
    void generateID() {
        System.out.println("Generated Aadhaar card");
    }
}

class Myaadhar extends AadhaarGenerator {
    // inherits generateID() from AadhaarGenerator
}

public class FinalClassDemo {
    public static void main(String[] args) {
        // create object of child class
        Myaadhar myId = new Myaadhar();
        
        // call inherited method
        myId.generateID();
    }
}
