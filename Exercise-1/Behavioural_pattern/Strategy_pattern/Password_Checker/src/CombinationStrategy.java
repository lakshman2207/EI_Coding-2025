public class CombinationStrategy implements PasswordStrengthStrategy {
    @Override
    public boolean checkStrength(String password) {
        return password.length() >= 8 &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
    @Override
    public String getDescription() {
        return "Password must be at least 8 characters, contain a number, and a special character.";
    }
}