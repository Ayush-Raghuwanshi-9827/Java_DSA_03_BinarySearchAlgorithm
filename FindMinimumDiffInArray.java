public class FindMinimumDiffInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 10,12, 15};
        int target = 12;
        System.out.println(findMinimumDiffInArray(arr, target));

    }
    static int findMinimumDiffInArray(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        int res = -1;
        //  elemet does not exist
        if (ans == -1) {
            if(end == -1){
                res = Math.abs(target - arr[start]);
            }else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            }else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = (ans1 < ans2)?ans1 : ans2;
            }
     }else{
     res = 0;
     }
     return res;
   }
}
