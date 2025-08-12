package cn.ibizlab.crm.crm.workprogress

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.workprogress.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WORK_PROGRESS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WorkProgress extends GroovyDataEntityRuntime<WorkProgress,WorkProgressDTO,WorkProgressFilterDTO> {

    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_FINDWORKPROGRESSBYDATE = "findWorkProgressByDate"
    private static WorkProgress _instance
    void setInstance(WorkProgress instance) {
        _instance = instance
    }
    static WorkProgress getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WorkProgressDTO create(WorkProgressDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WorkProgressDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WorkProgressDTO update(WorkProgressDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WorkProgressDTO.class)
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
    WorkProgressDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WorkProgressDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WorkProgressDTO getDraft(WorkProgressDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WorkProgressDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WorkProgressDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WorkProgressDTO save(WorkProgressDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WorkProgressDTO.class)
    }

    /**
     * 数据集：所有的工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<WorkProgressDTO> fetchALL(WorkProgressFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, WorkProgressDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WorkProgressDTO> fetchDefault(WorkProgressFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WorkProgressDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<WorkProgressDTO> fetchCreateman(WorkProgressFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, WorkProgressDTO.class)
    }

    /**
     * 数据集：根据天查询工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FINDWORKPROGRESSBYDATE)
    Page<WorkProgressDTO> fetchFindWorkProgressByDate(WorkProgressFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FINDWORKPROGRESSBYDATE, context, WorkProgressDTO.class)
    }

}