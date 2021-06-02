package de.dagere.peass;

public class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      for (int i = 0; i < 100000000; i++) {
      	oftenCalledMethod();
      }
      try {
         Thread.sleep(1);
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }
   }
   
   private void oftenCalledMethod() {
	// This method is called very often but does nothing   
   }

   protected void method2() {
      // This change should not be detected by PeASS since it is not covered by a test
      System.out.println("This is a test");
   }

}
