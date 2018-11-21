
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Nov 21 14:58:30 CLST 2018
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.io.BufferedReader;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Nov 21 14:58:30 CLST 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\004\000\002\002\007\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\010\003\000\002\004\006\000" +
    "\002\005\007\000\002\013\003\000\002\013\003\000\002" +
    "\006\010\000\002\007\006\000\002\011\003\000\002\011" +
    "\003\000\002\012\003\000\002\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\013\005\001\002\000\004\002\062\001" +
    "\002\000\004\015\006\001\002\000\014\005\011\006\021" +
    "\012\007\014\017\017\016\001\002\000\004\010\055\001" +
    "\002\000\004\015\053\001\002\000\004\010\046\001\002" +
    "\000\004\015\044\001\002\000\004\015\042\001\002\000" +
    "\004\014\017\001\002\000\004\015\037\001\002\000\004" +
    "\010\032\001\002\000\004\015\ufffa\001\002\000\004\015" +
    "\030\001\002\000\004\015\022\001\002\000\004\021\023" +
    "\001\002\000\004\007\024\001\002\000\006\016\027\020" +
    "\025\001\002\000\004\015\ufff6\001\002\000\004\015\ufff8" +
    "\001\002\000\004\015\ufff7\001\002\000\014\005\011\006" +
    "\021\012\007\014\017\017\016\001\002\000\004\014\ufffd" +
    "\001\002\000\006\016\035\021\033\001\002\000\006\004" +
    "\ufff3\011\ufff3\001\002\000\004\011\036\001\002\000\006" +
    "\004\ufff2\011\ufff2\001\002\000\004\015\ufff4\001\002\000" +
    "\004\014\ufffb\001\002\000\004\015\041\001\002\000\004" +
    "\002\000\001\002\000\014\005\011\006\021\012\007\014" +
    "\017\017\016\001\002\000\004\014\uffff\001\002\000\014" +
    "\005\011\006\021\012\007\014\017\017\016\001\002\000" +
    "\004\014\ufffc\001\002\000\006\016\035\021\033\001\002" +
    "\000\004\004\050\001\002\000\006\016\035\021\033\001" +
    "\002\000\004\011\052\001\002\000\004\015\ufff5\001\002" +
    "\000\014\005\011\006\021\012\007\014\017\017\016\001" +
    "\002\000\004\014\ufffe\001\002\000\006\020\056\021\057" +
    "\001\002\000\004\011\ufff1\001\002\000\004\011\ufff0\001" +
    "\002\000\004\011\061\001\002\000\004\015\ufff9\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\003\013\004\012\005\011\006\007" +
    "\007\017\010\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\037\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\030\004\012\005\011\006\007\007\017\010" +
    "\014\001\001\000\002\001\001\000\004\011\033\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\016\003\042\004\012\005\011\006\007\007" +
    "\017\010\014\001\001\000\002\001\001\000\016\003\044" +
    "\004\012\005\011\006\007\007\017\010\014\001\001\000" +
    "\002\001\001\000\004\011\046\001\001\000\002\001\001" +
    "\000\004\011\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\016\003\053\004\012\005\011\006\007\007\017" +
    "\010\014\001\001\000\002\001\001\000\004\012\057\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	static TablaSimbolos tabla = new TablaSimbolos();
    static parser analizador;

	public static void main (String argv[]) throws Exception
	{
		
		analizador = new parser(new Analizador_Flexiquito(new InputStreamReader(System.in), tabla));
		try
		{
		  analizador.parse();
		  tabla.imprimir();
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		  System.out.println("Error fatal");
		  System.exit(0);
		}
	} 

    /**Metodo al que se llama automáticamente ante algún error sintactico.*/
    public void syntax_error(Symbol s){
        System.out.println("ERROR: Instrucción no reconocida");
		System.exit(0);
    }

    /**Metodo al que se llama en el momento en que ya no es posible una recuperación de
    errores.*/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error Identificador " +
        s.value + " no reconocido.");
		System.exit(0);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


    Draw Dibujar = new Draw();

      public void salir(){
				System.out.println("Se ha terminado la lectura. Presione ENTER tecla para Terminar.");
				try{
					InputStreamReader reader = new InputStreamReader(System.in);
					BufferedReader buffer = new BufferedReader(reader);
          			buffer.readLine();
				}
				catch (Exception e) {
					System.exit(0);
				}
				System.exit(0);
      }

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // COLO ::= IDENTIFICADOR 
            {
              String RESULT =null;
		int Ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Simbolo I = (Simbolo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = I.valor; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("COLO",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // COLO ::= COLORES 
            {
              String RESULT =null;
		int C1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String C1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = C1;  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("COLO",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // VALOR ::= ENTERO 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALOR",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // VALOR ::= IDENTIFICADOR 
            {
              String RESULT =null;
		int Ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Simbolo I = (Simbolo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = I.valor; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALOR",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // MOVER ::= DIRECCION PARENTESIS_ABIERTO VALOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
				Dibujar.draw(d,Integer.valueOf(v));
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("MOVER",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ASIG_POS ::= POS PARENTESIS_ABIERTO VALOR COMA VALOR PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String v1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
				Dibujar.setPos(Integer.valueOf(v1),Integer.valueOf(v2));
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIG_POS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // VARIABLE ::= COLORES 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VARIABLE",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // VARIABLE ::= ENTERO 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VARIABLE",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ASIG_VALOR ::= DAVALOR E_SL IDENTIFICADOR IGUAL VARIABLE 
            {
              Object RESULT =null;
		int Ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Simbolo I = (Simbolo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				RESULT = v;
				I.valor = v;
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIG_VALOR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ASIG_COLOR ::= COLOR PARENTESIS_ABIERTO COLO PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
																			try{
																				Dibujar.setColor(c);  
																			}
																			catch(NullPointerException e)
																			{
																				System.out.println("ERROR: COLOR NO DEFINIDO");
																			}
																			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIG_COLOR",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TERMINAR ::= TERMINO 
            {
              Object RESULT =null;
		 salir(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERMINAR",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INST ::= TERMINAR E_SL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INST ::= ASIG_VALOR E_SL INST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INST ::= MOVER E_SL INST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INST ::= ASIG_POS E_SL INST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INST ::= ASIG_COLOR E_SL INST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROG ::= EDITAR E_SL INST TERMINAR E_SL 
            {
              Object RESULT =null;
		 salir(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROG",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROG EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

