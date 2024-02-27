import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator;
import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator1;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;

/**
 * JUnit test fixture for {@code BaseballPowerRankingsGeneratorSecondary}.
 */
public class BaseballPowerRankingsGeneratorSecondaryTest {
    /*
     * getTeamName method tests -----------------------------------------------------
     */
    @Test
    public void getTeamNameTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getTeamName(0);

        // Checks the result
        assertEquals("Baltimore Orioles", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamNameTestPIT(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getTeamName(24);

        // Checks the result
        assertEquals("Pittsburgh Pirates", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamNameTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getTeamName(29);

        // Checks the result
        assertEquals("San Francisco Giants", result);
        assertEquals(bExpected, b);
    }

    /*
     * getTeamWins method tests -----------------------------------------------------
     */
    @Test
    public void getTeamWinsTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamWins(0);

        // Checks the result
        assertEquals(101, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamWinsTestLAA(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamWins(11);

        // Checks the result
        assertEquals(73, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamWinsTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamWins(29);

        // Checks the result
        assertEquals(79, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getTeamLosses method tests -----------------------------------------------------
     */
    @Test
    public void getTeamLossesBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamLosses(0);

        // Checks the result
        assertEquals(61, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamLossesTestNYY(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamLosses(2);

        // Checks the result
        assertEquals(80, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamLossesTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamLosses(29);

        // Checks the result
        assertEquals(83, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getDivisionWins method tests -----------------------------------------------------
     */
    @Test
    public void getDivisionWinsTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getDivisionWins(0);

        // Checks the result
        assertEquals(449, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getDivisionWinsTestDET(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getDivisionWins(7);

        // Checks the result
        assertEquals(358, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getDivisionWinsTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getDivisionWins(29);

        // Checks the result
        assertEquals(404, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getDivisionLosses method tests -----------------------------------------------------
     */
    @Test
    public void getDivisionLossesTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getDivisionLosses(0);

        // Checks the result
        assertEquals(361, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getDivisionLossesTestMIL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getDivisionLosses(22);

        // Checks the result
        assertEquals(406, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getDivisionLossesTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getDivisionLosses(29);

        // Checks the result
        assertEquals(406, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getTeamWinsLast10 method tests -----------------------------------------------------
     */
    @Test
    public void getTeamWinsLast10TestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamWinsLast10(0);

        // Checks the result
        assertEquals(6, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamWinsLast10TestCLE(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamWinsLast10(6);

        // Checks the result
        assertEquals(4, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamWinsLast10TestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamWinsLast10(29);

        // Checks the result
        assertEquals(3, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getTeamLossesLast10 method tests -----------------------------------------------------
     */
    @Test
    public void getTeamLossesLast10TestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamLossesLast10(0);

        // Checks the result
        assertEquals(4, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamLossesLast10TestCWS(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamLossesLast10(5);

        // Checks the result
        assertEquals(7, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamLossesLast10TestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getTeamLossesLast10(29);

        // Checks the result
        assertEquals(7, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getPointDifferential method tests -----------------------------------------------------
     */
    @Test
    public void getTeamPointDifferentialTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getPointDifferential(0);

        // Checks the result
        assertEquals(129, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamPointDifferentialTestSTL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getPointDifferential(23);

        // Checks the result
        assertEquals(-110, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getTeamPointDifferentialTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getPointDifferential(29);

        // Checks the result
        assertEquals(-45, result, 0.01);
        assertEquals(bExpected, b);
    }

    /*
     * getStrengthRating method tests -----------------------------------------------------
     */
    @Test
    public void getStrengthRatingBeforeCalcTest(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        double result = b.getStrengthRating(0);

        // Check the result
        assertEquals(0, result, 0.01);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStrengthRatingAfterCalcTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        double result = b.getStrengthRating(0);

        // Check the result
        assertEquals(1.1129, result, 0.0001);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStrengthRatingAfterCalcTestHOU(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        double result = b.getStrengthRating(10);

        // Check the result
        assertEquals(1.0718, result, 0.0001);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStrengthRatingAfterCalcTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        double result = b.getStrengthRating(29);

        // Check the result
        assertEquals(.7834, result, 0.0001);
        assertEquals(bExpected, b);
    }

    /*
     * setStrengthRating method tests -----------------------------------------------------
     */
    @Test
    public void setStrengthRatingTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setStrengthRating(0, 2.134);

        // Check the result
        assertEquals(2.134, b.getStrengthRating(0), 0.0001);
        assertEquals(bExpected, b);
    }

    @Test
    public void setStrengthRatingTestTEX(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setStrengthRating(14, 2.134);

        // Check the result
        assertEquals(2.134, b.getStrengthRating(14), 0.0001);
        assertEquals(bExpected, b);
    }

    @Test
    public void setStrengthRatingTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setStrengthRating(29, 2.134);

        // Check the result
        assertEquals(2.134, b.getStrengthRating(29), 0.0001);
        assertEquals(bExpected, b);
    }

    /*
     * findAndSetLowestAndHighestPointDifferential method tests -----------------------------------------------------
     */
    @Test
    public void findAndSetLowestAndHighestPointDifferentialTest2023(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();

        // Check the result
        assertEquals(-399, b.getLowestPointDifferential());
        assertEquals(231, b.getHighestPointDifferential());
        assertEquals(bExpected, b);
    }

    @Test
    public void findAndSetLowestAndHighestPointDifferentialTests2022(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();

        // Check the result
        assertEquals(-252, b.getLowestPointDifferential());
        assertEquals(334, b.getHighestPointDifferential());
        assertEquals(bExpected, b);
    }

    @Test
    public void findAndSetLowestAndHighestPointDifferentialTests2021(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2021Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2021Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();

        // Check the result
        assertEquals(-297, b.getLowestPointDifferential());
        assertEquals(269, b.getHighestPointDifferential());
        assertEquals(bExpected, b);
    }

    /*
     * calculateAndSetStrengthRatings method tests -----------------------------------------------------
     */
    @Test
    public void calculateAndSetStrengthRatingsTestBAL(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        b.findAndSetLowestAndHighestPointDifferential();

        // Calls the method
        b.calculateAndSetStrengthRatings();

        // Check the result
        assertEquals(1.1129, b.getStrengthRating(0), 0.0001);
        assertEquals(bExpected, b);
    }

    @Test
    public void calculateAndSetStrengthRatingsTestPHI(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        b.findAndSetLowestAndHighestPointDifferential();

        // Calls the method
        b.calculateAndSetStrengthRatings();

        // Check the result
        assertEquals(1.0235, b.getStrengthRating(18), 0.0001);
        assertEquals(bExpected, b);
    }

    @Test
    public void calculateAndSetStrengthRatingsTestSF(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        b.findAndSetLowestAndHighestPointDifferential();

        // Calls the method
        b.calculateAndSetStrengthRatings();

        // Check the result
        assertEquals(.7834, b.getStrengthRating(29), 0.0001);
        assertEquals(bExpected, b);
    }

    /*
     * orderTeamsByStrengthRatings method tests -----------------------------------------------------
     */
    @Test
    public void orderTeamsByStrengthRatingsTest2023(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsInOrderByStrength.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        b.orderTeamsByStrengthRating();

        // Check the result
        assertEquals(bExpected, b);
    }

    @Test
    public void orderTeamsByStrengthRatingsTest2022(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2022StandingsInOrderByStrength.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        b.orderTeamsByStrengthRating();

        // Check the result
        assertEquals(bExpected, b);
    }

    @Test
    public void orderTeamsByStrengthRatingsTest2021(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2021Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2021StandingsInOrderByStrength.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        b.orderTeamsByStrengthRating();

        // Check the result
        assertEquals(bExpected, b);
    }

    /*
     * printResultsToFile method tests -----------------------------------------------------
     */
    @Test
    public void printResultsToFileTest2023(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsInOrderByStrength.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        b.orderTeamsByStrengthRating();
        b.printResultsToFile("doc/Final2023PowerRankingsTest.txt", "Final 2023 Power Rankings:");

        // Check the result
        assertEquals(bExpected, b);
        SimpleReader expected = new SimpleReader1L("doc/Final2023PowerRankings.txt");
        SimpleReader result = new SimpleReader1L("doc/Final2023PowerRankingsTest.txt");
        // Checks that every line is the same
        while (!expected.atEOS()) {
            assertEquals(expected.nextLine(), result.nextLine());
        }

        expected.close();
        result.close();
    }

    @Test
    public void printResultsToFileTest2022(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2022StandingsInOrderByStrength.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        b.orderTeamsByStrengthRating();
        b.printResultsToFile("doc/Final2022PowerRankingsTest.txt", "Final 2022 Power Rankings:");

        // Check the result
        assertEquals(bExpected, b);
        SimpleReader expected = new SimpleReader1L("doc/Final2022PowerRankings.txt");
        SimpleReader result = new SimpleReader1L("doc/Final2022PowerRankingsTest.txt");
        // Checks that every line is the same
        while (!expected.atEOS()) {
            assertEquals(expected.nextLine(), result.nextLine());
        }

        expected.close();
        result.close();
    }

    @Test
    public void printResultsToFileTest2021(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2021Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2021StandingsInOrderByStrength.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        b.calculateAndSetStrengthRatings();
        b.orderTeamsByStrengthRating();
        b.printResultsToFile("doc/Final2021PowerRankingsTest.txt", "Final 2021 Power Rankings:");

        // Check the result
        assertEquals(bExpected, b);
        SimpleReader expected = new SimpleReader1L("doc/Final2021PowerRankings.txt");
        SimpleReader result = new SimpleReader1L("doc/Final2021PowerRankingsTest.txt");
        // Checks that every line is the same
        while (!expected.atEOS()) {
            assertEquals(expected.nextLine(), result.nextLine());
        }

        expected.close();
        result.close();
    }


}
