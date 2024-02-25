import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator;
import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator1;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * A sample program for a use of the BaseballPowerRankingsGenerator Component
 */
public class VisualizingStandings {
    /**
    * Main method to demonstrate how the component could be used. *
    * @param args
    *           The command line arguments; unused here.
    */
    public static void main(String[] args) {
        // Creates two instances of the BaseballPowerRankingsGenerator
        BaseballPowerRankingsGenerator finalStandings2022 = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");
        BaseballPowerRankingsGenerator finalStandings2023 = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Creates a new SimpleWriter object to write to the console
        SimpleWriter out = new SimpleWriter1L();

        // Finds and sets the lowest and highest point differential for each year
        finalStandings2022.findAndSetLowestAndHighestPointDifferential();
        finalStandings2023.findAndSetLowestAndHighestPointDifferential();

        // Calculates and sets the strength ratings for each year
        finalStandings2022.calculateAndSetStrengthRatings();
        finalStandings2023.calculateAndSetStrengthRatings();

        // Writes the final standings for each year to the console
        out.println("2022 results: ");
        out.println(finalStandings2022.toString());
        out.println();
        out.println("2023 results: ");
        out.println(finalStandings2023.toString());

        // Closes the SimpleWriter object
        out.close();


    }
}
