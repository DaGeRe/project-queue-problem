package de.dagere.peass;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ExampleTest {

   @Test
   public void test() {
      final ExampleClazz exampleClazz = new ExampleClazz();
      exampleClazz.calleeMethod();
      assertNotNull(exampleClazz);
   }

}