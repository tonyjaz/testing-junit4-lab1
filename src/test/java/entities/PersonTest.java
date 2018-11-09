package entities;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class PersonTest {

    @Test(expected = IllegalArgumentException.class)
    public void setName_nullValue() {
//        given
        Person person = new Person();

//        when
        person.setName(null);
    }

    @Test
    public void setName_notNullValue() {
//        given
        Person person = new Person();

//        when
        person.setName("Antek");

//        then
        assertThat(person.getName(), is("Antek"));
    }
}