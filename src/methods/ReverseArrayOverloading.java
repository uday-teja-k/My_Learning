package methods;

public class ReverseArrayOverloading {

    static int  reverse(int n) {
    int rev=0;
    while(n!=0){
        rev = rev*10+n%10;
        n=n/10;
    }
    return rev;
    }

    static void reverse(int[] A){
        for(int i=A.length-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int A[] = new int[5];
        int B[] = {1, 2, 3, 4, 5, 6};

        System.out.println(reverse(345));

    }
}

