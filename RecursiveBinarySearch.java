public class RecursiveBinarySearch {
    int[] arr;
    public RecursiveBinarySearch(int arr[]){
        this.arr=arr;
    }
    public int binarysearch(int searchelement,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(searchelement==arr[mid]){
                return mid;
            }
            else if (searchelement < arr[mid]) {
                return binarysearch(searchelement, low, mid - 1);
            }
            else{
                return binarysearch(searchelement, mid + 1, high);
            }
        }
        return -1;
    }
}
