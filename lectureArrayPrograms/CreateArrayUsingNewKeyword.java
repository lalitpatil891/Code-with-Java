package logicalArray.lectureArrayPrograms;

public class CreateArrayUsingNewKeyword {

	public static void main(String[] args) {

		Object[] arr = new Object[6];   //Adding hetrogenious data
		arr[0] = 12;
		arr[1] = 45.90;          
		arr[2] = true;
		arr[3] = new String("NIT");
		arr[4] = new MyStudent();
		arr[5] = new MyCustomer();

		for (Object obj : arr) {
			System.out.println(obj);
		}
	}
}

class MyStudent {

	@Override
	public String toString() {
		return "MyStudent []";
	}
}

class MyCustomer {
	@Override
	public String toString() {
		return "MyCutomer []";
	}
}