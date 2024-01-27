import java.util.ArrayList;
import java.util.List;

public class Holidayzers {
    private List<Holidayzer> holidayzers = new ArrayList<>();

    public Holidayzers() {
        holidayzers.add(new Holidayzer("01-01-2024", "Confraternização Mundial"));
        holidayzers.add(new Holidayzer("12-02-2024", "Carnaval"));
        holidayzers.add(new Holidayzer("13-02-2024", "Carnaval"));
        holidayzers.add(new Holidayzer("29-03-2024", "Sexta-feira Santa"));
        holidayzers.add(new Holidayzer("21-04-2024", "Tiradentes"));
        holidayzers.add(new Holidayzer("01-05-2024", "Dia do Trabalho"));
        holidayzers.add(new Holidayzer("30-05-2024", "Corpus Christi"));
        holidayzers.add(new Holidayzer("07-09-2024", "Independência do Brasil"));
        holidayzers.add(new Holidayzer("12-10-2024", "Nossa Senhora Aparecida"));
        holidayzers.add(new Holidayzer("02-11-2024", "Finados"));
        holidayzers.add(new Holidayzer("15-11-2024", "Proclamação da República"));
        holidayzers.add(new Holidayzer("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        holidayzers.add(new Holidayzer("25-12-2024", "Natal"));
    }

    public void getHolidazers() {

        for (int i = 0; i < holidayzers.size(); i++) {
            System.out.println(holidayzers.get(i));
        }
    }

    public String isHolidazer(String date) {
        for (int i = 0; i < holidayzers.size(); i++) {
            if (holidayzers.get(i).getDate() == date)
                return "Dia " + date + " é " + holidayzers.get(i).getName();
        }

        return "Dia " + date + " não é feriado";
    }
}
