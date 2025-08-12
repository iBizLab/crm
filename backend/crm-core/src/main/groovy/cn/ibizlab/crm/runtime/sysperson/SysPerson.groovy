package cn.ibizlab.crm.runtime.sysperson

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.runtime.sysperson.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_PERSON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysPerson extends GroovyDataEntityRuntime<SysPerson,SysPersonDTO,SysPersonFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SysPerson _instance
    void setInstance(SysPerson instance) {
        _instance = instance
    }
    static SysPerson getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysPersonDTO create(SysPersonDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysPersonDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysPersonDTO update(SysPersonDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysPersonDTO.class)
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
    SysPersonDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysPersonDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysPersonDTO getDraft(SysPersonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysPersonDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysPersonDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysPersonDTO save(SysPersonDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysPersonDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SysPersonDTO> fetchDefault(SysPersonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SysPersonDTO.class)
    }

}