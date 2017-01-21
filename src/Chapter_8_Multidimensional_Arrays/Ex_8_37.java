package Chapter_8;
public class Ex_8_37 {
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        String[][] capitals = {
            {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming", "American Samoa", "Guam", "Northern", "Mariana Islands", "Puerto Rico", "U.S. Virgin Islands"},
            {"Montgomery", "Juneau", "Phoenix", "Sacramento", "Denver", "Hartford", "", "Dover", "Washington", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne", "Pago Pago", "Hagåtña", "Saipan", "San Juan", "Charlotte Amalie"},
        };
        System.out.println("!!! Wrong Capitals !!!\n --> BUT WORKS Properly :)\n");
        System.out.println("All Towns: " + capitals[0].length);
        System.out.println("All Capitals: " + capitals[1].length + "\n");
        int correct = 0;
        for (int i = 0; i < capitals[0].length; i++) {
            System.out.printf("%d: What is the capital of %S: ", i + 1, capitals[0][i]);
            String answer = console.nextLine();
            if (answer.toLowerCase().contains(capitals[1][i].toLowerCase())) {
                correct++;
                System.out.println("Your answer is correct");
            }
            else 
                System.out.printf("The correct answer should be %s\n", capitals[1][i]);
        }
        System.out.printf("The correct count is %d\n", correct);
    }
    
}
