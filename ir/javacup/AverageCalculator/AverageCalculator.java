package ir.javacup.AverageCalculator;


public class AverageCalculator {
    public static double sumcalculator( double... number){
        double totoal = 0;
        for(double num : number){
            totoal += num;
        }
        return totoal;
    }
    public static double divaidcalculator(double num1, double num2){
        if(num2 == 0){
            System.out.println("Cannot divide by zero!");
            return 0.0;
        }
        return num1 / num2 ;
    }

    public static void main(String[] args) {
        System.out.println(sumcalculator(1.2, 2.5, 3.4));
        System.out.println(sumcalculator(5, 10));
        System.out.println(sumcalculator());
        System.out.println(sumcalculator(1, 2, 3, 4, 5));
        System.out.println(divaidcalculator(16, 2));
        System.out.println(divaidcalculator(0, 2));
        System.out.println(divaidcalculator(1, 0));




    }    
}