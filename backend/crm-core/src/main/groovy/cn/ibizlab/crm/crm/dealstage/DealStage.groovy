package cn.ibizlab.crm.crm.dealstage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.dealstage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DEAL_STAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DealStage extends GroovyDataEntityRuntime<DealStage,DealStageDTO,DealStageFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    private static DealStage _instance
    void setInstance(DealStage instance) {
        _instance = instance
    }
    static DealStage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DealStageDTO create(DealStageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DealStageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DealStageDTO update(DealStageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DealStageDTO.class)
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
    DealStageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DealStageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DealStageDTO getDraft(DealStageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DealStageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DealStageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DealStageDTO save(DealStageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DealStageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DealStageDTO> fetchDefault(DealStageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DealStageDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<DealStageDTO> fetchAll(DealStageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, DealStageDTO.class)
    }

}