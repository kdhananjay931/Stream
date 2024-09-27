import java.util.ArrayList;
import java.util.List;

class Student {
 private  int roll_no;
 private  String name;
 private  String Address;

     public Student(int roll_no, String name, String address) {
         this.roll_no = roll_no;
         this.name = name;
         this.Address = address;
     }

     public int getRoll_no() {
         return roll_no;
     }

     public void setRoll_no(int roll_no) {
         this.roll_no = roll_no;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getAddress() {
         return Address;
     }

     public void setAddress(String address) {
         Address = address;
     }

     public static void main(String[] args) {
         List<Student> std=new ArrayList<>();
         std.add(new Student(1,"Raju","Patna"));
         std.add(new Student(2,"Rahul","Delhi"));
         std.add(new Student(3,"Reema","Ranchi"));

         List<Student> Studentaccordingtoroll = new ArrayList<>();
         for (Student stud : std) {
             if (stud.getRoll_no()>1 && stud.getAddress().equalsIgnoreCase("Ranchi")) {
                 Studentaccordingtoroll.add(stud);
             }
         }

         System.out.println("Student whose Roll no is greater than 1 and from ranchi");
         for (Student Studentaccording:Studentaccordingtoroll) {
             System.out.println("Name: " + Studentaccording.getName() + ", Address: "
                     + Studentaccording.getAddress() + ", Roll No: " + Studentaccording.getRoll_no());
         }
     }
 }
