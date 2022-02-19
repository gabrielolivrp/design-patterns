package prototype;

class Main {
    public static void main(String args[]) {
        Score.loadNotes();

        MusicalNote note1 = Score.getNote("Do");
        MusicalNote note2 = Score.getNote("Do");

        note1.draw();
        note2.draw();
    }
}
