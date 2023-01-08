

package project1.pkg2;

/**
 *
 * @author kpapaefth
 */
public class Houses extends Buildings{
    int rooms;


    public Houses(int Ide, String n, double emb, double xi, double yi,int new_rooms) {
        super(Ide, n, emb, xi, yi);
        rooms= new_rooms;
    }
    
    
    public Houses(){
        super();
        rooms = 0;
    }
}
   
  
   

    
    
  
