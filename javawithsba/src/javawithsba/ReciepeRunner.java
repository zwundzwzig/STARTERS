package javawithsba;

public class ReciepeRunner {

	public static void main(String[] args) {
		Recipe recipe = new Recipe();
		recipe.execute();

		RecipeMicrowave recipeMicrowave = new RecipeMicrowave(); 
		recipeMicrowave.execute();
	}

}
