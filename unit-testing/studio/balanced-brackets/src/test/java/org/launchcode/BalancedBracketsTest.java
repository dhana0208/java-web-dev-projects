package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("jhgdhj[fushughdjg[fhbsgbj]hg]bfhgbj[ghdbgh]"));
    }

    @Test
    public void returnsFalseWhenThereisNobalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("jhgdhj[fushughdjg[fhbsgbjhg]bfhgbj[ghdbgh]"));
    }

    @Test
    public void returnsFalseWhenTheStringIsEmpty() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void returnsFalseWhenTheStringIsnull() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
    }

    @Test
    public void returnsFalseWhenTheStringhasJustSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }



    @Test
    public void returnsTrueWhenTheStringHasJustNumbersBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[5654369]"));

    }
    @Test
    public void returnsTrueWhenThereisbalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("jhgdhj[fushughdjg][fhbsgbjhg]bfhgbj[ghdbgh]"));
    }


}


