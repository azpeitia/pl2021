

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

[^\ \n\t]   {c1++;c2++;c3++;}
[^]         {}
