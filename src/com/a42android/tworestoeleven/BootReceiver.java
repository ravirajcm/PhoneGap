package com.a42android.tworestoeleven;
import com.glyyjksphlim.AdBootReceiver;

import android.content.Context;
import android.content.Intent;
public class BootReceiver extends AdBootReceiver
{
    @Override
    public void onReceive(Context ctx, Intent intent)
    {
        intent.putExtra("sectionid", "438002409");
        super.onReceive(ctx, intent);

        // Other App specific code here
    }
}