public class Client implements Comparable{

    private String firstName;
    private String lastName;
    private int pursuer;
    private int search;

    public Client(String firstName, String lastName, int pursuer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pursuer = pursuer;
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

    public int getPursuer() {
        return pursuer;
    }

    public void setPursuer(int pursuer) {
        this.pursuer = pursuer;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pursuer=" + pursuer +
                ", search=" + search +
                '}';
    }

    public int compereTo(Object other)
    {
        int ans = 0;
        if (!(other instanceof Client)){
            System.out.println("compareTo got a non-Client parameter");
        }
        else {
            if (this.search == 1) {
                String otherName = ((Client) other).getFirstName();
                ans = this.firstName.compareTo(otherName);
            }
            if (this.search == 2) {
                int otherPursuer = ((Client) other).getPursuer();
                ans = this.pursuer - otherPursuer;
            }

        }
        return ans;
    }



}
