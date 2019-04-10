/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageeditor;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author Shane
 */
public class Editors {
    
    /*
        inverter() inverts all teh colors of a BufferedImage.
        It does so by subtracting 255 by the actual red, green,
        and blue values in the image and returning the
        BufferedImage with those new values.
    */
    public static BufferedImage inverter(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                r = (color & 0x00ff0000) >> 16;
                g = (color & 0x0000ff00) >> 8;
                b = color & 0x000000ff;
                r = 255 - r;
                g = 255 - g;
                b = 255 - b;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;
    }
    
    /*
        makeGreen() sets the green value of a BufferedImage
        to 255.
    */
    public static BufferedImage makeGreen(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                r = (color & 0x00ff0000) >> 16;
                b = color & 0x000000ff;
                g = 255;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;
    }
    
    /*
        makeBlue() sets the blue value of a BufferedImage
        to 255.
    */
    public static BufferedImage makeBlue(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                r = (color & 0x00ff0000) >> 16;
                g = (color & 0x0000ff00) >> 8;
                b = 255;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;    }
    
    /*
        makeRed() sets the red value of a BufferedImage
        to 255.
    */
    public static BufferedImage makeRed(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                g = (color & 0x0000ff00) >> 8;
                b = color & 0x000000ff;
                r = 255;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;
    }
    
    /*
        makeCyan() sets the green and blue values
        of a BufferedImage to 255.
    */
    public static BufferedImage makeCyan(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                r = (color & 0x00ff0000) >> 16;
                g = 255;
                b = 255;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;
    }
    
    /*
        makeYellow() sets the red and green values
        of a BufferedImage to 255.
    */
    public static BufferedImage makeYellow(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                b = color & 0x000000ff;
                r = 255;
                g = 255;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;    }
    
    /*
        makeMagenta() sets the red and blue values
        of a BufferedImage to 255.
    */
    public static BufferedImage makeMagenta(BufferedImage input){
        int width = input.getWidth();
        int height = input.getHeight();
        int r, g, b, color;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                color = input.getRGB(i, j);
                g = (color & 0x0000ff00) >> 8;
                r = 255;
                b = 255;
                input.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return input;
    }
}
