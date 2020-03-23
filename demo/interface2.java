package practice;

import java.util.Scanner;

interface iFace2{
	public int func(int n);
}

class aClass implements iFace2{
	public int func(int n){
		System.out.println("hi");
		return n;
	}
}

class mClass{
	public static void main(String[] args){
		aClass a = new aClass();
		int i = a.func(1);
	}
}