package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

// TODO: implement additional Test Classes for each class in the project
public class TestCorporateAmerica {

   @Test
   public void testCompanyName()
   {
     // create an instance of the class
      CorporateAmerica c = new CorporateAmerica();
      
     // action
     c.setCompanyName("Dummy Company");
     String strResult = c.getCompanyName();
     // assertion
     assertEquals("Dummy Company", strResult);

     // TODO: add more test cases for all public instance methods
     Manager manager = new Manager();
     manager.setName("Testy Test");
     manager.setPosition("manager");
     manager.setAge(25);
     manager.setID(12);
     manager.setLocation("Pasadena, California");
     assertEquals("Testy Test", manager.getName());
     assertEquals("Manager", manager.getPosition());
     assertEquals(25, manager.getAge());
     assertEquals(12, manager.getID());
     assertEquals("Pasadena, California", manager.getLocation());

     Staff staff = new Staff();
     staff.setName("Testo Testen");
     staff.setPosition("Staff");
     staff.setAge(20);
     staff.setID(10);
     staff.setLocation("Los Angeles, California");
     assertEquals("Testo Testen", staff.getName());
     assertEquals("Staff", staff.getPosition());
     assertEquals(20, staff.getAge());
     assertEquals(10, staff.getID());
     assertEquals("Los Angeles, California", staff.getLocation());

     Contractor contractor = new Contractor();
     contractor.setName("Testim Tester");
     contractor.setPosition("contractor");
     contractor.setAge(32);
     contractor.setID(58);
     contractor.setLocation("Sacramento, California");
     assertEquals("Testim Tester", contractor.getName());
     assertEquals("Contractor", contractor.getPosition());
     assertEquals(32, contractor.getAge());
     assertEquals(58, contractor.getID());
     assertEquals("Sacramento, California", contractor.getLocation());
     assertEquals("Testim Tester is performing his given task.", contractor.work());
     assertEquals("Testim Tester is resting.", contractor.rest());

   }
}
