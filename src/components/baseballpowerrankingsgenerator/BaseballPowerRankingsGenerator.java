package components.baseballpowerrankingsgenerator;

/**
 * {@code BaseballPowerRankingsGenerator} enhanced with secondary methods.
 */
public interface BaseballPowerRankingsGenerator extends BaseballPowerRankingsGeneratorKernel{

    /**
     * Method to get the team's name.
     *
     * @param index
     *              The index of the array of the current team.
     * @return The name of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The name of the team of the array at the given index is returned.
     */
    String getTeamName(int index);

    /**
     * Method to get the team's wins.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The number of wins of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The number of wins of the team of the array at the given index is returned.
     */
    double getTeamWins(int index);

    /**
     * Method to get the team's losses.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The number of losses of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The number of losses of the team of the array at the given index is returned.
     */
    double getTeamLosses(int index);

    /**
     * Method to get the number of division wins the team's division has.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The number of division win's of the team's division at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The number of division wins of the team's division of the array at the given index is returned.
     */
    double getDivisionWins(int index);

    /**
     * Method to get the number of division losses the team's division has.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The number of division win's of the team's division at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The number of division losses of the team's division of the array at the given index is returned.
     */
    double getDivisionLosses(int index);

    /**
     * Method to get the team's wins in the last 10 games.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The number of wins in the last 10 games of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The number of wins in the last 10 games of the team of the array at the given index is returned.
     */
    double getTeamWinsLast10(int index);

    /**
     * Method to get the team's losses in the last 10 games.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The number of losses in the last 10 games of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The number of losses in the last 10 games of the team of the array at the given index is returned.
     */
    double getTeamLossesLast10(int index);

    /**
     * Method to get the team's point differential.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The point differential of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The point differential of the team of the array at the given index is returned.
     */
    double getPointDifferential(int index);

    /**
     * Method to get the team's strength rating.
     *
     * @param index
     *             The index of the array of the current team.
     * @return The strength rating of the team at the given index.
     * @requires 0 <= index < this.teamArrays.length
     * @ensures The strength rating of the team of the array at the given index is returned.
     */
    double getStrengthRating(int index);

    /**
     * Method to get the team's strength rating.
     *
     * @param index
     *             The index of the array of the current team.
     * @param strengthRating
     *              The strength rating to be set for the team at the given index.
     * @replaces this.teamArrays[index][8]
     * @requires 0 <= index < this.teamArrays.length and strengthRating != null
     * @ensures The strength rating of the team of the array at the given index is returned.
     */
    void setStrengthRating(int index, double strengthRating);

    /**
     * Method to find and set the lowest and highest point differential of the all the teams in the league.
     *
     * @replaces this.lowestPointDifferential
     * @replaces this.highestPointDifferential
     * @ensures The lowest and highest point differential of the teams are set.
     */
    void findAndSetLowestAndHighestPointDifferential();

    /**
     * Method to calculate and set the strength ratings of the teams.
     *
     * @updates this.teamArrays
     * @requires this.lowestPointDifferential != 0 and this.highestPointDifferential != 0
     * @ensures The strength rating is calculated and set for each team with the strength
     *  = (Team Win Percentage  * 0.50) + (Division Win Percentage * 0.10) +
     *  (Last 10 Games Win Percentage * .10) + (Point Differential Spread Comparision * .30)
     */
    void calculateAndSetStrengthRatings();

    /**
     * Method to order the teams by their strength rating.
     *
     * @updates this.teamArrays
     * @ensures The teams are ordered by their strength rating from the first array of teams having the highest strength rating to the last array of teams having the lowest strength rating.
     */
    void orderTeamsByStrengthRating();

    /**
     * Method to print the results to the console.
     *
     * @param fileName
     *              The name of the file to print the results to.
     * @param date
     *           The date of the results.
     * @requires fileName != null
     * @ensures The results are printed to the the file with the given name.
     */
    void printResultsToFile(String fileName, String date);




}
