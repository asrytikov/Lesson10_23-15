package dz6;

public interface Informable {

    default void info(){
        System.out.println("Info phone of Informable");
    }


}
