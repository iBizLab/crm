package cn.ibizlab.crm.runtime.sysrole.dto

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
class SysRoleDTO extends GroovyDTO<SysRoleDTO> {

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
     * 「角色代码标记」
     */
    @JsonProperty("authority")
    String authority
    /**
     * 「系统标识」
     */
    @JsonProperty("deploy_system_id")
    String deploySystemId

    /**
     * 设置「标识」值
     * @param val
     */
    SysRoleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SysRoleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「角色代码标记」值
     * @param val
     */
    SysRoleDTO setAuthority(String authority) {
        this.authority = authority
        return this
    }


    /**
     * 设置「系统标识」值
     * @param val
     */
    SysRoleDTO setDeploySystemId(String deploySystemId) {
        this.deploySystemId = deploySystemId
        return this
    }

}
