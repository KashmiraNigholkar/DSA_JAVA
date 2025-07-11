package Stack;
import java.util.Stack;

public class DecodeAString {

    static String decode(String str) {
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String currStr = "";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--; // step back since the for loop also increases i
            } else if (ch == '[') {
                intStack.push(num);
                strStack.push(currStr);
                currStr = "";
                num = 0;
            } else if (ch == ']') {
                int count = intStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j = 0; j < count; j++) {
                    temp.append(currStr);
                }
                currStr = temp.toString();
            } else {
                currStr += ch;
            }
        }

        return currStr;
    }

    public static void main(String[] args) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));
    }
}
