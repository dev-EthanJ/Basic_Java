class Student {
    String name;
    String address;
    String phone;
    String email;

    public Student(String name) { this.name = name; }
    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student)obj;

        if (this.name == null)  {
            if (other.name != null) return false;
        } else if (!this.name.equals(other.name)) return false;

        if (this.address == null)  {
            if (other.address != null) return false;
        } else if (!this.address.equals(other.address)) return false;
        
        if (this.phone == null)  {
            if (other.phone != null) return false;
        } else if (!this.phone.equals(other.phone)) return false;
        
        if (this.email == null)  {
            if (other.email != null) return false;
        } else if (!this.email.equals(other.email)) return false;

        return true;
    }
}

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manage = new ManageStudent();
        
        /*
        Student[] student = null;
        student = manage.addStudent();
        manage.printStudents(student);
        */

        manage.checkEquals();
        manage.checkSame();
    }

    public Student[] addStudent() {
        Student[] studentArr = new Student[3];

        studentArr[0] = new Student("Kim");
        studentArr[1] = new Student("Lee");
        studentArr[2] = new Student("Park", "Seoul", "1234-5678", "abc@mail.com");

        return studentArr;
    }

    public void printStudents(Student[] student) {
        for(Student stu: student) {
            System.out.println(stu);
        }
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "01012345678", "abc@mail.com");
        Student b = new Student("Min", "Seoul", "01012345678", "abc@mail.com");

        if (a.equals(b)) System.out.println("Equal");
        else System.out.println("Not Equal");

    }

    public void checkSame() {
        Student a = new Student("Min", "Seoul", "01012345678", "abc@mail.com");
        Student b = new Student("Min", "Seoul", "01012345678", "abc@mail.com");

        if (a == b) System.out.println("Same");
        else System.out.println("Not Same");    

    }
}
