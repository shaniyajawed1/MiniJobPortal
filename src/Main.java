import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Job {
    String title;
    String skill;

    Job(String title, String skill) {
        this.title = title;
        this.skill = skill;
    }
}

class Candidate {
    String name;
    String skill;

    Candidate(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Job> jobs = new ArrayList<>();
        List<Candidate> candidates = new ArrayList<>();

        // Add sample job
        jobs.add(new Job("Software Engineer", "Java"));

        // Add sample candidate
        candidates.add(new Candidate("Shaniya", "Java"));

        System.out.println("Jobs:");
        for (Job j : jobs) System.out.println(j.title + " - " + j.skill);

        System.out.println("Candidates:");
        for (Candidate c : candidates) System.out.println(c.name + " - " + c.skill);
    }
}
