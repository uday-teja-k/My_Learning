package conditionalstatements;

import java.util.Scanner;

public class ConditionalStatementsOne {
    
    public static void main(String[]args){
        
  
    
    //          int n=-100;
//          if(n>=0){
//              System.out.println("Positive");
//          }else{
//              System.out.println("Negative");
//          }  
          //        float a=5.5f,b=10.3f,c=15.9f;
//        System.out.println(a<b || a>c);

//          int a=5,b=15,c=-4;
//          if(a>b && a>c){
//              System.out.println(a);
//          }else if(b>c){
//              System.out.println(b);     
//          }else{
//              System.out.println("c");
//          }

        /*   
           Scanner sc = new Scanner(System.in);
           System.out.println("enter number");
           int num = sc.nextInt();
           if(num%2==0)
           {
               System.out.println("even");
           }
           else
           {
               System.out.println("odd");
           }
          */
    /*int day;
    Scanner sc = new Scanner(System.in);
        System.out.println("enter day number");
        day = sc.nextInt();
        
        if(day==0){
           System.out.println("sunday");
        }else if(day==1){
            System.out.println("monday");
        }else if(day==2){
            System.out.println("tuesday");
        }else if(day==3){
            System.out.println("wednesday");
        }else if(day==4){
            System.out.println("thursday");
        }else if(day==5){
            System.out.println("friday"); 
        }else if(day==6){
            System.out.println("saturday");
        }else{
            System.out.println("invalid number");
        }*/
    /*
    String url;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter url");
    url = sc.nextLine();
    String protocol = url.substring(0,url.indexOf(':'));
    if (protocol.equals("http")){
        System.out.println("Hyper Text Transfer Protocol");
    }else if(protocol.equals("https")){
        System.out.println("Hyper Text Transfer Protocol Secured");
    }else if(protocol.equals("ftp")){
         System.out.println("File Transfer Protocol");
    }else{
        System.out.println("invalid protocol");
    }
    
    if(url.endsWith(".com")){
        System.out.println("commercial website");
    }else if(url.endsWith(".in")){
        System.out.println("also commercial website");
    }else if(url.endsWith(".io")){
        System.out.println("Tech Startup company");
    }else if(url.endsWith(".org")){
        System.out.println("some organization");
    }else if(url.endsWith(".gov")){
        System.out.println("government organization");
    }else{
        System.out.println("some other website");
    }
    */
   /* int n = 3;
    if(n==1){
        System.out.println("one");
    }else if(n==2){
        System.out.println("one");
    }else if(n==3){
        System.out.println("three");
    }else{
        System.out.println("na");
    }
    
    */
 /*  String n= "1";
        switch(n) {
            case "1":System.out.println("one");
                break;
            case "2":System.out.println("two");
                break;
            case "3":System.out.println("three");
                break;    
            default: System.out.println("invalid");
        }
        
    */
/*  int day =110;
   switch(day){
       case 1: System.out.println("sunday");
               break;
       case 2: System.out.println("monday");
               break;
       case 3: System.out.println("tuesday");
               break;
       case 4: System.out.println("wednesday");
               break;
       case 5: System.out.println("thursday");
               break;
       case 6: System.out.println("friday");
               break;
       case 7: System.out.println("saturday");
               break;
       default: System.out.println("invalid");
               break;
   }

*/
   /*
   int number = 5;
   switch(number){
       case 1: System.out.println("january");
       break;
        case 2: System.out.println("feb");
       break;
        case 3: System.out.println("mar");
       break;
        case 4: System.out.println("apr");
       break;
        case 5: System.out.println("may");
       break;
        case 6: System.out.println("jun");
       break;
        case 7: System.out.println("july");
       break;
        case 8: System.out.println("aug");
       break;
        case 9: System.out.println("sep");
       break;
        case 10: System.out.println("oct");
       break;
        case 11: System.out.println("nov");
       break;
        case 12: System.out.println("dec");
       break;
        default: System.out.println("invalid");
        break;   }
   */
   /*
   String url ="google.net";
   
//   String extension = url.substring(url.indexOf('.'));
   System.out.println(url.lastIndexOf(".")+1);
   String extension = url.substring(url.lastIndexOf(".")+1);
   System.out.println("extension is "+extension);
   switch (extension){
       case "com": System.out.println("commercial website");
       break;
       case "gov": System.out.println("government website");
       break;
       case "net": System.out.println("network !!!!!!!!!");
       break;
       case "io": System.out.println("tech startup company");
       break;
       default: System.out.println("invalid");
       break;
   }
 */
   
   
   System.out.println("Enter the two numbers");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   sc.nextLine();
   System.out.println("enter the operation you need to perform");
   String str= sc.nextLine();
   str = str.toUpperCase();
   sc.close();
   
   switch(str){
       case "ADD": System.out.println("sum is "+(a+b));
       break;
       case "SUB": System.out.println("Sub is "+(a-b));
       break;
       case "MUL": System.out.println("mul is "+(a*b));
       break;
       case "DIV": System.out.println("div is "+(a/b));
       break;
       default: System.out.println("invalid");
       
   }
 
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
