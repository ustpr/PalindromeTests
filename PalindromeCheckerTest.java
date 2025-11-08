import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    void testSimplePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("abba"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("palindrome"));
        assertFalse(PalindromeChecker.isPalindrome("abca"));
    }

    @Test
    void testPalindromeWithSpacesAndPunctuation() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(PalindromeChecker.isPalindrome("No lemon, no melon"));
        assertTrue(PalindromeChecker.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    void testCaseInsensitivity() {
        assertTrue(PalindromeChecker.isPalindrome("MadAm"));
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"));
    }

    @Test
    void testEmptyAndSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome(""));
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @Test
    void testNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}
