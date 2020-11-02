
%%
%{
    String nombreVar="";
    String valorVar="";
    //class Yytoken {}; //para evitar el error Yytoken 
    String variable_string="";
%}
%int    //tambien es para evitar el error del Yytoken
%xstate STRINGVARIABLE
%xstate STRINGPRINT
%xstate PRINTMODE
%xstate VARIABLE
%xstate VALORVARIABLE
%%

class[\n\t\ ]+[a-zA-Z_0-9]+    {
                                System.out.print(yytext()+"_rmj");
                               }

((System\.out\.println)|(System.out.print))[\ \n\t]*\(        {
                                                            System.out.print(yytext()+"\"");
                                                            yybegin(PRINTMODE);
                                                            }

main[\ \t\n]*\([\ \t\n]*String[\ \t\n]*[a-zA-Z_][a-zA-Z_0-9]*\[\]\)     {
                                                                            System.out.print(yytext());
                                                                        }
String[\ \t\n]*                     {      
                                        valorVar="";
                                        yybegin(VARIABLE); 
                                    }
[a-zA-Z_][a-zA-Z_0-9]*[\ \n\t]*\=[\ \n\t]*          {   
                                                        nombreVar=yytext().replaceAll("\\s|=|\"", "") ; 
                                                        valorVar="";
                                                        yybegin(VALORVARIABLE); 
                                                    }

[^]                         {
                                System.out.print(yytext());
                            }

<PRINTMODE>{

[a-zA-Z0-9_]+   {
                    System.out.print(TablaSimbolos.get(yytext()));
                }

\"              {   
                    variable_string="";
                    yybegin(STRINGPRINT);
                }
\)              {
                    System.out.print("\")");
                    yybegin(YYINITIAL);
                }
[\ \t\n]*\+[\ \t\n]*             {}
[^]                              {}
}

<STRINGPRINT>{

\"                          {
                                System.out.print(variable_string);
                                yybegin(PRINTMODE);
                            }
[^\"\\]+                    { variable_string += yytext() ; }
\\                          { variable_string += '\\' ; }
\\\"                        { variable_string += '\\' ; variable_string += '\"' ;}
\\\\/\"                     { variable_string += '\\' ; variable_string += '\\' ;} 




}

<VARIABLE>{
[a-zA-Z_][a-zA-Z_0-9]*[\ \n\t]*\=[\ \n\t]*          {   
                                                        nombreVar=yytext().replaceAll("\\s|=|\"", "") ; 
                                                        valorVar="";
                                                        yybegin(VALORVARIABLE); 
                                                    }
}

<VALORVARIABLE>{

([\ \n\t]*\+[\ \n\t]*)|[\ \n\t]*        {}
\"                          {  
                                yybegin(STRINGVARIABLE);
                            }
[_a-zA-Z][a-zA-Z_0-9]*      {
                                valorVar += TablaSimbolos.get(yytext());
                            }
\;                          {   
                                TablaSimbolos.put(nombreVar, valorVar); 
                                yybegin(YYINITIAL);
                            }
}

<STRINGVARIABLE>{

\"                          {   
                                yybegin(VALORVARIABLE); 
                            }
[^\"\\]+                    { valorVar += yytext() ; }
\\                          { valorVar += '\\' ; }
\\\"                        { valorVar += '\\' ; valorVar += '\"' ;}
\\\\/\"                     { valorVar += '\\' ; valorVar += '\\' ;} 
}

