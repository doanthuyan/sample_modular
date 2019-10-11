package org.devday.external.api.sample;

public class APIEndPoint {
	private static final String END_POINT = "https://discover.libraryhub.jisc.ac.uk/search?format=json&title=";
	public static void handShake() {
		System.out.println("Greeting from modular.\nI am using the end-point: "+ END_POINT);
	}
}
