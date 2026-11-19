package Day3.PersonTestActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        // TODO: Initialize person object
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // TODO: Tear down person object (set to null)
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertTrue(Math.abs(1.75f - person.getHeight()) < 0.0001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)
        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.75));


        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));


        assertEquals("Overweight", person.getBodyMassIndex(80, 1.75));


        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));

        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-70, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));

        // Boundary check: weight = 600 and height = 3.0 are valid
      //  assertEquals("Invalid input", person.getBodyMassIndex(600, 3.0) == null ? null :(600.0 / (3.0 * 3.0) >= 30 ? "Obese" : "Overweight"));
       //valid upper boundary check
        assertEquals("Obese", person.getBodyMassIndex(600, 3.0));
    }
    }

