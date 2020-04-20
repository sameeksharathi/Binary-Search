public class NonRecursiveBinarySearch {
    int[] arr;
    public NonRecursiveBinarySearch(int arr[]){
        this.arr=arr;
    }
    public int binarysearch(int searchelement){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(searchelement==arr[mid]){
                return mid;
            }
            else if (searchelement < arr[mid]) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
