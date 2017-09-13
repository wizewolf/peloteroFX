package com.metodologia.sistemapelotero.modelos.REST;

import com.google.gson.Gson;
import com.metodologia.sistemapelotero.modelos.ClientesJson;
import com.metodologia.sistemapelotero.modelos.entity.ClienteVo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class RESTCliente {
	private static final String WS_URI = "http://pelotero.herokuapp.com/";

	public static boolean postClienteAdd(ClientesJson persona) {
		try {

			URL url = new URL(WS_URI + "clientes");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			Gson gson = new Gson();
			String input = gson.toJson(persona);
			System.out.println(input);

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			if (conn.getResponseCode() != 200) { // HttpURLConnection.HTTP_CREATED
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
			return true;

		} catch (MalformedURLException ex) {
			System.err.println(ex.getMessage());
			return false;

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			return false;
		}
	}

	public static List<ClienteVo> getClientes() {

		try {
			
			URL url = new URL(WS_URI + "clientes");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			List<ClienteVo> list = null;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				Gson gson = new Gson();
				list = gson.fromJson(output, new TypeToken<List<ClienteVo>>() {
				}.getType());
			}
			
			conn.disconnect();
			list.forEach(x -> System.out.println(x));
			return list;
		} catch (MalformedURLException ex) {
			System.err.println(ex.getMessage());
		} catch (IOException | RuntimeException ex) {
			System.err.println(ex.getMessage());
		}
		return null;
	}
}
