package components.baseballpowerrankingsgenerator;

import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;

/**
 * {@code BaseballPowerRankingsGenerator1} represented as a two-dimensional array of strings with two ints to represent the lowest and highest point differentials of the teams with implementations of primary methods.
 *
 * @convention <pre>
 * $this.teamArrays is a two dimensional array of Strings where $this.teamArrays.length = 30 and $this.teamArrays[i].length = 9.
 * $this.lowestPointDifferential is the lowest point differential in the league represented as an int.
 * $this.highestPointDifferential is the highest point differential in the league represented as an int.
 * <pre>
 * @correspondence <pre
 * this = ($this.teamArrays, $this.lowestPointDifferential, $this.highestPointDifferential)
 * $this.teamArrays[i]  is in the form [teamName, teamWins, teamLosses, divisionWins, divisionLosses, last10GamesWins, last10GamesLosses, pointDifferential, strengthRating]
 * <pre>
 */
public class BaseballPowerRankingsGenerator1 extends BaseballPowerRankingsGeneratorSecondary {

    /*
     * Private members --------------------------------------------------------
     */

     /**
      * Representation of the team arrays.
      */
    private String[][] teamArrays;

    /**
     * Representation of the lowest point differential of the teams.
     */
    int lowestPointDifferential;

    /**
     * Representation of the highest point differential of the teams.
     */
    int highestPointDifferential;

    /**
     * Creator of initial representation.
     */
    public void createNewRep(){

        /*
         * Initializes the teamArrays to a 30x9 array of strings.
         */
        this.teamArrays = new String[30][9];

        /*
         * Initializes the lowestPointDifferential and highestPointDifferential to 0.
         */
        this.lowestPointDifferential = 0;
        this.highestPointDifferential = 0;
    }

    /**
     * Constructor for the BaseballPowerRankingsGenerator1.
     */
    public BaseballPowerRankingsGenerator1(String fileName){
        assert fileName != null : "Violation of: fileName is not null";
        this.createNewRep();

        /*
         * Creates a simple reader to read the file with the team's information.
         */
        SimpleReader input = new SimpleReader1L(fileName);

        /*
         * Loops through the file and adds the team's information to the teamArrays.
         */
        for (int teamNumber = 0; teamNumber < this.teamArrays.length; teamNumber++){
            for (int index = 0; index < this.teamArrays[teamNumber].length - 1; index++){
                this.teamArrays[teamNumber][index] = input.nextLine();
            }
            this.teamArrays[teamNumber][this.teamArrays[teamNumber].length - 1] = "0";
            input.nextLine();
        }

        /*
         * Closes the input file.
         */
        input.close();

    }

    /**
     * Standard methods --------------------------------------------------------
     */

    @SuppressWarnings("unchecked")
    @Override
    public final BaseballPowerRankingsGenerator newInstance(){
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear(){
        this.createNewRep();
    }

    @Override
    public final void transferFrom(BaseballPowerRankingsGenerator source){
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof BaseballPowerRankingsGenerator1 : ""
                + "Violation of: source is of dynamic type BaseballPowerRankingsGenerator1";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        BaseballPowerRankingsGenerator1 localSource = (BaseballPowerRankingsGenerator1) source;
        this.teamArrays = localSource.this.teamArrays;
        this.lowestPointDifferential = localSource.this.lowestPointDifferential;
        this.highestPointDifferential = localSource.this.highestPointDifferential;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ----------------------------------------------------------
     */

    @Override
    public final String getStat(int teamIndex, int statIndex){
        assert 0 <= teamIndex && teamIndex < this.teamArrays.length : "Violation of: 0 <= teamIndex < this.teamArrays.length";
        assert 0 <= statIndex && statIndex < this.teamArrays[teamIndex].length : "Violation of: 0 <= statIndex < this.teamArrays[teamIndex].length";
        return this.teamArrays[teamIndex][statIndex];
    }

    @Override
    public final void setStat(int teamIndex, int statIndex, String value){
        assert 0 <= teamIndex && teamIndex < this.teamArrays.length : "Violation of: 0 <= teamIndex < this.teamArrays.length";
        assert 0 <= statIndex && statIndex < this.teamArrays[teamIndex].length : "Violation of: 0 <= statIndex < this.teamArrays[teamIndex].length";
        assert value != null : "Violation of: value is not null";
        this.teamArrays[teamIndex][statIndex] = value;
    }

    @Override
    public final void switchTeamIndexes(int teamIndex1, int teamIndex2){
        assert 0 <= teamIndex1 && teamIndex1 < this.teamArrays.length : "Violation of: 0 <= teamIndex1 < this.teamArrays.length";
        assert 0 <= teamIndex2 && teamIndex2 < this.teamArrays.length : "Violation of: 0 <= teamIndex2 < this.teamArrays.length";
        String[] temp = this.teamArrays[teamIndex1];
        this.teamArrays[teamIndex1] = this.teamArrays[teamIndex2];
        this.teamArrays[teamIndex2] = temp;
    }

    @Override
    public final int getLowestPointDifferential(){
        return this.lowestPointDifferential;
    }

    @Override
    public final int getHighestPointDifferential(){
        return this.highestPointDifferential;
    }

    @Override
    public final void setLowestPointDifferential(int value){
        this.lowestPointDifferential = value;
    }

    @Override
    public final void setHighestPointDifferential(int value){
        this.highestPointDifferential = value;
    }

    @Override
    public final int baseballPowerRankingsGeneratorSize(){
        return this.teamArrays.length;
    }

    @Override
    public final int baseballPowerRankingsGeneratorTeamSize(){
        return this.teamArrays[0].length;
    }



}
