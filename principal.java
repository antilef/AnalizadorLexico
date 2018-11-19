package jlexCup;

import java.io.StringReader;
import java.util.*;
import java.io.BufferedReader;

import oracle.jrockit.jfr.parser.Parser;

public class principal{
    public static void main(String[] args) throws Exception {
        try{
            String cadena = "1 + 2";
            //StringReader LS = new StringReader(args[1]);
            new Sintactico(new Analizador_Flexiquito(new BufferedReader(new StringReader(cadena)))).parse();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}