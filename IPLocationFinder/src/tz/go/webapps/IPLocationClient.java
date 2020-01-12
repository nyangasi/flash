package tz.go.webapps;

import com.lavasoft.*;

public class IPLocationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Plse supply an IP address for the lookup");
		}
		else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			String ipLocation = geoIPServiceSoap.getIpLocation(ipAddress);
			System.out.println(ipLocation);
			
		}
	}

}