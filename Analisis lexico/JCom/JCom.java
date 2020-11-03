import java.io.FileReader;
import java.io.IOException;

public class JCom {
    public static int c1=0; //Contador para //
    public static int c2=0; //Contador para /* */
    public static int c3=0; //Contador para /** */

    public static void main(String arg[]) {
        if (arg.length>0) {
            Yylex lex = null;
            try {
                lex = new Yylex(new FileReader(arg[0]));
	            lex.yylex();
	        } catch (IOException e) {
            } 
            //System.out.println("//  "+c1+"\n/*  "+c2+"\n/** "+c3+"\n");
        }
    }

}
