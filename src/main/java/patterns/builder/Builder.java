package patterns.builder;

public class Builder {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("LLLL")
                .age(12).build();
        System.out.println(user);
    }
}
