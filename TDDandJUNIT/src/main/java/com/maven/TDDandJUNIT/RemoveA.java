package com.maven.TDDandJUNIT;

public class RemoveA {
	public String removeA(String string) {
		if(string.length() == 0) {
			return "";
		}
		else if(string.charAt(0)=='A' && string.charAt(1)=='A' ) {
			return string.substring(2);
		}
		else if(string.charAt(0)=='A') {
			return string.substring(1);
		}
		else if(string.charAt(1)=='A') {
			return string.charAt(0)+""+string.substring(2);
		}
		else {
			return string;
		}
	}

}
