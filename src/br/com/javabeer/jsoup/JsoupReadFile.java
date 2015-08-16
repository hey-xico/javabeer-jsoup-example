package br.com.javabeer.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupReadFile {
	
	ClassLoader classLoader = getClass().getClassLoader();
	
	public static void main(String[] args) {
		JsoupReadFile jrf = new JsoupReadFile();
		Document doc;
		try {
			//pegando arquivos da pasta resources
			doc = Jsoup.parse(new File(jrf.classLoader.getResource("jsoup-file-example.html").getFile()), "UTF8");
			System.out.println(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

