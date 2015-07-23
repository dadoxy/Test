/*
 * Class exponats that implements searchable
 */
public class Exponats {

	protected Integer ID;
	protected String name;
	protected String description;

	/*
	 * Constructor for exponats class including ID, name, and description
	 */
	public Exponats(Integer iD, String name, String description) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Exponats))
			return false;
		Exponats other = (Exponats) obj;
		if (ID != other.ID)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getID(){
		return ID.toString();
	}
	
	@Override
	public String toString() {
		return "Exponats [ID=" + ID + ", name=" + name + ", description="
				+ description + "]";
	}

}
