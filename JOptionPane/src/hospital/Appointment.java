package hospital;

import java.time.LocalDate;

public class Appointment {
	private Doctor doc;
	private Patient pat;
	private LocalDate day;

	public Appointment(Doctor doc, Patient pat, LocalDate day) {
		super();
		this.doc = doc;
		this.pat = pat;
		this.day = day;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public Patient getPat() {
		return pat;
	}

	public void setPat(Patient pat) {
		this.pat = pat;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Appointment [doc=" + doc + ", pat=" + pat + ", day=" + day + "]";
	}

}// end public class Patient
