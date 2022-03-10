package week1;

public class BinarySearch {
    public static void binarySearch (int key, int [] arr) {
        int mid;
        int left = 0;
        int right = arr.length;
        while (right > left) {
            mid = (left + right) / 2;

            if(arr[mid] == key) {
                System.out.println("find key!! The key "+key+" is located at "+mid+" in array");
                return; // break;
            }

            if(arr[mid] > key) {
                right = mid - 1;
            }else if (arr[mid] < key) {
                left = mid + 1;
            }
        }
    }
}
