/*
 * Name: Trinity Hurtado
 * Date: 04/19/2026
 * This class contains JUnit 5 tests for the RecursiveProblems class.
 * Each method in RecursiveProblems has at least 5 test cases.
 * The tests verify correctness of recursive implementations, including:
 * - count8 (with double-counting consecutive 8s)
 * - countHi
 * - countHi2 (ignoring "hi" preceded by 'x')
 * - strCount (non-overlapping substrings)
 * - stringClean (removing consecutive duplicates) 
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveProblemsTest {

    @Test
    void testCount8() {
        assertEquals(1, RecursiveProblems.count8(8));
        assertEquals(2, RecursiveProblems.count8(818));
        assertEquals(4, RecursiveProblems.count8(8818));
        assertEquals(3, RecursiveProblems.count8(888));
        assertEquals(0, RecursiveProblems.count8(123));
    }

    @Test
    void testCountHi() {
        assertEquals(1, RecursiveProblems.countHi("xxhixx"));
        assertEquals(2, RecursiveProblems.countHi("xhixhix"));
        assertEquals(1, RecursiveProblems.countHi("hi"));
        assertEquals(0, RecursiveProblems.countHi("h"));
        assertEquals(3, RecursiveProblems.countHi("hihihi"));
    }

    @Test
    void testCountHi2() {
        assertEquals(1, RecursiveProblems.countHi2("ahixhi"));
        assertEquals(2, RecursiveProblems.countHi2("ahibhi"));
        assertEquals(0, RecursiveProblems.countHi2("xhixhi"));
        assertEquals(1, RecursiveProblems.countHi2("hihi"));
        assertEquals(0, RecursiveProblems.countHi2("xhi"));
    }

    @Test
    void testStrCount() {
        assertEquals(2, RecursiveProblems.strCount("catcowcat", "cat"));
        assertEquals(1, RecursiveProblems.strCount("catcowcat", "cow"));
        assertEquals(0, RecursiveProblems.strCount("catcowcat", "dog"));
        assertEquals(3, RecursiveProblems.strCount("aaaa", "aa"));
        assertEquals(1, RecursiveProblems.strCount("abcd", "abc"));
    }

    @Test
    void testStringClean() {
        assertEquals("yza", RecursiveProblems.stringClean("yyzzza"));
        assertEquals("abcd", RecursiveProblems.stringClean("abbbcdd"));
        assertEquals("Helo", RecursiveProblems.stringClean("Hello"));
        assertEquals("a", RecursiveProblems.stringClean("aa"));
        assertEquals("abc", RecursiveProblems.stringClean("abc"));
    }
}