package varargs;

public class Main {
    public static void main(String[] args) {
        StudentLogBook logBook = new StudentLogBook();

        // dodanie metodą klasyczną
        logBook.addStudent("Pawel");
        logBook.addStudent("Gawel");

        // dodanie metodą varargs
        logBook.addStudents("Jason", "Mandy", "Jurgen", "Hugon");

    }
}
