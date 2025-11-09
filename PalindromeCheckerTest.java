package tests;

import main.PalindromeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("abba"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("palindrome"));
        assertFalse(PalindromeChecker.isPalindrome("abca"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(PalindromeChecker.isPalindrome("No lemon, no melon"));
        assertTrue(PalindromeChecker.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testCaseInsensitivity() {
        assertTrue(PalindromeChecker.isPalindrome("MadAm"));
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"));
    }

    @Test
    public void testEmptyAndSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome(""));
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @Test
    public void testNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}
