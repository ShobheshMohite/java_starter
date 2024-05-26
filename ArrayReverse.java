public class ArrayReverse{

    public static void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println("Original Array");
        printArray(nums);

        reverseArray(nums);

        System.out.println("Reversed Array");
        printArray(nums);
    }

    public static void printArray(int[] nums){
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}