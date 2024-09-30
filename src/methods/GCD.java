package methods;

public class GCD {
    int gcd(int m,int n){
        while(m!=n){
            if(m>n) m =m-n;
            else n=n-m;
            }
        return m;  //since both are equal you can return either m or n value
        }
    public static void main(String [] args){
         GCD gcd = new GCD();

    System.out.println(gcd.gcd(100,50));

}
}
