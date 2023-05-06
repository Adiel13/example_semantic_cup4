package udv.compi;

import java.io.StringReader;

/**
 * Hello world!
 *
 */
public class app 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World Semantic 4!" );
        String entrada = "2+3*2+1";
        Scanner lex = new Scanner(new StringReader(entrada));
        Parser sintax = new Parser(lex);
        
        sintax.parse();
        
    }
}
