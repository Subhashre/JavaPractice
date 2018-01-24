package com.thoughtworks.recruitme.characterCount;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
  public static Map<Character, Integer> countCharacters(String string) {
	  Map<Character, Integer> result = new HashMap();
	  string = string.replaceAll("\\s", "");
	  if(string.length()==0)
		  return result;
	  else {
		  char[] chars = string.toCharArray();
		  for(char c: chars) {
			  if(result.containsKey(c))
				  result.put(c, result.get(c)+1);
			  else
				  result.put(c, 1);
		  }
		  
	  }
	  return result;
		  
  }
}
