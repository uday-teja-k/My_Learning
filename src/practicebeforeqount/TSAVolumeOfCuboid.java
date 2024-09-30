package practicebeforeqount;

import java.util.Scanner;

public class TSAVolumeOfCuboid {

    public static void main(String args[]){

        int length,breadth,height,TSA,volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter l,b,h values");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        TSA = 2*((length*breadth)+(breadth*height)+(height*length));
        volume = length*breadth*height;
        System.out.println("tsa is"+TSA);
        System.out.println("volume is"+volume);

    }



}
