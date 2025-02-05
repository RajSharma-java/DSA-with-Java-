package com.loop;

public class FibnocacciSeries
{
	public static void main(String[] args) {
		int N=7;
		int first=0;
		int second=1;
		for(int i=1;i<=N; i++) {
			System.out.print(first+" ");
			int next= first+second;
			first=second;
			second=next;
		}
	}

}
