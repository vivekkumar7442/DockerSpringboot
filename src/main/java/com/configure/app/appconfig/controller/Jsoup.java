package com.configure.app.appconfig.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author vivek
 *
 */
public class Jsoup {
public static void main(String args[]) throws IOException {

	
	Document document=org.jsoup.Jsoup.connect("http://164.100.128.10/mfmsReports/complaintReport").get();
	
	String tit=document.title();
	ArrayList<String> downServers = new ArrayList<>();
	
	System.out.println(tit);
	
	Element table =document.select("table").get(0);
	Elements rows = table.select("tr");
	
	for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
	    Element row = rows.get(i);
		System.out.println(row);

	    Elements cols = row.select("td");
		System.out.println(cols);


	   
	}
	
	System.out.println(table);
	
		
		
}


}
