import org.junit.Assert;
import org.junit.Test;

public class diceTest {
Dice dice = new Dice();

    @Test
    public void diceThrowTest(){
        //Given

        //When
        for (int i=0; i<50;i++) {
            int actual =  dice.diceThrow(2);
            //Then
            Assert.assertTrue(actual <=12 && actual >=2);
        }
    }

    @Test
    public void simulationTest(){
        Simulation sim = new Simulation(2,1000000);
        sim.runSimulation();

    }
}
