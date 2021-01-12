import java.util.Random;
class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 251;
        //generate random values from 0-250
      int int_random = rand.nextInt(upperbound); 
      
      System.out.println("Random integer value from 0 to " + (upperbound-1) + " : "+ int_random);
    }
}
