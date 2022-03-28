public class Worker implements Comparable {

    private String firstName;
    private String lastName;
    private String description;
    private int salary;
    private int search;

    public Worker(String firstName, String lastName, String description, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.salary = salary;
        this.search=1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", search=" + search +
                '}';
    }

    public int compereTo(Object other)
    {
        int ans = 0;
        if (!(other instanceof Worker)){
            System.out.println("compareTo got a non-Worker parameter");
        }
        else {
            if (this.search == 1) {
                String otherName = ((Worker) other).getFirstName();
                ans = this.firstName.compareTo(otherName);
            }
            if (this.search == 2) {
                String otherDescription = ((Worker) other).getDescription();
                ans = this.description.compareTo(otherDescription);
            }
            if (this.search == 3) {
                int otherSalary = ((Worker) other).getSalary();
                ans = this.salary-otherSalary;
            }
        }
        return ans;
    }
}
