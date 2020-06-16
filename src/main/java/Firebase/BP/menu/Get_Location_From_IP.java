/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firebase.BP.menu;

/**
 *
 * @author aryam
 */

import Firebase.BP.Main;
import java.io.IOException;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Get_Location_From_IP {
    public static void main(String[] args) throws IOException {
        InetAddress myIP=null;
            try {
                myIP = InetAddress.getLocalHost();
            } catch (UnknownHostException ex) {
                Logger.getLogger(Geoloc.class.getName()).log(Level.SEVERE, null, ex);
            }
        String ip=myIP.getHostAddress();
        System.out.println(ip);
        String path="https://ipapi.co/"+ip+"/json/";
         URL ipapi = new URL(path);

        URLConnection c = ipapi.openConnection();
        c.setRequestProperty("User-Agent", "java-ipapi-client");
        BufferedReader reader = new BufferedReader(
          new InputStreamReader(c.getInputStream())
        );

        String line;
        while ((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
        reader.close();
    }
 }


