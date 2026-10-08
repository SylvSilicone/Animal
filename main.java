public class main extends ConsoleProgram {

    public void run() {
        ArrayCollection<String> animals = new ArrayCollection<String>();
        ArrayCollection<String> used = new ArrayCollection<String>();

        Scanner file = new Scanner(new File("input/Animals.txt"));

        while (file.hasNextLine()) {
            animals.add(file.nextLine());
        }

        char letter = (char) ('A' + (int)(Math.random() * 26));

        println("Enter an animal that starts with " + letter);

        while (true) {
            String animal = readLine();

            if (animal.length() == 0) {
                break;
            }

            if (Character.toUpperCase(animal.charAt(0)) != letter) {
                break;
            }

            if (!animals.contains(animal)) {
                break;
            }

            if (used.contains(animal)) {
                break;
            }

            used.add(animal);
        }

        println("You successfully entered " + used.size() + " animals.");
    }
}
```
