package Stack;
import java.util.*;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String res = simplify(path);
        System.out.println(res);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<>();
        int i = 0;
        int len = A.length();

        while (i < len) {
            while (i < len && A.charAt(i) == '/') {
                i++;
            }

            String dir = "";
            while (i < len && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if (dir.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!dir.equals("") && !dir.equals(".")) {
                st.push(dir);
            }
        }

        // Construct the simplified path
        if (st.isEmpty()) return "/";

        StringBuilder res = new StringBuilder();
        for (String dir : st) {
            res.append("/").append(dir);
        }

        return res.toString();
    }
}
