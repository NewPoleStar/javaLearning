package com.exercise.java;

public class Test {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e = new Employee();
		e.name="Ram";
		e.salary=3000;
		e.getDetails();
		String v = e.greet("to Java");
		System.out.println(v);
		System.out.println();
		
		Employee e1 = new Employee();
		e1.name="Sham";
		e1.salary=5000;
		e1.getDetails();
		System.out.println(e1.greet("back to Java Class"));
		
	
		
		
		
		
		
		
//		for(int i=0; i<10;i++) {
//			System.out.println(i);
//			System.out.println();
//		}
//	}
		
		
//		int x=5,y=10;
//		switch(x+y){
//			case 5:
//				System.out.println("Print 5");
//				break;
//			case 10:
//				System.out.println("Print 10");
//				break;
//			case 15:
//				System.out.println("Print 15");
//				break;
//			}
//		
//			String day = "Sunday";
//			switch(day.toUpperCase()) {
//			case "MONDAY":
//			case "TUESDAY":
//			case "WEDNESDAY":
//			case "THURSDAY":
//			case "FRIDAY":
//				System.out.println("Weekdays");
//				break;
//			case "SATURDAY":
//			case "SUNDAY":
//				System.out.println("Weekends");
//				break;
//			default:
//				System.out.println("Not a day");
//				break;
//			
			}
		
		
		

}
