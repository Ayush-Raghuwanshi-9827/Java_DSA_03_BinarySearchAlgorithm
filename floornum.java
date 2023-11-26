public class floornum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,12,54,77};
        int ans = BinarySearch(arr, 1);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr,int target){
        if(target < arr[arr.length-1]){
            return -1;
        };
        int start = 0;
        int end = arr.length - 1;
        //  Check first its is Ascending or in Decending Order.
        boolean check = arr[start] < arr[end];
        
            while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
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
   return arr[end];
  }
}
