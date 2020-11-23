package zoochi.aamir.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void ShowToastTem(Context cc, String click){
        Toast.makeText(cc, click, Toast.LENGTH_SHORT).show();
    }
    public static void ShowToast(Context cc, String click){
        Toast.makeText(cc, click, Toast.LENGTH_SHORT).show();
    }
    public static void ShowToastLong(Context cc, String click){
        Toast.makeText(cc, click, Toast.LENGTH_LONG).show();
    }
}
