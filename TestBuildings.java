package project1.pkg2;

/**
 *
 * @author kpapaefth
 */
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
        
public class TestBuildings {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Bofs [] bofs;
        Houses [] houses;
        Shops [] shops;
        
        bofs = new Bofs [30];
        houses = new Houses [10];
        shops = new Shops [20];
        
        for(int i=0; i<10; i++){
            houses[i] = new Houses();
        }
        
        for(int i=0; i<30; i++){
            bofs[i] = new Bofs();
        }
        
        for(int i=0; i<20; i++){
            shops[i] = new Shops();
        }
        
        
        
        final String alphabet = " 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();
        
        
        
         for(int i=0;i<10;i++){
            
        	
            int ID = 0;
            String name = "";
            double embadon = 0.0;
            double x = 0.0;
            double y = 0.0;
            int rooms =0;
            
            
            for (int j = 0; j < 6; j++) {
                ID+= alphabet.charAt(rand.nextInt(N));
               name += alphabet.charAt(rand.nextInt(N));
               embadon += alphabet.charAt(rand.nextInt(N));
               y += alphabet.charAt(rand.nextInt(N));
              x += alphabet.charAt(rand.nextInt(N));
             rooms  += alphabet.charAt(rand.nextInt(N)); 
                
                
            }
           houses[i].ID = ID;
            houses[i].name = name;
            houses[i].embadon = embadon;
            houses[i].x = x;
            houses[i].y = y;
            houses[i].rooms = rooms;
 }
        
      for(int i=0;i<30;i++){
            
        	
            int ID = 0;
            String name = "";
            double embadon = 0.0;
            double x = 0.0;
            double y = 0.0;
            int flats =0;
            
            
            for (int j = 0; j < 6; j++) {
                ID+= alphabet.charAt(rand.nextInt(N));
               name += alphabet.charAt(rand.nextInt(N));
               embadon += alphabet.charAt(rand.nextInt(N));
               y += alphabet.charAt(rand.nextInt(N));
              x += alphabet.charAt(rand.nextInt(N));
               flats  += alphabet.charAt(rand.nextInt(N)); 
                
                
            }
           bofs[i].ID = ID;
            bofs[i].name = name;
            bofs[i].embadon = embadon;
            bofs[i].x = x;
            bofs[i].y = y;
            bofs[i].flats = flats;
 }
       for(int i=0;i<20;i++){
            
        	
            int ID = 0;
            String name = "";
            double embadon = 0.0;
            double x = 0.0;
            double y = 0.0;
            int floors =0;
            
            
            for (int j = 0; j < 6; j++) {
                ID+= alphabet.charAt(rand.nextInt(N));
               name += alphabet.charAt(rand.nextInt(N));
               embadon += alphabet.charAt(rand.nextInt(N));
               y += alphabet.charAt(rand.nextInt(N));
              x += alphabet.charAt(rand.nextInt(N));
               floors += alphabet.charAt(rand.nextInt(N)); 
                
                
            }
           shops[i].ID = ID;
            shops[i].name = name;
            shops[i].embadon = embadon;
            shops[i].x = x;
           shops[i].y = y;
            shops[i].floors = floors;
 }
    //Ends
    
    
    /////////////////////////////////////////////////////
    
    // elements sortt
  
        int n = houses.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (houses[i].embadon > houses[k].embadon) {
                    
                  houses[i].Swap(i, k, houses);  
                }
                
            }
           
        }
        
       
        for(int i=0; i<10;i++){
            System.out.println(houses[i].print_houses() +" Rooms:" + houses[i].rooms);
        }
        
        //Mo of the floors
         int sum_flats=0;
        for(int i=0; i<30;i++){
            sum_flats += bofs[i].flats;
            
            }
        double mo;
        
        mo=sum_flats/30.0;
        System.out.println("The mo of the flats is:" + mo);
         
    
    
    //Mo of the houses embadon
   int sum_hembadon=0; 
   for ( int i=0;i<10; i++){
    sum_hembadon +=houses[i].embadon;
   }
double mo2;
mo2=sum_hembadon/10.0;
 System.out.println("The mo of houses embadon is:" + mo2);
    


//MO of the bofs embadon
     int sum_bembadon=0; 
   for ( int i=0;i<30; i++){
    sum_bembadon +=bofs[i].embadon;
   
}
double mo3;
mo3=sum_bembadon/30.0;
 System.out.println("The mo of the bofs embadon is:" + mo3);




//Mo of the shops embadon
 int sum_sembadon=0; 
   for ( int i=0;i<20; i++){
    sum_sembadon +=shops[i].embadon;
    
}
double mo4;
mo4=sum_sembadon/20.0;
     System.out.println("The mo of shops embadon is:" + mo4);
    
     
     //Fluctuation of the houses
    double diakimansi_houses=0;
    double sums=0;
 for(int i=0; i<10; i++){
     diakimansi_houses=Math.pow(houses[i].embadon-mo2,2);
     sums +=diakimansi_houses;
     }
 System.out.println("The fluctuation of the  houses' embadon is:" + sums);
    
    //Fluctuation of the bofs
    
    
    double diakimansi_bofs=0;
    double sums2=0;
 for(int i=0; i<30; i++){
     diakimansi_bofs=Math.pow(bofs[i].embadon-mo3,2);
     sums2 +=diakimansi_bofs;
     }
 System.out.println("The fluctuation of the bofs' embadon is:" + sums2);
    
    //Fluctuation of the shops
    double diakimansi_shops=0;
    double sums3=0;
 for(int i=0; i<20; i++){
     diakimansi_shops=Math.pow(bofs[i].embadon-mo4,2);
     sums3 +=diakimansi_shops;
     }
 System.out.println("The fluctuation of the shops' embadon is:" + sums3);
    
    
    
    
    
    }
   }



