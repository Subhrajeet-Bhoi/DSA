import java.util.Stack;

public class stockSpan {
    
    // Function to calculate Stock Span for each day
    public static void StockSpan(int stocks[]) {
        Stack<Integer> myStack = new Stack<>();   // Stack stores indices of stock prices
        int span[] = new int[stocks.length];      // Span array to store result
        
        // First day's span is always 1 (only itself)
        span[0] = 1;
        myStack.push(0);   // Push index of the first stock
        
        // Loop through rest of the days
        for (int i = 1; i < stocks.length; i++) {
            int current = stocks[i];   // Current day's stock price
            
            // Pop all previous days with stock price <= current price
            while (!myStack.isEmpty() && current >= stocks[myStack.peek()]) {
                myStack.pop();
            }
            
            // If stack is empty → all previous days are smaller
            if (myStack.isEmpty()) {
                span[i] = i + 1;   // Span is entire range (0...i)
            } else {
                // Otherwise span is difference between current day and previous higher day
                int prevHigh = myStack.peek();
                span[i] = i - prevHigh;
            }
            
            // Push current day's index into stack
            myStack.push(i);
        }
        
        // Print span array
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 75, 85};
        StockSpan(stocks);   // Call function
    }
}
