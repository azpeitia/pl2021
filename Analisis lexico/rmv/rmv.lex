

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
[a-zA-Z_][a-zA-Z_0-9]*\=    { 
                                nombreVar=yytext().substring(0, yytext().length() - 1);
                                valorVar="";
                                yybegin(VALOR);   
                            }
[a-zA-Z_][a-zA-Z_0-9]*\=\"  {   nombreVar=yytext().substring(0, yytext().length() - 2) ; 
                                valorVar="";
                                yybegin(STRING); 
                            }
\$[a-zA-Z_][a-zA-Z_0-9]*    {
                                System.out.print(TablaSimbolos.get(yytext()));
                            }
\"[a-zA-Z_][a-zA-Z_0-9]*\=  {
                                System.out.print(yytext());
                            }

[^]                         {
                                System.out.print(yytext());
                            }
<VALOR>{

\\;                         { valorVar += ';' ; }
\$[a-zA-Z_][a-zA-Z_0-9]*    {
                                valorVar+=(TablaSimbolos.get(yytext()));
                            }
[^\t\r\n\ ;|]               {
                                valorVar += yytext();

                            }
[\t\r\n\ ;|]                {
                                TablaSimbolos.put(nombreVar, valorVar);
                                yybegin(YYINITIAL);
                            }

}
<STRING>{

\"                          {   TablaSimbolos.put(nombreVar, valorVar);     
                                yybegin(YYINITIAL); 
                            }
\"\;                        {   TablaSimbolos.put(nombreVar, valorVar);     
                                yybegin(YYINITIAL); 
                            }
\$[a-zA-Z_][a-zA-Z_0-9]*    {
                                valorVar+=(TablaSimbolos.get(yytext()));
                            }
[^\$\n\r\"\\]+              { valorVar += yytext() ; }
\\t                         { valorVar += '\t' ; }
\\n                         { valorVar += '\n' ; }
\\r                         { valorVar += '\r' ; }
\\\"                        { valorVar += '\"' ; }
\\                          { valorVar += '\\' ; }
\\\$                        { valorVar += '$' ; }
\\;                         { valorVar += ';' ; }
}

