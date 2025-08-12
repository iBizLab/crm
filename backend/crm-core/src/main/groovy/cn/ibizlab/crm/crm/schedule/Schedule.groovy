package cn.ibizlab.crm.crm.schedule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.schedule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SCHEDULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Schedule extends GroovyDataEntityRuntime<Schedule,ScheduleDTO,ScheduleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_INDEXDER = "IndexDER"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CLOSE = "close"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_NOT_CLOSE = "not_close"
    public static final String DATASET_OWNER = "owner"
    private static Schedule _instance
    void setInstance(Schedule instance) {
        _instance = instance
    }
    static Schedule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ScheduleDTO create(ScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ScheduleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ScheduleDTO update(ScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ScheduleDTO.class)
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
    ScheduleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ScheduleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ScheduleDTO getDraft(ScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ScheduleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ScheduleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ScheduleDTO save(ScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ScheduleDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ScheduleDTO> fetchDefault(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ScheduleDTO.class)
    }

    /**
     * 数据集：数据集2 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INDEXDER)
    Page<ScheduleDTO> fetchIndexDER(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INDEXDER, context, ScheduleDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ScheduleDTO> fetchAll(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ScheduleDTO.class)
    }

    /**
     * 数据集：已关闭 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE)
    Page<ScheduleDTO> fetchClose(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE, context, ScheduleDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<ScheduleDTO> fetchCreateman(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, ScheduleDTO.class)
    }

    /**
     * 数据集：未关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CLOSE)
    Page<ScheduleDTO> fetchNotClose(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CLOSE, context, ScheduleDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<ScheduleDTO> fetchOwner(ScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, ScheduleDTO.class)
    }

}