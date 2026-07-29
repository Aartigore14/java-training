public class Person {;
    String name;
    int age;
    void displayPersonInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
};

class Employee extends Person{
    int empId;
    double salary;
    void displayEmp(){
        displayPersonInfo();
        System.out.println("Employee ID: "+empId);
        System.out.println("Salary:"+salary);
    }

    static void main() {
        Employee e = new Employee();
        e.name="Aarti Gore";
        e.age=21;
        e.empId=201;
        e.salary=50000;
        e.displayEmp();
    }
}
