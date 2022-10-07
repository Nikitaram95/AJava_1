package ru.netology.service;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {


    @org.junit.Test
    void shouldRemainBoundaryIfLess1000 (){
        CashbackHackService  cashbackHack = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHack.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @org.junit.Test
    void shouldNotRemainBoundaryIfPurchaseOn1000 (){
        CashbackHackService  cashbackHack = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHack.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);

    }

}