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
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/**
 * Created by Loulou on 20/12/2017.
 */


public class ConnectionWebService {

    private static final String WEB_SERVICE_URL = "https://192.168.4.10/www/pfe/webservice.php";
    private static final String LOGON_WEB_SERVICE = "LOGON";

    public ConnectionWebService() {

    }



    public static String getResultConnection(String login, String password) throws Exception {
        URL url = new URL(WEB_SERVICE_URL+"?q="+LOGON_WEB_SERVICE+"&user="+login+"&pass="+password);
        HttpsURLConnection urlConnection;

        String result = null;
        String api = null;
        String token = null;
        String error = null;

        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier(){
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }});
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, new X509TrustManager[]{new X509TrustManager(){
            public void checkClientTrusted(X509Certificate[] chain,
                                           String authType) throws CertificateException {}
            public void checkServerTrusted(X509Certificate[] chain,
                                           String authType) throws CertificateException {}
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }}}, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(
                context.getSocketFactory());


        // Ouverture de la connexion
            urlConnection = (HttpsURLConnection) url.openConnection();

            // Connexion à l'URL
            urlConnection.connect();

            // Si le serveur nous répond avec un code OK
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                urlConnection.getInputStream();
            }

        JsonReader reader = new JsonReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println("Output from Server .... \n");
        System.out.println(reader.toString());
       /* reader.beginObject();
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

*/
        return reader.toString();

    }

}
