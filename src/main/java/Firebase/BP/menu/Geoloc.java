/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firebase.BP.menu;

import io.ipgeolocation.api.Geolocation;
import io.ipgeolocation.api.GeolocationParams;
import io.ipgeolocation.api.IPGeolocationAPI;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aryam
 */
public class Geoloc {
    public Geoloc()
    {
         IPGeolocationAPI api = new IPGeolocationAPI("01e7802f32344d1a9817c7d831a3e298");
        GeolocationParams geoParams = new GeolocationParams();
        Geolocation geolocation = api.getGeolocation();

    if(geolocation.getStatus() == 200) {
        System.out.println(geolocation.getCountryCode2());
        System.out.println(geolocation.getTimezone().getCurrentTime());
        double latt=Double.parseDouble(geolocation.getLatitude());
        Menu.lat=latt+6.132794;
        System.out.println(Menu.lat);
        double longt=Double.parseDouble(geolocation.getLongitude());
        Menu.lon=longt-4.693918;
        System.out.println(longt);
    } else {
        System.out.printf("Status Code: %d, Message: %s\n", geolocation.getStatus(), geolocation.getMessage());
    }
    }
    public static void main(String[] args)
    {
       
    }
}
