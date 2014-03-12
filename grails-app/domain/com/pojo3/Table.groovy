package com.pojo3

import org.apache.jackrabbit.ocm.mapper.impl.annotation.Field
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Node

@Node
class Table {
    @Field(path=true) def path
    @Field def tableData

    def getPath() {
        return path
    }

    void setPath(def path) {
        this.path = path
    }

    def getTableData() {
        return tableData
    }

    void setTableData(def tableData) {
        this.tableData = tableData
    }
}
