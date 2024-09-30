package methods;

public class Discount {

    static int discount(int...D){
        int sum=0;
        for(int x:D){
            sum = sum+x;
        }
        if(sum<500){
        return sum=sum-10;

        }else if(sum>500 && sum<1000){
                return sum=sum-20;
        }else{
               return sum=sum-30;
        }
    }
    public static void main(String[] args){
        System.out.println(discount(1200));

    }
}
