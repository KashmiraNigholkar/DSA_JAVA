package Stack;
import java.util.Stack;

public class TrappingRainWater {
    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int distance = i - stack.peek() - 1;
                int bounded_height = Math.min(height[i], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water: " + maxWater(arr));
    }
}
