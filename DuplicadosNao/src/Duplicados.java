public class Duplicados {
    private String[] list1;
    private String[] list2;

    public Duplicados() {
    }

    public Duplicados(String[] list1, String[] list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public void findDuplicates() {
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j])
                    System.out.println(list1[i]);
            }
        }
    }
}
