package rle_algorithm;

import java.util.Random;

public class Rle {
    
    public static void main(String[] args) {
        
        int breite = 5;
        int hoehe = 5;
        
        int anzahl = 0;
        int zahl = 0;
        
        int wohin = 0;
                
        int[][] array1 = new int[hoehe][breite];
        int[][] ergebnis = new int[anzahl][2];
        
        Random r = new Random();
        //füllen-----------------------------------
        for(int y = 0; y < hoehe; y++) {
            
            for(int x = 0; x < breite; x++) {
            
                int a = r.nextInt(10);
                array1[y][x] = a;
                System.out.print(array1[y][x]);
                
            }
        }
        //-----------------------------------------

        
        for(int y = 0; y < hoehe; y++){
            
            for(int x = 0; x < breite; x++){
                
               
                if(array1[y][x] == array1[y][0]){
                    anzahl = anzahl + 1;
                    zahl = array1[y][x];
                    ergebnis[wohin][0] = anzahl;
                    ergebnis[wohin][1] = zahl;
                }
                
                if(array1[y][x] == array1[y][x+1]){
                    
                    anzahl = anzahl + 1;
                    zahl = array1[y][x];
                }
                
                if(array1[y][x] != array1[y][x+1]){
                    
                    ergebnis[wohin][0] = anzahl;
                    ergebnis[wohin][1] = zahl;
                    
                    anzahl = 0;
                    zahl = array1[y][x+1];
                    
                    wohin = wohin + 1;
                }    
            }
        }
        
        System.out.println("Tabelle mit Zahlen:");
        
        for(int y = 0; y < hoehe; y++) {
            
            for(int x = 0; x < breite; x++) {
            
                int a = array1[y][x];
                System.out.print(a);
                
            }
                System.out.println();
            
        }
        
        System.out.println("Tabelle zusammengerechnet: Erste Stelle = anzahl;\n"
                + "Zweite Stelle = Zahl");
        
        for(int y = 0; y < hoehe; y++) {
            
            for(int x = 0; x < breite; x++) {
            
                int a = ergebnis[y][x];
                System.out.print(a);
                
            }
                System.out.println();
            
        }
        
    } //PSVM

}
