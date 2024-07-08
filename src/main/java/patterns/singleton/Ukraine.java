package patterns.singleton;

public final class Ukraine {
    private static Ukraine single;
    public String capital;

    public Ukraine(String capital) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.capital = capital;
    }

    public static Ukraine getInstance(String capital) {
        if (single == null) {
            single = new Ukraine(capital);
        }
        return single;
    }
}
