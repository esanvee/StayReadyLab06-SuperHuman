package Superpowers;

import org.junit.Assert;

import org.junit.Test;

public class HumanTest {

    @Test

    public void testGetName(){

        String name = "Bobbina";

        Human test = new Human();

        test.setName(name);

        String expected = name;
        String actual = test.getName();

        Assert.assertEquals(expected, actual);


    }

    @Test

    public void testGetId(){

        int id = 25;

        Human test = new Human();

        int expected = id;
        int actual = test.getId();

        Assert.assertEquals(expected, actual);


    }


}
