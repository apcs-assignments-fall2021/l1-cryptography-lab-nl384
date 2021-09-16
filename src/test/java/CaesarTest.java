import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarTest {
    @Test
    public void testEncryptCaesar() {
        // Uppercase, basic
        assertEquals("KHOOR", Caesar.encryptCaesar("HELLO"), "The encrypted output of \"HELLO\" should be: " + "KHOOR");
        assertEquals("KHOOR ZRUOG", Caesar.encryptCaesar("HELLO WORLD"), "The encrypted output of \"HELLO WORLD\" should be: " + "KHOOR ZRUOG");
        assertEquals("KHOOR, ZRUOG!", Caesar.encryptCaesar("HELLO, WORLD!"), "The encrypted output of \"HELLO, WORLD!\" should be: " + "KHOOR, ZRUOG!");

        // Lowercase, basic
        assertEquals("khoor", Caesar.encryptCaesar("hello"), "The encrypted output of \"hello\" should be: " + "khoor");
        assertEquals("khoor zruog", Caesar.encryptCaesar("hello world"), "The encrypted output of \"hello world\" should be: " + "khoor zruog");
        assertEquals("khoor, zruog!", Caesar.encryptCaesar("hello, world!"), "The encrypted output of \"hello, world!\" should be: " + "khoor, zruog!");

        // XYZ
        assertEquals("cheud a-udbv", Caesar.encryptCaesar("zebra x-rays"), "The encrypted output of \"zebra x-rays\" should be: " + "cheud a-udbv");
        assertEquals("FRQWHAWXDOLCH BDNV", Caesar.encryptCaesar("CONTEXTUALIZE YAKS"), "The encrypted output of \"CONTEXTUALIZE YAKS\" should be: " + "FRQWHAWXDOLCH BDNV");
        assertEquals("defghijklmnopqrstuvwxyzabc", Caesar.encryptCaesar("abcdefghijklmnopqrstuvwxyz"), "The encrypted output of \"abcdefghijklmnopqrstuvwxyz\" should be: " + "defghijklmnopqrstuvwxyzabc");
        assertEquals("DEFGHIJKLMNOPQRSTUVWXYZABC", Caesar.encryptCaesar("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "The encrypted output of \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\" should be: " + "DEFGHIJKLMNOPQRSTUVWXYZABC");
        assertEquals("deFGhIJklmNOPQRstuVWxyZAbC", Caesar.encryptCaesar("abCDeFGhijKLMNOpqrSTuvWXyZ"), "The encrypted output of \"abCDeFGhijKLMNOpqrSTuvWXyZ\" should be: " + "deFGhIJklmNOPQRstuVWxyZAbC");
    }

    @Test
    public void testDecryptCaesar() {
        // Uppercase, basic
        assertEquals("HELLO", Caesar.decryptCaesar("KHOOR"), "The decrypted output of \"KHOOR\" should be: " + "HELLO");
        assertEquals("HELLO WORLD", Caesar.decryptCaesar("KHOOR ZRUOG"), "The decrypted output of \"KHOOR ZRUOG\" should be: " + "HELLO WORLD");
        assertEquals("HELLO, WORLD!", Caesar.decryptCaesar("KHOOR, ZRUOG!"), "The decrypted output of \"KHOOR, ZRUOG!\" should be: " + "HELLO, WORLD!");

        // Lowercase, basic
        assertEquals("hello", Caesar.decryptCaesar("khoor"), "The decrypted output of \"khoor\" should be: " + "hello");
        assertEquals("hello world", Caesar.decryptCaesar("khoor zruog"), "The decrypted output of \"khoor zruog\" should be: " + "hello world");
        assertEquals("hello, world!", Caesar.decryptCaesar("khoor, zruog!"), "The decrypted output of \"khoor, zruog!\" should be: " + "hello, world!");

        // XYZ
        assertEquals("zebra x-rays", Caesar.decryptCaesar("cheud a-udbv"), "The decrypted output of \"cheud a-udbv\" should be: " + "zebra x-rays");
        assertEquals("CONTEXTUALIZE YAKS", Caesar.decryptCaesar("FRQWHAWXDOLCH BDNV"), "The decrypted output of \"FRQWHAWXDOLCH BDNV\" should be: " + "CONTEXTUALIZE YAKS");
        assertEquals("abcdefghijklmnopqrstuvwxyz", Caesar.decryptCaesar("defghijklmnopqrstuvwxyzabc"), "The decrypted output of \"defghijklmnopqrstuvwxyzabc\" should be: " + "abcdefghijklmnopqrstuvwxyz");
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", Caesar.decryptCaesar("DEFGHIJKLMNOPQRSTUVWXYZABC"), "The decrypted output of \"DEFGHIJKLMNOPQRSTUVWXYZABC\" should be: " + "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("abCDeFGhijKLMNOpqrSTuvWXyZ", Caesar.decryptCaesar("deFGhIJklmNOPQRstuVWxyZAbC"), "The decrypted output of \"deFGhIJklmNOPQRstuVWxyZAbC\" should be: " + "abCDeFGhijKLMNOpqrSTuvWXyZ");
    }
}
