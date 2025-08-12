package cn.ibizlab.crm.crm.call

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.call.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CALL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Call extends GroovyDataEntityRuntime<Call,CallDTO,CallFilterDTO> {

    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CLOSE = "close"
    public static final String DATASET_NOT_CLOSE = "not_close"
    private static Call _instance
    void setInstance(Call instance) {
        _instance = instance
    }
    static Call getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CallDTO create(CallDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CallDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CallDTO update(CallDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CallDTO.class)
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
    CallDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CallDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CallDTO getDraft(CallDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CallDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CallDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CallDTO save(CallDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CallDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(CallDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, CallDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(CallDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, CallDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(CallDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, CallDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(CallDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, CallDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(CallDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, CallDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CallDTO> fetchDefault(CallFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CallDTO.class)
    }

    /**
     * 数据集：关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE)
    Page<CallDTO> fetchClose(CallFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE, context, CallDTO.class)
    }

    /**
     * 数据集：未关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CLOSE)
    Page<CallDTO> fetchNotClose(CallFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CLOSE, context, CallDTO.class)
    }

}