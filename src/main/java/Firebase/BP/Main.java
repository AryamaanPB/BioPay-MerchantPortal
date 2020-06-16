/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firebase.BP;

import Firebase.BP.menu.Geoloc;
import Firebase.BP.menu.Ipapi;
import Firebase.BP.menu.Login;
import Firebase.BP.menu.Menu;
import Firebase.BP.menu.SignUp;
import static Firebase.BP.util.Common.initFirebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aryam
 */
public class Main {
public static Login logg;
public static String flag="";
public static FirebaseDatabase database;
public static DatabaseReference myRef;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initFirebase();
        Geoloc geo=new Geoloc();
        //Ipapi ipp=new Ipapi();
        /*System.out.println("0");
        
        database=FirebaseDatabase.getInstance();
        myRef=database.getReference();
         myRef.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            // This method is called once with the initial value and again
            // whenever data at this location is updated.
            
          InetAddress myIP=null;
            try {
                myIP = InetAddress.getLocalHost();
            } catch (UnknownHostException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        String ip=myIP.getHostAddress();
        String ipf="";
        for(int i=0;i<ip.length();i++)
        {
            char c=ip.charAt(i);
            if(c=='.' || c==':')
                continue;
            else
                ipf+=c;
        }
            if(dataSnapshot.child("Remember").hasChild(ipf))
            {
                System.out.println("1");
                if(dataSnapshot.child("Remember").child(ipf).getValue().toString()=="false")
                {
                    System.out.println("2");
                    try {
                        logg=new Login();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    logg.setVisible(true);
                    flag="main";
                }
                else
                {
                    Menu m=null;
                    try {
                        m = new Menu();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    m.setVisible(true);
                }
            }
           
        }

        @Override
        public void onCancelled(DatabaseError error) {
            // Failed to read value
            System.out.println("FAILEEEEEED");
        }
    });*/
       try {
                        logg=new Login();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    logg.setVisible(true);
                    flag="main";
        
    }
    
}
