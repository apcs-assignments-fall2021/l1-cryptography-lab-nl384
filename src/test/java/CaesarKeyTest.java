import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarKeyTest {
    @Test
    public void testEncryptCaesarKey() {
        // Uppercase, basic
        assertEquals("KHOOR, ZRUOG!", Caesar.encryptCaesarKey("HELLO, WORLD!", 3), "The encrypted output of \"HELLO, WORLD!\" with the key " + "3" + " should be: " + "KHOOR, ZRUOG!");
        assertEquals("KHOOR, ZRUOG!", Caesar.encryptCaesarKey("HELLO, WORLD!", 133), "The encrypted output of \"HELLO, WORLD!\" with the key " + "133" + " should be: " + "KHOOR, ZRUOG!");
        assertEquals("LIPPS, ASVPH!", Caesar.encryptCaesarKey("HELLO, WORLD!", 4), "The encrypted output of \"HELLO, WORLD!\" with the key " + "4" + " should be: " + "LIPPS, ASVPH!");
        assertEquals("MJQQT, BTWQI!", Caesar.encryptCaesarKey("HELLO, WORLD!", 5), "The encrypted output of \"HELLO, WORLD!\" with the key " + "5" + " should be: " + "MJQQT, BTWQI!");
    }

    @Test
    public void testDecryptCaesarKey() {
        // Uppercase, basic
        assertEquals("HELLO, WORLD!", Caesar.decryptCaesarKey("KHOOR, ZRUOG!", 3), "The decrypted output of \"KHOOR, ZRUOG!\" with the key " + "3" + " should be: " + "HELLO, WORLD!");
        assertEquals("HELLO, WORLD!", Caesar.decryptCaesarKey("KHOOR, ZRUOG!", 133), "The decrypted output of \"KHOOR, ZRUOG!\" with the key " + "133" + " should be: " + "HELLO, WORLD!");
        assertEquals("HELLO, WORLD!", Caesar.decryptCaesarKey("LIPPS, ASVPH!", 4), "The decrypted output of \"LIPPS, ASVPH!\" with the key " + "4" + " should be: " + "HELLO, WORLD!");
        assertEquals("HELLO, WORLD!", Caesar.decryptCaesarKey("MJQQT, BTWQI!", 5), "The decrypted output of \"MJQQT, BTWQI!\" with the key " + "5" + " should be: " + "HELLO, WORLD!");
    }
}
