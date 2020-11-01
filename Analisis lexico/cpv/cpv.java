import java.io.FileReader;
import java.io.IOException;

public class cpv {
    public static int a=0;
    public static int b=0;
    public static int c=0;
    public static int d=0;
    
    public static void main(String arg[]) {
    
        if (arg.length>0) {
            try {

                Yylex lex = new Yylex(new FileReader(arg[0]));
                lex.yylex();
                
                System.out.println("A "+a+"\nB "+b+"\nC "+c+"\nD "+d+"\n");
            
                
	        } catch (IOException e) {
	    }
        }
    }

}
