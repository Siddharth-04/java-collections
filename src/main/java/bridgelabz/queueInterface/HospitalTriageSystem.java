package bridgelabz.queueInterface;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    @Override
    public int compareTo(Patient o) {
        return o.severityLevel - this.severityLevel;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<Patient>();

        pq.add(new Patient("Bob", 2));
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));

        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " " + p.severityLevel);
        }
    }
}

//Alice 5
//John 3
//Bob 2