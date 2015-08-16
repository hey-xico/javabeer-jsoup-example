package br.com.javabeer.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupReadString {
	public static void main(String[] args) {
		String html = "<!DOCTYPE html>"
							+"<html>"
							+"<head>"
							+"<title>JavaBeer</title>"
							+"</head>"
							+"<body>"
							+"<h1>Hello World</h1>"
							+"</body>"
							+"</html>";
		
		Document doc = Jsoup.parse(html);
		
	}
}
