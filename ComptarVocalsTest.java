import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComptarVocalsTest {
    private final ByteArrayOutputStream sortida = new ByteArrayOutputStream();

    @BeforeEach
    public void preparaSortida() {
        // Redirigim la sortida estàndard per capturar el text que imprimeix el programa
        System.setOut(new PrintStream(sortida));
    }

    // Test amb vocals normals
    @Test
    public void testVocalesSimples() {
        String entrada = "aei";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        ComptarVocals.main(null);
        String resultat = sortida.toString().toLowerCase();

        assertTrue(resultat.contains("a: 1"));
        assertTrue(resultat.contains("e: 1"));
        assertTrue(resultat.contains("i: 1"));
        assertTrue(resultat.contains("o: 0"));
        assertTrue(resultat.contains("u: 0"));
    }

    // Test amb frase sense vocals
    @Test
    public void testSenseVocals() {
        String entrada = "xyz";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        sortida.reset();
        ComptarVocals.main(null);
        String resultat = sortida.toString().toLowerCase();

        assertTrue(resultat.contains("total: 0"));
    }

    // Test amb totes les vocals
    @Test
    public void testTotesLesVocals() {
        String entrada = "aeiou";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        sortida.reset();
        ComptarVocals.main(null);
        String resultat = sortida.toString().toLowerCase();

        assertTrue(resultat.contains("total: 5"));
    }

    // Test amb vocals en majúscula
    @Test
    public void testMajuscules() {
        String entrada = "AEIOU";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
        sortida.reset();
        ComptarVocals.main(null);
        String resultat = sortida.toString().toLowerCase();

        assertTrue(resultat.contains("a: 1"));
        assertTrue(resultat.contains("e: 1"));
        assertTrue(resultat.contains("i: 1"));
        assertTrue(resultat.contains("o: 1"));
        assertTrue(resultat.contains("u: 1"));
    }
}
