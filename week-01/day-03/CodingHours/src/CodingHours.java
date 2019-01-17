public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyAverage = 6;
        int weeksInTotal = 17;
        int workdays = 5;
        int averageWorkHoursWeekly = 52;
        int totalCodingHoursInSemester;
        int totalHoursInSemester = 24 * 7 * weeksInTotal;
        int totalHoursInSemester2 = averageWorkHoursWeekly * weeksInTotal;
        int percentageOfCodingHours;

        totalCodingHoursInSemester = dailyAverage * workdays * weeksInTotal;
        System.out.println("Hours spent with coding in a semester: " + totalCodingHoursInSemester);

        percentageOfCodingHours = (totalHoursInSemester2 * 100) / totalHoursInSemester;
        System.out.println("Percentage of coding hours: " + percentageOfCodingHours);

    }
}