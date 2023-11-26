public class Binaysearchfirst {
    public static void main(String[] args) {
        // int[] arr = {3232,323,43,33,22,11,5,3,2,1};
        int[] arr = {1,2,3,4,5,22,33,44,55,66};
        int target = 22;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //  Check first its is Ascending or in Decending Order.
        boolean check = arr[start] < arr[end];
            while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(check){
                if(target < arr[mid]){
                 end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                 if(target > arr[mid]){
                 end = mid - 1;
                }
                else if(target < arr[mid]){
                start = mid + 1;
                }
            }
        
    }
   return -1;
  }
}
