package cn.ibizlab.crm.crm.payeeplan

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.payeeplan.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PAYEE_PLAN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PayeePlan extends GroovyDataEntityRuntime<PayeePlan,PayeePlanDTO,PayeePlanFilterDTO> {

    public static final String ACTION_ADD_PROJECT = "add_project"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_PLAN_TO_PAYEE = "plan_to_payee"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_EXECUTOR = "executor"
    public static final String DATASET_SUM = "sum"
    public static final String DATASET_TOWARD = "toward"
    public static final String DATASET_TREE = "tree"
    private static PayeePlan _instance
    void setInstance(PayeePlan instance) {
        _instance = instance
    }
    static PayeePlan getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PayeePlanDTO create(PayeePlanDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PayeePlanDTO update(PayeePlanDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PayeePlanDTO.class)
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
    PayeePlanDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PayeePlanDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PayeePlanDTO getDraft(PayeePlanDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PayeePlanDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PayeePlanDTO save(PayeePlanDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：获取订单数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_PROJECT)
    def addProject(PayeePlanDTO dto) throws Throwable {
        return this.execute(ACTION_ADD_PROJECT, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(PayeePlanDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(PayeePlanDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(PayeePlanDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(PayeePlanDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(PayeePlanDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(PayeePlanDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, PayeePlanDTO.class)
    }

    /**
     * 行为：将数据传给记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLAN_TO_PAYEE)
    def planToPayee(PayeePlanDTO dto) throws Throwable {
        this.execute(ACTION_PLAN_TO_PAYEE, dto, PayeePlanDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PayeePlanDTO> fetchDefault(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PayeePlanDTO.class)
    }

    /**
     * 数据集：全部 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<PayeePlanDTO> fetchAll(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, PayeePlanDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<PayeePlanDTO> fetchCreateman(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, PayeePlanDTO.class)
    }

    /**
     * 数据集：执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR)
    Page<PayeePlanDTO> fetchExecutor(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR, context, PayeePlanDTO.class)
    }

    /**
     * 数据集：金额汇总 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SUM)
    Page<PayeePlanDTO> fetchSum(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SUM, context, PayeePlanDTO.class)
    }

    /**
     * 数据集：进行中 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TOWARD)
    Page<PayeePlanDTO> fetchToward(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TOWARD, context, PayeePlanDTO.class)
    }

    /**
     * 数据集：树表格 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TREE)
    Page<PayeePlanDTO> fetchTree(PayeePlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TREE, context, PayeePlanDTO.class)
    }

}