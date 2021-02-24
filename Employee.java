public class Employee extends Teacher {
    int id;
    String subject ;

    public static void main(String[] args) {

        System.out.println("you are in employee class ,and it is a child class");
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();

        obj1.id= 89;
        obj1.subject="micro_controller";
        System.out.println(obj1.collegename);
        System.out.println(obj1.department);
        System.out.println(obj1.id);
        System.out.println(obj1.subject);
        obj1.does();

        obj2.id= 90;
        obj2.subject="micro_processor";
        System.out.println(obj2.collegename);
        System.out.println(obj2.department);
        System.out.println(obj2.id);
        System.out.println(obj2.subject);
        obj2.does();



    }

}
