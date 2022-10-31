public class WhileLoopFun {
    /**
     * This class has no instance variables, so we can either include no constructor,
     * or this simple no-parameter constructor, which is actually preferred practice
     * over omitting the constructor entirely
     */
    public WhileLoopFun() {
    }

    /**
     * Performs the factorial operation on number (i.e. number!) and returns the result as a double
     * (returning a double rather than an int is intentional, as it allows for much larger results to be returned
     * than would be possible if returning an int, because with factorials, it is easy to quickly exceed
     * Integer.MAX_VALUE and get unexpected results).
     * Example:  If number is 6, this methods returns 6 * 5 * 4 * 3 * 2 * 1 = 720.0
     * Example:  If number is 10, this methods returns 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 362880.0
     * Example:  If number is 20, this methods returns 2.43290200817664E18 ≈ 2.43 x 1018
     */
    public double factorial(int number) {
        double n1=0;
        double factorial=number;
        while (number != n1) {
            n1 = n1 + 1;
            if(n1==number){
                return factorial;
            }
            double fakeNumber = number - n1;
            factorial = fakeNumber * factorial;

        }
        return factorial;
    }

    /**Prints the individual digits in number separately, starting with the rightmost digit first.
     Example:  If number is 361, this methods prints 1, then 6, then 3
     Example:  If number is 150856, this methods prints 6, then 5, then 8, then 0, then 5, then 1
     */
    public void printDigits(int number)
    {
       String numberInString = Integer.toString(number);
       int lengthOfNumber =  numberInString.length();
       int counter = 0;
       while (counter != lengthOfNumber){
       counter = counter + 1;
       double divide =  (number/(int)Math.pow(10,counter))*(int)Math.pow(10,counter);
       int digit = (int)(number % divide);
       System.out.println(digit);
       }
    }}





