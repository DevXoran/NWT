package rle_algorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rle2 {
    
    public Rle2() {
        
        initUI();
        rle_algo();
        writeFile(null);
    }
    
    private void writeFile(String indatei) {

        PrintWriter pw;
        pw = null;
        try {
            File file = new File("fubars.txt");
            FileWriter fw = new FileWriter(file, true);
            pw = new PrintWriter(indatei);
     
        } catch (IOException e) {
    
            e.printStackTrace();
            System.out.println(e.getMessage());
     
        } finally {
    
            if (pw != null) {
            pw.close();
            }
        }
    }
    
    private String rle_algo() {
        
        int width = 20;
        int x;
        String save = (String.valueOf(width));
        save = save.concat("\n");
        
        int prevval, value, n = 0;
                
        int[] pixels = new int[width];
        //Generate Random numbers between 0 - 1
        Random r = new Random();
        //Fill that shit
        for(x = 0; x < width; x++) {
            
            pixels[x] = r.nextInt(2);
        }
        
        prevval = pixels[0];
        
        //Let it FLOW
        for(x = 0; x < width; x++) {
            
            value = pixels[x];
            
            if(value != prevval) {
                
                save = save.concat((String.valueOf(n))+"x"+(String.valueOf(prevval))+"\n");
                n=1;              
                prevval = value;
                
            } else {
                
                n += 1;
            }
        }
        
        save = save.concat((String.valueOf(n))+"x"+(String.valueOf(prevval))+"\n");
        
        return(save);
    }
    
    private void initUI() {
        
        JFrame frame = new JFrame();
        frame.setTitle("Epic Viewer 0.1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setSize(350, 350);
        
        frame.add(panel);
    }
    
    public static void main(String[] args) {
        
        
    }

}
