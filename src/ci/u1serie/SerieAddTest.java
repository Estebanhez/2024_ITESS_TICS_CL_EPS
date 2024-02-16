
package ci.u1serie;

/**
 *
 * @author Esteban
 */
public class SerieAddTest {
    public static void main(String ... args){
        SerieAdd sa = new SerieAdd(1,7);
        
        sa.compute();
        sa.print();
    }
}
