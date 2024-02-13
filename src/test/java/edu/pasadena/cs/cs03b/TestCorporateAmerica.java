package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

// TODO: implement additional Test Classes for each class in the project
public class TestCompany {

   @Test
   public void testCompanyName()
   {
     // create an instance of the class
      Company c = new Company();
      
     // action
     c.setCompanyName("Dummy Company");
     String strResult = c.getCompanyName();
     // assertion
     assertEquals("Dummy Company", strResult);

     // TODO: add more test cases for all public instance methods

   }
}
