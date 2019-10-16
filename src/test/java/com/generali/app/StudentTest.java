package com.generali.app;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {


    @Test
    public void shouldReturnName(){

        Student student = new Student();
        assertEquals("Rick",student.getName());
    }

    @Test
    @Tag("integration-test")
    public void shoudlReturnNewName(){

        Student student = new Student();
        assertEquals("RickNew",student.getNewName());

    }
}
