import java.util.Scanner;

public class Affine {
    public static String encryptAffine(String message) {
        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int x = c - 'A';
                x = (x * 3) % 26;
                x += 'A';
                encrypted += (char) x;
            }
            else if (c >= 'a' && c <= 'z') {
                int x = c - 'a';
                x = (x * 3) % 26;
                x += 'a';
                encrypted += (char) x;
            }
            else {
                encrypted += c;
            }
        }

        return encrypted;
    }

    public static String decryptAffine(String message) {
        String decrypted = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int x = c - 'A';
                x = (x * 9) % 26;
                x += 'A';
                decrypted += (char) x;
            }
            else if (c >= 'a' && c <= 'z') {
                int x = c - 'a';
                x = (x * 9) % 26;
                x += 'a';
                decrypted += (char) x;
            }
            else {
                decrypted += c;
            }
        }

        return decrypted;
    }

    public static String encryptAffineKeys(String message, int key1, int key2) {
        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int x = c - 'A';
                x = (x * key1 + key2) % 26;
                x += 'A';
                encrypted += (char) x;
            }
            else if (c >= 'a' && c <= 'z') {
                int x = c - 'a';
                x = (x * key1 + key2) % 26;
                x += 'a';
                encrypted += (char) x;
            }
            else {
                encrypted += c;
            }
        }

        return encrypted;
    }

    public static int modularInverse(int x) {
        int y = 1;
        while (true) {
            int prod = x * y;
            if (prod % 26 == 1) {
                return y;
            }
            else {
                y++;
            }
        }
    }

    public static String decryptAffineKeys(String message, int key1, int key2) {
        int comp = modularInverse(key1);
        String decrypted = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int x = c - 'A';
                x = ((((x - key2)+26) % 26) * comp) % 26;
                x += 'A';
                decrypted += (char) x;
            }
            else if (c >= 'a' && c <= 'z') {
                int x = c - 'a';
                x = ((((x - key2)+26) % 26) * comp) % 26;
                x += 'a';
                decrypted += (char) x;
            }
            else {
                decrypted += c;
            }
        }

        return decrypted;
    }

    // Some basic testing code
    public static void main(String[] args) {
        System.out.println("Encrypt and Decrypt Basic Tests:");
        System.out.println(encryptAffine(("Hello, World!"))); // Vmhhq, Oqzhj!
        System.out.println(decryptAffine("Vmhhq, Oqzhj!")); // Hello, World!

        System.out.println();
        System.out.println("Modular Inverse Tests:");
        System.out.println(modularInverse(9)); // 3
        System.out.println(modularInverse(3)); // 9
        System.out.println(modularInverse(23)); // 17

        System.out.println();
        System.out.println("Affine Encrypt and Decrypt with Keys Tests:");
        System.out.println(encryptAffineKeys("hello", 5, 17)); // aluuj
        System.out.println(decryptAffineKeys("aluuj", 5, 17)); // hello
    }
}
