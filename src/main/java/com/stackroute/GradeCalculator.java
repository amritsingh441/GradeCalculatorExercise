package com.stackroute;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeCalculator {

	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores) {
		Map<Integer, String> tmpMap = new TreeMap<Integer, String>();
		if(scores!= null && scores.size() > 0) {
			Iterator<Integer> itr = scores.keySet().iterator();
			while(itr.hasNext()) {
				int rollNumber = itr.next();
				if(scores.get(rollNumber)>=80 && scores.get(rollNumber) <= 100) {
					tmpMap.put(rollNumber, "A");

				}else if(scores.get(rollNumber) >= 60 && scores.get(rollNumber) < 80) {
					tmpMap.put(rollNumber, "B");

				}else if(scores.get(rollNumber) >= 45 && scores.get(rollNumber) < 60) {
					tmpMap.put(rollNumber, "C");

				}else if(scores.get(rollNumber) < 45 && scores.get(rollNumber)>=0){
					tmpMap.put(rollNumber, "D");
				}
			}
			return tmpMap;
		}else {
			return null;
		}
	}

	//Do not print anything other than what's expected/asked in problem
	public static void main(String[] args) {
		//Use Scanner to get input from console
		Scanner sc = new Scanner (System.in);
		int noOfStudents = sc.nextInt();
		Map<Integer, Integer> stdMarksMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < noOfStudents; i++) {
			stdMarksMap.put(sc.nextInt(), sc.nextInt());
		}
		Map<Integer, String> resMap = calculateGrade(stdMarksMap);
		for (Integer key : resMap.keySet()) {
			System.out.println(key+" "+resMap.get(key));
			
		}
	}
}