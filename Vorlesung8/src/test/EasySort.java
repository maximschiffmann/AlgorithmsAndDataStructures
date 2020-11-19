package test;

import java.util.*;

public class EasySort {
	public static void insertionSort1(String[] objArray) {
// insertion sort starts from second element
		for (int i = 1; i < objArray.length; i++) {
			String objectToSort = objArray[i];
			float objectToSortValue = Float.parseFloat(objArray[i].substring(0, 3));
			int j = i;
			while (j > 0 && Float.parseFloat(objArray[j - 1].substring(0, 3)) > objectToSortValue) {
				objArray[j] = objArray[j - 1];
				j--;
			}
			objArray[j] = objectToSort;
		}
	}

	public static void main(String[] args) {
		String one = "xxx@web.de";
		String two = "yyy@web.de";
		String three = "aaa@web.de";

		// In mailIn = new In(args[0]);

		String[] mailArray = { one, two, three };

		double[] grades = { 1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0 };
		double bestGrade = 1.0;

		Random randomGrade = new Random();

		int count = 0;
		for (Object i : mailArray) {

			if (!(i.equals("meineMail"))) {
				mailArray[count] = grades[randomGrade.nextInt(grades.length)] + " " + i;

			} else
				mailArray[count] = bestGrade + " " + i;
			count++;
		}

		insertionSort1(mailArray);
		List<String> gradelist = Arrays.asList(mailArray);
		// Collections.sort(gradelist);

		gradelist.forEach(t -> System.out.println(t));
	}

}