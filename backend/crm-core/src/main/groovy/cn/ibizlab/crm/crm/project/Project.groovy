package cn.ibizlab.crm.crm.project

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.project.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PROJECT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Project extends GroovyDataEntityRuntime<Project,ProjectDTO,ProjectFilterDTO> {

    public static final String ACTION_ASYNC_ADDPROJECTTOWORKPROGRESS = "Async_addProjectToWorkProgress"
    public static final String ACTION_FINDBYPID = "FindByPid"
    public static final String ACTION_ADDPROJECTTOWORKPROGRESS = "addProjectToWorkProgress"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_CHECKSUBANDUPDATE = "CheckSubAndUpdate"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ORDERSTATISTICS = "OrderStatistics"
    public static final String DATASET_QUERYPHYSICALORDERGRID = "QueryPhysicalOrderGrid"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_EXECUTOR = "executor"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_TREE = "tree"
    private static Project _instance
    void setInstance(Project instance) {
        _instance = instance
    }
    static Project getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProjectDTO create(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProjectDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProjectDTO update(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProjectDTO.class)
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
    ProjectDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProjectDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProjectDTO getDraft(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProjectDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProjectDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProjectDTO save(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProjectDTO.class)
    }

    /**
     * 行为：异步新建订单时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_ADDPROJECTTOWORKPROGRESS)
    def asyncAddprojecttoworkprogress(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_ADDPROJECTTOWORKPROGRESS, dto, Object.class)
    }

    /**
     * 行为：查询父订单信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FINDBYPID)
    def findByPid(ProjectDTO dto) throws Throwable {
        return this.execute(ACTION_FINDBYPID, dto, ProjectDTO.class)
    }

    /**
     * 行为：新建订单时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADDPROJECTTOWORKPROGRESS)
    def addProjectToWorkProgress(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_ADDPROJECTTOWORKPROGRESS, dto, ProjectDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, ProjectDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, ProjectDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, ProjectDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, ProjectDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, ProjectDTO.class)
    }

    /**
     * 行为：检测子订单是否有未关闭订单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKSUBANDUPDATE)
    def scanStatus(ProjectDTO dto) throws Throwable {
        this.execute(ACTION_CHECKSUBANDUPDATE, dto, ProjectDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProjectDTO> fetchDefault(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProjectDTO.class)
    }

    /**
     * 数据集：签单统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ORDERSTATISTICS)
    Page<ProjectDTO> fetchOrderStatistics(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ORDERSTATISTICS, context, ProjectDTO.class)
    }

    /**
     * 数据集：实体订单 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_QUERYPHYSICALORDERGRID)
    Page<ProjectDTO> fetchQueryPhysicalOrderGrid(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_QUERYPHYSICALORDERGRID, context, ProjectDTO.class)
    }

    /**
     * 数据集：所有数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ProjectDTO> fetchAll(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ProjectDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<ProjectDTO> fetchCreateman(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, ProjectDTO.class)
    }

    /**
     * 数据集：执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR)
    Page<ProjectDTO> fetchExecutor(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR, context, ProjectDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<ProjectDTO> fetchOwner(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, ProjectDTO.class)
    }

    /**
     * 数据集：树表格 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TREE)
    Page<ProjectDTO> fetchTree(ProjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TREE, context, ProjectDTO.class)
    }

}