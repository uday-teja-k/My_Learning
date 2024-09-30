package methods;

public class MethodPractice {
    static void update(int D[]){
        D[0]=25;
    }
   public static void main(String [] args){
       int D[] = {3,4,5,6,7,8};
       update(D);
       System.out.println(D[0]);
       System.out.println(D[1]);
       System.out.println(D[2]);
       System.out.println(D[3]);
       System.out.println(D[4]);

   }
}
