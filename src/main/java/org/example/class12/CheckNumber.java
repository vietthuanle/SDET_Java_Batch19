package org.example.class12;

public class CheckNumber {
    void compareNumbers(int num1, int num2) {
        if (num1 - num2 < 0) {
            System.out.println(num2 + " is larger than " + num1);
        } else if (num1 - num2 > 0) {
            System.out.println(num1 + " is larger than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }

    void EvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    void PalindromeCheck(String str) {
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reverse = st.toString();
        if (reverse.equals(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
    void LanguageChange(String country){
        switch (country.toLowerCase()){
            case "china":
                System.out.println("你好");
                break;
            case "vietnam":
                System.out.println("Xin Chào");
                break;
            case "korea":
                System.out.println("안녕하세요");
                break;
            case "russia":
                System.out.println("привет");
                break;
            case "japan":
                System.out.println("こんにちは");
                break;
            default:
                System.out.println("No country found");
        }
    }
}
