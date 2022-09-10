/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Nga
 */
public class InetAddressTest {

    public static void main(String args[]) throws
            UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
       // Address = InetAddress.getByName("www.nba.com");
        Address = InetAddress.getByName("www.tintuconline.com.vn"); //khong go ten thu muc va ten file vao dia chi
        System.out.println("tintuconline - address and ip is: "+ Address);
        Address = InetAddress.getByName("www.google.com"); //khong go ten thu muc va ten file vao dia chi
        System.out.println("google.com - address and ip is: "+ Address);
         Address = InetAddress.getByName("www.yahoo.com"); //khong go ten thu muc va ten file vao dia chi
        System.out.println("yahoo.com - address and ip is: "+ Address);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
