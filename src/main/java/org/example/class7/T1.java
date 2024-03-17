package org.example.class7;

public class T1 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Max";
        names[1] = "Maggy";
        names[2] = "Alice";
        String[] names2 = {"John", "Jason", "Katy"};

        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }

    }
}
