package pl.gemiusz.example.mavenchilddependency.take;

public class TakeClass {
    public void methodTakeClass() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");
    }
}
