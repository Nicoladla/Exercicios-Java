public class App {
    public static void main(String[] args) throws Exception {
        String[] list1= {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] list2= {"Manga", "Caqui", "Morango", "Amora"};

        Duplicados duplicados= new Duplicados(list1, list2);
        duplicados.findDuplicates();
    }
}
