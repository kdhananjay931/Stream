package Revision;

import java.util.Arrays;
import java.util.List;


public class RemoveDuplicateWord {
    public static void main(String[] args) {

        List<String> str= Arrays.asList("Pen","Pencil","NoteBook","Pen");
        String duplicate= str.stream().distinct().toList().toString();
        System.out.println(duplicate);
    }
}
