package pl.gemiusz.example.mavenchilddependency.take;

public class Take2Class {
    public void methodTake2Class() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");
    }
}
