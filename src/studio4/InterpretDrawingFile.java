package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
if(shape.equals("ellipse")){
		int redCompenent = in.nextInt();
		int greenCompenent = in.nextInt();
		int blueCompenent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
			StdDraw.setPenColor(redCompenent,greenCompenent,blueCompenent);
		if(isFilled == true){
		StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);

		} else {
StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);

		}
}

if(shape.equals("rectangle")){
	
		int redCompenent = in.nextInt();
		int greenCompenent = in.nextInt();
		int blueCompenent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
			StdDraw.setPenColor(redCompenent,greenCompenent,blueCompenent);
		if(isFilled == true){
		StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);

		} else {
StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);

		}
	
}

if(shape.equals("triangle")){
	
		int redCompenent = in.nextInt();
		int greenCompenent = in.nextInt();
		int blueCompenent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		double parameterFive = in.nextDouble();
		double parameterSix = in.nextDouble();

		double[] x = {parameterOne,parameterTwo,parameterThree};
		double[] y = {parameterFour,parameterFive,parameterSix};
		
		

StdDraw.setPenRadius(.01);
			StdDraw.setPenColor(redCompenent,greenCompenent,blueCompenent);
		if(isFilled == true){
		StdDraw.filledPolygon(x,y);

		} else {
StdDraw.polygon(x,y);

		}

	
}
	



	
}
}

