/**
<<<<<<< HEAD
 * WHAT ANIMAL IS BALOGNA
=======
 * Hi Matt not Matt Frank
>>>>>>> origin/master
 * A simple port scanner
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package portScanner;

// Adapted from:
// http://proquest.safaribooksonline.com.proxy.libraries.uc.edu/0596007213/javanp3-CHP-9-SECT-3

import java.net.*;
import java.io.*;

public class LowPortScanner {

  public static void main(String[] args) {
    final int maxPort = 1024;
    String host = "localhost";

    //System.err.println("This is an error message");
    
    if (args.length > 0) {
      host = args[0];
    }
    System.out.println("Scanning ports on " + host);
    for (int i = 1; i <= maxPort; i++) {
      try {
        Socket mySocket = new Socket(host, i);
        // if we get this far, we were able to open the socket.
        // Now close it because all we cared about was trying to open it.
        mySocket.close();
        System.out.println("There is a server on port " + i + " of " + host);
      }
      catch (UnknownHostException ex) {
        System.err.println(ex);
        break;
      }
      catch (IOException ex) {
        // must not be a server on this port
      }
    } // end for    
  }  // end main

}  // end PortScanner
