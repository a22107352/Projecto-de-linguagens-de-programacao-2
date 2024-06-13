package pt.ulusofona.aed.rockindeisi2023;

public class Query {
    String name;
    String[] args;

    public Query(String name, String[] args) {
        this.name = name;
        this.args = args;
    }

    public String getName() {
        return name;
    }

    public String[] getArgs() {
        return args;
    }
}

