package zebra.printer.reactnative;

import java.util.Map;

public interface BluetoothServiceStateObserver {
    void onBluetoothServiceStateChanged(int state, Map<String,Object> boundle);
}
