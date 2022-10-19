import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("notepad.exe");
        Process miProceso = null;
        ArrayList<Process> listaProcesos = new ArrayList<>();


        try {
            int timesToOpen;
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduzca el numero de ventanas que quiere abrir: ");
            timesToOpen = scan.nextInt();

            for (int i = 0; i < timesToOpen; i++) {
                miProceso = processBuilder.start();
                String initProcess = ("The process " + i + " has been initialized at --> " + LocalTime.now());
                System.out.println(initProcess.substring(0, 54));
                listaProcesos.add(miProceso);
            }
            listaProcesos.get(0).waitFor(500, TimeUnit.MILLISECONDS);

            for (int i = 0; i < listaProcesos.size(); i++) {
                Process proceso = listaProcesos.get(i);

                proceso.destroyForcibly();
                String endProcess = ("The process " + i + " has ended at --> " + LocalTime.now());
                System.out.println(endProcess.substring(0, 43));
            }
        } catch (IOException | InterruptedException error) {
            error.printStackTrace();
        }
    }
}
