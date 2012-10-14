import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Double> map = new HashMap<String, Double>();

		map.put("Джон Доу", new Double(3434.34));
		map.put("Том Смит", new Double(123.22));
		map.put("Джейн Бейкер", new Double(1378.00));
		map.put("Тод Холл", new Double(99.22));
		map.put("Ральф Смит", new Double(-19.08));

		Set<Map.Entry<String, Double>> set = map.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}

		System.out.println();

		double balance = map.get("Джон Доу");
		map.put("Джон Доу", balance + 1000);
		System.out.println("Новый баланс Джона Доу: " + map.get("Джон Доу"));

	}
}