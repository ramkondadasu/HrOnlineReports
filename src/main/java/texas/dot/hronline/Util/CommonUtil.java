package texas.dot.hronline.Util;

public class CommonUtil {
	
	/*
	 * {"A","D","C"} with the given string and delimiter "|^" expecting '^A|^B|^C|^D|^E'
	 */
	
	public static String convertStringArrayToString(String[]starry, String del){		
		StringBuilder sb = new StringBuilder();
		for(String str : starry){
			sb.append(str).append(del);
		}
		return "^"+sb.substring(0,sb.length()-2);
	}

}
