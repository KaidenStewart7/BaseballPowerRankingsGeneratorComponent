package components.baseballpowerrankingsgenerator;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Layered implementatinos of secondary methods for {@code BaseballPowerRankingsGenerator}.
 */
public abstract class BaseballPowerRankingsGeneratorSecondary implements BaseballPowerRankingsGenerator {
    /*
     * Common methods (from Object) ---------------------------------------------------
     */

     /*
      * The Object version of the hashCode method is not overridden because if the the nature of the implemenenation of a BaseballPowerRankingsGenerator would not make sense to be hashed. Futhermore, making a hashCode method for the BaseballPowerRankingsGenerator would be difficult as there are many differnet elements of different values in the BaseballPowerRankingsObject. As a result of both of these factors, the hashCode method will not be overrriden.
      */

     // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
     @Override
     public String toString() {
        // Creates result
        String result = "";
        // Prints every array in the two dimensional array
         for (int index = 0; index < this.baseballPowerRankingsGeneratorSize(); index++) {
            result += "[";
            for (int statIndex = 0; statIndex < this.baseballPowerRankingsGeneratorTeamSize(); statIndex++) {
                result += this.getStat(index, statIndex);
                if (statIndex < this.baseballPowerRankingsGeneratorTeamSize() - 1) {
                    result += ", ";
                 } else {
                    result += "]";
                 }
            } if (index < this.baseballPowerRankingsGeneratorSize() - 1) {
                result += ", \n";
            }
        }

     //Returns the resulting string
     return result;

    }

    @Override
    public boolean equals(Object obj) {
        // Creates a boolean to check if the two objects are equal
        boolean isEqual = true;

        if (this == obj) {
            isEqual = true;
        } else if (obj == null) {
            isEqual = false;
        } else if (this.getClass() != obj.getClass()) {
            isEqual = false;
        }

        //Returns the boolean
        return isEqual;
    }

    /*
     * Other non-kernel methods -----------------------------------------------------
     */

     @Override
    public String getTeamName(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
         return this.getStat(index, 0);
     }

     @Override
    public double getTeamWins(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 1));
    }

    @Override
    public double getTeamLosses(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 2));
    }

    @Override
    public double getDivisionWins(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 3));
    }

    @Override
    public double getDivisionLosses(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 4));
    }

    @Override
    public double getTeamWinsLast10(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 5));
    }

    @Override
    public double getTeamLossesLast10(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 6));
    }

    @Override
    public double getPointDifferential(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 7));
    }

    @Override
    public double getStrengthRating(int index) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        return Double.parseDouble(this.getStat(index, 8));
    }

    @Override
    public void setStrengthRating(int index, double value) {
        assert 0 <= index && index < this.baseballPowerRankingsGeneratorSize() : "Violation of: 0 <= index < this.teamArrays.length";
        assert value != 0 : "Violation of: value != null";
        this.setStat(index, 8, Double.toString(value));
    }

    @Override
    public void findAndSetLowestAndHighestPointDifferential(){
        //Creates the lowest and highest variables
        int lowest = 0;
        int highest = 0;

        // Loops through all teams to find the lowest and highest point differentials.
        for (int index = 0; index < this.baseballPowerRankingsGeneratorSize(); index++) {
            //Checks if the current point differential is lower than the current lowest
            if ((int) this.getPointDifferential(index) < lowest) {
                lowest = (int) this.getPointDifferential(index);
            }
            //Checks if the current point differential is higher than the current highest
            if ((int) this.getPointDifferential(index) > highest) {
                highest = (int) this.getPointDifferential(index);
            }
        }

        //Sets the lowest and highest point differentials
        this.setLowestPointDifferential(lowest);
        this.setHighestPointDifferential(highest);
    }

    @Override
    public void calculateAndSetStrengthRatings(){
        assert this.getLowestPointDifferential() != 0 : "Violation of: this.lowestPointDifferential != 0";
        assert this.getHighestPointDifferential() != 0 : "Violation of: this.highestPointDifferential != 0";
        // Loops through each team and calculates the strength rating.
        for (int team = 0; team < 30; team++){
            // Initializes the strength rating to 0.
            double strengthRating = 0;
            // Calculates the win percentage for the team and adds it to the strength rating.
            double winPercentage = this.getTeamWins(team) / (this.getTeamWins(team) + this.getTeamLosses(team));
            strengthRating += (winPercentage * 0.5);

            // Calculates the division win percentage for the team and adds it to the strength rating.
            double divisionWinPercentage = this.getDivisionWins(team) / (this.getDivisionWins(team) + this.getDivisionLosses(team));
            strengthRating += (divisionWinPercentage * 0.10);

            // Calculates the last 10 games win percentage for the team and adds it to the strength rating.
            double last10GamesWinPercentage = this.getTeamWinsLast10(team) / (this.getTeamWinsLast10(team) + this.getTeamLossesLast10(team));
            strengthRating += (last10GamesWinPercentage * 0.10);

            // Calculates the point differential spread comparasion for the team and adds it to the strength rating.
            double pointDifferentialSpreadComparasion = (this.getPointDifferential(team) - this.getLowestPointDifferential()) / (this.getHighestPointDifferential());
            strengthRating += (pointDifferentialSpreadComparasion * 0.30);

            // Sets the strength rating for the team.
            this.setStrengthRating(team, strengthRating);
        }
    }

    @Override
    public void orderTeamsByStrengthRating(){
        // Variable to keep track of the index in the array of team arrays.
        int index = this.baseballPowerRankingsGeneratorSize() - 1;
        while (index > 0){
            double teamOneStrengthRating = this.getStrengthRating(index - 1);
            double teamTwoStrengthRating = this.getStrengthRating(index);
            // Checks if the strength rating of the team at the current index is greater than the strength rating of the team at the next index and if so the teams are switched.
            if (teamTwoStrengthRating > teamOneStrengthRating){
                this.switchTeamIndexes(index, index - 1);
                index = this.baseballPowerRankingsGeneratorSize() - 1;
            } else {
                index--;
            }
        }
    }

    @Override
    public void printResultsToFile(String fileName, String date){
        assert fileName != null : "Violation of: fileName != null";
        assert date != null : "Violation of: date != null";

        //Creates new simple writer
        SimpleWriter out = new SimpleWriter1L(fileName);

        //Prints the date of the results
        out.println("Baseball Power Rankings: " + date);
        out.println();

        //Loops through all teems in order and prints the team name and strength rating.
        for (int index = 0; index < this.baseballPowerRankingsGeneratorSize(); index++) {
            out.println(index + 1 + ". " + this.getTeamName(index) + ": " + this.getStrengthRating(index));
        }

        //Closes the simple writer
        out.close();
    }



}

