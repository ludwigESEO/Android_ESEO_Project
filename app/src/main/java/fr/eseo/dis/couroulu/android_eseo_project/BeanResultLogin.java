package fr.eseo.dis.couroulu.android_eseo_project;

/**
 * Created by Loulou on 20/12/2017.
 */

public class BeanResultLogin {

    private String result;
    private String api;
    private String token;
    private String error;

    public BeanResultLogin(String result, String api, String token, String error) {


    }

    public String getApi() {
        return api;
    }

    public String getError() {
        return error;
    }

    public String getResult() {
        return result;
    }

    public String getToken() {
        return token;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
