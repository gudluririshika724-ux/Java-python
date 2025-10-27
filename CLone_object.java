class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CLone_object {
    public static void main(String args[]) {
        try {
            Student s1 = new Student(1, "Suresh");
            Student s2 = (Student) s1.clone();

            System.out.println(s2.id + " " + s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
