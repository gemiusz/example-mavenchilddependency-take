package pl.gemiusz.example.mavenchilddependency.take;

public class Take1Child1Class {
    public void methodTake1Child1Class() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");
    }
}
