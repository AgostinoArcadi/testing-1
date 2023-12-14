import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @org.junit.jupiter.api.Test
    void trova_il_char_nella_stringa() {
        String result = testing.indexChar("ciao", 0);
        assertEquals("c", result, "Il risultato dovrebbe essere c");
    }

    @org.junit.jupiter.api.Test
    void trova_il_char_nella_stringa_null() {
        String result = testing.indexChar(null, 0);
        String expected = "Errore: la stringa è null";
        assertEquals(expected, result, "Il risultato dovrebbe essere una stringa di errore");
    }

    @org.junit.jupiter.api.Test
    void trova_il_char_con_indice_negativo() {
        String result = testing.indexChar("ciao", -3);
        String expected = "l'indice al numero: -3 non esiste";
        assertEquals(expected, result, "Il risultato dovrebbe essere una stringa di errore");
    }

    @org.junit.jupiter.api.Test
    void trova_il_char_con_indice_maggiore_della_stringa() {
        String result = testing.indexChar("ciao", 30);
        String expected = "l'indice al numero: 30 non esiste";
        assertEquals(expected, result, "Il risultato dovrebbe essere una stringa di errore");
    }
}