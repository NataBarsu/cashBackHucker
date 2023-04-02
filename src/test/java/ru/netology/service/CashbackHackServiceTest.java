package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}