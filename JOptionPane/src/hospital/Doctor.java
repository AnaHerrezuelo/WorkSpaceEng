package hospital;

public class Doctor extends Person{
		String specialty;

		public Doctor(String specialty) {
			super();
			this.specialty = specialty;
		}

		public Doctor(String name, String address, int dni, String specialty) {
			super(name, address, dni);
			this.specialty = specialty;
		}

		public String getSpecialty() {
			return specialty;
		}

		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}

		@Override
		public String toString() {
			return super.toString() + "Doctor [specialty=" + specialty + "]";
		}
		
		
		
		
		

}//end public class Doctor
