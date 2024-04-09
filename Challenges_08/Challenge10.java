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
import java.util.Collections;

public class Challenge10 {

    public static void addNoteButton(ArrayList<String> diary, String diaryPage){
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

    public static void editNoteButton(ArrayList<String> diary, String date, String textEdit){
        for(String page : diary){
           String[] buffer = page.split(":");
           if(buffer[0].equals(date)){
               int index = diary.indexOf(page);
               diary.set(index, date + ":" + textEdit);
               break;
           }
        }
    }

    public static void deleteNoteButton(ArrayList<String> diary, String diaryDate){
        for (String page : diary) {
            String[] bufferDiary = page.split(":");
            if (bufferDiary[0].equals(diaryDate)) {
                diary.remove(page);
                break;
            }
        }
    }

    public static void displayPagesButton(ArrayList<String> diary){
        Collections.sort(diary, Collections.reverseOrder());

        for(String mesaj : diary){
            System.out.println(mesaj);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> diary = new ArrayList<>();

        addNoteButton(diary,"2008-11-28:It's sunny outside!");
        addNoteButton(diary,"2008-11-28:I am playing with my brother!");
        editNoteButton(diary,"2008-11-28", "I am eating ice cream with my mother!");
        addNoteButton(diary,"2009-12-12:My brother broke his leg!");
        addNoteButton(diary,"2007-09-01:I visited Italy with my friends!");
        deleteNoteButton(diary,"2009-12-12");

        displayPagesButton(diary);
    }
}
