//Interfaces

//Write a program to define a queue interface and have insert and delete methods in the interface. Implement these methods in a class


public interface Queue {

   void insert(int num);
   void delete(int num);

}
class Mypractice implements Queue {

    @Override
    public void insert(int num) {
        System.out.println("Inserting numbers" + num);
    }

    @Override
    public void delete(int num) {
        System.out.println("deleting numbers from queue" +num);
    }
    void getDetails(){
        System.out.println("get details");
    }
}
class Practice {
    public static void main(String[] args) {

       Mypractice s = new Mypractice();
       Queue q = new Mypractice();
        q.insert(3);
        q.delete(5);
        s.getDetails();
    }
}