public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = { 'c' , 'f' , 'j', 'l', 'n', 'p' , 'q'};
        char target = 'o';
        System.out.println(findLetterGreaterThanTarget(arr, target));

    }
    static char findLetterGreaterThanTarget(char[] letters, char target){
     char ans = '$';
     int start = 0;
     int end = letters.length - 1;
     while (start <= end) {
        int mid = start + (end - start) /2;
        if(letters[mid] <= target){
          start = mid + 1;
        }
        else {
            end = mid - 1;
            ans = letters[mid];
        }
     }
     return (ans == '$')?letters[0]:ans;
    }
}
