package visitor;

// CONTRATO CLASES VISITOR: Declaramos según el tipo de la clase que queremos visitar.
public interface AccountVisitor {
    public String visit(User u);
    public String visit(Artist a);
}
