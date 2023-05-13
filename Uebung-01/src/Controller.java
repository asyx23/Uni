public class Controller {

    public static void main(String[] args) {

        final String programmende = "quit";
        String command[];
        String line;

        do {

            System.out.println("Geben Sie den Befehl ein: ");
            line = StaticScanner.nextString();

            command = line.split(" ");

            System.out.println("Folgender Befehlt wurde eingegeben: " + line);

        } while (!(line.equals(programmende)));

        System.out.println("Programm Ende");

    }

    private void doCommand(String[] command) {
        switch ((char) command[0]) {

        }

    }

}
