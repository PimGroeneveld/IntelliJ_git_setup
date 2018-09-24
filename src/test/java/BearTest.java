import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62);
    }
    //@Test -> press enter
    @Test
    public void hasName(){
        String name = bear.getName();
        assertEquals("Baloo", name);
        // assertEquals -> option-enter, second option (junit)
    }

    @Test
    public void hasAge(){
        int age = bear.getAge();
        assertEquals(25, age);
    }

    @Test
    public void hasWeight(){
        double weight = bear.getWeight();
        assertEquals(95.62, weight, 0.01); // delta gives room for a small deviation and still have the test pass
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        boolean readyToHibernate = bear.isReadyToHibernate();
        assertEquals(true, readyToHibernate);
    }

    @Test
    public void NotReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Yogi", 25, 65.44);
        boolean readyToHibernate = thinBear.isReadyToHibernate();
        assertEquals(false, readyToHibernate);
    }
}
