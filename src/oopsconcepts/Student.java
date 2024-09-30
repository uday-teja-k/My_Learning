package oopsconcepts;

public class Student {

    public static void main(String[] args){

        Student1 s1 = new Student1();


        s1.m1=98;
        s1.m2=98;
        s1.m3=97;
        s1.course="B.Tech";
        s1.roll=1701040;
        s1.name="uday";

        System.out.println("total marks: "+s1.total());
        System.out.println("average: "+s1.average());
        System.out.println("grade: "+s1.grade());
        System.out.println(s1);

        //here we remove .details method call and we just let s1 stay
        //even this works
        //changed the method details name to totstring from details
//if tostring method is there. automatically the object will call

    }


















































}
//    public int rollno;
//    public String name;
//    public String course;
//    public int m1,m2,m3;
//
//
//    public int totalmarks()
//    {
//
//    }
//    public float averagemarks()
//    {
//
//    }

