package main.pruefungsvorbereitung.Comparable_Sort;

        import javax.naming.Name;
        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Mannschaft> tabelle = Mannschaft.createTabelle();


        System.out.println("---------");
        tabelle.stream().filter(m -> (m.punkte > 49)).forEach(System.out::println);
        System.out.println("---------");
        tabelle.stream().sorted(Comparator.comparing(m -> m.name)).filter(name->name.name.charAt(0) =='F').forEach(System.out::println);
        System.out.println("---------");
        tabelle.stream().max(Comparator.comparing(m->m.punkte)).ifPresent(System.out::println);

    }
}
