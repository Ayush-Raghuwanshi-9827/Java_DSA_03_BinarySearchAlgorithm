// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class BinarysearchforInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 28};
        int target = 6;
        System.out.println(CheckRange(arr, target));
        
    }

    static int CheckRange(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int startN = end + 1;
            end = end + (end - start + 1) * 2;
            start = startN;
        } 
      
        return Search(arr, target, start, end);
    }
    static int Search(int[] arr, int target,int start,int end){
            while(start <= end){
                int mid = start + (end - start)/2;
                if(arr[mid] > target){
                   end = mid -1;
                }else if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    
                    return mid;
                }
            }
        return -1;
    }
    
}
