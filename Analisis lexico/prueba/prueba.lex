/*

Twitter es una red social con casi 15 años en activo. La idea básica de Twitter es el microblogging, 
es decir, publicaciones de entradas de muy corta longitud.

Originalmente, Twitter solo permitía mandar texto plano de un máximo de 140 caracteres pero debido a 
su popularidad ese límite fue ampliado y se añadió la posibilidad de incluir material multimedia al mensaje.

Unos ejemplos de tweets (mensajes utilizado en Twitter) serían los siguientes:
Este es un ejemplo de Tweet
este podria ser otro ejemplo de tweet
aun mas largo para la asignatura de #PL
InclUso. #PL #informatica PoDr1a s3r ALGO + RAROOO!!!!!!! #Examen
O una mencion a otra persona @usuario
e Incluso un enlace https://www.uma.es/ como este

En este caso, se va a suponer que un mensaje puede tener cualquier carácter incluido en la tabla ASCII. 
Además, existen tres tipos de cadenas de caracteres especiales: hashtags, menciones y enlaces

Hashtags
Son palabras clave que se usan para destacar algún tópico de interés.
Se componen del símbolo # seguido de una cadena alfanumérica. En esta práctica se considerará que los hashtags 
solo pueden contener letras o números. Algunos ejemplos serían:

#PL
#123procesadores
#29
#procesadoresDeLenguaje2021
No son sensibles a mayúsculas y minúsculas con lo que #PL sería igual a #pl.

Menciones
Consisten en referencias a otros usuarios. Se componen del símbolo @ seguido del nombre de usuario. Dicho nombre 
puede contener letras, números y guiones bajos (_) pero no se admiten como nombres de usuario aquellos con solo 
números y/o guiones bajos.Algunas menciones correctas serían:

@Ricardo 
@Jose_del_Campo
@Chr1st1an
@20profe_PL
Enlaces
Consisten en enlaces a otras páginas web. Se considerará que todos los enlaces comienzan por http:// o https:// y 
solo pueden contener letras, números y guiones, así como los separadores para las páginas y dominios (/) y (.). 
Todo enlace debe tener como mínimo un dominio web válido.Algunos enlaces válidos son:

https://www.uma.es/
https://informatica.cv.uma.es/pl/2021.html
http://prueba1.es/probando/un/enlace.mas/largo

Se quiere realizar un analizador de Tweets que calcule las siguientes estadísticas:
Longitud del Tweet
Número total de hashtags
Número total de citas
Número total de enlaces
Listado de hashtags con su número de repeticiones

Se debe enviar un fichero llamado Twitter.lex que contenga un analizador léxico en Jflex que analice los puntos 
enunciados en el apartado anterior. Para ello se debe de hacer uso de los métodos ofrecidos por las clases java 
que proporcionamos (las cuales no se pueden modificar bajo ningún concepto). El fichero debe de poder compilarse 
mediante los comandos:
          > jflex Tweets.lex
          > javac *.java
y pueda ejecutarse con la instruccion:
          > java Tweets <opcion> <fichero>
En donde <opcion> representa el dato que queremos obtener, segun la siguiente tabla:
-l Devuelve la longitud del tweet
-h Devuelve el número total de hashtags
-c Devuelve el número total de citas
-e Devuelve el número total de enlaces
-hn Devuelve el número total de hashtags con su número de repeticiones

Por ejemplo, para el tweet contenido en el fichero tweet.txt, la ejecución con los distintos comandos daria distintos 
resultados:

En respuesta a @profesores #PL #pl #informatica #teams


NOTA: Para este ejercicio se debe enviar un solo fichero Tweets.zip que se debe contener todos los ficheros 
necesarios para compilarar y ejecutarar segun las instrucciones que se detallan en este enunciado
*/

%%
%{
    String str="";
    int aux=0;
    int nl=0;       //numero de caracteres
    int nh=0;       //numero de hashtags
    int nc=0;       //numero de menciones
    int ne=0;       //numero de enlaces
    //toLowerCase() //funcion para pasar a minusculas
%}
%int

%eof{
    System.out.println("\nnumero de caracteres: "+nl);
    System.out.println("\nnumero de hashtags: "+nh);
    System.out.println("\nnumero de citas: "+nc);
    System.out.println("\nnumero de enlances: "+ne);
    TablaSimbolos.getAll();
%eof}

%%
\#[a-zA-Z0-9]*      { 
                        nl+=yytext().length();
                        nh++;
                        str=yytext().toLowerCase();
                        aux=TablaSimbolos.get(str);
                        aux++;
                        TablaSimbolos.put(str,aux);
                    }

\@[a-zA-Z_0-9]*[a-zA-Z][a-zA-Z_0-9]*    {
                                            nl+=yytext().length();
                                            nc++;
                                        }
(https?:\/\/)[a-zA-Z_\-0-9]+\.[a-zA-Z_\-0-9]+([\/\.][a-zA-Z_\-0-9]+)*   {
                                                                            nl+=yytext().length();
                                                                            ne++;
                                                                        }
[\ \n\t]+       {
                    nl+=yytext().length();
                }
[^]             {nl++;}       