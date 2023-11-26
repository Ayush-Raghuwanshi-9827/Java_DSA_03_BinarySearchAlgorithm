public class SearchTargetInRotated {
    public static void main(String[] args) {
       int[] arr = {5,6,7,8,9,0,1,2,3};
       System.out.println(findMin(arr));
       int target = 7;
       int pivot = findPivot(arr);
       System.out.println(pivot);
       if(pivot != -1){
        if(pivot > target){
           int answer = BinarySearch(arr, target, pivot+1 , arr.length -1);
           System.out.println(answer);
        }else{
           int answer2 = BinarySearch(arr, target, 0 , pivot -1);
           System.out.println(answer2);
        }
       }
        
    }
    // this will not work for Duplicate value:
    static int BinarySearch(int[] arr,int target,int start , int end){
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

    static int findPivot(int[] arr){
        // {5,6,7,8,9,0,1,2,3};
       int start = 0;
       int end = arr.length-1;
       while(start <= end){
        int mid = start + (end - start)/2;
        // 4 cases
        if(mid < end && arr[mid] > arr[mid+1]){
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid-1]){
            return mid-1;
        }
        if(arr[mid] <= arr[start]){
            end = mid-1;
        }else{
            start = mid +1;
        }
       }    
       return -1;
    }
    static int findMin(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) /2;
            if(mid > 0 && arr[mid] < arr[mid - 1]){
                return mid;
            }
            if (arr[mid] < arr[end]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
