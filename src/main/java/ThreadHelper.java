public class ThreadHelper {

    public static int fib(final int numberToCalculate) throws Exception {
        final FibCalculator calculator = new FibCalculator(numberToCalculate);
        calculator.start();
        calculator.join();
        return calculator.getResult();
    }

    private static class FibCalculator extends Thread {
        // BEGIN (write your solution here)
        private int number;
        private int fibfirst=1;
        private int fibsecond=1;
        private int result;

        public FibCalculator(final int numberToCalculate){
            this.number=numberToCalculate;
        }

        public void run(){
            result=fibonachi(number);
        }

        private int fibonachi(final int num){
            if (num==1) return fibfirst;
            if (num==2) return fibsecond;
            return fibonachi(num-1)+fibonachi(num-2);
        }

        public int getResult(){
            return result;
        }
        // END
    }

}
