class mario
{

	public static void main (String[] args) 
	{
		System.out.println("############################");
		System.out.println("Pyramids");
		System.out.println();
		System.out.println();
		System.out.println("Easy Way");

		{ //pyramid function - easy
			int x = 0;
			for(x=0; x<1; x++) {
				System.out.print("#");
			}
			System.out.println();
			for(x=0; x<2; x++) {
				System.out.print("#");
			}
			System.out.println();
			for(x=0; x<3; x++) {
				System.out.print("#");
			}
			System.out.println();
			System.out.println("-------------------------");
		} //end mario function

		{ //harder pyramid
			System.out.println();
		System.out.println("Harder");
			int x = 0;
			int y=0;
				for(x=0;x<6;x++){
					for(y=0;y<=x;y++) {
						System.out.print("# ");
					} //end y
					System.out.println();
				} // end x
		} // end harder

		{ //skewed
			System.out.println();
			System.out.println("Skewd");
				int x = 0;
				int y=0;
				int z=0;
					for(x=0;x<6;x++){
						for(z=0;z<=x;z++) {
							System.out.print(" ");
						} //end 
						for(y=0;y<=x;y++) {
							System.out.print("# ");
						} //end y
						System.out.println();
					} // end x
		} // end skewed

		{ //triangle
			System.out.println();
			System.out.println("Triangle");
				int x = 0;
				int y=0;
				int z=0;
					for(x=0;x<6;x++){
						for(z=6;z>=x;z--) {
							System.out.print(" ");
						} //end 
						for(y=0;y<=x;y++) {

							System.out.print("# ");
						} //end y

						System.out.println();
					} // end x
		} // end triangle

		{ //flipped
			System.out.println();
			System.out.println("Flipped");
				int x = 0;
				int y=0;
				int z=0;
					for(x=0;x<6;x++){
						for(z=(2*(6-x));z>=0;z--) {
							System.out.print(" ");
						} //end 
						for(y=0;y<=x;y++) {

							System.out.print("# ");

						} //end y

						System.out.println();
					

					} // end x
				

		} // end flippede


	} //end public static void
} //end class