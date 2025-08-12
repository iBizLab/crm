package cn.ibizlab.crm.crm.taskexecutor.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class TaskExecutorDTO extends GroovyDTO<TaskExecutorDTO> {

    /**
     * 「sysuserid」
     */
    @JsonProperty("sysuserid")
    String sysuserid
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「任务标识」
     */
    @JsonProperty("task_id")
    String taskId
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「人员标识」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「sysuserid」值
     * @param val
     */
    TaskExecutorDTO setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TaskExecutorDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TaskExecutorDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TaskExecutorDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TaskExecutorDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「任务标识」值
     * @param val
     */
    TaskExecutorDTO setTaskId(String taskId) {
        this.taskId = taskId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TaskExecutorDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TaskExecutorDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「人员标识」值
     * @param val
     */
    TaskExecutorDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
