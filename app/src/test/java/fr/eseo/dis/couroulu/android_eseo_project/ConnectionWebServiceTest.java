package fr.eseo.dis.couroulu.android_eseo_project;

import org.junit.Test;

/**
 * Created by Loulou on 20/12/2017.
 */

public class ConnectionWebServiceTest {

    @Test
    public void ResultLoginTest() throws Exception {
        String login="test";
        String password="test";

        BeanResultLogin bean = ConnectionWebService.getResultConnection(login,password);
    }

}
