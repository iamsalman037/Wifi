package com.thenewboston.wifi;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button on, off;
    private BluetoothAdapter BA;
    WifiManager wifiManager;
    private SensorManager mSensorManager;

    TextView sen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sen = findViewById(R.id.sen);
//        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
//        List<Sensor> mList= mSensorManager.getSensorList(Sensor.TYPE_ALL);
//
//        for (int i = 1; i < mList.size(); i++) {
//            sen.append("\n" + mList.get(i).getName() + "\n" + mList.get(i).getVendor() + "\n" + mList.get(i).getVersion());
//        }
//


//    }
//}
        on = findViewById(R.id.on);
        off = findViewById(R.id.off);
        BA = BluetoothAdapter.getDefaultAdapter();

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (!BA.isEnabled()) {
//                    Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//                    startActivityForResult(turnOn, 0);
//                    Toast.makeText(getApplicationContext(), "Turned on", Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Already on", Toast.LENGTH_LONG).show();
//                }
                WifiManager wifi =(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);

            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BA.disable();
                WifiManager wifi =(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);


            }
        });
    }
}

