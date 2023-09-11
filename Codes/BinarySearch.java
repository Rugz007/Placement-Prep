public class BinarySearch
{
    public BinarySearch() {
        int[] arr = {1,2,3,4,6,7,9,10,14,20,43,64};
        binarySearch(arr, arr.length - 1, 0, 2);
    }

    public static void main(String[] args) {
        Object bs = new BinarySearch();
    }
    void binarySearch(int[] arr, int high,int low,int key) {
        if (high < low)
        {
            System.out.println("Element not found");
            return;
        }
        else if(high == low)
        {
            if(arr[low] == key)
            {
                System.out.println("Found the element" + low);
                return;
            }
            else
            {
                System.out.println("Element not found");
                return;
            }
        }
       
        int mid = (high+low) / 2;
        if(key == arr[mid])
        {
            System.out.println("Element found at" + mid);
            return;
        }
        else if(key > arr[mid])
        {
            binarySearch(arr, high, mid + 1, key);
        }
        else if(key <= arr[mid])
        {
            binarySearch(arr, mid - 1, low, key);
        }
    }
}