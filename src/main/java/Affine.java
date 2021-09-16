import java.util.Scanner;

public class Affine {
    public static String encryptAffine(String message) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }

    public static String decryptAffine(String message) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }

    public static String encryptAffineKeys(String message, int key1, int key2) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }

    public static int modularInverse(int x) {
        // REPLACE THIS WITH YOUR CODE
        return -1;
    }


    public static String decryptAffineKeys(String message, int key1, int key2) {
        // REPLACE THIS WITH YOUR CODE
        return message;
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
