package com.paolo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IOException {

        int width = 963;
        int height = 640;

        BufferedImage image = null;

        try{
            File input_file = new File("D:\\Ultrawide Wallpapers\\speeding-lights-3440x1440.jpg");

            image = new BufferedImage(width,height,
                                            BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(input_file);
            System.out.println("Reading complete.");
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }

        try{
            File output_file = new File("D:\\Ultrawide Wallpapers\\UxO3Eu0.jpg");

            ImageIO.write(image, "jpg", output_file);

            System.out.println("Writing complete.");
        }
        catch(IOException e){
            System.out.println("Error: "+ e);
        }
    }
}
