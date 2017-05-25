package pr01_pr02_classBox_classBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

      /*  Class boxClass = Box.class;
        Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields)
                .stream()
                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.valueOf(reader.readLine());
        double width = Double.valueOf(reader.readLine());
        double height = Double.valueOf(reader.readLine());
        try {
            Box box = new Box(length, width, height);
            System.out.println(String.format("Surface Area - %.2f", box.getSurfaceArea()));
            System.out.println(String.format("Lateral Surface Area - %.2f", box.getLateralSurfaceArea()));
            System.out.println(String.format("Volume - %.2f", box.getVolume()));
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

}
