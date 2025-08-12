package cn.ibizlab.crm.crm.event

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.event.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EVENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Event extends GroovyDataEntityRuntime<Event,EventDTO,EventFilterDTO> {

    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CLOSE = "close"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_INVITED = "invited"
    public static final String DATASET_NOT_CLOSE = "not_close"
    public static final String DATASET_OWNER = "owner"
    private static Event _instance
    void setInstance(Event instance) {
        _instance = instance
    }
    static Event getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    EventDTO create(EventDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, EventDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    EventDTO update(EventDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, EventDTO.class)
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
    EventDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, EventDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    EventDTO getDraft(EventDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, EventDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(EventDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    EventDTO save(EventDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, EventDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(EventDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, EventDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(EventDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, EventDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(EventDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, EventDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(EventDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, EventDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(EventDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, EventDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<EventDTO> fetchDefault(EventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, EventDTO.class)
    }

    /**
     * 数据集：关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE)
    Page<EventDTO> fetchClose(EventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE, context, EventDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<EventDTO> fetchCreateman(EventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, EventDTO.class)
    }

    /**
     * 数据集：已邀请的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INVITED)
    Page<EventDTO> fetchInvited(EventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INVITED, context, EventDTO.class)
    }

    /**
     * 数据集：未关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CLOSE)
    Page<EventDTO> fetchNotClose(EventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CLOSE, context, EventDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<EventDTO> fetchOwner(EventFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, EventDTO.class)
    }

}