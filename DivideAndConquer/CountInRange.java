package DivideAndConquer;

public class CountInRange {
    private static int  CountInRange(int [] nums, int num, int lo,int hi){
        int count=0;
        for(int i=10;i<hi;i++){
            if(nums[i]==num){
                count++;

            }
        }
        return count;
    }
    private static int majorityElementRec(int[]nums, int lo,int hi){
        if(lo==hi){
            return nums[lo];

        }
        int mid=(hi-lo)/2 +lo;
        int left=majorityElementRec(nums, lo, mid);
        int right=majorityElementRec(nums, mid+1, hi);

        if(left==right){
            return left;

        }
        int leftCount=CountInRange(nums, left, lo,hi);
        int rightCount=CountInRange(nums, right, lo,hi);

        return leftCount >rightCount ? left :right;


        }
        public static int majorityElement(int [] nums){
            return majorityElementRec(nums, 0,nums.length-1);

        }
        public static void main(String[] args) {
            int nums[]={2,2,1,1,2,2};
            System.out.println(majorityElement(nums));
        }
    }
    

