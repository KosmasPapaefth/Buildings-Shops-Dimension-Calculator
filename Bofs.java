
package project1.pkg2;

/**
 *
 * @author kpapaefth
 */
public class Bofs extends Buildings {
    int flats;

    public Bofs(int Ide, String n, double emb, double xi, double yi, int new_flats) {
        super(Ide, n, emb, xi, yi);
        flats = new_flats;
    }
public Bofs(){
        super();
        flats = 0;
    }
   }

