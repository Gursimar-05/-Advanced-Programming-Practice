class student{
    int  year;
    String name;
    int roll;
    String dep;
    void display(){
        System.out.println("--------student details---------");
        System.out.println("name of the student is : "+ name);
        System.out.println("registration number :"+roll);
        System.out.println("year of study :"+year);
        System.out.println("department "+dep);
    }
    public class main{
        public static void main (String []args){
           student s = new student();
           s.name=sahil;
           s.year=2026;
           s.dep=cintel;
           s.roll=015;
           s.display();
        }
    }
}