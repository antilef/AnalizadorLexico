/*Codigo de Usuario */
import java_cup.runtime.*;
import java.io.*;



/* Opciones y Declaraciones */



%%

%{
    private TablaSimbolos tabla;
    //Constructor
    public Analizador_Flexiquito(Reader in, TablaSimbolos t)
    {
      this(in);
      this.tabla = t;
    }
%}

%class Analizador_Flexiquito
%unicode
%ignorecase
%cup
%line
%column

numero = [0-9]+
identificador = [a-zA-Z][a-zA-Z0-9]*

colores = "rojo" | "verde" | "azul" | "amarillo" | "blanco"
direccion = arr | aba | der | izq
LineTerminator = \r|\n|\r\n



%%

/*  REGLAS LEXICAS */


 <YYINITIAL> "editar"       { System.out.println("token editar"); return new Symbol(sym.EDITAR); }
 <YYINITIAL> "termino"      { System.out.println("token termino");return new Symbol(sym.TERMINO); }
 <YYINITIAL> "pos"          { return new Symbol(sym.POS); }
 <YYINITIAL> "color"        { return new Symbol(sym.COLOR); }
 <YYINITIAL> "davalor"      { return new Symbol(sym.DAVALOR); }
 <YYINITIAL> { direccion }  { return new Symbol(sym.DIRECCION, new String(yytext())); }
 <YYINITIAL> { colores }    { return new Symbol(sym.COLORES, new String(yytext())); }
 <YYINITIAL> ","            { return new Symbol(sym.COMA); }
 <YYINITIAL> "="            { return new Symbol(sym.IGUAL); }
 <YYINITIAL> "("            { return new Symbol(sym.PARENTESIS_ABIERTO); }
 <YYINITIAL> ")"            { return new Symbol(sym.PARENTESIS_CERRADO); }

 {identificador}            {
			                Simbolo s;
                            if((s = tabla.buscar(yytext())) == null)
                                s = tabla.insertar(yytext());
                            return new Symbol(sym.IDENTIFICADOR, s);
                            }

 {numero}                   { System.out.println("token entero");return new Symbol(sym.ENTERO, new String(yytext())); }

 [ \t\r\n\f] 		{ return new Symbol(sym.E_SL); }


.                           { System.out.println("Desconocido"); /* Token Desconocido de acuerdo a la Gramatica */}