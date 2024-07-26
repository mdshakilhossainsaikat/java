package com.valluk.again;

public class numberconvertion {

    public static void main(String[] args) {

        System.out.println("---Binary to---");
        String binary1 = "10110";
        Integer decimal1 = Integer.parseInt(binary1, 2);
        Integer octal3 = Integer.parseInt(binary1, 2);
        System.out.println("Binary number: " + binary1 + "\tDecimal number: " + decimal1);
        System.out.println("octal3: "+octal3);

        System.out.println("\n---Octal to---");
        String octal1 = "567";
        Integer decimal2 = Integer.parseInt(octal1, 8);
        System.out.println("Octal number: " + octal1 + "\tDecimal number: " + decimal2);

        System.out.println("\n---Hexadecimal to---");
        String hexa1 = "ABC";
        Integer decimal3 = Integer.parseInt(hexa1, 16);
        System.out.println("Hexa number: " + hexa1 + "\tDecimal number: " + decimal3);

        System.out.println("\n---Decimal to---");
        String binary2 = Integer.toBinaryString(decimal1);
        String octal2 = Integer.toOctalString(decimal2);
        String hexa2 = Integer.toHexString(decimal3);
        System.out.println("Decimal number: " + decimal1 + "\tBinary number: " + binary2);
        System.out.println("Decimal number: " + decimal2 + "\tOctal number: " + octal2);
        System.out.println("Decimal number: " + decimal3 + "\tHexa number: " + hexa2);
    }
}
