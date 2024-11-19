package com.challenge.easy.string;

/**
    # Defanging an IP Address

     Given a valid (IPv4) IP address, return a defanged version of that IP address.

     A defanged IP address replaces every period "." with "[.]".

     Example 1:
         Input: address = "1.1.1.1"
         Output: "1[.]1[.]1[.]1"

     Example 2:
         Input: address = "255.100.50.0"
         Output: "255[.]100[.]50[.]0"

     Constraints:

        * The given address is a valid IPv4 address.

 */
public class DefangingIpAddress {

    public static String defangIPaddr(String address) {
        String[] addressSections = address.split("\\.");
        StringBuilder defangBuilder = new StringBuilder();
        defangBuilder.append(addressSections[0]);
        for (int i = 1; i < addressSections.length; i++) {
            String section = addressSections[i];
            defangBuilder.append("[.]")
                    .append(section);
        }
        return defangBuilder.toString();
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";
        String res = defangIPaddr(address);
        System.out.println(res);
    }
}
