package lab1.zad2;

public class Shape {
   public void print() {
      System.out.println(this.getClass().getSimpleName());
   }
   

   public static void main(String[] args) {
      Shape shape = new Shape();
      shape.print();
   }
}

class Main {
   public static void main(String[] args) {
      Shape shape = new Shape();
      shape.print();
   }
}