package wangdaye.com.geometricweather.weather;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import wangdaye.com.geometricweather.common.basic.models.options.provider.WeatherSource;
import wangdaye.com.geometricweather.weather.services.*;
import wangdaye.com.geometricweather.weather.services.OpenWeatherWeatherService;

public class WeatherServiceSet {

    private final WeatherService[] mWeatherServices;

    @Inject
    public WeatherServiceSet(OpenMeteoWeatherService openMeteoWeatherService,
                             AccuWeatherService accuWeatherService,
                             MetNoWeatherService metNoWeatherService,
                             OpenWeatherWeatherService openWeatherWeatherService,
                             MfWeatherService mfWeatherService,
                             CaiYunWeatherService caiYunWeatherService) {
        mWeatherServices = new WeatherService[] {
                openMeteoWeatherService,
                accuWeatherService,
                metNoWeatherService,
                openWeatherWeatherService,
                mfWeatherService,
                caiYunWeatherService
        };
    }

    @NonNull
    public WeatherService get(WeatherSource source) {
        switch (source) {
            case OPEN_METEO:
                return mWeatherServices[0];

            case ACCU:
                return mWeatherServices[1];

            case METNO:
                return mWeatherServices[2];

            case OWM:
                return mWeatherServices[3];

            case MF:
                return mWeatherServices[4];

            case CAIYUN:
                return mWeatherServices[5];

            default:
                return mWeatherServices[1]; // ACCU
        }
    }

    @NonNull
    public WeatherService[] getAll() {
        return mWeatherServices;
    }
}
