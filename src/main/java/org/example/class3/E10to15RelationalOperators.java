package org.example.class3;

public class E10to15RelationalOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2=20;
        char letter1='A';
        char letter2='a';

        // "==" operator
        boolean result=letter2==letter1;
        System.out.println(num2==num1);
        System.out.println(result);

        // "!=" operator
        boolean r = letter2!=letter1;
        System.out.println(r);

        // ">" operator
        System.out.println(num2>num1);

        // "<" operator
        System.out.println(num1<num2);

        // ">=" operator
        System.out.println(num2>=num1);
        int num3=20;
        System.out.println(num3>=num2);
    }
}
