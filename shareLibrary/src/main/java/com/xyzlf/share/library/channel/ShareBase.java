package com.xyzlf.share.library.channel;

import android.content.Context;

import com.xyzlf.share.library.bean.ShareEntity;
import com.xyzlf.share.library.interfaces.IShareBase;
import com.xyzlf.share.library.interfaces.OnShareListener;


/**
 * Created by zhanglifeng
 */
public abstract class ShareBase implements IShareBase {
    protected String tag = getClass().getSimpleName();
    Context context;

    public ShareBase(Context context) {
        this.context = context;
    }

    @Override
    public void share(ShareEntity data, OnShareListener listener) {

    }

    @Override
    public void share(ShareEntity data, OnShareListener listener, String title) {

    }
}
