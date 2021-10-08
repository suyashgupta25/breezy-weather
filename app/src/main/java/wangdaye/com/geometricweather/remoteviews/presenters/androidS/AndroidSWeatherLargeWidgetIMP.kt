package wangdaye.com.geometricweather.remoteviews.presenters.androidS

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import wangdaye.com.geometricweather.GeometricWeather
import wangdaye.com.geometricweather.R
import wangdaye.com.geometricweather.background.receiver.widget.androidSWeather.WidgetAndroidSWeatherLargeProvider
import wangdaye.com.geometricweather.common.basic.models.Location

class AndroidSWeatherLargeWidgetIMP: AbstractAndroidSWeatherWidgetIMP() {

    companion object {

        @JvmStatic
        fun isEnable(context: Context): Boolean {
            val widgetIds = AppWidgetManager.getInstance(
                context
            ).getAppWidgetIds(
                ComponentName(
                    context,
                    WidgetAndroidSWeatherLargeProvider::class.java
                )
            )
            return widgetIds.isNotEmpty()
        }

        @JvmStatic
        fun updateWidgetView(context: Context, location: Location) {
            AppWidgetManager.getInstance(context).updateAppWidget(
                ComponentName(context, WidgetAndroidSWeatherLargeProvider::class.java),
                buildWeatherWidget(
                    context,
                    R.layout.widget_s_card_4x2,
                    GeometricWeather.WIDGET_ANDROID_S_WEATHER_L_PENDING_INTENT_CODE_WEATHER,
                    location
                )
            )
        }
    }
}