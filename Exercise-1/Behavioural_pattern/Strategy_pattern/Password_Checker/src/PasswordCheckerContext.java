public class PasswordCheckerContext {
    private PasswordStrengthStrategy strategy;

    public void setStrategy(PasswordStrengthStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String password) {
        return strategy.checkStrength(password);
    }

    public String getStrategyDescription() {
        return strategy.getDescription();
    }
}