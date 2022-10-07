package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test
    void shouldRemainBoundaryIfLess1000 (){
        CashbackHackService  cashbackHack = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHack.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    void shouldNotRemainBoundaryIfPurchaseOn1000 (){
        CashbackHackService  cashbackHack = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHack.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);

    }

}