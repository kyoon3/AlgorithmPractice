package prac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Start = scan.nextInt();

		int[] Stair = new int[Start];
		boolean[] visited = new boolean[Start];

		for (int i = 0; i < Start; i++) {
			Stair[i] = scan.nextInt();
			visited[i] = false;
		}
		int[] DynamicStair = new int[Start];
		DynamicStair[0] = Stair[0];
		visited[0] = true;
		for (int i = 1; i < Stair.length; i++) {
			int max = DynamicStair[i - 1] + Stair[i];
			if (i >= 2) {
				if (visited[i - 2] == false ||)
					max = Math.max(max, DynamicStair[i - 2] + Stair[i]);
			}
			if (i >= 3) {

				if (visited[i - 3] == false)
					max = Math.max(max, DynamicStair[i - 3] + Stair[i]);
			}
			visited[i] = true;
		}
	}
}
