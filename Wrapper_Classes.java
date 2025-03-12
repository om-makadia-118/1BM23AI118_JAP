public class Wrapper_Classes {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer boxedInt = primitiveInt;

        float primitiveFloat = 5.5f;
        Float boxedFloat = primitiveFloat;

        byte primitiveByte = 100;
        Byte boxedByte = primitiveByte;

        char primitiveChar = 'A';
        Character boxedChar = primitiveChar;

        int unboxedInt = boxedInt;
        float unboxedFloat = boxedFloat;
        byte unboxedByte = boxedByte;
        char unboxedChar = boxedChar;

        System.out.println("Boxing and Unboxing Demo:");
        System.out.println("Boxed Integer: " + boxedInt + " --> Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Float: " + boxedFloat + " --> Unboxed Float: " + unboxedFloat);
        System.out.println("Boxed Byte: " + boxedByte + " --> Unboxed Byte: " + unboxedByte);
        System.out.println("Boxed Character: " + boxedChar + " --> Unboxed Character: " + unboxedChar);
    }
}

/*
Output:

Boxing and Unboxing Demo:
Boxed Integer: 10 --> Unboxed Integer: 10
Boxed Float: 5.5 --> Unboxed Float: 5.5
Boxed Byte: 100 --> Unboxed Byte: 100
Boxed Character: A --> Unboxed Character: A
 */