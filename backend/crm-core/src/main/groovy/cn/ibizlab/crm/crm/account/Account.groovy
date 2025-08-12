package cn.ibizlab.crm.crm.account

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.account.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ACCOUNT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Account extends GroovyDataEntityRuntime<Account,AccountDTO,AccountFilterDTO> {

    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_FIND_ACCOUNT = "find_account"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_MERGE_ACCOUNT = "merge_account"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_ASSIGNED = "assigned"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_CURRENT = "current"
    public static final String DATASET_NOT_CURRENT = "not_current"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_TARGET_RELATION = "target_relation"
    private static Account _instance
    void setInstance(Account instance) {
        _instance = instance
    }
    static Account getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AccountDTO create(AccountDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AccountDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AccountDTO update(AccountDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AccountDTO.class)
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
    AccountDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AccountDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AccountDTO getDraft(AccountDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AccountDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AccountDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AccountDTO save(AccountDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AccountDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(AccountDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, AccountDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(AccountDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, AccountDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(AccountDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, AccountDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(AccountDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, AccountDTO.class)
    }

    /**
     * 行为：通过id查询客户信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FIND_ACCOUNT)
    def findAccount(AccountDTO dto) throws Throwable {
        this.execute(ACTION_FIND_ACCOUNT, dto, AccountDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(AccountDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, AccountDTO.class)
    }

    /**
     * 行为：合并客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MERGE_ACCOUNT)
    def mergeAccount(AccountDTO dto) throws Throwable {
        this.execute(ACTION_MERGE_ACCOUNT, dto, AccountDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AccountDTO> fetchDefault(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AccountDTO.class)
    }

    /**
     * 数据集：全部客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<AccountDTO> fetchAll(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, AccountDTO.class)
    }

    /**
     * 数据集：分配的客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ASSIGNED)
    Page<AccountDTO> fetchAssigned(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ASSIGNED, context, AccountDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<AccountDTO> fetchCreateman(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, AccountDTO.class)
    }

    /**
     * 数据集：当前客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURRENT)
    Page<AccountDTO> fetchCurrent(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURRENT, context, AccountDTO.class)
    }

    /**
     * 数据集：当前客户外其他客户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CURRENT)
    Page<AccountDTO> fetchNotCurrent(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CURRENT, context, AccountDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<AccountDTO> fetchOwner(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, AccountDTO.class)
    }

    /**
     * 数据集：被关联的数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TARGET_RELATION)
    Page<AccountDTO> fetchTargetRelation(AccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TARGET_RELATION, context, AccountDTO.class)
    }

}