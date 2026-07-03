/**
 * Financial Forecast using Recursion.
 */
public class FinancialForecast {

    /**
     * Recursively calculates future value.
     *
     * @param presentValue Current investment amount
     * @param growthRate Annual growth rate (e.g., 0.10 for 10%)
     * @param years Number of years
     * @return Future value
     */
    public static double calculateFutureValue(double presentValue,
                                              double growthRate,
                                              int years) {

        // Base Case
        if (years == 0) {
            return presentValue;
        }

        // Recursive Case
        return calculateFutureValue(
                presentValue,
                growthRate,
                years - 1) * (1 + growthRate);

    }

}