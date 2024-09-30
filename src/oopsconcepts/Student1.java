package oopsconcepts;

public class Student1 {

    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public int average(){
        return (m1+m2+m3)/3;
    }
    public int grade(){
        if( total()>250)
            return 10;
        else if(total()<250&&total()>200)
            return 9;
        else
            return 7;
    }
    public String toString(){  //changed to toString from details
        return "Roll no: "+roll+"\n"+"name: "+name+"\n"+"Course: "+course+"\n";

    }





}
