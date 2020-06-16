package Firebase.BP.menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ipapi {
public static double lat,lon;
public Ipapi() throws IOException
{
    URL ipapi = new URL("https://ipapi.co/json/");

        URLConnection c = ipapi.openConnection();
        c.setRequestProperty("User-Agent", "java-ipapi-client");
        BufferedReader reader = new BufferedReader(
          new InputStreamReader(c.getInputStream())
        );
        String line;
        int i=0;
        while ((line = reader.readLine()) != null)
        {
              i++;
            if(i==15 || i==16)
            {
                String m[]=line.split(":");
                String k=m[1];
                k=k.substring(0,k.length()-1);
                System.out.println(k);
                if(i==15)
                    Menu.lat=Double.parseDouble(k);
                else
                    Menu.lon=Double.parseDouble(k);
            }
            else
                continue;
            //System.out.println(line);
        }
        reader.close();
         
       
}
    public static void main(String[] args) throws IOException {
        Ipapi op=new Ipapi();
    }

}