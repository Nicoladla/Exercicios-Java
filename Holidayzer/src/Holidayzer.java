public class Holidayzer {
    public String date;
    public String name;

    public Holidayzer(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String toString(){
        return "{date: " + this.date + ", name: " + this.name + "}";
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
