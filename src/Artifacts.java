public class Artifacts extends Exponats {
	/*
	 * Artifacts class that extends exponats and have own name origin and period
	 * attributes
	 */
	private String name;
	private String origin;
	private Period period;

	/*
	 * Constructor for artifacts class including id, name,d escritpion,o rigin and
	 * period
	 */
	public Artifacts(int iD, String name, String description, String origin,
			Period period) {
		super(iD, name, description);
		this.origin = origin;
		this.period = period;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Artifacts))
			return false;
		Artifacts other = (Artifacts) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artifacts [name=" + name + ", origin=" + origin + ", period="
				+ period + "]";
	}

}
