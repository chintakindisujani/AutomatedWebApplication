package com.iwt.nit.aws.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MyIPAddress {

	public static String ipAddress() {
		String ipAddress = "";
		try {

			URL url = new URL("http://checkip.amazonaws.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			ipAddress = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ipAddress;
	}
}
