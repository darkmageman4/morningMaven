public class Countries {
    //TODO: Create a new Maven project (remember it goes in its own repo and directly under IdeaProjects).
    // Create a `Countries` class and add at least 3 fields to it and then create an instance of that class and
    // use at least 2 of the fields in that instance within the main method.

    //fields
    String country;
    String enemies;
    double population;

    public Countries(String country, String enemies, double population) {
        this.country = country;
        this.enemies = enemies;
        this.population = population;
    }

    public Countries() {
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEnemies() {
        return enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }
}
