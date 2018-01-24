package com.thoughtworks.recruitme.duplicateStringProblem;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueList {
  public static List<String> deDuplicate(List<String> list) {
	  if(list.size() == 0)
		  return new ArrayList<>();
	  else if (list.size() == 1)
		  return list ;
	  else {
		  java.util.Set<String> set = new LinkedHashSet<>(list);
		  return new ArrayList(set);
	  }
  }
}
