package arrays;

import java.util.Scanner;

public class SearchElementsInArray {

    public static void main(String[] args){
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key;
        System.out.println("enter key ");
        Scanner sc = new Scanner(System.in);
        key=sc.nextInt();
        sc.close();
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println("Element found at index: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
}
