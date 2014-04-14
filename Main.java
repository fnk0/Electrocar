import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main
{

    public static int MAX_CHARGE = 240; // In minutes
    public static int END_OF_DAY = 1439; // In minutes
    public static String END_OF_LINE = "0 0";

    public static void main(String[] args)
    {

	// Sets buffered reader to null because it allows us to exit the program in the catch
	BufferedReader bf = null;
	try
	    {
		bf = new BufferedReader(new FileReader(args[0]));
	    }
	catch(IOException e)
	    {
		e.printStackTrace();
		return;
	    }
	catch(Exception e)
	    {
		e.printStackTrace();
		return;
	    }

	// Reads the file in
	ArrayList<String> lines = new ArrayList<String>();
	String line = "";
	try{
	    while((line = bf.readLine()) != null)
		{
		    lines.add(line);
		}
	} catch(IOException e)
	    {
		e.printStackTrace();
		return;
	    }

	// Goes to the bottom of the file where the bottom is "0 0"
	int index = 0;
	while(!lines.get(i).equals("0 0"))
	    {
		String[] currentCase = line.split(" ");
		int finalStation = Integer.parseInt(currentCase[0]) - 1;
		int travelBlocks = Integer.parseInt(currentCase[1]);
		int currentCharge = 240;
		ArrayList<Path> paths = new ArrayList<Path>();

		for(int i = 0; i < travelBlocks; i++) {
		    
		    
		}
		
		
	    }
    }
}

private class Path
{
    public int start_time;
    public int end_time;
    public int travel_time;
    
    public Path(String path) {
	String[] pathArray = path.split(" ");
	start_state = Integer.parseInt(pathArray[0]);
	end_state = Integer.parseInt(pathArray[1]);
	travel_time = Integer.parseInt(pathArray[2])
    }

}
