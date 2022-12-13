package javawithsba;

public class ComplexProject {

	interface Test {
		void nothing();
		default void nothin() {
			
		};
	}
	
	class Classy implements Test {

		@Override
		public void nothing() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new ComplexDummy();
		algorithm.complexAlorithm(2, 3);
	}

}
