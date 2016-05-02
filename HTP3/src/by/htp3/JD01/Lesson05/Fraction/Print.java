package by.htp3.JD01.Lesson05.Fraction;


	
	import java.util.Arrays;
	import java.util.Collection;


public class Print {

		//SimpleFraction f;	
		
		public static void print(SimpleFraction f) {
			System.out.println(f);
		}

		public static void print(SimpleFraction []f) {
			System.out.println(Arrays.toString(f));
		}

		public static void print(Collection<SimpleFraction> f) {
			if ( null == f) {
				System.out.println("null");
			}

			if (f.isEmpty()) {
				System.out.println("[]");
			}

			String result = "[";
			boolean first = true;
			for (SimpleFraction simpleFraction : f) {
				if (!first) {
					result = result + ", ";
				} else {
					first = false;
				}

				result = result + simpleFraction;
			}
			
			result = result + "]";
			System.out.println(result);
		}
}
