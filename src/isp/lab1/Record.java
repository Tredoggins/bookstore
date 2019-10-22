package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

public interface Record {
    public String getArtist();

    public Duration getPlayingTime();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public String getFormattedReleaseDate();

    public void order(int quantity);
}
