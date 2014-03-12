package com.pojo3

import org.apache.jackrabbit.JcrConstants
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Field
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Node

@Node(jcrType = "cq:PageContent", jcrMixinTypes = JcrConstants.JCR_CONTENT)
class UspPage {
    @Field(path=true)
    String path

    @Field(jcrName="jcr:title")
    String title

    String getPath() {
        return path
    }

    void setPath(String path) {
        this.path = path
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }
}
