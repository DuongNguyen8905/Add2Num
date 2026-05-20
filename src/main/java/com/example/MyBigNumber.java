package com.example;

public class MyBigNumber {

    public String sum (String stn1,String stn2){

        StringBuilder result = new StringBuilder();

        int i = stn1.length() - 1;
        int j = stn2.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int digit1 = (i >= 0)
                    ? stn1.charAt(i) - '0'
                    : 0;

            int digit2 = (j >= 0)
                    ? stn2.charAt(j) - '0'
                    : 0;

            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);

            carry = sum / 10;

            System.out.println(
                    "Step: "
                            + digit1
                            + " + "
                            + digit2
                            + " carry="
                            + carry
            );

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
