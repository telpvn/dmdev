package zaur_tregulov.generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Команда
public class Team<T extends Participant> {

    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("V komandu " + name + " byl dobavlen novyi uvhasnik" + " po imeni " + participant.getName());
    }

    // играть с
    public void playWith(Team<T> team) {
        String winnerName;  // имя победителя
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Vyigrala komanda " + winnerName);
    }
}
