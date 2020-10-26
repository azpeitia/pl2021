

%%
%{
    String nombreVar;
    String valorVar;
    //class Yytoken {}; //para evitar el error Yytoken 
%}
%int    //tambien es para evitar el error del Yytoken
%xstate VALOR
%xstate STRING
%%
[a-zA-Z_][a-zA-Z_0-9]*/=     { 
                                nombreVar=yytext();
                                valorVar="";
                                yybegin(VALOR);   
                            }
\$[a-zA-Z_][a-zA-Z_0-9]*  {
                                System.out.print(TablaSimbolos.get(yytext()));
                            }

.|\n                        {
                                System.out.print(yytext());
                            }
<VALOR>{

\=                          {}
[^\t\r\n\ ;|]               {
                                valorVar += yytext();

                            }
[\t\r\n\ ;|]               {
                                TablaSimbolos.put(nombreVar, valorVar);
                                yybegin(YYINITIAL);
                            }

}
