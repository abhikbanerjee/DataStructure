package com.mycompany.interviews;

/**
 *
 * @author abhikbanerjee12
 */
public class TimePassTest {
  
  public static void main(String args[]){
    
    String stri = new String("1235164827");
    char[] str = stri.toCharArray();
    removeDuplicates(str);
    
  }
  public static void removeDuplicates(char[] str) {
    if (str == null) return;
    int len = str.length;
    if (len < 2) return;
    int tail = 1;
    for (int i = 1; i < len; ++i) 
    {
      int j;
      for (j = 0; j < tail; ++j)
      {
        System.out.println();
        System.out.println(i+" :: "+j);
        print(str);
        if (str[i] == str[j])
          break;
      }
      if (j == tail)
      {
        str[tail] = str[i];
        ++tail;
      }
    }
    str[tail] = 0;
  }
  
  public static void print(char[] str){
    for(int i =0;i<str.length;i++){
      System.out.print(str[i]+" ");
    }
  }
}
