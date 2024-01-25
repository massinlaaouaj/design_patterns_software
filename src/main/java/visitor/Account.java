package visitor;

// CONTRATO CUENTA: Métodos que deben implementar los diferentes tipos de cuentas.
public interface Account {
    public String accept(AccountVisitor v);
    public String getAccountName();
}
