public class Encryption {

    private int[] key_bin;
    private int[] txtToEncrypt_bin;
    private int[] code;
    private int[] txtDecrypt ;
    private StringBuilder text;



    public Encryption(String key, String pass)                  // Constructor where are binarary words to encrypt
    {
        text= new StringBuilder();
        key_bin = new int[key.length()];

        txtToEncrypt_bin = new int[pass.length()];
        code= new int [pass.length()];
        txtDecrypt= new int [pass.length()];

        for (int i = 0; i < pass.length(); i++) {
            txtToEncrypt_bin[i] = (byte) pass.charAt(i);

        }

        for (int i = 0; i < key.length(); i++) {
            key_bin[i] = (byte) key.charAt(i);
        }

    }


    public int[] DoEncrypt() {

        for (int i = 0, j = 0; i < txtToEncrypt_bin.length; i++, j++) {

            if(j == key_bin.length) j = 0 ;

            code[i]=txtToEncrypt_bin[i] ^ key_bin[j];
        }

        return code;
    }


    public int[] DoDecrypt() {

        for (int i = 0, j = 0; i < code.length; i++, j++) {

            if(j == key_bin.length) j = 0 ;
            txtDecrypt[i]=code[i] ^ key_bin[j];
            text.append( (char) ((byte)txtDecrypt[i]) );

        }
        return txtDecrypt;
    }

    public void Disp_Code (){

        System.out.print("Tekst zakodowany : ");
        for ( int i = 0 ; i < code.length ; i++)
            System.out.print( Integer.toString(code[i], 2)    );
        System.out.println();

    }

    public  void  Disp_Text() {
        System.out.print("Tekst odkodowany : ");
        System.out.println(text);
    }

}
