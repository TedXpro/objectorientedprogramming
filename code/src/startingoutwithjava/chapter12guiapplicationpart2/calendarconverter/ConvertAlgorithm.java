package code.src.startingoutwithjava.chapter12guiapplicationpart2.calendarconverter;

public class ConvertAlgorithm {
    private int convertedDay;
    private int convertedMonth;
    private int convertedYear;

    public ConvertAlgorithm(int day, int month, int year, int flag) {
        
        if(flag == 1)
            convertToEthiopian();
        else 
            convertToGregorian();

    }

    private void convertToEthiopian() {

    }

    private void convertToGregorian() {
        
    }

    public int getDay() {
        return convertedDay;
    }

    public int getMonth() {
        return convertedMonth;
    }

    public int getYear() {
        return convertedYear;
    }
}
