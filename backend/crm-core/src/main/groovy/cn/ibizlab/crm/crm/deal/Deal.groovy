package cn.ibizlab.crm.crm.deal

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.deal.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DEAL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Deal extends GroovyDataEntityRuntime<Deal,DealDTO,DealFilterDTO> {

    public static final String ACTION_ASYNC_ADDDEALTOWORKPROGRESS = "Async_addDealToWorkProgress"
    public static final String ACTION_ADDDEALTOWORKPROGRESS = "addDealToWorkProgress"
    public static final String ACTION_ADD_DEAL = "add_deal"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_RELATE_TASK_AND_MANEUVER = "relate_task_and_maneuver"
    public static final String ACTION_STAGEPROBABILITY = "stageProbability"
    public static final String DATASET_ALL = "All"
    public static final String DATASET_BYACCOUNT = "ByAccount"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHART = "chart"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_DEAL_RELATION_TASK = "deal_relation_task"
    public static final String DATASET_EXECUTOR = "executor"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_RELATION = "relation"
    public static final String DATASET_SUM = "sum"
    public static final String DATASET_TARGET_RELATION = "target_relation"
    private static Deal _instance
    void setInstance(Deal instance) {
        _instance = instance
    }
    static Deal getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DealDTO create(DealDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DealDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DealDTO update(DealDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DealDTO.class)
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
    DealDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DealDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DealDTO getDraft(DealDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DealDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DealDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DealDTO save(DealDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DealDTO.class)
    }

    /**
     * 行为：异步新建商机时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_ADDDEALTOWORKPROGRESS)
    def asyncAdddealtoworkprogress(DealDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_ADDDEALTOWORKPROGRESS, dto, Object.class)
    }

    /**
     * 行为：新建商机时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADDDEALTOWORKPROGRESS)
    def addDealToWorkProgress(DealDTO dto) throws Throwable {
        this.execute(ACTION_ADDDEALTOWORKPROGRESS, dto, DealDTO.class)
    }

    /**
     * 行为：添加商机 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_DEAL)
    def addDeal(DealDTO dto) throws Throwable {
        this.execute(ACTION_ADD_DEAL, dto, DealDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(DealDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, DealDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(DealDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, DealDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(DealDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, DealDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(DealDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, DealDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(DealDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, DealDTO.class)
    }

    /**
     * 行为：关联任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RELATE_TASK_AND_MANEUVER)
    def relateTaskAndManeuver(DealDTO dto) throws Throwable {
        this.execute(ACTION_RELATE_TASK_AND_MANEUVER, dto, DealDTO.class)
    }

    /**
     * 行为：获取阶段概率 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_STAGEPROBABILITY)
    def stageProbability(DealDTO dto) throws Throwable {
        return this.execute(ACTION_STAGEPROBABILITY, dto, DealDTO.class)
    }

    /**
     * 数据集：全部商机 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<DealDTO> fetchAll(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, DealDTO.class)
    }

    /**
     * 数据集：根据客户筛选 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BYACCOUNT)
    Page<DealDTO> fetchByAccount(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BYACCOUNT, context, DealDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DealDTO> fetchDefault(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DealDTO.class)
    }

    /**
     * 数据集：图表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHART)
    Page<DealDTO> fetchChart(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHART, context, DealDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<DealDTO> fetchCreateman(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, DealDTO.class)
    }

    /**
     * 数据集：商机关联的任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEAL_RELATION_TASK)
    Page<DealDTO> fetchDealRelationTask(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEAL_RELATION_TASK, context, DealDTO.class)
    }

    /**
     * 数据集：执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR)
    Page<DealDTO> fetchExecutor(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR, context, DealDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<DealDTO> fetchOwner(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, DealDTO.class)
    }

    /**
     * 数据集：关联的商机 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION)
    Page<DealDTO> fetchRelation(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION, context, DealDTO.class)
    }

    /**
     * 数据集：金额汇总 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SUM)
    Page<DealDTO> fetchSum(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SUM, context, DealDTO.class)
    }

    /**
     * 数据集：被关联的商机信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TARGET_RELATION)
    Page<DealDTO> fetchTargetRelation(DealFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TARGET_RELATION, context, DealDTO.class)
    }

}