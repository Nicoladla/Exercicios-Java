public class App {
    public static void main(String[] args) throws Exception {
        Holidayzers holi = new Holidayzers();
        holi.getHolidazers();
        System.out.println(holi.isHolidazer("22-12-2024"));
    }
}
