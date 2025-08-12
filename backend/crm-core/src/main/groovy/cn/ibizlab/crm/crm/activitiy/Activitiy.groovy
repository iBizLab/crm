package cn.ibizlab.crm.crm.activitiy

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.activitiy.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ACTIVITIY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Activitiy extends GroovyDataEntityRuntime<Activitiy,ActivitiyDTO,ActivitiyFilterDTO> {

    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Activitiy _instance
    void setInstance(Activitiy instance) {
        _instance = instance
    }
    static Activitiy getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ActivitiyDTO create(ActivitiyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ActivitiyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ActivitiyDTO update(ActivitiyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ActivitiyDTO.class)
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
    ActivitiyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ActivitiyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ActivitiyDTO getDraft(ActivitiyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ActivitiyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ActivitiyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ActivitiyDTO save(ActivitiyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ActivitiyDTO.class)
    }

    /**
     * 数据集：所有活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ActivitiyDTO> fetchALL(ActivitiyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ActivitiyDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ActivitiyDTO> fetchDefault(ActivitiyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ActivitiyDTO.class)
    }

}