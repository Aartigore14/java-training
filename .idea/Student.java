public class Student{
    private int id;
    private String name;
    private double marks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if (marks >=0 && marks <= 100) {
            this.marks = marks;
        }
        else{
            System.out.println("Invalid Marks..enter marks between 0 to 100");
        }
    }

    static void main() {
        Student s = new Student();
        s.setId(1);
        s.setName("Aarti");
        s.setMarks(89);
        System.out.println("Student Details");
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Marks: "+s.getMarks());
    }

}