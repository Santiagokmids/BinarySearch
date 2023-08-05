package binarySort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bSearch {
	
	public final static String SEPARATOR = " ";
	private static ArrayList<Long> numbers = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		String nums = br.readLine();
		String parts[] = nums.split(SEPARATOR);

		for (int j = 0; j < parts.length; j++) {
			
			Long dates = Long.parseLong(parts[j]);
			numbers.add(dates);
		}
		
		br.close();
		bw.close();

	}
	
	public void sortByAverage() {
		Comparator<Long> numbersComparator = new Comparator<Long>() {

			@Override
			public int compare(Long num1, Long num2) {
				return Long.compare(num1, num2);
			}
		};
		//Collections.sort(students,Collections.reverseOrder(gradeAverageComparator));orden natural, pero al revez
		Collections.sort(numbers,numbersComparator);
	}

}
