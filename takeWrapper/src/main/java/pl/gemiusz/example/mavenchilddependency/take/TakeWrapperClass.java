package pl.gemiusz.example.mavenchilddependency.take;

public class TakeWrapperClass {
    public void methodTakeWrapperClass() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");
    }
}
