import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "java enterprise        edition";
        StringBuilder builder = new StringBuilder(str);
        if (Character.isAlphabetic(str.codePointAt(0))) {
            builder.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        }
        for (int i = 1; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) && Character.isSpaceChar(str.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        }
    }                 
}

  