package patterns.proxy;

import java.io.IOException;

public class ProxyFile implements File{
    private RealFile realFile;
    private String file;
    private User user;

    public ProxyFile(String file, User user) {
        this.file = file;
        this.user = user;
    }

    @Override
    public void displayInfo() throws IOException {
        if (realFile == null){
            realFile = new RealFile(file, user);
        }
        realFile.displayInfo();
    }
}
