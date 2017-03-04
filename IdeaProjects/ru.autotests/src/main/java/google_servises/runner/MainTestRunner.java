package google_servises.runner;

import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by Dmitriy.Yakovlev on 04.03.17.
 */
public class MainTestRunner {
    public static void main(String[] args) {
        runTest();
    }

    private static void runTest() {
        // Initializing junit core
        Computer computer = new Computer();
        JUnitCore jUnitCore = new JUnitCore();

        // running all tests
        Result result = jUnitCore.run(computer, AllTests.class);

        // returning result
        System.exit(result.wasSuccessful() ? 0 : 1);
    }
}
