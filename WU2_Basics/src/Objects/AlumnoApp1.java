package Objects;

public class AlumnoApp1 {

	public static void main(String[] args) {
		//private static String school is a variable where all the values are the same.
		AlumnoTeacher pepe = new AlumnoTeacher("Pepe");
		pepe.setSchool("Camino");
		System.out.println("Pepe School: " + pepe.getSchool());
		
		AlumnoTeacher juan = new AlumnoTeacher("Pepe");
		pepe.setSchool("Oron");
		
		System.out.println("Pepe School: " + pepe.getSchool());
		System.out.println("Juan School: " + juan.getSchool());

	}

}
