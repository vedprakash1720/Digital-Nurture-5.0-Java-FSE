public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double forecastValue(double currentValue,
                                       double growthRate,
                                       int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
                 
         
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue =
                forecastValue(currentValue, growthRate, years);

        System.out.printf(
                "Predicted value after %d years = %.2f%n",
                years,
                futureValue
        );
    }
}

Sample Output: 
Predicted value after 5 years = 16105.10