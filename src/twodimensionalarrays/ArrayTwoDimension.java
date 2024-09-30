package twodimensionalarrays;

public class ArrayTwoDimension {

    public static void main(String[] args){

//        int [][]A = new int[3][4];
//        int A[][] = new int[3][3];
//
//        int [][]B = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
//
//        int C[][];
//        C=new int[3][4];
//
//        for(int x[] :B){
//            for(int y:x){
//                System.out.print(y+" ");
//            }System.out.println("");
//        }
//        System.out.println("");


//        int A[][]=new int [5][5];
//        int B[][]={{1,2,3},{2,4,6},{1,3,5}};
//        int C[][];
//        C=new int[4][5];
//
//        int [][]D =new int[4][4];
//        int  []E[] = new int[3][3];
//
//        int[] G,F[];
//        G=new int[5];
//        F=new int[4][3];
        //in the above example G is 1d array and F is 2d array.
        // it basically takes the int[] and F[] so it becomes a 2d array


        int A[][]=new int[5][5];
        int B[][]={{1,2,3},{2,4,6},{1,3,5}};

        for(int i =0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
        System.out.println("");
        }
        System.out.println("");





    }
}
