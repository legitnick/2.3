/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
    public static int pow8(int n){
        int res = 1;
        while(n-->0)res*=8;
        return res;
    }
    
    public static int bit_pow8(int n){
        int res = 1;
        while(n-->0)res=res<<3;
        return res;
    }
	public static void main(String[] args) {
		System.out.println(pow8(4));
		System.out.println(bit_pow8(9));
		
	}
}


