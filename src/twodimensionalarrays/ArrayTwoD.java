package twodimensionalarrays;

public class ArrayTwoD {

    public static void main(String[] args){

        int [][]A = new int[3][4];
//        int A[][] = new int[3][3];

        int [][]B = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};

        int C[][];
        C=new int[3][4];

        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }System.out.println("");
        }
        System.out.println("");

    }
}
