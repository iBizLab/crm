package cn.ibizlab.crm.runtime.sysrole

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.runtime.sysrole.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_ROLE_UAA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysRole extends GroovyDataEntityRuntime<SysRole,SysRoleDTO,SysRoleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SysRole _instance
    void setInstance(SysRole instance) {
        _instance = instance
    }
    static SysRole getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysRoleDTO create(SysRoleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysRoleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysRoleDTO update(SysRoleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysRoleDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    SysRoleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysRoleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysRoleDTO getDraft(SysRoleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysRoleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysRoleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysRoleDTO save(SysRoleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysRoleDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SysRoleDTO> fetchDefault(SysRoleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SysRoleDTO.class)
    }

}