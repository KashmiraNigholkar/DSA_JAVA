package Queue.PractiseSet;
import java.util.*;

public class JobSequencingProblem {

    static class Job {
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.job_id = job_id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr) {
        // Step 1: Sort jobs by deadline (ascending)
        Collections.sort(arr, (a, b) -> a.deadline - b.deadline);

        int n = arr.size();
        ArrayList<Job> result = new ArrayList<>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> b.profit - a.profit);

        // Step 2: Traverse from end to start
        for (int i = n - 1; i >= 0; i--) {
            int slotAvailable;
            if (i == 0) {
                slotAvailable = arr.get(i).deadline;
            } else {
                slotAvailable = arr.get(i).deadline - arr.get(i - 1).deadline;
            }

            maxHeap.add(arr.get(i));
            while (slotAvailable > 0 && !maxHeap.isEmpty()) {
                Job job = maxHeap.poll();
                result.add(job);
                slotAvailable--;
            }
        }

        // Step 3: Sort final result by deadline or any desired order
        Collections.sort(result, (a, b) -> a.deadline - b.deadline);

        // Step 4: Print result
        for (Job job : result) {
            System.out.print(job.job_id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        System.out.println("Following is the maximum profit sequence of jobs:");
        printJobScheduling(arr);
    }
}
