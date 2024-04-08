package Challenges_08;

//Write a program that manages a personal diary using an ArrayList. Each entry in the diary is a string
// that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day.
//Your program should allow the user to:
//        Add a new entry (but ensure there's no duplicate date).
//        Edit an existing entry based on the date.
//        Delete an entry by date.
//        Display all entries in reverse chronological order (latest first).
//
//Ensure that all these operations are efficient, especially the addition of new entries,
//which should keep the list sorted without resorting it every time.


import java.util.ArrayList;

public class Challenge10 {

    public static void addNote(ArrayList<String> diary, String diaryPage){
        String[] buffer = diaryPage.split(":");
        boolean alreadyExists = false;
        for (String page : diary) {
            String[] bufferDiary = page.split(":");
            if (bufferDiary[0].equals(buffer[0])) {
                alreadyExists = true;
                break;
            }
        }
        if (!alreadyExists) {
            diary.add(diaryPage);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> diary = new ArrayList<>();

        addNote(diary,"2008-11-28:Today I was sad");
        addNote(diary,"2008-11-28:Mamma mia");

        for(String mesaj : diary){
            System.out.println(mesaj);
        }
    }
}
