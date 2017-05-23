package pr09_google;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Person {
    private String name;
    private Car car;
    private Company company;
    private Set<Child> children;
    private Set<Parent> parents;
    private Set<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.children = new LinkedHashSet<>();
        this.parents = new LinkedHashSet<>();
        this.pokemons = new LinkedHashSet<>();
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setChildren(Child child) {
        children.add(child);
        this.children = children;
    }

    public void setParents(Parent parent) {
        parents.add(parent);
        this.parents = parents;
    }

    public void setPokemons(Pokemon pokemon) {
        pokemons.add(pokemon);
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\r\n");
        sb.append("Company:").append("\r\n");
        if (this.company!=null){
            sb.append(this.company).append("\r\n");
        }
        sb.append("Car:").append("\r\n");
        if (this.car!=null){
            sb.append(this.car).append("\r\n");
        }
        sb.append("Pokemon:").append("\r\n");
        if (!this.pokemons.isEmpty()){
            for (Pokemon pokemon : pokemons) {
                sb.append(pokemon).append("\r\n");
            }
        }
        sb.append("Parents:").append("\r\n");
        if (!this.parents.isEmpty()){
            for (Parent parent : parents) {
                sb.append(parent).append("\r\n");
            }
        }
        sb.append("Children:").append("\r\n");
        if (!this.children.isEmpty()){
            for (Child child : children) {
                sb.append(child).append("\r\n");
            }
        }
        return sb.toString();
    }
}
