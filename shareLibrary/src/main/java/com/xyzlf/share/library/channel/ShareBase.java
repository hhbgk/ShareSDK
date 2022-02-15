package com.xyzlf.share.library.channel;

import android.content.Context;

import com.xyzlf.share.library.interfaces.IShareBase;


/**
 * Created by zhanglifeng
 */
public abstract class ShareBase implements IShareBase {
    protected String tag = getClass().getSimpleName();
    Context context;

    public ShareBase(Context context) {
        this.context = context;
    }

}
