public class NumberStrategy implements PasswordStrengthStrategy {
    @Override
    public boolean checkStrength(String password) {
        return password.matches(".*\\d.*");
    }
    @Override
    public String getDescription() {
        return "Password must contain at least one number.";
    }
}