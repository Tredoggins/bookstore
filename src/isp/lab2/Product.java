package isp.lab2;

import java.time.LocalDate;

public interface Product {
    public String getTitle();
    public double getCost();
    public int getQuantityOnHand();
    public LocalDate getReleaseDate();
    public void order(int quantity);
    public String getFormattedReleaseDate();
}
