public class ComptarVocalsTest {
private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
@BeforeEach
public void setUp() {
System.setOut(new PrintStream(outputStream));
}
@Test
public void testComptarVocals() {
String input = "aei";
System.setIn(new ByteArrayInputStream(input.getBytes()));
ComptarVocals.main(new String[]{});
// Resultat que surt per pantalla: "Please, insert the message: ..."
String resultat = outputStream.toString().toLowerCase();
assertTrue(resultat.contains("amount of 'a': 1"));
assertTrue(resultat.contains("amount of 'e': 1"));
assertTrue(resultat.contains("amount of 'i': 1"));
assertTrue(resultat.contains("amount of 'o': 0"));
assertTrue(resultat.contains("amount of 'u': 0"));
assertTrue(resultat.contains("total amount of vowels: 3"));
}