package com.rainnie.exer4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReaderTest {
	public static void main(String[] args) {
		try {
			URL url=new URL("https://store.meizu.com/?rc=bdpzbt");
			BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		} catch (MalformedURLException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
	}
}
