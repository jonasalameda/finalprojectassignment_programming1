package org.jonas;

import lombok.*;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String city, String province, String country, String postalCode) {
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = isPostalCodeValid(postalCode) ? postalCode : null;
    }

    /**
     * checks if a postal code is valid or not, a valid postal code can only have two formats
     * if the length is 6, then it is CDCDCD
     * if the length is 7 then it is CDC DCD
     * where C is a character and D is a digit (num)
     * @param postalCode postal code given in String, should length of 6 or 7
     * @return if the postal code is valid or not
     */
    public static boolean isPostalCodeValid(String postalCode) {
        if (postalCode.length() == 6) {
            return Character.isAlphabetic(postalCode.charAt(0)) &&
            Character.isDigit(postalCode.charAt(1)) &&
            Character.isAlphabetic(postalCode.charAt(2)) &&
            Character.isDigit(postalCode.charAt(3)) &&
            Character.isAlphabetic(postalCode.charAt(4)) &&
            Character.isDigit(postalCode.charAt(5));
        }
        if (postalCode.length() == 7) {
            return Character.isAlphabetic(postalCode.charAt(0)) &&
                    Character.isDigit(postalCode.charAt(1)) &&
                    Character.isAlphabetic(postalCode.charAt(2)) &&
                    Character.isWhitespace(postalCode.charAt(3)) &&
                    Character.isDigit(postalCode.charAt(4)) &&
                    Character.isAlphabetic(postalCode.charAt(5)) &&
                    Character.isDigit(postalCode.charAt(6));
        }
        return false;
    }
}
