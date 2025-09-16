package interfacedemo;

public class WrapperClassDemo {

    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper class
        byte primitiveByte = 1;
        Byte wrapperByte = primitiveByte; // Autoboxing
        System.out.println("Autoboxed Byte: " + wrapperByte);
        
     // Unboxing: wrapper class to primitive
        byte unboxedByte = wrapperByte; // Unboxing
        System.out.println("Unboxed byte: " + unboxedByte);

        short primitiveShort = 2;
        Short wrapperShort = primitiveShort; // Autoboxing
        System.out.println("Autoboxed Short: " + wrapperShort);
        

        short unboxedShort = wrapperShort; // Unboxing
        System.out.println("Unboxed short: " + unboxedShort);

        int primitiveInt = 3;
        Integer wrapperInt = primitiveInt; // Autoboxing
        System.out.println("Autoboxed Integer: " + wrapperInt);
        

        int unboxedInt = wrapperInt; // Unboxing
        System.out.println("Unboxed int: " + unboxedInt);

        long primitiveLong = 4L;
        Long wrapperLong = primitiveLong; // Autoboxing
        System.out.println("Autoboxed Long: " + wrapperLong);

        long unboxedLong = wrapperLong; // Unboxing
        System.out.println("Unboxed long: " + unboxedLong);

        float primitiveFloat = 5.5f;
        Float wrapperFloat = primitiveFloat; // Autoboxing
        System.out.println("Autoboxed Float: " + wrapperFloat);
        

        float unboxedFloat = wrapperFloat; // Unboxing
        System.out.println("Unboxed float: " + unboxedFloat);

        double primitiveDouble = 6.6;
        Double wrapperDouble = primitiveDouble; // Autoboxing
        System.out.println("Autoboxed Double: " + wrapperDouble);
        

        double unboxedDouble = wrapperDouble; // Unboxing
        System.out.println("Unboxed double: " + unboxedDouble);


        char primitiveChar = 'a';
        Character wrapperChar = primitiveChar; // Autoboxing
        System.out.println("Autoboxed Character: " + wrapperChar);
        
        char unboxedChar = wrapperChar; // Unboxing
        System.out.println("Unboxed char: " + unboxedChar);

        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; // Autoboxing
        System.out.println("Autoboxed Boolean: " + wrapperBoolean);

        boolean unboxedBoolean = wrapperBoolean; // Unboxing
        System.out.println("Unboxed boolean: " + unboxedBoolean);	
	
}

}