
import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();

        int n = prices.length;

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }

            int discount = st.isEmpty() ? 0 : st.peek();

            prices[i] = prices[i] - discount;

            st.push(prices[i] + discount);
        }

        return prices;
    }
}
