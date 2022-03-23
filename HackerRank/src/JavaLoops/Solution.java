package JavaLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bufferedReader.readLine().trim());
		for(int i = 0; i<=20; i++) {
			System.out.println(N + " x "+i+" = "+i*N);
		}
		
		bufferedReader.close();
	}

}
