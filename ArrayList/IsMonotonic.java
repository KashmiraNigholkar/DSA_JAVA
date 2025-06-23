package Practise;
import java.util.ArrayList;

public class IsMonotonic {
    public boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean desc = true;

        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1)) {
                inc = false;
            }
            if (A.get(i) < A.get(i + 1)) {
                desc = false;
            }
        }

        return inc || desc;
    }
}
