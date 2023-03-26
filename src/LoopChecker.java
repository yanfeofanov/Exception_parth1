public class LoopChecker implements Checker {
    private static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ0123456789_";

    @Override
    public boolean check(String s) {
        char[] chars = s.toCharArray();
        for (char symmbol : chars) {
            if (!ALLOWED_CHARACTERS.contains(Character.toString(symmbol))) {
                return false;
            }
        }
        return true;
    }
}
