public class test {
    private String key;
    public test(String key) {
        this.key = key;
    }

    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31 * hash) + key.charAt(i);
        }
        return hash;
    }
}
