package methods;

public class MaxOfNumVaragrs {

    static int max(int... s) {

        if (s.length == 0) return Integer.MIN_VALUE;
        int max = s[0];
        for (int i = 1; i < s.length; i++)
            if (s[i] > max) max = s[i];
        return max;
    }




    public static void main(String[] args){

    System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30,40));

}
}
