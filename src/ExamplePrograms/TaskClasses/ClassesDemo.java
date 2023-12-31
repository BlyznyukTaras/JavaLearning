package src.ExamplePrograms.TaskClasses;

import src.ExamplePrograms.TaskClasses.EasyClasses.Book;
import src.ExamplePrograms.TaskClasses.EasyClasses.Circle;
import src.ExamplePrograms.TaskClasses.EasyClasses.Rectangle;
import src.ExamplePrograms.TaskClasses.HardClasses.Clock;
import src.ExamplePrograms.TaskClasses.HardClasses.Library;
import src.ExamplePrograms.TaskClasses.MediumClasses.BankAccount;
import src.ExamplePrograms.TaskClasses.MediumClasses.Car;
import src.ExamplePrograms.TaskClasses.MediumClasses.Student;

public class ClassesDemo {
    public static void main(String[] args) {
        firstClass: {
            var someObj = new FirstClass();
            var anotherObj = new FirstClass(15, 30, 45);
            System.out.println(someObj.getSum());
            System.out.println(anotherObj.getSum() * 10);
            var copyObj = new FirstClass(anotherObj);
            System.out.println(copyObj.getSum());
        }
        System.out.println();
        bookClass: {
            var ktBook = new Book("Head First Kotlin", "Dawn Griffiths and David Griffiths", 2019);
            ktBook.showBookInfo();
        }
        System.out.println();
        circleClass: {
            var genericCircle = new Circle(8);
            System.out.println("\nRadius of circle: " + genericCircle.GetRadius() +
                    ", its area: " + genericCircle.areaOfCircle() + ", its length: " + genericCircle.lengthOfCircle());
        }
        System.out.println();
        rectangleClass: {
            var genericRect = new Rectangle(17, 25);
            System.out.printf("The area of your rectangle: %d, " +
                    "its perimeter: %d\n", genericRect.rectArea(), genericRect.rectPerimeter());
        }
        System.out.println();
        bankAccountClass: {
            var bankAcc = new BankAccount("Peter Piper");
            bankAcc.addToBal(500); bankAcc.withdrawFromBal(150);
            bankAcc.withdrawFromBal(650);
            bankAcc.outputInfo();
        }
        System.out.println();
        carClass: {
            var someCar = new Car();
            someCar.speedUp(200);
            someCar.speedUp(50);
            someCar.slowDown(125);
            someCar.outputInfo();
        }
        System.out.println();
        studentClass: {
            var someStudent = new Student("Laborant Chair", 18);
            someStudent.addSubject("Mathematical analysis");
            someStudent.addSubject("Object-oriented programming");
            someStudent.addSubject("Algorithms and data structures");
            someStudent.addSubject("Foreign language");
            someStudent.showStudInfo();
        }
        System.out.println();
        libraryClass: {
            var stockLibrary = new Library("Rainbow");
            stockLibrary.addBook("George Orwell", "1984");
            stockLibrary.addBook("George Orwell", "Animal Farm");
            stockLibrary.addBook("Dawn Griffiths and David Griffiths", "Head First Kotlin");
            stockLibrary.showBooks();
            stockLibrary.searchBooksByAuthor("George Orwell");
            stockLibrary.removeBookByName("1984");
            stockLibrary.searchBooksByAuthor("George Orwell");
            stockLibrary.removeBookByName("Animal Farm");
            stockLibrary.showBooks();
        }
        System.out.println();
        clockClass: {
            var newClock = new Clock();
            newClock.show24Hours();
            var otherClock = new Clock(24, 15, 11);
            otherClock.show12Hours();
            newClock.show12Hours();
            newClock.changeTime(15, 11, 39);
            newClock.show12Hours();
        }
    }
}
