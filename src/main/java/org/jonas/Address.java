package org.jonas;

import lombok.*;

@Getter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String city, String province, String country) {
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    /**
     * checks if a postal code is valid or not, a valid postal code can only have two formats
     * if the length is 6, then it is CDCDCD
     * if the length is 7 then it is CDC DCD
     * where C is a character and D is a digit (num)
     * @param postalCode
     * @return if a postal code is valid or not
     */
//    public static boolean isPostalCodeValid(String postalCode) {
//        Character.isAlphabetic(postalCode.charAt(0)); //and it goes on
//        Character.isDigit(postalCode.charAt(1)); // and so on
//    }
}
