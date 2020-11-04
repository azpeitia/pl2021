import java.io.FileReader;
import java.io.IOException;

public class wc {
    public static int nl=0;
    public static int np=0;
    public static int nc=0;
    
    public static void main(String arg[]) {
    
        if (arg.length>0) {
            try {

                Yylex lex = new Yylex(new FileReader(arg[0]));
                lex.yylex();
                
                //System.out.println(nl+"\t"+np+"\t"+nc+"\t"+arg[0]);
            
                
	        } catch (IOException e) {
	    }
        }
    }

}
