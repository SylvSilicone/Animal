public class main extends ConsoleProgram {

    public void run() {
        String[] animals = new String[556];
        String[] used = new String[556];

        Scanner file = new Scanner(new File("input/Animals.txt"));

        int count = 0;

        while (file.hasNextLine()) {
            animals[count] = file.nextLine();
            count++;
        }

        char letter = (char)('A' + (int)(Math.random() * 26));

        println("Enter an animal that starts with " + letter);

        int usedCount = 0;

        while (true) {
            String animal = readLine();

            if (animal.length() == 0) {
                break;
            }

            if (Character.toUpperCase(animal.charAt(0)) != letter) {
                break;
            }

            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (animals[i].equals(animal)) {
                    found = true;
                }
            }

            if (!found) {
                break;
            }

            boolean alreadyUsed = false;

            for (int i = 0; i < usedCount; i++) {
                if (used[i].equals(animal)) {
                    alreadyUsed = true;
                }
            }

            if (alreadyUsed) {
                break;
            }

            used[usedCount] = animal;
            usedCount++;
        }

        println("You successfully entered " + usedCount + " animals.");
    }
}
```
