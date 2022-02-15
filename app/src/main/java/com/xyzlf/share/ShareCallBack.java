package com.xyzlf.share;


import android.util.Log;

import com.xyzlf.share.library.interfaces.ShareConstant;
import com.xyzlf.share.util.ToastUtil;

/**
 * Created by zhanglifeng on 2016/6/22
 */
public class ShareCallBack {
    private String tag = getClass().getSimpleName();

    /**
     * @param channel
     * @param status
     */
    public void onShareCallback(int channel, int status) {
        Log.w(tag, "on Share Callback::channel=" + channel + ", status=" + status);
        switch (channel) {
            case ShareConstant.SHARE_CHANNEL_WEIXIN_FRIEND:
            case ShareConstant.SHARE_CHANNEL_WEIXIN_CIRCLE:
                onWeixinCallBack(status);
                break;

            case ShareConstant.SHARE_CHANNEL_SINA_WEIBO:
                onWeiboCallBack(status);
                break;

            case ShareConstant.SHARE_CHANNEL_QQ:
                onQQCallBack(status);
                break;

            case ShareConstant.SHARE_CHANNEL_QZONE:
                onQZoneCallBack(status);
                break;

            case ShareConstant.SHARE_CHANNEL_SYSTEM:
                onSystemCallBack(status);
                break;
            case ShareConstant.SHARE_CHANNEL_ALL:
                onAllAppCallback(status);
                break;
        }
    }

    private void onAllAppCallback(int status) {
        switch (status) {
            case ShareConstant.SHARE_STATUS_NO_SHARE_APP:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.not_found_any_app, true);
                break;
            /** 取消 **/
            case ShareConstant.SHARE_STATUS_CANCEL:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_cancel, true);
                break;
        }
    }

    /** 没有取消状态 **/
    private void onWeixinCallBack(int status) {
        switch (status) {
            /** 成功 **/
            case ShareConstant.SHARE_STATUS_COMPLETE:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_success, true);
                break;
            /** 失败 **/
            case ShareConstant.SHARE_STATUS_FAILED:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_failed, true);
                break;
            case ShareConstant.SHARE_STATUS_NO_INSTALL:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_no_weixin_client, true);
                break;
            /** 取消 **/
            case ShareConstant.SHARE_STATUS_CANCEL:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_cancel, true);
                break;
        }
    }

    /** 以下有成功，失败，取消三种回调结果 **/
    private void onWeiboCallBack(int status) {
        switch (status) {
            /** 成功 **/
            case ShareConstant.SHARE_STATUS_COMPLETE:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_success, true);
                break;
            /** 失败 **/
            case ShareConstant.SHARE_STATUS_FAILED:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_failed, true);
                break;
            /** 取消 **/
            case ShareConstant.SHARE_STATUS_CANCEL:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_cancel, true);
                break;
            case ShareConstant.SHARE_STATUS_NO_INSTALL:
                ToastUtil.showToast(MyApplication.getAppContext(), R.string.share_no_weibo_client, true);
                break;
        }
    }

    private void onQQCallBack(int status) {

    }

    private void onQZoneCallBack(int status) {
    }
    /** 以上有成功，失败，取消三种回调结果 **/


    /** 系统分享，回调结果没有实际意义，因为不能知道用户是否发送短信了，是否发送邮件了 **/
    private void onSystemCallBack(int status) {
    }
    /** 系统分享，回调结果没有实际意义，因为不能知道用户是否发送短信了，是否发送邮件了 **/

}
