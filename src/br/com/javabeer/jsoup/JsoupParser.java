package br.com.javabeer.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParser {
	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("https://twitter.com/javaandbeer").get();
			Element content = doc.getElementById("timeline");
			Elements links = content.getElementsByTag("p");
			for (Element link : links) {
				StringBuilder hashTags = new StringBuilder();
				
				Elements hashTagsElementes = link.getElementsByClass("twitter-hashtag");
				
				for (Element element : hashTagsElementes) {
					hashTags.append(element.text()+" ");
				}
				String linkText = link.text();
				System.out.println("TWEET = "+linkText+", \nHASHTAGS::"+hashTags+"\n\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
