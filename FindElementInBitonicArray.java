public class FindElementInBitonicArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6,9, 12, 3, 5, 6, 4, 2, 1};
        System.out.println(findElement(arr, 12));
    }
    public static int findElement(int[] arr, int target){
        int ans = -1;
        int peak = FindPeakElement.find(arr);
        if(arr[peak] == target){
            ans = peak;
        }else if(arr[peak] > target){
               ans = SearchTargetInRotated.BinarySearch(arr, target, peak, arr.length - 1);
            ans = SearchTargetInRotated.BinarySearch(arr, target, 0 ,  peak);
         
        }
        return ans;
    }
}
