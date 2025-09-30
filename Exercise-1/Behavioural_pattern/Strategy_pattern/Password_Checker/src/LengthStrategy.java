public class LengthStrategy implements PasswordStrengthStrategy {
    @Override
    public boolean checkStrength(String password) {
        return password.length() >= 8;
    }
    @Override
    public String getDescription() {
        return "Password must be at least 8 characters long.";
    }
}