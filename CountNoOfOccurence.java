public class CountNoOfOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,4,4};
        int first = FindFirstandend.SearchAns(arr, 44, true);
        int last = FindFirstandend.SearchAns(arr, 44, false);
        if(first == -1){
            System.out.println("Target is not found in the array");

        }else{
            System.out.println("No of Occurence is : "+ ((last - first) + 1) );
        }
    }
    
}
