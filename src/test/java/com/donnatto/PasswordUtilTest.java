package com.donnatto;

import org.junit.Test;

import static com.donnatto.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakWhenHassLessThan8Letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abc12!"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void strongWhenHasLettersAndNumbersAndSymbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }


}