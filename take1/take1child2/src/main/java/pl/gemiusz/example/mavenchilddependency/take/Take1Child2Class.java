package pl.gemiusz.example.mavenchilddependency.take;

public class Take1Child2Class {
    public void methodTake1Child2Class() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");
    }
}
