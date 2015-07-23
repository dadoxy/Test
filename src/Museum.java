import java.util.ArrayList;

public class Museum implements Searchable {
	/*
	 * Class museum including list of all other classes Exponats, art, artifacts
	 * and employee
	 */
	protected ArrayList<Exponats> exponats = new ArrayList<Exponats>();

	protected ArrayList<Art> art = new ArrayList<Art>();

	protected ArrayList<Artifacts> artifacts = new ArrayList<Artifacts>();

	protected ArrayList<Employee> employees = new ArrayList<Employee>();

	/*
	 * Constructor for museum class with lists as parameters
	 */
	public Museum(ArrayList<Exponats> exponats, ArrayList<Art> art,
			ArrayList<Artifacts> artifacts, ArrayList<Employee> employees) {
		super();
		this.exponats = exponats;
		this.art = art;
		this.artifacts = artifacts;
		this.employees = employees;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Museum))
			return false;
		Museum other = (Museum) obj;
		if (art == null) {
			if (other.art != null)
				return false;
		} else if (!art.equals(other.art))
			return false;
		if (artifacts == null) {
			if (other.artifacts != null)
				return false;
		} else if (!artifacts.equals(other.artifacts))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (exponats == null) {
			if (other.exponats != null)
				return false;
		} else if (!exponats.equals(other.exponats))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Musem [exponats=" + exponats + ", art=" + art + ", artifacts="
				+ artifacts + ", employees=" + employees + "]";
	}

	/*
	 * Method for searching through attributes and returning true if any
	 * attribute contains given String
	 */
	@Override
	public boolean fitsSearch(String s) {
		int counter = 0;
		for (int i = 0; i < exponats.size(); i++) {
			if (exponats.get(i).name == s || exponats.get(i).description == s
					|| exponats.get(i).getID().equals(s)
					|| employees.get(i).name == s
					|| employees.get(i).surname == s
					|| employees.get(i).getAge().equals(s) ) {
				counter++;
			}
		}
		if (counter > 0) {
			return true;
		}
		return false;
	}
}
