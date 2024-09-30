package regularexpressions;


public class RegularExpressions {
    
    public static void main(String args[]){
        
//        String str1="abcd";
        
//        System.out.println(str1.matches("abcd"));
        
//        String str2="#";
//        System.out.println(str2.matches("\\W")); 

//          String str1 = "esrssgfssss";
//          System.out.println(str1.matches("[a-z]{5,10}"));

//          String str1 = "uda_y@gmail.com";
//          System.out.println(str1.matches("\\w*@gmail(.*)"));

            String str = "programmer@hotmail.com";
            
            int i = str.indexOf("@");
            String username = str.substring(0,i);
            String domainname = str.substring(i+1,str.length());
            System.out.println("Username " +username);
            System.out.println("Domain "+domainname);
            
            int j = domainname.indexOf('.');
            String name = domainname.substring(0,j);
            System.out.println(name.equals("gmail"));
            
            
            
            
            
            
            
            
            





            
 
          
          



        
        
         
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
