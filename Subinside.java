import java.io.*;
import java.util.*;
public class Subinside
{
Public Static void main (String [] args)
  {
  String s1 = "abcde";
  String s2 = "cd";
  int index = -1;
  int count = 0;
  for ( int i=0; i<s1.length;i++)
    {
      if (s1.charAt(i)==s2.charAt(0) && count == 0)
        {
          index = i;
          count++;      
        }
      else if ( s1.charAt(i) == s2.charAt(0))
        {
          count++;
        }
       else 
        {
          index = -1;
          count = 0;
         }
        if (count == s2.length())
          {
           break;
          }
  
    }
  
  if ( index > 1)
    System.out.println (" Matched at index" +index);
  else
  System.out.println (" S2 string is not a sub string of S1");
 
  }

}
