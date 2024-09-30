package loops;

public class PatternsTwo {
    
    public static void main(String[] args) {
        // int count=0;
        
        for(int i=1;i<=5;i++){
            for(int j =1;j<=5-i+1;j++){
                System.out.print("*"+" ");

            }
            System.out.println("");
    }
    }
}


/*
  for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
 1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5


  System.out.print("*"+" ");
* 
* *
* * *
* * * *
* * * * *




 */
