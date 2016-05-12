package snakecamel;

import java.util.ArrayList;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_+");//_の前までのwordを取得	
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//大文字だったら
				sb.append(camelcase.substring(j, i));//jからi-1番目までを切り取り
			
				if (sb.length() > 0) {
					sb.append("_");
				}
	
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if (s.equals("")) return "";
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);//toUpperCaseで大文字に変換
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		if (s.equals("")) return "";
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//小文字に変換
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
