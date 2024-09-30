package loops;

public class PatternsThree {

    public static void main(String []args){
    // int count=0;
    
       for(int i=1;i<=5;i++){
        for(int j =1;j<=5;j++){
            // if(j>=i)
            if(i+j>5)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
          for(int j=1;j<=i-1;j++){
            System.out.print("* ");

          }
          System.out.println();
}

for(int i=1;i<=5;i++){
    for(int j =1;j<=4;j++){
        // if(j>=i)
        if(j>=i)
        System.out.print("* ");
        else
        System.out.print("  ");
    }
      for(int j=1;j<=5-i+1;j++){
        System.out.print("* ");

      }
      System.out.println();
}
    

    }
}

