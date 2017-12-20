package fr.eseo.dis.couroulu.android_eseo_project;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/**
 * Created by Loulou on 20/12/2017.
 */

public class ConnectionWebService {
    public ConnectionWebService() {

    }



    public static BeanResultLogin getResultConnection(String login, String password) throws Exception {
        URL url = new URL("https://192.168.4.10/www/pfe/webservice.php?q=XXX");
        HttpURLConnection urlConnection;

        String result = null;
        String api = null;
        String token = null;
        String error = null;


            // Ouverture de la connexion
            urlConnection = (HttpURLConnection) url.openConnection();

            // Connexion à l'URL
            urlConnection.connect();

            // Si le serveur nous répond avec un code OK
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                urlConnection.getInputStream();
            }

        JsonReader reader = new JsonReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println("Output from Server .... \n");
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("result")) {
                result = reader.nextString();
            } else if (name.equals("api")) {
                api = reader.nextString();
            } else if (name.equals("token") && reader.peek() != JsonToken.NULL) {
                token = reader.nextString();
            } else if (name.equals("error") && reader.peek() != JsonToken.NULL) {
                error = reader.nextString();
            } else {
                reader.skipValue();
            }
        }
        Log.d(result,"result");
        Log.d(api,"api");
        Log.d(token,"token");
        Log.d(error,"error");
        reader.endObject();
        reader.close();
        return new BeanResultLogin(result, api, token, error);



    }

}
