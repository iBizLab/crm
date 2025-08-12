package cn.ibizlab.crm.crm.lead

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.lead.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[LEAD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Lead extends GroovyDataEntityRuntime<Lead,LeadDTO,LeadFilterDTO> {

    public static final String ACTION_ASYNC_ADDLEADTOWORKPROGRESS = "Async_addLeadtoWorkProgress"
    public static final String ACTION_ADDLEADTOWORKPROGRESS = "addLeadtoWorkProgress"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_LEADTOBEDEAL = "leadToBeDeal"
    public static final String ACTION_LEADTODEAL = "leadToDeal"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_RELATE_TASK_AND_MANEUVER = "relate_task_and_maneuver"
    public static final String DATASET_TREE = "tree"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_EXECUTOR = "executor"
    public static final String DATASET_LEAD_RELATION_TASK = "lead_relation_task"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_TARGET_RELATION = "target_relation"
    private static Lead _instance
    void setInstance(Lead instance) {
        _instance = instance
    }
    static Lead getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    LeadDTO create(LeadDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, LeadDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    LeadDTO update(LeadDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, LeadDTO.class)
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
    LeadDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, LeadDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    LeadDTO getDraft(LeadDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, LeadDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(LeadDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    LeadDTO save(LeadDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, LeadDTO.class)
    }

    /**
     * 行为：异步新建线索时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_ADDLEADTOWORKPROGRESS)
    def asyncAddleadtoworkprogress(LeadDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_ADDLEADTOWORKPROGRESS, dto, Object.class)
    }

    /**
     * 行为：新建线索时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADDLEADTOWORKPROGRESS)
    def addLeadtoWorkProgress(LeadDTO dto) throws Throwable {
        this.execute(ACTION_ADDLEADTOWORKPROGRESS, dto, LeadDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(LeadDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, LeadDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(LeadDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, LeadDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(LeadDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, LeadDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(LeadDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, LeadDTO.class)
    }

    /**
     * 行为：派生商机 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LEADTOBEDEAL)
    def leadToBeDeal(LeadDTO dto) throws Throwable {
        this.execute(ACTION_LEADTOBEDEAL, dto, LeadDTO.class)
    }

    /**
     * 行为：线索转商机 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LEADTODEAL)
    def leadToDeal(LeadDTO dto) throws Throwable {
        this.execute(ACTION_LEADTODEAL, dto, LeadDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(LeadDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, LeadDTO.class)
    }

    /**
     * 行为：关联任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RELATE_TASK_AND_MANEUVER)
    def relateTaskAndManeuver(LeadDTO dto) throws Throwable {
        this.execute(ACTION_RELATE_TASK_AND_MANEUVER, dto, LeadDTO.class)
    }

    /**
     * 数据集：树表格 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TREE)
    Page<LeadDTO> fetchDataSet2(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TREE, context, LeadDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<LeadDTO> fetchDefault(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, LeadDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<LeadDTO> fetchAll(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, LeadDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<LeadDTO> fetchCreateman(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, LeadDTO.class)
    }

    /**
     * 数据集：执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR)
    Page<LeadDTO> fetchExecutor(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR, context, LeadDTO.class)
    }

    /**
     * 数据集：线索关联的任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_LEAD_RELATION_TASK)
    Page<LeadDTO> fetchLeadRelationTask(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_LEAD_RELATION_TASK, context, LeadDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<LeadDTO> fetchOwner(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, LeadDTO.class)
    }

    /**
     * 数据集：被关联的数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TARGET_RELATION)
    Page<LeadDTO> fetchTargetRelation(LeadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TARGET_RELATION, context, LeadDTO.class)
    }

}