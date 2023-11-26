import java.util.Arrays;

public class FindFirstandend {
    public static void main(String[] args) {
        
        int[] arr = {1 ,2 , 3 ,3 , 3 ,3 ,4 ,4 ,5 ,5, 6, 6};
        int target  = 2;
        int[] ans = {0,0};
        int start = SearchAns(arr, target, true);
        int end = SearchAns(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
         
    }
    public static int SearchAns(int[] nums ,int target ,boolean firstIndex){
         int start = 0;
         int end = nums.length - 1;
         int ans = -1;
         
         while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if(firstIndex){
                    end = mid - 1; 
                }else{
                    start = mid + 1; 
                }
            }
         }

         return ans;
    }
}
