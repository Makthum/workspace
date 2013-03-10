package com.ubc.ca.socketprogramming;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class LocalHostFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalHostFinder ls= new LocalHostFinder();
		ls.find();

	}

	
	public void find()
	{
		try {
			       Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
			       if (interfaceList == null) {
			        System.out.println("--No interfaces found--");
			      } else {
			         while (interfaceList.hasMoreElements()) {
			          NetworkInterface iface = interfaceList.nextElement();
			           System.out.println("Interface " + iface.getName() + ":");
			           Enumeration<InetAddress> addrList = iface.getInetAddresses();
			            if (!addrList.hasMoreElements()) {
			            				              System.out.println("\t(No addresses for this interface)");
			           }
			            while (addrList.hasMoreElements()) {
			              InetAddress address = addrList.nextElement();
			             System.out.println(address.getCanonicalHostName());
			             System.out.println(address.isAnyLocalAddress());
			               System.out.print("\tAddress "
			                  + ((address instanceof Inet4Address ? "(v4)"
			                      : (address instanceof Inet6Address ? "(v6)" : "(?)"))));
			              System.out.println(": " + address.getHostAddress());
			           }
			         }
			       }
			        } catch (SocketException se) {
			          System.out.println("Error getting network interfaces:" + se.getMessage());
			    }
	}
}
