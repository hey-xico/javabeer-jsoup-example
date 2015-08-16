package br.com.javabeer.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupSelectors {
	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("https://twitter.com/javaandbeer").get();
			Elements hashTagsElementes = doc.select("img[src]");
			for (Element hashTags : hashTagsElementes) {
				System.out.println("HASHTAGS::"+hashTags);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
