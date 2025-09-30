public interface PasswordStrengthStrategy {
    boolean checkStrength(String password);
    String getDescription();
}