public class parent {
    public void display(){
        System.out.println("display method of parent clas");
    }

}
 class child extends parent{
    public void display(){
        //super.display();
        System.out.println("display method of child class");
    }

     public static void main(String[] args) {
         child obj1 = new child();
         obj1.display();

     }

}
