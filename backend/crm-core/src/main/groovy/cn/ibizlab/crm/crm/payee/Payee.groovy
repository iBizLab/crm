package cn.ibizlab.crm.crm.payee

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.payee.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PAYEE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Payee extends GroovyDataEntityRuntime<Payee,PayeeDTO,PayeeFilterDTO> {

    public static final String ACTION_ACCOUNTFROMPLAN = "AccountFromPlan"
    public static final String ACTION_ALLOCATEFROMPROJECT = "AllocateFromProject"
    public static final String ACTION_ASYNC_ADDPAYEETOWORKPROGRESS = "Async_addPayeeToWorkProgress"
    public static final String ACTION_PROJECTINFO = "ProjectInfo"
    public static final String ACTION_ADDPAYEETOWORKPROGRESS = "addPayeeToWorkProgress"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_MOVE_ORDER = "move_order"
    public static final String ACTION_PLANINFOBYPROJECT = "PlanInfoByProject"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_EXECUTOR = "executor"
    public static final String DATASET_SUM = "sum"
    public static final String DATASET_TREE = "tree"
    private static Payee _instance
    void setInstance(Payee instance) {
        _instance = instance
    }
    static Payee getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PayeeDTO create(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PayeeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PayeeDTO update(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PayeeDTO.class)
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
    PayeeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PayeeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PayeeDTO getDraft(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PayeeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PayeeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PayeeDTO save(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PayeeDTO.class)
    }

    /**
     * 行为：获取对应记录金额 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACCOUNTFROMPLAN)
    def accountFromPlan(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_ACCOUNTFROMPLAN, dto, PayeeDTO.class)
    }

    /**
     * 行为：获取订单的人员分配 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ALLOCATEFROMPROJECT)
    def allocateFromProject(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_ALLOCATEFROMPROJECT, dto, PayeeDTO.class)
    }

    /**
     * 行为：异步新建线索时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_ADDPAYEETOWORKPROGRESS)
    def asyncAddpayeetoworkprogress(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_ADDPAYEETOWORKPROGRESS, dto, Object.class)
    }

    /**
     * 行为：获取订单相关信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROJECTINFO)
    def projectInfo(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_PROJECTINFO, dto, PayeeDTO.class)
    }

    /**
     * 行为：新建收款记录添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADDPAYEETOWORKPROGRESS)
    def addPayeeToWorkProgress(PayeeDTO dto) throws Throwable {
        this.execute(ACTION_ADDPAYEETOWORKPROGRESS, dto, PayeeDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(PayeeDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, PayeeDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(PayeeDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, PayeeDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(PayeeDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, PayeeDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(PayeeDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, PayeeDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(PayeeDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, PayeeDTO.class)
    }

    /**
     * 行为：移动排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MOVE_ORDER)
    def moveOrder(PayeeDTO dto) throws Throwable {
        return this.executeForList(ACTION_MOVE_ORDER, dto, PayeeDTO.class)
    }

    /**
     * 行为：通过project_id获取plan 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PLANINFOBYPROJECT)
    def planInfoByProject(PayeeDTO dto) throws Throwable {
        return this.execute(ACTION_PLANINFOBYPROJECT, dto, PayeeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PayeeDTO> fetchDefault(PayeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PayeeDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<PayeeDTO> fetchAll(PayeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, PayeeDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<PayeeDTO> fetchCreateman(PayeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, PayeeDTO.class)
    }

    /**
     * 数据集：执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR)
    Page<PayeeDTO> fetchExecutor(PayeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR, context, PayeeDTO.class)
    }

    /**
     * 数据集：金额汇总 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SUM)
    Page<PayeeDTO> fetchSum(PayeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SUM, context, PayeeDTO.class)
    }

    /**
     * 数据集：树表格 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TREE)
    Page<PayeeDTO> fetchTree(PayeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TREE, context, PayeeDTO.class)
    }

}