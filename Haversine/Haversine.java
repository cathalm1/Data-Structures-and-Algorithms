package Haversine;

public class Haversine {
    public static void main(String args[]) {
        System.out.println(haversine(40.6892,74.0445,48.8530,2.3499));
    }

    public static double haversine(double slat, double slon, double elat, double elon) {
        double lat = Math.toRadians(elat - slat);
        double lon = Math.toRadians(elon - slon);
        slat = Math.toRadians(slat);
        elat = Math.toRadians(elat);
        double r = Math.pow(Math.sin(lat/2),2)+Math.pow(Math.sin(lon/2),2)*Math.cos(slat)*Math.cos(elat);
        return 6371*(2 * Math.asin(Math.sqrt(r)));
    }

}
