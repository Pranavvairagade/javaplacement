package classmethod;

public class checkNumberInArray {

    public boolean searchInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        checkNumberInArray obj1 = new checkNumberInArray();
        int[] arr = {5, 10, 15, 20, 25, 30};
        int num = 9;

        boolean result = obj1.searchInArray(arr, num);
        System.out.println(result);
    }

}
