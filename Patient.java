import java.util.ArrayList;
import java.util.List;

class Patient {

    private String name;
    private String city;
    private int id;
    private int age;

    public Patient(int id,String name,String city,int age) {
        this.id = id;
        this.age=age;
        this.name=name;
        this.city=city;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String address) {
        city = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        List<Patient> patient=new ArrayList<>();
        patient.add(new Patient(1,"Ramesh","Bengaluru",34));
        patient.add(new Patient(2,"Ritu","Patna",32));
        patient.add(new Patient(3,"Rahul","Pune",18));
        patient.add(new Patient(4,"Some","Hyderabad",50));

        List<Patient> patient1=new ArrayList<>();
        for(Patient patient2:patient) {
            if (patient2.getCity().equalsIgnoreCase("patna") && patient2.getAge() >30) {
                patient1.add(patient2);

            }
        }

        for(Patient patient3 :patient1){
            System.out.println(patient3.getName());
        }
    }

}
