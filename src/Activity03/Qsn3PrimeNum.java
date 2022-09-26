package Activity03;
import java.util.*;
public class Qsn3PrimeNum {
    public static void main(String args[]) {


        ArrayList<Integer> primes = new ArrayList<>();// qsn 3a

        for (int num = 2; num <= 100; num++) {
            int count = 0;
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                primes.add(num);
            }
        }

        System.out.print(primes);// printing the prime numbers between 1 and 100




        }
    }
