
package project1.pkg2;

/**
 *
 * @author kpapaefth
 */
public class Buildings {
    int ID;
    String name;
    double embadon;
    double x,y;

Buildings (int Ide,String n, double emb , double xi, double yi){
        ID=Ide;
        name=n;
        embadon=emb;
        x=xi;
        y=yi;
    }

public Buildings(){
        ID = 0;
        name = "";
        embadon = 0.0;
        x = 0.0;
        y = 0.0;
    }

public  void Swap(int i, int j, Houses[] array) {
 
        Houses temp = new Houses();
        temp =array[i];
        array[i] = array[j];
        array[j] = temp;
    }


public String print_houses(){
    return "ID:" + this.ID + " Name: " + this.name + "  Embadon:"+this.embadon+ "  Coordinates: (" + this.x + "," + this.y + ")";


            } 
}   
