package chapter5;

import jp.kwebs.lib.Browser;
import jp.kwebs.lib.Input;

public class Sample0 {

	public static void main(String[] args) {
		String fname;
		String seiza = Input.getString();
		
		switch(seiza) {
			case "おひつじざ"	-> fname = "aries";
			case "おうしざ"		-> fname = "taurus";
			case "みずがめざ"	-> fname = "aquarius";
			case "ししざ"			-> fname = "leo";
			default						-> {
				System.out.println("入力エラーです");
				fname = "index";
				}
		}
		String url = "https://www.asahi.com/uranai/12seiza/";
		Browser.open(url + fname + ".html");

	}

}
