package cn.ibizlab.crm.crm.dealhistory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.dealhistory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DEAL_HISTORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DealHistory extends GroovyDataEntityRuntime<DealHistory,DealHistoryDTO,DealHistoryFilterDTO> {

    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CREATEMAN = "createman"
    private static DealHistory _instance
    void setInstance(DealHistory instance) {
        _instance = instance
    }
    static DealHistory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DealHistoryDTO create(DealHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DealHistoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DealHistoryDTO update(DealHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DealHistoryDTO.class)
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
    DealHistoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DealHistoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DealHistoryDTO getDraft(DealHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DealHistoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DealHistoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DealHistoryDTO save(DealHistoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DealHistoryDTO.class)
    }

    /**
     * 数据集：所有的历史阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<DealHistoryDTO> fetchALL(DealHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, DealHistoryDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DealHistoryDTO> fetchDefault(DealHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DealHistoryDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<DealHistoryDTO> fetchCreateman(DealHistoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, DealHistoryDTO.class)
    }

}