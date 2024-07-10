package patterns.proxy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RealFile implements File{
    private String file;
    private String textOfFile;

    private final String EMAIL_ADMIN = "adm@adm";
    private final String USERNAME = "adm";

    public RealFile(String file, User user) throws IOException {
        this.file = file;
        takeInfoFromFile(user);
    }

    public void takeInfoFromFile(User user) throws IOException {
        if (user.getEmail().equals(EMAIL_ADMIN) && user.getUsername().equals(USERNAME)) {
            StringBuilder stringBuilder = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/patterns/proxy/" + file));
            while ((textOfFile = bufferedReader.readLine()) != null) {
                stringBuilder.append(textOfFile).append("\n");
            }
            textOfFile = stringBuilder.toString();
        } else {
            System.err.println("Not allowed for casual user");
            System.exit(0);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println(textOfFile);
    }
}
