package wangdaye.com.geometricweather.db.entities;

import java.util.Date;

import io.objectbox.annotation.Convert;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import wangdaye.com.geometricweather.common.basic.models.weather.Minutely;
import wangdaye.com.geometricweather.common.basic.models.weather.WeatherCode;
import wangdaye.com.geometricweather.db.converters.WeatherCodeConverter;

/**
 * Minutely entity.
 *
 * {@link Minutely}.
 * */
@Entity
public class MinutelyEntity {

    @Id public Long id;
    public String cityId;
    public String weatherSource;

    public Date date;
    public boolean daylight;

    public String weatherText;
    @Convert(converter = WeatherCodeConverter.class, dbType = String.class)
    public WeatherCode weatherCode;

    public int minuteInterval;
    public Integer dbz;
    public Integer cloudCover;
    
    public MinutelyEntity(Long id, String cityId, String weatherSource, Date date, boolean daylight,
                          String weatherText, WeatherCode weatherCode, int minuteInterval, Integer dbz,
                          Integer cloudCover) {
        this.id = id;
        this.cityId = cityId;
        this.weatherSource = weatherSource;
        this.date = date;
        this.daylight = daylight;
        this.weatherText = weatherText;
        this.weatherCode = weatherCode;
        this.minuteInterval = minuteInterval;
        this.dbz = dbz;
        this.cloudCover = cloudCover;
    }
    
    public MinutelyEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCityId() {
        return this.cityId;
    }
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    public String getWeatherSource() {
        return this.weatherSource;
    }
    public void setWeatherSource(String weatherSource) {
        this.weatherSource = weatherSource;
    }
    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public boolean getDaylight() {
        return this.daylight;
    }
    public void setDaylight(boolean daylight) {
        this.daylight = daylight;
    }
    public String getWeatherText() {
        return this.weatherText;
    }
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }
    public WeatherCode getWeatherCode() {
        return this.weatherCode;
    }
    public void setWeatherCode(WeatherCode weatherCode) {
        this.weatherCode = weatherCode;
    }
    public int getMinuteInterval() {
        return this.minuteInterval;
    }
    public void setMinuteInterval(int minuteInterval) {
        this.minuteInterval = minuteInterval;
    }
    public Integer getDbz() {
        return this.dbz;
    }
    public void setDbz(Integer dbz) {
        this.dbz = dbz;
    }
    public Integer getCloudCover() {
        return this.cloudCover;
    }
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

}
