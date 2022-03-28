public class Product implements Comparable{

    private String name;
    private int price;
    private boolean isStock;
    private int search;

    public Product(String name, int price, boolean isStock) {
        this.name = name;
        this.price = price;
        this.isStock = isStock;
        this.search = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isStock=" + isStock +
                ", search=" + search +
                '}';
    }

    public int compereTo(Object other)
    {
        int ans = 0;
        if (!(other instanceof Product)){
            System.out.println("compareTo got a non-Product parameter");
        }
        else {
            if (this.search == 1) {
                String otherName = ((Product) other).getName();
                ans = this.name.compareTo(otherName);
            }
            if (this.search == 2) {
                int otherPrice = ((Product) other).getPrice();
                ans = this.price - otherPrice;
            }
            if (this.search == 3) {
                boolean stock = ((Product) other).isStock();
                if (stock) {
                    ans = 1;
                }
                else ans = -1;
            }
        }
        return ans;
    }
}
