package visitor;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Hunter");
        user1.followers.add(user1);

        Artist skrillex = new Artist("skrillex");
        skrillex.followers.add(user1);

        XMLExportation xml = new XMLExportation();
        System.out.println(xml.export(skrillex));
    }
}
