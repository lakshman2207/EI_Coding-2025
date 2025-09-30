public class SpecialCharStrategy implements PasswordStrengthStrategy {
    @Override
    public boolean checkStrength(String password) {
        return password.matches(".*[!@#$%^&*()].*");
    }
    @Override
    public String getDescription() {
        return "Password must contain at least one special character (!@#$%^&*()).";
    }
}