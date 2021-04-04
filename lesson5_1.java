package lesson5_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class lesson5_1 {
    public static void main(String[] args) {

        ArrayList<Numbers> numbersArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("number"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] values = tempString.split(";");
                numbersArrayList.add(new Numbers(values[0], values[1], values[2]));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(numbersArrayList);
    }
}

