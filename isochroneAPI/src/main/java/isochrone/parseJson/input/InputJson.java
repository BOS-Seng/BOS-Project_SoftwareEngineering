package isochrone.parseJson.input;
/**
* Objektklasse des Eingabewertes f�r Gson 
* @since 07.02.2017
* @author Thomas M�ller
*/
import java.util.List;

public class InputJson {
	//****************************************
	// CONSTANTS 
	//****************************************

	//****************************************
	// VARIABLES
	//****************************************
	
	private int timelimit;
	private List<Coordinate> bos;
	
	//****************************************
	// INIT/CONSTRUCTOR
	//****************************************
	
	//****************************************
	// GETTER/SETTER
	//****************************************
	
	public int getTimeMin(){
		return timelimit;
	}
	
	public List<Coordinate> getCoordinates() {
            return bos;
	}
	
	//****************************************
	// PUBLIC METHODS
	//****************************************
	
	//****************************************
	// PRIVATE METHODS
	//****************************************

	//****************************************
	// INNER CLASSES
	//****************************************		
}
