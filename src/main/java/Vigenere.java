import java.util.Scanner;

public class Vigenere {
    // Harry's Code
    public static byte isLetter(char c){
        if(c > 64 && c < 91){
            return 1;
        }else if(c > 96 && c < 124){
            return 2;
        }else{
            return 0;
        }
    }

    public static boolean hasSymbols(String s){
        for(int i = 0; i < s.length(); i ++){
            if(isLetter(s.charAt(i)) == 0){
                return true;
            }
        }
        return false;
    }

    public static String encryptVigenere(String message, String key) {
        if (hasSymbols(key)) {
            return "ERROR: key can only contain letters.";
        }

        char[] s = message.toCharArray();
        char[] k = key.toCharArray();


        //make the key array into the shift array
        for(int i = 0; i < k.length; i ++){
            k[i] -= 65;
        }

        // this variable only ++ if a letter is reached;
        int k_index = 0;

        for(int i = 0; i < s.length; i ++){

            if(isLetter(s[i]) == 1){

                s[i] -= 13;                         //sets the letter up
                s[i] += k[(k_index % k.length)];    //shifts the letter
                s[i] = (char) ((s[i] % 26) + 65);   //makes the letter fit in the correct range
                k_index ++;

            }else if(isLetter(s[i]) == 2){                                  //similar logic for lower letters
                s[i] -= 19;
                s[i] += k[(k_index % k.length)];
                s[i] = (char) ((s[i] % 26) + 97);
                k_index ++;
            }

        }
        return new String(s);
    }


    public static String decryptVigenere(String message, String key) {
        if (hasSymbols(key)) {
            return "ERROR: key can only contain letters.";
        }

        char[] s = message.toCharArray();
        char[] k = key.toCharArray();

        //make the key array into the shift array
        for(int i = 0; i < k.length; i ++){
            k[i] -= 65;
        }

        // this variable only ++ if a letter is reached;
        int k_index = 0;


        for(int i = 0; i < s.length; i ++){

            if(isLetter(s[i]) == 1){

                s[i] -= 13;                         //sets the letter up
                s[i] -= k[(k_index % k.length)];    //shifts the letter
                s[i] = (char) ((s[i] % 26) + 65);   //makes the letter fit in the correct range
                k_index ++;

            }else if(isLetter(s[i]) == 2){                                  //similar logic for lower letters
                s[i] -= 19;
                s[i] -= k[(k_index % k.length)];
                s[i] = (char) ((s[i] % 26) + 97);
                k_index ++;
            }

        }

        return new String(s);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
