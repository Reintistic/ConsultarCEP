package br.com.consultarcep.viacep;

import br.com.consultarcep.Util;
import br.com.consultarcep.domain.Address;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServiceOfCep {
    static String webService = "http://viacep.com.br/ws/";
    static int successCode = 200;

    public static Address searchAddressBy(String cep)throws Exception{
        String callUrl = webService + cep + "/json";

        try{
            URL url = new URL(callUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if(connection.getResponseCode() != successCode)
                throw new RuntimeException("HTTP error code: " + connection.getResponseCode());

            BufferedReader response = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            String jsonToString = Util.fromJson(response);

            Gson gson = new Gson();
            Address address = gson.fromJson(jsonToString, Address.class);

            return address;
        }
        catch(Exception e){
            throw new Exception("ERROR: " + e);
        }
    }
}
