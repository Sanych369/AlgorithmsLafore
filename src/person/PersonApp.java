package person;

public class PersonApp {
    public static void main(String[] args) {
        int maxSize = 100;
        PersonDataArray personDataArray = new PersonDataArray(maxSize);
        personDataArray.insert("Evans", "Patty", 24);
        personDataArray.insert("Smith", "Lorraine", 37);
        personDataArray.insert("Yee", "Tom", 43);
        personDataArray.insert("Adams", "Henry", 63);
        personDataArray.insert("Hashimoto", "Sato", 21);
        personDataArray.insert("Stimson", "Henry", 29);
        personDataArray.insert("Velasquez", "Jose", 72);
        personDataArray.insert("Lamarque", "Henry", 54);
        personDataArray.insert("Vang", "Minh", 22);
        personDataArray.insert("Creswell", "Lucinda", 18);

        personDataArray.displayPeople();

        String searchKey = "Henry";
        Person found = personDataArray.find(searchKey);

        if (found != null) {
            System.out.println("Found " );
            found.displayPerson();
        } else {
            System.out.println("Cant find " + searchKey);
        }
        System.out.println("Deleting Smith, Yee, and Creswell");
        personDataArray.delete("Patty"); // Удаление трех элементов
        personDataArray.delete("Lorraine");
        personDataArray.delete("Tom");
        personDataArray.displayPeople(); // Повторный вывод содержимого
    }
}
