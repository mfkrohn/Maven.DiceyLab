public class Simulation {

    public int numberOfDice;
    public int numberOfTosses;

    public Simulation(int numberOfDice,int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;

    }

    public void runSimulation() {
        Bins bins = new Bins(numberOfDice,numberOfDice*6);
        Dice dice = new Dice();
        double percent = 0;
        for (int i = 0; i < numberOfTosses; i++){

            bins.binEntry(dice.diceThrow(numberOfDice));

        }
        for(int i = numberOfDice; i <= numberOfDice*6; i++){
            percent = (double)bins.getBin(i)/numberOfTosses;
            System.out.println(""+ i +" :   " + bins.getBin(i) + ":   " + percent);
        }
    }
}
