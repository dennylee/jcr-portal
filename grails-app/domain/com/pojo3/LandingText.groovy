package com.pojo3

import org.apache.jackrabbit.ocm.mapper.impl.annotation.Field
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Node

@Node
class LandingText {
    @Field(path=true)
    def path

    @Field
    def text

    def getPath() {
        return path
    }

    void setPath(def path) {
        this.path = path
    }

    def getText() {
        return text
    }

    void setText(def text) {
        this.text = text
    }
}
