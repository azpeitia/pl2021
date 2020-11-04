

%%
%{
    int c1=0;   //Comentarios tipo //
    int c2=0;   //Comentarios tipo /*
    int c3=0;   //Comentarios tipo /**
    //class Yytoken {}; //para evitar el error Yytoken 
%}
%int    //tambien es para evitar el error del Yytoken

// Comentario tipo 1
%xstate COM1   

/* Comentario tipo 2 */
%xstate COM2    

/** Comentario tipo 3 */
%xstate COM3    

%xstate STRING

%eof{
    System.out.println("//  "+c1+"\n/*  "+c2+"\n/** "+c3);
%eof}

%%

\"          {
                yybegin(STRING);
            }

(\/\/)      {
                yybegin(COM1);
            }
(\/\*)      {
                yybegin(COM2);
            }
(\/\*\*)    {
                yybegin(COM3);
            }
[^]         {}


<STRING>{

\"  {yybegin(YYINITIAL);}
(\\)+\"     {}

[^] {}

}

<COM1>{

\n  {yybegin(YYINITIAL);}
[\ \t]    {}
[^]     {c1++;}

}

<COM2>{

\*\/    {yybegin(YYINITIAL);}
[\ \n\t]    {}
[^]     {c2++;}

}

<COM3>{

\*\/    {yybegin(YYINITIAL);}
[\ \n\t]    {}
[^]     {c3++;}

}


