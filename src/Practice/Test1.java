package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	public Test1() {
	}

	public void formatted(List<Object> list) {
		Stream<Object> obj = list.stream();
		obj.map(Object::toString).sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.forEach(i -> System.out.println(i));
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		List<Object> li = new ArrayList<>();
		li.add("가");
		li.add("바");
		li.add("히");
		li.add("라");
		li.add("강");
		li.add("서");

	test1.formatted(li);
	}

}
