package fr.slickteam.decouverte.gradle;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuerrierTest {

    @Test
    public void getName() throws Exception {
        Guerrier childerick = new Guerrier("Childerick");
        assertEquals(childerick.getName(), "Childerick2");
    }

}