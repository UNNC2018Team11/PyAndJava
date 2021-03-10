import java.io.IOException;

/**
 * To launch python script
 */
public class PythonLauncher extends Thread {
    private String path;
    private String python3 = "python3";
    private String[] arguments;
    private Process process;

    /**
     * Constructor
     * @param path The path to python script
     */
    PythonLauncher(String path) {
        this.path = path;
        arguments = new String[] {python3, this.path};
    }

    /**
     * Run another process to launch python script
     */
    @Override
    public void run() {
        try {
            process = Runtime.getRuntime().exec(arguments);
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        process.destroy();
    }

    public void des() {
        process.destroy();
    }
}
