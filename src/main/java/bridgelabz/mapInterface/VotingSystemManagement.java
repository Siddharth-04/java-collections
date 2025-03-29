package bridgelabz.mapInterface;

import java.util.*;

class VotingSystem {
    Map<String, Integer> votes = new HashMap<>();
    Map<String, Integer> orderedVotes = new LinkedHashMap<>();
    Map<String, Integer> sortedVotes = new TreeMap<>();

    void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, orderedVotes.getOrDefault(candidate, 0) + 1);
        sortedVotes.put(candidate, sortedVotes.getOrDefault(candidate, 0) + 1);
    }

    int getVotes(String candidate) {
        return votes.getOrDefault(candidate, 0);
    }

    void displayResults() {
        System.out.println("Votes in insertion order: " + orderedVotes);
        System.out.println("Votes in sorted order: " + sortedVotes);
    }
}

class VotingSystemManagement {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Siddharth");
        system.castVote("Ishan");
        system.castVote("Siddharth");
        system.castVote("Ishan");
        system.castVote("Dhruv");

        System.out.println("Siddharth's votes: " + system.getVotes("Siddharth"));

        system.displayResults();
    }
}
//Siddharth's votes: 2
//Votes in insertion order: {Siddharth=2, Ishan=2, Dhruv=1}
//Votes in sorted order: {Dhruv=1, Ishan=2, Siddharth=2}