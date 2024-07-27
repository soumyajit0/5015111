public class FutureValueCalculator {
  public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
    if (periods == 0) {
      return presentValue;
    }
    return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
  }

  public static void main(String[] args) {
    double presentValue = 1000;
    double growthRate = 0.05;
    int periods = 10;
    System.out.println("Present Value: " + presentValue);
    System.out.println("Growth Value: " + growthRate);
    System.out.println("Periods: " + periods);
    double futureValue = calculateFutureValue(presentValue, growthRate, periods);
    System.out.println("Future Value: " + futureValue);
  }
}
