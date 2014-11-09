package com.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView myBatteryInfo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myBatteryInfo = (TextView) findViewById(R.id.textBattery);
		this.registerReceiver(this.getBatteryInfo, new IntentFilter(
				Intent.ACTION_BATTERY_CHANGED));
	}

	private BroadcastReceiver getBatteryInfo = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			int batteryHealth = intent.getIntExtra(BatteryManager.EXTRA_HEALTH,
					0);
			int batteryIconSmall = intent.getIntExtra(
					BatteryManager.EXTRA_ICON_SMALL, 0);
			int batteryLevel = intent
					.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
			int batteryPlugged = intent.getIntExtra(
					BatteryManager.EXTRA_PLUGGED, 0);
			boolean batteryPresent = intent.getExtras().getBoolean(
					BatteryManager.EXTRA_PRESENT);
			int batteryScale = intent
					.getIntExtra(BatteryManager.EXTRA_SCALE, 0);
			int batteryStatus = intent.getIntExtra(BatteryManager.EXTRA_STATUS,
					0);
			String batteryTechnology = intent.getExtras().getString(
					BatteryManager.EXTRA_TECHNOLOGY);
			int batteryTemperature = intent.getIntExtra(
					BatteryManager.EXTRA_TEMPERATURE, 0);
			int batteryVoltage = intent.getIntExtra(
					BatteryManager.EXTRA_VOLTAGE, 0);
			int batteryCold = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_COLD);
			int batteryDead = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_DEAD);
			int batteryGood = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_GOOD);
			int batteryOverVoltage = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE);
			int batteryOverHeat = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_OVERHEAT);
			int batteryUnknown = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_UNKNOWN);
			int batteryUnspecifiedFailure = intent.getIntExtra(null,
					BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE);
			int batteryPluggedAC = intent.getIntExtra(null,
					BatteryManager.BATTERY_PLUGGED_AC);
			int batteryPluggedUSB = intent.getIntExtra(null,
					BatteryManager.BATTERY_PLUGGED_USB);
			int batteryPluggedWireless = intent.getIntExtra(null,
					BatteryManager.BATTERY_PLUGGED_WIRELESS);
			int batteryCharging = intent.getIntExtra(null,
					BatteryManager.BATTERY_STATUS_CHARGING);
			int batteryDischarging = intent.getIntExtra(null,
					BatteryManager.BATTERY_STATUS_DISCHARGING);
			int batteryFull = intent.getIntExtra(null,
					BatteryManager.BATTERY_STATUS_FULL);
			int batteryNotCharging = intent.getIntExtra(null,
					BatteryManager.BATTERY_STATUS_NOT_CHARGING);

			myBatteryInfo.setText("Health: " + batteryHealth + "\n"
					+ "Icon Small: " + batteryIconSmall + "\n" + "Level: "
					+ batteryLevel + "\n" + "Plugged: " + batteryPlugged + "\n"
					+ "Present: " + batteryPresent + "\n" + "Scale: "
					+ batteryScale + "\n" + "Status: " + batteryStatus + "\n"
					+ "Technology: " + batteryTechnology + "\n"
					+ "Temperature: " + batteryTemperature + "\n" + "Voltage: "
					+ batteryVoltage + "\n" + "Cold: " + batteryCold + "\n"
					+ "Dead:: " + batteryDead + "\n" + "Good: " + batteryGood
					+ "\n" + "OverVoltage: " + batteryOverVoltage + "\n"
					+ "OverHeat: " + batteryOverHeat + "\n" + "Unknown: "
					+ batteryUnknown + "\n" + "UnspecifiedFailure: "
					+ batteryUnspecifiedFailure + "\n" + "PluggedAC: "
					+ batteryPluggedAC + "\n" + "PluggedUSB: "
					+ batteryPluggedUSB + "\n" + "PluggedWireless: "
					+ batteryPluggedWireless + "\n" + "Charing: "
					+ batteryCharging + "\n" + "Discharging: "
					+ batteryDischarging + "\n" + "Full: " + batteryFull + "\n"
					+ "NotCharging: " + batteryNotCharging + "\n");
		};
	};

}
