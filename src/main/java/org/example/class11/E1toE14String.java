package org.example.class11;

public class E1toE14String {
    public static void main(String[] args) {
        String str = new String("Long time no see");

        // .length()
        int leng = str.length();
        System.out.println(leng);

        // .toUpperCase()
        String upper = str.toUpperCase();

        // .trim()
        str = str.trim();

        // .charAt()
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // .indexOf()
        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf("n"));

        // .replace()
        System.out.println(str.replace("see", "see you"));

        // .replaceAll()
        String text = "/NJKN#*(IUBJ()56165+" +
                "2+1fehfoeijwiuf";
        System.out.println(text.replaceAll("[0-9]", "*"));
        System.out.println(text.replaceAll("[a-f]", ""));
        System.out.println(text.replaceAll("[A-Z]", ""));
        System.out.println(text.replaceAll("[A-Z0-9]", ""));
        System.out.println(text.replaceAll("[^A-Z0-9]", ""));
        System.out.println(text.replaceAll("[47]", ""));

        // .split()
        String[] words=str.split(" ");
        System.out.println(words.length);
        System.out.println(words[3]);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        String sentences = "1fjeofef. 2efneifjf. 3efjeifj";
        String[] shortSent= sentences.split("[.]");
        System.out.println(shortSent[1].trim());
    }
}
