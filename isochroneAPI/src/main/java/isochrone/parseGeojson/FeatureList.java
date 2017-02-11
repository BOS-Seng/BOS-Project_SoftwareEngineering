package isochrone.parseGeojson;
/**
* Objektklasse des externen R�ckgabewertes f�r Gson 
* @since 07.02.2017
* @author Thomas M�ller
*/
public class FeatureList {
	//****************************************
	// CONSTANTS 
	//****************************************
	
	//****************************************
	// VARIABLES
	//****************************************
	
	private String type;
	private Geometry geometry;
	private Properties properties;		
	
	//****************************************
	// INIT/CONSTRUCTOR
	//****************************************
		
	//****************************************
	// GETTER/SETTER
	//****************************************
	
	public String getType(){
		return type;
	}
	public Geometry getGeometry(){
		return geometry;
	}
	public Properties getProperties(){
		return properties;
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
