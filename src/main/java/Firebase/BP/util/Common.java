/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firebase.BP.util;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author aryam
 */
public class Common {
    public static void initFirebase() throws FileNotFoundException, FileNotFoundException, IOException
    {
        FileInputStream refreshToken = new FileInputStream("credentials.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(refreshToken))
            .setDatabaseUrl("https://sem2-64e12.firebaseio.com/")
            .build();

        FirebaseApp.initializeApp(options);
    }
    
}
