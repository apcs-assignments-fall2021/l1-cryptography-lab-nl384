import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VigenereTest {
    @Test
    public void testEncryptVigenere() {
        // Basic tests
        assertEquals("HFNOS", Vigenere.encryptVigenere("HELLO", "ABCDE"), "The encrypted output of \"HELLO\" with the key \"ABCDE\" should be: " + "HFNOS");
        assertEquals("HFNOS WPTOH", Vigenere.encryptVigenere("HELLO WORLD", "ABCDE"), "The encrypted output of \"HELLO WORLD\" with the key \"ABCDE\" should be: " + "HFNOS WPTOH");      
        assertEquals("HFNOS, WPTOH!", Vigenere.encryptVigenere("HELLO, WORLD!", "ABCDE"), "The encrypted output of \"HELLO, WORLD!\" with the key \"ABCDE\" should be: " + "HFNOS, WPTOH!");    
        
        // Harder tests
        assertEquals("B qlsdk wyy jlwqs fffr krf lrjz dfq", Vigenere.encryptVigenere("A quick fox jumps over the lazy dog", "BARK"), "The encrypted output of \"A quick fox jumps over the lazy dog\" with the key \"BARK\" should be: " + "B qlsdk wyy jlwqs fffr krf lrjz dfq");
        assertEquals("Wenv af fzi kpxs qwci oznlr wtebsc uinw", Vigenere.encryptVigenere("Pack my box with five dozen liquor jugs", "HELLO"), "The encrypted output of \"Pack my box with five dozen liquor jugs\" with the key \"HELLO\" should be: " + "Wenv af fzi kpxs qwci oznlr wtebsc uinw");      
        assertEquals("Hfe uskinxtx ehicb lztg zeszzg wumg!", Vigenere.encryptVigenere("How vexingly quick daft zebras jump!", "ARIZONA"), "The encrypted output of \"How vexingly quick daft zebras jump!\" with the key \"ARIZONA\" should be: " + "Hfe uskinxtx ehicb lztg zeszzg wumg!");    
    }

    @Test
    public void testDecryptVigenere() {
        // Basic tests
        assertEquals("HELLO", Vigenere.decryptVigenere("HFNOS", "ABCDE"), "The decrypted output of \"HFNOS\" with the key \"ABCDE\" should be: " + "HELLO");
        assertEquals("HELLO WORLD", Vigenere.decryptVigenere("HFNOS WPTOH", "ABCDE"), "The decrypted output of \"HFNOS WPTOH\" with the key \"ABCDE\" should be: " + "HELLO WORLD");
        assertEquals("HELLO, WORLD!", Vigenere.decryptVigenere("HFNOS, WPTOH!", "ABCDE"), "The decrypted output of \"HFNOS, WPTOH!\" with the key \"ABCDE\" should be: " + "HELLO, WORLD!");

        // Harder tests
        assertEquals("A quick fox jumps over the lazy dog", Vigenere.decryptVigenere("B qlsdk wyy jlwqs fffr krf lrjz dfq", "BARK"), "The decrypted output of \"B qlsdk wyy jlwqs fffr krf lrjz dfq\" with the key \"BARK\" should be: " + "A quick fox jumps over the lazy dog");
        assertEquals("Pack my box with five dozen liquor jugs", Vigenere.decryptVigenere("Wenv af fzi kpxs qwci oznlr wtebsc uinw", "HELLO"), "The decrypted output of \"Wenv af fzi kpxs qwci oznlr wtebsc uinw\" with the key \"HELLO\" should be: " + "Pack my box with five dozen liquor jugs");
        assertEquals("How vexingly quick daft zebras jump!", Vigenere.decryptVigenere("Hfe uskinxtx ehicb lztg zeszzg wumg!", "ARIZONA"), "The decrypted output of \"Hfe uskinxtx ehicb lztg zeszzg wumg!\" with the key \"ARIZONA\" should be: " + "How vexingly quick daft zebras jump!");
    }
}
