package lecture5.task3;

public class LibraryDossier {

    public static void main(String[] args) {

        Reader.takeBook("Петров В.В.", 4);
        Reader.takeBook("Пупкина И.И.", new String[]{"Словарь матерных слов", "Энциклопедия Дарвина"});
        Reader.takeBook("Ромашкина Аделаида Апполинариевна",
                       new Book[]{ new Book("Еврипид", "Медея"),
                                   new Book("Софокл", "Царь Эдип")});
        Reader.returnBook("Петров В.В.", 2);
        Reader.returnBook("Пупкин И.И.", new String[]{"Словарь матерных слов"});
        Reader.returnBook("Ромашкина Аделаида Апполинариевна",
                new Book[]{ new Book("Еврипид", "Медея"),
                            new Book("Софокл", "Царь Эдип")});

    }
}
