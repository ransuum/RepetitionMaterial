package patterns.proxy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new ProxyFile("file.txt", new User("adm@adm", "adm"));
        file.displayInfo();
    }
}
