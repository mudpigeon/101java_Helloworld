import lib.oop2.Human;
import lib.std.StdOut;

public class Hello {
    public static void main(String[] args) {
        StdOut.print("Hello world!\n");
        StdOut.print("----- Test is begining! -----\n");

        Human yumiya = new Human();

        yumiya.speak("哦哦哦，好爽，草我！");
        yumiya.speak("Yumiya 受不了了，啊————");
    }
}
