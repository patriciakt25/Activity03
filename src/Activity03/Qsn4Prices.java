package Activity03;
import java.util.*;
public class Qsn4Prices {
    public static void main(String [] args) {
        double [][] prices = new double [4][2];
        prices[0][0] = 12.45;
        prices[0][1] = 11.39;
        prices[1][0] = 100.23;
        prices[1][1] = 100.80;
        prices[1][2] = 96.99;
        prices[2][1] = 94.78;
        prices[3][0] = 245.50;
        prices[3][1] = 247.00;
            double sum =0;
        for(int row= 0;row<8;row++){
            for(int col=0;col<2;col++){
                sum = sum + prices[row][col];

            }
            System.out.println("Sum of the prices is " + sum);
        }

    }
}
