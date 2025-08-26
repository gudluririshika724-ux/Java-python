public class Maths {
    public int divide(int dividend, int divisor) {
        // special overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        return(int) Math.ceil(dividend / divisor); // safe otherwise
    }
    
}
