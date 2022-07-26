package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain400() {
        int actual = service.remain(1600);
        int expected = 400;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain700() {
        int actual = service.remain(3300);
        int expected = 700;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain() {
        int actual = service.remain(0);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}