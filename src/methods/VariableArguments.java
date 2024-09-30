package methods;

public class VariableArguments {

    static void show(int...s){
        for(int i:s){
            System.out.println(i);
        }
    }

    static void show1(int x, int...d){
        System.out.println(x);
        for(int i:d){
            System.out.println(d);
        }
    }
    static void showList(int start,String ...s){
        for(int i=0;i<s.length;i++){
            System.out.println(start+". "+s[i]);
            start++;
        }
        for(String i:s){
            System.out.println(i);
        }

    }

    public static void main(String... args){
//        show(20,22,23,43,4,5,5,6,6,7,67,67,768,78);
        show(new int[]{1,2,3,4,4,5,6,6,6});  //anonymous array
        int s= 45;


        show1(44);
        //varargs should be at last in the parameters
        int a=10,b=20,c=30,d=40;
        System.out.printf("%d%d%d%d",a,b,c,d);
        System.out.println("");

        showList(10,"Uday","Ahmed","Divya","Mark","Vaishnavi");







    }


}
