package com.mycompany.interviews.stringproblems;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author abhikbanerjee12
 */
public class CareerCupBook_1_1 {
  
  	public static void main(String args[]){
		String str = "Abhik";
	//	String str = "Shekhar";
		System.out.println("Unique characters in a string = "+uniqueString(str));
		System.out.println("Unique characters in a string = "+uniqueStringSet(str));
		System.out.println("Unique characters in a string = "+uniqueStringNoExtraSpace(str));
	}
	public static boolean uniqueString(String st)
	{
		int ch[] = new int[256];
		for(int i =0;i <st.length(); i++){
			int cha = (int)st.charAt(i);
			if(ch[cha]!=0){
				return false;	
			}
			else{
				ch[cha] = cha;
			}
		}	
		return true;
	}
	public static boolean uniqueStringSet(String st)
        {
                HashSet<Character> hsh = new HashSet<Character>();
                for(int i =0;i <st.length(); i++){
                        Character cha = st.charAt(i);
                        if(!hsh.contains(cha)){
                                hsh.add(cha);
                        }
                        else{
                                return false;
                        }
                }
                return true;
        }
	public static boolean uniqueStringNoExtraSpace(String st)
	{
		char ch[] = st.toCharArray();
		Arrays.sort(ch);
		for(int i =0;i<ch.length-1;i++){
			if(ch[i] == ch[i+1]){
				return false;
			}
		}
		return true;	
	}
  
}
