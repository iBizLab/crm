package cn.ibizlab.crm.crm.recent

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.recent.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RECENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Recent extends GroovyDataEntityRuntime<Recent,RecentDTO,RecentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Recent _instance
    void setInstance(Recent instance) {
        _instance = instance
    }
    static Recent getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    RecentDTO create(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RecentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RecentDTO update(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RecentDTO.class)
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
    RecentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RecentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RecentDTO getDraft(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RecentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RecentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RecentDTO save(RecentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RecentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<RecentDTO> fetchDefault(RecentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, RecentDTO.class)
    }

}