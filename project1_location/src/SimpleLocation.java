public class SimpleLocation {
    private double latitude;
    private double longitude;

    // المنشئ الافتراضي
    public SimpleLocation() {
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    // Overloading: منشئ يقبل إحداثيات
    public SimpleLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getter و Setter
    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) {
        if(latitude >= -90 && latitude <= 90) this.latitude = latitude;
        else System.out.println("خطأ: خط العرض يجب أن يكون بين -90 و 90");
    }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) {
        if(longitude >= -180 && longitude <= 180) this.longitude = longitude;
        else System.out.println("خطأ: خط الطول يجب أن يكون بين -180 و 180");
    }

    // حساب المسافة بين موقعين
    public double distanceTo(SimpleLocation other) {
        final int R = 6371; // نصف قطر الأرض بالكيلومتر
        double latDistance = Math.toRadians(other.getLatitude() - this.latitude);
        double lonDistance = Math.toRadians(other.getLongitude() - this.longitude);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // المسافة بالكيلومتر
    }

    // طباعة الموقع
    public void printLocation() {
        System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
    }
}
