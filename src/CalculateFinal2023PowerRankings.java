import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator;
import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator1;

/**
 * A sample program for a use of the BaseballPowerRankingsGenerator Component
 */
public class CalculateFinal2023PowerRankings {
    /**
    * Main method to demonstrate how the component could be used. *
    * @param args
    *           The command line arguments; unused here.
    */
    public static void main(String[] args) {

        // Creates a BallPowerRankingsGenerator object for the final standings of 2023
        BaseballPowerRankingsGenerator finalStandings2023 = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Finds and sets the lowest and highest point differential for 2023
        finalStandings2023.findAndSetLowestAndHighestPointDifferential();

        // Calculates and sets the strength ratings
        finalStandings2023.calculateAndSetStrengthRatings();

        // Orders the teams by strength rating
        finalStandings2023.orderTeamsByStrengthRating();

        // Writes the final standings for 2023 to a file
        finalStandings2023.printResultsToFile("doc/Final2023PowerRankings.txt", "Final 2023 Power Rankings:");

    }
}
