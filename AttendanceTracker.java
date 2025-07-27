import java.util.*;

class AttendanceTracker {
    private static final int DAYS = 5;
    private static final int HOURS_PER_DAY = 8;
    private int[][] attendance = new int[DAYS][HOURS_PER_DAY];
    private String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};//no need to initialise seperately
    private int totalPresent = 0;

    public void collectAttendance() {
        Scanner s = new Scanner(System.in);
        for (int day = 0; day < DAYS; day++) {
            System.out.println("\nEnter attendance for " + dayNames[day] + ":");
            for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
                System.out.print("Hour " + (hour + 1) + " (1=Present, 0=Absent): ");
                attendance[day][hour] = s.nextInt();
                totalPresent += attendance[day][hour];
            }
        }
        
    }

    public void displayDailyPercentages() {
        System.out.println("\nDaily Attendance Percentages:");
        for (int day = 0; day < DAYS; day++) {
            int dailyPresent = 0;
            for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
                dailyPresent += attendance[day][hour];
            }
            double dailyPercentage = (dailyPresent / (double) HOURS_PER_DAY) * 100;
            System.out.printf("%s: %.2f%%\n", dayNames[day], dailyPercentage);//to limit decimal points(since using double)
        }
    }

    public void displayOverallAttendance() {
        int totalHours = DAYS * HOURS_PER_DAY;
        double overallPercentage = (totalPresent / (double) totalHours) * 100;
        System.out.printf("\nOverall Weekly Attendance: %.2f%%\n", overallPercentage);
    }

    public static void main(String[] args) {
        AttendanceTracker obj = new AttendanceTracker();
        System.out.print(">>> NIVRITI MUTHU VAIRAVAN (2024503005)");
        obj.collectAttendance();
        obj.displayDailyPercentages();
        obj.displayOverallAttendance();
    }
}