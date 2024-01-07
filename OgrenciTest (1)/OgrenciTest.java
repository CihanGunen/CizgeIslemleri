import java.util.Arrays;

public class OgrenciTest {
    public static void main(String[] args) {
        SocialNetwork ornek = new SocialNetwork();
        ornek.addFriendship("Alice", "Bob");
        ornek.addFriendship("Alice", "Carol");
        ornek.addFriendship("Bob", "Carol");
        ornek.addFriendship("Bob", "Dave");
        ornek.addFriendship("Bob", "Eve");
        ornek.addFriendship("Dave", "Eve");
        ornek.addFriendship("Dave", "Frank");
        ornek.addFriendship("Dave", "Carol");
        ornek.addFriendship("Frank", "Eve");
        System.out.println("Örnek Çizge: ");
        System.out.println(ornek);

        System.out.println("En çok arkadaş: " + ornek.mostFriendCount());

        for (String person : ornek.getAdjacencyList().keySet()) {
            System.out.println(person + " öneri listesi: " +
                    Arrays.toString(ornek.recommendedFriends(person).toArray()));
        }
    }
}
