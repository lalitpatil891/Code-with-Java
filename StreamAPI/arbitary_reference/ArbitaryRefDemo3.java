package streamAPI.arbitary_reference;

interface TriFunction<T, U, V, R> {
	R myApply(T t, U u, V v);
}

class Sum {
	public Integer doSum(String x, String y) {
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
}

public class ArbitaryRefDemo3 {

	public static void main(String[] args) {

		TriFunction<Sum, String, String, Integer> fn1 = (sum, x, y) -> sum.doSum(x, y);

		System.out.println(fn1.myApply(new Sum(), "100", "200"));

		System.out.println("----------------------------");

		TriFunction<Sum, String, String, Integer> fn2 = Sum::doSum;
		System.out.println(fn2.myApply(new Sum(), "300", "400"));

	}

}
