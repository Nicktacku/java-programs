import javax.swing.JOptionPane;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		int number = num + 1;
		
		System.out.println(num);
		System.out.println(number);
		System.out.println(number);
		System.out.println(number);
		System.out.println(number);
	}
}
