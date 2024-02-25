import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator;
import components.baseballpowerrankingsgenerator.BaseballPowerRankingsGenerator1;


/**
 * JUnit test fixture for {@code BaseballPowerRankingsGenerator1}.
 */
public class BaseballPowerRankingsGenerator1Test {

    /*
     * getStat tests -----------------------------------------------------------
     */
    @Test
    public void getStatTestTeamIndex0StatIndex0() {
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(0, 0);

        // Checks equality
        assertEquals("Baltimore Orioles", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex3StatIndex1() {
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(3, 1);

        // Checks equality
        assertEquals("99", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex9StatIndex2(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(9, 2);

        // Checks equality
        assertEquals("75", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex11StatIndex3(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(11,3);

        // Checks equality
        assertEquals("391", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex15StatIndex4(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(15, 4);

        // Checks equality
        assertEquals("386", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex20StatIndex5(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(20, 5);

        // Checks equality
        assertEquals("4", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex22StatIndex6(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(22, 6);

        // Checks equality
        assertEquals("4", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex25StatIndex7(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(25, 7);

        // Checks equality
        assertEquals("-15", result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getStatTestTeamIndex28StatIndex8(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        String result = b.getStat(25, 8);

        // Checks equality
        assertEquals("0", result);
        assertEquals(bExpected, b);
    }

    /*
     * setStat tests -----------------------------------------------------------
     */
    @Test
    public void setStatTestTeamIndex0StatIndex0(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsWithBaltimoreOriolesWins0.txt");

        // Calls the method
        b.setStat(0, 1, "0");

        // Checks equality
        assertEquals(bExpected, b);
    }

    @Test
    public void setStatTestTeamIndex6StatIndex2(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsWithClevelandGuardiansLosses0.txt");

        // Calls the method
        b.setStat(0, 6, "0");

        // Checks equality
        assertEquals(bExpected, b);
    }

    @Test
    public void setStatTestTeamIndex29Index7(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsWithSanFranciscoGiantsPointDifferential0.txt");

        // Calls the method
        b.setStat(29, 7, "0");

        // Checks equality
        assertEquals(bExpected, b);
    }

    /*
     * switchTeamIndexes tests -------------------------------------------------
     */
    @Test
    public void switchTeamIndexesTestBALAndBOS(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsWithBALAndBOSSwitched.txt");

        // Calls the method
        b.switchTeamIndexes(0, 1);

        // Checks equality
        assertEquals(bExpected, b);
    }

    @Test
    public void switchTeamIndexesTestCLEAndCWS(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsWithCLEAndCWSSwitched.txt");

        // Calls the method
        b.switchTeamIndexes(5, 6);

        // Checks equality
        assertEquals(bExpected, b);
    }

    @Test
    public void switchTeamIndexesTestSFAndSD(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023StandingsWithSFAndSDSwitched.txt");

        // Calls the method
        b.switchTeamIndexes(28, 29);

        // Checks equality
        assertEquals(bExpected, b);
    }

    /*
     * getLowestPointDifferential tests ----------------------------------------
     */
    @Test
    public void getLowestPointDifferentialTestBeforeFound(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        int result = b.getLowestPointDifferential();

        // Checks equality
        assertEquals(0, result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getLowestPointDifferentialTestAfterFound2023(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        int result = b.getLowestPointDifferential();

        // Checks equality
        assertEquals(-399, result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getLowestPointDifferentialTestAfterFound2022(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        int result = b.getLowestPointDifferential();

        // Checks equality
        assertEquals(-252, result);
        assertEquals(bExpected, b);
    }

    /*
     * getHighestPointDifferential tests ---------------------------------------
     */
    @Test
    public void getHighestPointDifferentialTestBeforeFound(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        int result = b.getHighestPointDifferential();

        // Checks equality
        assertEquals(0, result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getHighestPointDifferentialTestAfterFound2023(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        int result = b.getHighestPointDifferential();

        // Checks equality
        assertEquals(231, result);
        assertEquals(bExpected, b);
    }

    @Test
    public void getHighestPointDifferentialTestAfterFound2022(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2022Standings.txt");

        // Calls the method
        b.findAndSetLowestAndHighestPointDifferential();
        int result = b.getHighestPointDifferential();

        // Checks equality
        assertEquals(334, result);
        assertEquals(bExpected, b);
    }

    /*
     * setLowestPointDifferential tests ----------------------------------------
     */
    @Test
    public void setLowestPointDifferentialTest0(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setLowestPointDifferential(0);

        // Checks equality
        assertEquals(bExpected, b);
        assertEquals(0, b.getLowestPointDifferential());
    }

    @Test
    public void setLowestPointDifferentialTestNegative(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setLowestPointDifferential(-321);

        // Checks equality
        assertEquals(bExpected, b);
        assertEquals(-321, b.getLowestPointDifferential());
    }

    @Test
    public void setLowestPointDifferentialTestPositive(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setLowestPointDifferential(321);

        // Checks equality
        assertEquals(bExpected, b);
        assertEquals(321, b.getLowestPointDifferential());
    }

    /*
     * setHighestPointDifferential tests ---------------------------------------
     */
    @Test
    public void setHighestPointDifferentialTest0(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setHighestPointDifferential(0);

        // Checks equality
        assertEquals(bExpected, b);
        assertEquals(0, b.getHighestPointDifferential());
    }

    @Test
    public void setHighestPointDifferentialTestNegative(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setHighestPointDifferential(-321);

        // Checks equality
        assertEquals(bExpected, b);
        assertEquals(-321, b.getHighestPointDifferential());
    }

    @Test
    public void setHighestPointDifferentialTestPositive(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        b.setHighestPointDifferential(321);

        // Checks equality
        assertEquals(bExpected, b);
        assertEquals(321, b.getHighestPointDifferential());
    }

    /*
     * baseballPowerRankingsGeneratorSize test (only one test is needed as it should always return 30)
     */
    @Test
    public void baseballPowerRankingsGeneratorSizeTest(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        int result = b.baseballPowerRankingsGeneratorSize();

        // Checks equality
        assertEquals(30, result);
        assertEquals(bExpected, b);
    }

    /*
     * baseballPowerRankingsGeneratorTeamSize test (only one test is needed as it should always return 9)
     */
    @Test
    public void baseballPowerRankingsGeneratorTeamSizeTest(){
        // Sets up variables
        BaseballPowerRankingsGenerator b = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");
        BaseballPowerRankingsGenerator bExpected = new BaseballPowerRankingsGenerator1("doc/Final2023Standings.txt");

        // Calls the method
        int result = b.baseballPowerRankingsGeneratorTeamSize();

        // Checks equality
        assertEquals(9, result);
        assertEquals(bExpected, b);
    }



}
