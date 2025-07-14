import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] =   {2, 4, 6, 8, 7, 9};

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;       // activity index
            activities[i][1] = start[i]; // start time
            activities[i][2] = end[i];   // end time
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // sort by end time

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
    }
}
