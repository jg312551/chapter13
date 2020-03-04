package practice;
        import java.nio.file.*;
        import java.io.*;
        import java.util.Scanner;
        import static java.nio.file.StandardOpenOption.CREATE;

public class writeEmployeeFile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\jg312551\\Desktop\\Java\\chapter13\\src\\practice\\Employees.txt");

        String s ="";
        String delimeter = ",";
        int id;
        String name;
        double payRate;
        final int QUIT= 999;

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.println("enter employee ID number >>");
            id = input.nextInt();
            while(id != QUIT){
                System.out.println("enter name for employee  #"+ id +" >> ");
                input.nextLine();
                name = input.nextLine();

                System.out.println("enter pay rate >>");
                payRate = input.nextDouble();
                s = id + delimeter + name + delimeter + payRate;
                writer.write(s,0,s.length());
                writer.newLine();
                System.out.println("enter id number or " + QUIT +" to quit >>>>");
                id = input.nextInt();
            }
            writer.close();
        }
catch(Exception e){
            System.out.println("message: " +e);
}

    }

}
