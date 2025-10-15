public class LicationTester {
public class LocationTester {
    public static void main(String[] args) {
        // موقع المستخدم الحالي (مثال: تاجوراء)
        SimpleLocation myLocation = new SimpleLocation(32.9036, 13.2265);

        // موقع كلية تقنية المعلومات في طرابلس
        SimpleLocation collegeLocation = new SimpleLocation(32.8872, 13.1913);

        // طباعة المواقع
        System.out.print("موقعي الحالي: ");
        myLocation.printLocation();
        System.out.print("موقع الكلية: ");
        collegeLocation.printLocation();

        // حساب المسافة بين الموقعين
        double distance = myLocation.distanceTo(collegeLocation);
        System.out.println("المسافة بين الموقعين: " + distance + " كم");
    }
}