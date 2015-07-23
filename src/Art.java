public class Art extends Exponats {
	/*
	 * Art class that extends exponats including attributes author name and
	 * period in which art is made
	 */
	private String authorName;
	private Period period;

	/*
	 * Constructor for art class including id, name, descritption, author name
	 * and period
	 */
	public Art(int iD, String name, String description, String authorName,
			Period period) {
		super(iD, name, description);
		this.authorName = authorName;
		this.period = period;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Art))
			return false;
		Art other = (Art) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Art [authorName=" + authorName + ", period=" + period + "]";
	}

}
