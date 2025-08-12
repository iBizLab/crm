package cn.ibizlab.crm.runtime.sysrolemember.dto

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
class SysRoleMemberDTO extends GroovyDTO<SysRoleMemberDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「DC」
     */
    @JsonProperty("dc")
    String dc
    /**
     * 「系统角色标识」
     */
    @JsonProperty("role_id")
    String roleId
    /**
     * 「用户组/人员标识」
     */
    @JsonProperty("member_uid")
    String memberUid

    /**
     * 设置「标识」值
     * @param val
     */
    SysRoleMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「DC」值
     * @param val
     */
    SysRoleMemberDTO setDc(String dc) {
        this.dc = dc
        return this
    }


    /**
     * 设置「系统角色标识」值
     * @param val
     */
    SysRoleMemberDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「用户组/人员标识」值
     * @param val
     */
    SysRoleMemberDTO setMemberUid(String memberUid) {
        this.memberUid = memberUid
        return this
    }

}
