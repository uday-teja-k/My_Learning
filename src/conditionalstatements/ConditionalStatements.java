package conditionalstatements;

import java.util.Scanner;


public class ConditionalStatements {
    public static void main(String[] args){
           
//        int age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter age");
//        age = sc.nextInt();
//        if(age >=14 && age <=55){
//             System.out.println("young");
//        }else{
//             System.out.println("not young");
//        }
//          int maths, science, social;
//          Scanner sc = new Scanner(System.in);
//          System.out.println("enter maths marks");
//          maths = sc.nextInt();
//           System.out.println("enter science marks");
//          science = sc.nextInt();
//           System.out.println("enter social marks");
//          social = sc.nextInt();
//          int avg = (maths+science+social)/3;
//          
//          System.out.println("total marks are "+(maths+science+social)+ "/300");
//          System.out.println("avg of marks are "+avg);
//          if(avg>=90 && avg<=100){
//              System.out.println("O grade");
//          }else if(avg>=80 && avg<=90){
//               System.out.println("A grade");
//          }else if(avg>=70 && avg<=80){
//               System.out.println("B grade");
//          }else if(avg>=40 && avg<=70){
//               System.out.println("C grade");
//          }else{
//              System.out.println("FAIL!!!!");
//          }

//      String num;
//        System.out.println("enter a number");
//        Scanner sc = new Scanner(System.in);
//      num=sc.nextLine();
//      if(num.matches("[01]+")){
//          System.out.println("binary radix 2");
//      } else if(num.matches("[0-7]+")){
//          System.out.println("octal radix 8"); 
//      } else if(num.matches("[0-9]+")){
//           System.out.println("decimal radix 10"); 
//      } else if(num.matches("[0-9A-F]+")){
//          System.out.println("hexa radix 16");
//      }else{
//          System.out.println("not a number");
//      }
  int year ;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter year");
  year = sc.nextInt();
  sc.close();
  
  if(year%4==0){
      if(year%100==0){
          if(year%400==0){
              System.out.println("Leap year");
          }else{
              System.out.println("not leap year");
          }
      }else{
          System.out.println("Leap year");
      }  }else{
      System.out.println("Not leap year");
  }
  
  

        
      
      
      
      

















    }
    
}
