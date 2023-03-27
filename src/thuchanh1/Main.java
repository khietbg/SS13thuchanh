package thuchanh1;

import java.util.Scanner;

public class Main {
    static int[] list={2,4,7,11,24,50,54,60,67,70,87,90,100};
    static int BinarySearch(int[] list,int key)

    {
        int low = 0;
        int high = list.length - 1;
        while (high>=low) {
            int mid = (high + low) / 2;
            if (key<list[mid]){
                high=mid-1;
            }else if (key == list[mid]){
                return mid;
            }else {
               low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap key muon tim trong mang");

        System.out.println(BinarySearch(list,Integer.parseInt(scanner.nextLine())));
    }
}