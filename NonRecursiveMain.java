import java.util.Scanner;

class NonRecursiveMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in array in sorted way:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        NonRecursiveBinarySearch obj=new NonRecursiveBinarySearch(arr);
        System.out.print("Enter element to be search:");
        int searchelement=sc.nextInt();
        int result=obj.binarysearch(searchelement);
        if(result==-1){
            System.out.println(searchelement+" not found ");
        }
        else {
            System.out.println(searchelement+" found");
        }
    }
}
