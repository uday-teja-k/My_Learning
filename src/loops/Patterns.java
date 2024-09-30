package loops;

public class Patterns {
    public static void main(String[] args) {

        int count=0;

        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){
                ++count;

                System.out.format("%02d ", count);

            }
            System.out.println("");
        }

        /* 
        printing j
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5



System.out.format("%02d ", count);
01 02 03 04 05 
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25








printing i+j
2 3 4 5 6 
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10





printing i
1 1 1 1 1 
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/


    }
}
