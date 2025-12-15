package enumeration;

enum Status {
    Success, Failed, Loading, Crash; // objects or Named Constants
}

public class EnumDemo1 {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        System.out.println(Status.Loading.ordinal());

        Status[] all = Status.values();
        for (Status status : all) {
            System.out.println(status + " : " + status.ordinal());
        }
    }
}
