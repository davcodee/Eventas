package com.example.deyvi.eventas;

import android.app.Application;
import android.os.SystemClock;
import android.provider.Settings;

/**
 * Created by deyvi on 26/11/2017.
* Clase que duerme la 3000 milisegundos para poder
 * mostrar el splashScreen
 */

public class MyApp extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SystemClock.sleep(3000);
	}
}
