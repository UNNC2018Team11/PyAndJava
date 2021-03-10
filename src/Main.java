public class Main {

    public static void main(String[] args) {

        Thread simulationLauncher = new SimulationLauncher(args[0]);
        simulationLauncher.start();

    }
}
