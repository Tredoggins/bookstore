package isp.lab2;

import java.time.Duration;
import java.time.LocalDate;

public interface Record extends Product{
    public String getArtist();

    public Duration getPlayingTime();
}
