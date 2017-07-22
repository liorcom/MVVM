package lior.package.data;

import lior.package.data.remote.AuthAPI;

/**
 * Created by bukhoriaqid on 11/10/16.
 */

public class DataManager
{
    private static AuthAPI sAuthAPI = new AuthAPI();

    public static void login (String id, String password)
    {
        sAuthAPI.login(id, password);
    }

    public static void logout ()
    {
        sAuthAPI.logout();
    }

    public static void forgotPassword (String id) { sAuthAPI.forgotPassword(id);}

    public static String getUserToken ()
    {
        return "";
    }


}
