package ren.solid.ganhuoio.bean.bomb;

import cn.bmob.v3.BmobObject;

/**
 * Created by _SOLID
 * Date:2016/5/25
 * Time:16:36
 */
public class FeedBack extends BmobObject {

    private String content;
    private String deviceName;
    private String systemVersion;
    private String appVersion;
    private String username;


    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
