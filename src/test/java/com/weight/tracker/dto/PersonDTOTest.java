package com.weight.tracker.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonDTOTest {

    private PersonDTO personDTO;

    @BeforeEach
    public void setup() {
        personDTO = new PersonDTO("Jermaine", "Ro", "Watts", "Jr", 31, 223);
    }

    @Test
    public void testFirstName() {
        Assertions.assertEquals("Jermaine", personDTO.getFirstName());
    }

    @Test
    public void testMiddleName() {
        Assertions.assertEquals("Ro", personDTO.getMiddleName());
    }

    @Test
    public void testLastName() {
        Assertions.assertEquals("Watts", personDTO.getLastName());
    }

    @Test
    public void testSuffix() {
        Assertions.assertEquals("Jr", personDTO.getSuffix());
    }


    @Test
    public void testAge() {
        Assertions.assertEquals(31, personDTO.getAge());
    }

    @Test
    public void testWeight() {
        Assertions.assertEquals(223, personDTO.getWeight());
    }

    @Test
    public void testNoArgConstructor() {
        PersonDTO personDTO1 = new PersonDTO();
        Assertions.assertNotNull(personDTO1);
    }

    @Test
    public void testToString() {
        Assertions.assertNotNull(personDTO.toString());
    }

}
