package pl.gemiusz.example.mavenchilddependency.take;

public class Take1Class {
    public void methodTake1Class() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");
    }
}
