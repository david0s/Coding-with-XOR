/*  This program encodes the string to binary  word  using XORhttps://github.com/david0s/Coding-XOR-in-Java.git
by Dawid Kreft
 */


public class Main {

    public static void main(String[] args) {

        String key = "Klucz123";
        String text = "Ala ma 2 koty i koty maja Ale ";
        Encryption temp = new Encryption(key, text);
        temp.DoEncrypt();
        temp.DoDecrypt();

        temp.Disp_Code();
        temp.Disp_Text();

    }

}
