package components.baseballpowerrankingsgenerator;
import components.standard.Standard;

/**
 * Baseball power rankings generator kernel component with primary methods. (Note: by package-wide convention, all referenceces are non null.)
 */
public interface BaseballPowerRankingsGeneratorKernel extends Standard<BaseballPowerRankingsGenerator>{

    /**
     *Method to return the stat gievn the teamIndex and statIndex.
     *
     * @param teamIndex
     *                 the index for the array that holds the team's information
     * @param statIndex
     *                 the index in the tea, array that holds the stat to return
     * @return The stat for the team at the given index
     * @requires 0 <= teamIndex < this.teamArrays.length and 0 <= statIndex < this.teamArrays[teamIndex].length
     * @ensures The stat that is returned for the correct team given the teamIndex and statIndex.
     */
    String getStat(int teamIndex, int statIndex);

    /**
     * Method to set the stat gievn the teamIndex and statIndex and the value of the stat.
     *
     * @param teamIndex
     *                 the index for the array that holds the team's information
     * @param statIndex
     *                 the index in the tea, array that holds the stat to return
     * @param value
     *                the value to set the stat to
     * @replaces this.teamArrays[intIndex][statIndex]
     * @requires 0 <= teamIndex < this.teamArrays.length and 0 <= statIndex < this.teamArrays[teamIndex].length and value != null
     * @ensures The stat that is set for the correct team given the teamIndex and statIndex.
     */
    void setStat(int teamIndex, int statIndex, String value);

    /**
     * Method to switch the team indexes given the two indexes.
     * @param teamIndex1
     *                  The index of the first team to switch.
     * @param teamIndex2
     *                  The index of the second team to switch.
     * @updates this.teamArrays
     * @requires 0 <= teamIndex1 < this.teamArrays.length and 0 <= teamIndex2 < this.teamArrays.length
     * @ensures The two teams at the given indexes are switched. (i.e. the team at teamIndex1 is now at teamIndex2 and vice versa.)
     */
    void switchTeamIndexes(int teamIndex1, int teamIndex2);

    /**
     * Method to get the lowest point differential of the teams.
     *
     * @return this.lowestPointDifferential
     * @ensures The lowest point differential of the teams is returned.
     */
    int getLowestPointDifferential();

    /**
     * Method to get the highest point differential of the teams.
     *
     * @return this.highestPointDifferential
     * @ensures The highest point differential of the teams is returned.
     */
    int getHighestPointDifferential();

    /**
     * Method to set the lowest point differential of the teams.
     *
     * @param pointDifferential
     *                          The point differential to set the lowest point differential to.
     * @replaces this.lowestPointDifferential
     * @requires pointDifferential <= 0
     * @ensures this.lowestPointDifferential = pointDifferential
     */
    void setLowestPointDifferential(int pointDifferential);

    /**
     * Method to set the highest point differential of the teams.
     *
     * @param pointDifferential
     *                          The point differential to set the highest point differential to.
     * @replaces this.highestPointDifferential
     * @requires pointDifferential <= 0
     * @ensures this.highestPointDifferential = pointDifferential
     */
    void setHighestPointDifferential(int pointDifferential);

    /**
     * Method to return the number of arrays in the two dimensional array.
     *
     * @return this.teamArrays.length
     * @ensures The number of arrays in the two dimensional array is returned.
     */
    int baseballPowerRankingsGeneratorSize();

    /**
     * Method to return the length of a team array in the two dimensional array.
     *
     * @return this.teamArrays[0].length
     * @ensures The length of a team array in the two dimensional array is returned.
     */
    int baseballPowerRankingsGeneratorTeamSize();


}
