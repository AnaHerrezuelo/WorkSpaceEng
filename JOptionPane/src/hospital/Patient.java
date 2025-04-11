package hospital;

public class Patient extends Person{
		int identifier;

		public Patient(int identifier) {
			super();
			this.identifier = identifier;
		}

		public Patient(String name, String address, int dni, int identifier) {
			super(name, address, dni);
			this.identifier = identifier;
		}

		public int getIdentifier() {
			return identifier;
		}

		public void setIdentifier(int identifier) {
			this.identifier = identifier;
		}

		@Override
		public String toString() {
			return super.toString() + "Patient [identifier=" + identifier + "]";
		}
		

}//end public class Patient
