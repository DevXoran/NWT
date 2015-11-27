package antialiasing_algorithm;

public class Antialiasing {

    public static void main(String[] args) {
        
        int[][] array1 = new int[20][20];
        
        int endey = array1.length;
        int endex = array1[0].length;
        
        
        
        for(int y = 0; y < endey; y++) {
            
            for(int x = 0; x < endex; x++) {
                int teil = 0;
                int summe = 0;
                
                if(x != 0){
                    summe += array1[x-1][y];
                    teil += 1;
                }
                if(x != endex){
                    summe += array1[x+1][y];
                    teil += 1;
                }
                if(y != 0){
                    summe += array1[x][y-1];
                    teil += 1;
                }
                if(x != endey){
                    summe += array1[x][y+1];
                    teil += 1;
                }
                if(x != 0 && y != 0){
                    summe += array1[x-1][y-1];
                    teil += 1;
                }
                if(x != endex && y != 0){
                    summe += array1[x+1][y-1];
                    teil += 1;
                }
                if(x != 0 && y != endey){
                    summe += array1[x-1][y+1];
                    teil += 1;
                }
                if(x != endex && y != endey){
                    summe += array1[x+1][y+1];
                    teil += 1;
                }
                
                array1[x][y] = summe/teil;
                                             
            }
                       
        }
        
        
        //Ausgabe
        for(int y = 0; y < endey; y++) {
            
            for(int x = 0; x < endex; x++) {
            
                int a = array1[y][x];
                System.out.print(a);
                
            }
                System.out.println();
            
        }
        
        System.out.println(endey);
        System.out.println(endex);
    }
}
