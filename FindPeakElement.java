public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;
            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            }else if(arr[mid] > arr[prev]){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
