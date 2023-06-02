import lib.oop2.Human;
// import lib.std.StdOut;
import java.io.File;

public class Hello {
    public static void main(String[] args) {

        Human linee = new Human();
        linee.sleep();
        linee.speak("Hello world!");

        File openFile = new File("./doc/qwe.txt");
        System.out.println(openFile);
    }
}
