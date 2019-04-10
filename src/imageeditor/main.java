package imageeditor;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author Shane
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File(args[0]));
            produceImage(img);
        } catch (IOException e) {
            System.out.println("No image");
        }

    }

    public static BufferedImage produceImage(BufferedImage img) {
        int width = 0;
        int height = 0;
        Scanner user = new Scanner(System.in);
        int choice;
        System.out.println("What do you want to do with your image?");
        System.out.println("1 for invert color. 2 for make it green.");
        System.out.println("3 for make it red. 4 for make it blue.");
        System.out.println("5 for make it Cyan. 6 for make it Yellow.");
        System.out.println("7 for make it Magenta.");
        choice = user.nextInt();
        switch (choice) {
            case 1:
                Editors.inverter(img);
                break;
            case 2:
                Editors.makeGreen(img);
                break;
            case 3:
                Editors.makeRed(img);
                break;
            case 4:
                Editors.makeBlue(img);
                break;
            case 5:
                Editors.makeCyan(img);
                break;
            case 6:
                Editors.makeYellow(img);
                break;
            case 7:
                Editors.makeMagenta(img);
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println("Image has not been changed.");
        }
        try {
            BufferedImage output = img;
            File outputfile = new File("output.jpg");
            ImageIO.write(output, "jpg", outputfile);
        } catch (IOException e) {
            System.out.println("Could not output files!");
        }

        ImageIcon icon = new ImageIcon(img);
        width = img.getWidth();
        height = img.getHeight();
        JFrame display = new JFrame();
        JLabel label = new JLabel(icon);
        display.add(label);
        display.setSize(width, height);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setVisible(true);
        return img;
    }

}
