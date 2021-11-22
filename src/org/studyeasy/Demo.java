package org.studyeasy;

public class Demo {
	
	public static final int COREJAVA       = 1;
	public static final int COLLECTIONS    = 2;
	public static final int GENERICS       = 3;
	public static final int JSPANDSERVLETS = 4;
	public static final int MULTITHEADING  = 5;

	public static void main(String[] args) {
		
		Learning learn = Learning.COREJAVA;
		
		switch(learn) {
		case COLLECTIONS:
			System.out.println("Step 2: Learning Collections Framework");
			break;
		case COREJAVA:
			System.out.println("Step 1: Learning Core Java");
			break;
		case GENERICS:
			System.out.println("Step 3: Learning Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4: Learning JSP and Servlets");
			break;
		case MULTITHEADING:
			System.out.println("Step 5: Learning MuiltThreading");
			break;
		default:
			break;
		
		}
		
	}

}
