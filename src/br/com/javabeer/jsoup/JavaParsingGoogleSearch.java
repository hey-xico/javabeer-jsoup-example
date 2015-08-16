package br.com.javabeer.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaParsingGoogleSearch {
	public static void main(String[] args) {
		 Document doc;
		try {
			doc = Jsoup.connect("https://www.google.com/search?q=java").userAgent("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)").get();
	        Elements searchResults = doc.select("h3.r > a");
	        for (Element result : searchResults) {
	            String link = result.attr("href");
	            String titulo = result.text();
	            System.out.println("Titulo = " + titulo + ", Link = " + link.substring(6, link.indexOf("&")));
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
	       
	}
}
