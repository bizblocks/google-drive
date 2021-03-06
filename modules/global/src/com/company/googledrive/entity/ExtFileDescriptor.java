package com.company.googledrive.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.annotation.Extends;

@Extends(FileDescriptor.class)
@Entity(name = "googledrive$ExtFileDescriptor")
public class ExtFileDescriptor extends FileDescriptor {
    private static final long serialVersionUID = -357649408853616265L;

    @Column(name = "GDRIVE_ID")
    protected String gdriveId;

    @Column(name = "USE_DEFAULT_FILE_API")
    protected Boolean useDefaultFileApi=false;

    public void setUseDefaultFileApi(Boolean useDefaultFileApi) {
        this.useDefaultFileApi = useDefaultFileApi;
    }

    public Boolean getUseDefaultFileApi() {
        return useDefaultFileApi;
    }


    public void setGdriveId(String gdriveId) {
        this.gdriveId = gdriveId;
    }

    public String getGdriveId() {
        return gdriveId;
    }


}