package com.pojo3

import org.apache.jackrabbit.ocm.mapper.impl.annotation.Field
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Node

@Node
class Image {
    @Field
    def fileReference

    @Field(path=true)
    def path

    def getFileReference() {
        return fileReference
    }

    void setFileReference(def fileReference) {
        this.fileReference = fileReference
    }

    def getPath() {
        return path
    }

    void setPath(def path) {
        this.path = path
    }
}
