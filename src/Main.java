import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creating exponats 
		 */
		Exponats e2 = new Exponats(2, "Zebra", "beatuful zebra xD");
		Exponats e1 = new Exponats(1, "Lion", "beatuful lion xD");
		/*
		 * creating art
		 */
		Art a1 = new Art(1, "Art1", "awesome art", "Leonardo", Period.MODERN);
		Art a2 = new Art(2, "Art2", "beautiful art", "Mice", Period.CLASSIC);
		/*
		 * Creating artifacts
		 */
		Artifacts ar1 = new Artifacts(1, "Artifact 1",
				"Strange alien artifact", "Unknown", Period.MODERN_AGE);
		Artifacts ar2 = new Artifacts(2, "Artifact 2", "Strange knight sword",
				"Unknown", Period.MIDDLE_AGE);
		/*
		 * Creating employees
		 */
		Employee employee1 = new Employee("King", "Kinge", 20);
		Employee employee2 = new Employee("Kingis", "kan", 35);
		/*
		 * creating lists with exponats, art, artifacts and employees
		 */
		ArrayList<Exponats> expoList = new ArrayList<Exponats>();
		expoList.add(e1);
		expoList.add(e2);

		ArrayList<Art> artList = new ArrayList<Art>();
		artList.add(a1);
		artList.add(a2);

		ArrayList<Artifacts> artifactsList = new ArrayList<Artifacts>();
		artifactsList.add(ar1);
		artifactsList.add(ar2);

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		/*
		 * Creating museum that contains all lists above
		 */
		Museum museum1 = new Museum(expoList, artList, artifactsList,
				employeeList);
		/*
		 * sorting exponats by name
		 */
		museum1.exponats.sort(new Comparator<Exponats>() {

			@Override
			public int compare(Exponats o1, Exponats o2) {
				return o1.name.compareTo(o2.name);
			}

		});
		System.out.println(expoList);
		/*
		 * testing fits search method
		 */
		System.out.println(museum1.fitsSearch("3`"));
	}

}
