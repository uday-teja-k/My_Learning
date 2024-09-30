package constructors;
class Subject{

    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public String getSubId(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtained(){return marksObtained;}

    public void setMaxMarks(int mm){maxMarks=mm;}
    public void setMarksObtained(int mo){marksObtained=mo;}

    //we are not writing set methods for subid and name as those are
    //mandatory fields and required to be given while creating object of the class

    public Subject(String subId, String name, int marksObtained){
        this.subId=subId;
        this.name=name;
        this.marksObtained= marksObtained;
        setMaxMarks(100);
    }
    public Subject(String subId, int maxMarks, String name){
        this.subId=subId;
        this.maxMarks= maxMarks;
        this.name=name;
        setMarksObtained(20);
    }
    boolean isQualified(){
        return marksObtained>=maxMarks/10*4;
    }
    public String toString(){
        return "\nSubject ID: "+subId+"\nSubject name: "+name+"\nMarks Obtained: "+marksObtained;
    }
}
public class College {
    public static void main(String [] args){
        //this is one way to create array of objects
        // this will create an array of size 3 and will contain references
        // of the 3 objects that will be created
        //we must now create object of a subject
//        Subject subs[] = new Subject[3];
//        subs[0] =new Subject("s101","maths",98);
//        subs[1] =new Subject("s102","algorithms",97);
//        subs[2] =new Subject("s103",90,"Data Structures");




        //another way to do this is to
        Subject s1 =new Subject("s101","maths",98);
        Subject s2 =new Subject("s102","algorithms",97);
        Subject s3 =new Subject("s103",90,"Data Structures");
        Subject subs[]  = {s1,s2,s3};
        // subs[0]=s1; subs[1]=s2; subs[2]=s3; this is how these are stored


//        for(Subject i:subs){
//            System.out.println(i);
//
//        }

        for(int i=0; i<3;i++){
            System.out.println(subs[i]);
            //above line is executing the entire class subject and also calling
            //tostring method
            System.out.println("max marks: "+subs[i].getMaxMarks());
            System.out.println(subs[i].isQualified());
        }




    }
}
