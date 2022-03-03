import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTests {
    @Test
    public void chArrToString_test() {
        char[] ch = { 'a', '\\', '9'};
        assertEquals("a\\9", A_CharAndString.chArrToString(ch));
    }

    @Test
    public void asciiCode_test() {
        assertEquals(0, A_CharAndString.asciiCode('\0'));
        assertEquals(53, A_CharAndString.asciiCode('5'));
        assertEquals(65, A_CharAndString.asciiCode('A'));
        assertEquals(97, A_CharAndString.asciiCode('a'));
    }

    @Test
    public void fullName_test() {
        assertEquals("Walter White", B_StringMethods.fullName(
                "Walter",
                "White"
        ));

        assertEquals("Homelander", B_StringMethods.fullName("Homelander", ""));

        assertEquals("", B_StringMethods.fullName("", ""));
    }

    @Test
    public void certainNumberOfChar_test() {
        assertTrue(B_StringMethods.certainNumberOfChar(
                "noushirvani",
                'o',
                1
        ));

        assertTrue(B_StringMethods.certainNumberOfChar(
                "babol",
                'b',
                2
        ));

        assertTrue(B_StringMethods.certainNumberOfChar(
                "java",
                't',
                0
        ));

        assertTrue(B_StringMethods.certainNumberOfChar(
                "\0\t\b\r",
                '\0',
                1
        ));

        assertFalse(B_StringMethods.certainNumberOfChar(
                "java",
                'j',
                2
        ));

        assertFalse(B_StringMethods.certainNumberOfChar(
                "java",
                't',
                1
        ));
    }

    @Test
    public void firstWord_test() {
        assertEquals("adult", B_StringMethods.firstWord("beyond", "adult"));

        assertEquals("a", B_StringMethods.firstWord("aa","a"));
    }

    @Test
    public void containsDoubleChar_test() {
        assertTrue(C_LoopAndString.containsDoubleChar(
                "attribute",
                't'
        ));

        assertTrue(C_LoopAndString.containsDoubleChar("aab", 'a'));
        assertTrue(C_LoopAndString.containsDoubleChar("baa", 'a'));
        assertFalse(C_LoopAndString.containsDoubleChar("aba", 'a'));
        assertFalse(C_LoopAndString.containsDoubleChar("aba", 'b'));
    }

    @Test
    public void caesarEncrypt_test() {
        String text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.""";
        String code = """
                Yberz vcfhz qbybe fvg nzrg, pbafrpgrghe nqvcvfpvat ryvg, frq qb rvhfzbq grzcbe vapvqvqhag hg ynober rg qbyber zntan nyvdhn. Hg ravz nq zvavz iravnz, dhvf abfgehq rkrepvgngvba hyynzpb ynobevf avfv hg nyvdhvc rk rn pbzzbqb pbafrdhng. Qhvf nhgr veher qbybe va erceruraqrevg va ibyhcgngr iryvg rffr pvyyhz qbyber rh shtvng ahyyn cnevnghe. Rkprcgrhe fvag bppnrpng phcvqngng aba cebvqrag, fhag va phycn dhv bssvpvn qrfrehag zbyyvg navz vq rfg ynobehz.""";

        assertEquals(code, C_LoopAndString.caesarEncrypt(text, 13));
        assertEquals(code, C_LoopAndString.caesarEncrypt(text, 39));
        assertEquals(code, C_LoopAndString.caesarEncrypt(text, -13));
        assertEquals("yx", C_LoopAndString.caesarEncrypt("zy", -1));

        assertEquals(text, C_LoopAndString.caesarDecrypt(code, 13));
        assertEquals(text, C_LoopAndString.caesarEncrypt(code, 39));
        assertEquals(text, C_LoopAndString.caesarEncrypt(code, -13));
        assertEquals("zy", C_LoopAndString.caesarDecrypt("yx", -1));
    }

    /*
    Additional method tests should be provided below.
     */
}
