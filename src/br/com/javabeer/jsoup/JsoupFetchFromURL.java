package br.com.javabeer.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupFetchFromURL {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://google.com.br").get();
			System.out.println(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
