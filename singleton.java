/*1.Implement a Singleton Class
Problem Statement:
You need to implement a Logger class that follows the Singleton Design Pattern,
ensuring that only one instance of the class is created and used throughout the application.
Requirements:
The class should have a private constructor.
A static method getInstance() should return the same instance of the class every time it is called.
Implement a method log(message: string) that prints the message to the console.
Example:
Logger logger1 = Logger.getInstance();
logger1.log("First log message");

Logger logger2 = Logger.getInstance();
logger2.log("Second log message");
logger1 and logger2 should be the same instance.*/
//code

class Logger {
    private Logger() {}
 public static Logger getInstance() { 
        return LoggerHolder.INSTANCE; 
    }
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        System.out.println(logger1 == logger2);
    }
}


//2nd one
  /*2.Implement Factory Design Pattern
Problem Statement:
You are building a Shape Factory that creates objects of different shapes 
(Circle, Rectangle, Square) based on user input.
Requirements:
Implement a Shape interface with a method draw().
Implement Circle, Rectangle, and Square classes that implement Shape.
Implement a ShapeFactory class with a method getShape(String shapeType) that returns the correct object.
The client should not create objects directly. Instead, it should request them from ShapeFactory.
Example:
ShapeFactory factory = new ShapeFactory();
Shape shape1 = factory.getShape("CIRCLE");
shape1.draw();  // Output: Drawing a Circle
Shape shape2 = factory.getShape("RECTANGLE");
shape2.draw();  // Output: Drawing a Rectangle
*/
  //code
  interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

  class ShapeFactory{
   public shape getShape(String shapeType){
     if(shapeType == null){
       return null;
     }
     if(shapeType.equalsIgnorecase("circle")){
       return new circle();
     }
     els if(shapeType.equalsIgnorecase("rectangle")){
       return new rectangle();
     }
     else if(shapeType.equalsIgnorecase("square")){
       return new square();
     }
     else
       return null;
   }
  }
  public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get objects and call their draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
     
    
