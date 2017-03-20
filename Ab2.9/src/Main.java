
public class Main {
	public static void main(String[] args){
		
		// Block A
		{
			int x=5,y=5;
			// Block B
			{
				float f = 10.5f;
				float g = 11.7f;
				x = 20;
				
				// Block C
				{
					int z = 5;
					float h = 7.0f;
					
					// Korrigiert
					h = 5.0f;
					z = 4;
				}
				y=3000;
			}
			// FALSCH
			//h = 5.0f;
			//z = 4.0f;

		}
		
		// h müsste in block h neu definiert werden -- nicht sichbar außerhalb
		// z ebenfalls aber Z ist auch ein integer keine float

		

	}
}
