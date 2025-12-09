enum Status {
    Running, Failed, Pending, Success;
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Status s = Status.Failed;

        System.out.println(s);
        if (s.equals(Status.Running)) {
            System.out.println("All Good");
        } else if (s.equals(Status.Failed)) {
            System.out.println("Try Again");
        } else if (s.equals(Status.Pending)) {
            System.out.println("Please Wait");
        } else {
            System.out.println("Done");
        }
    }
}
