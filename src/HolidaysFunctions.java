import java.util.ArrayList;

public class HolidaysFunctions {

    private ArrayList<Holiday> holidaysList = new ArrayList<>();

    public HolidaysFunctions() {
        String[] holidaysNames = {"Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", 
        "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", 
        "Proclamação da República", "Natal"};
        String[] holidaysDates = {"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", 
        "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023"}; 

        for (int i=0; i < holidaysDates.length; i++) {
            Holiday holiday = new Holiday(holidaysDates[i], holidaysNames[i]);
            holidaysList.add(holiday);
        }
    }

    public void isHoliday(String date) {
        for (int j=0; j < holidaysList.size(); j++) {
            if (date.equals(holidaysList.get(j).getDate())) {
                System.out.println("No dia " + date + " é " + holidaysList.get(j).getName());
                return;
            }
        }
        
        System.out.println("Essa data não é feriado");
    }

    public void getAllHolidays() {
        for (int j=0; j < holidaysList.size(); j++) {
            System.out.println("No dia " + holidaysList.get(j).getDate() + " é " + holidaysList.get(j).getName());
        }
    }
}
