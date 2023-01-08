
package project1.pkg2;

/**
 *
 * @author kpapaefh
 */
public class Shops extends Buildings {
    int floors;
    public Shops(int Ide, String n, double emb, double xi, double yi, int new_floors) {
        super(Ide, n, emb, xi, yi);
        floors= new_floors;
    }
    public Shops(){
        super();
        floors = 0;
    }
}
