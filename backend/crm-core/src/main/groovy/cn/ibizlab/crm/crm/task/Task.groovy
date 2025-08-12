package cn.ibizlab.crm.crm.task

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.task.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TASK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Task extends GroovyDataEntityRuntime<Task,TaskDTO,TaskFilterDTO> {

    public static final String ACTION_ASYNC_MANEUVERTOWORKPROGRESS = "Async_maneuverToWorkProgress"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CANCEL_RELATION = "cancel_relation"
    public static final String ACTION_CLOSED_TASK = "Closed_task"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DEAL_CANCEL_RELATION = "deal_cancel_relation"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_LEAD_CANCEL_RELATION = "lead_cancel_relation"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_MANEUVERTOWORKPROGRESS = "maneuverToWorkProgress"
    public static final String ACTION_RELATE_TASK_AND_MANEUVER = "relate_task_and_maneuver"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL_MANEUVER = "all_maneuver"
    public static final String DATASET_ALL_TASK = "all_task"
    public static final String DATASET_CLOSE = "close"
    public static final String DATASET_CLOSE_MANEUVER = "close_maneuver"
    public static final String DATASET_CLOSE_TASK = "close_task"
    public static final String DATASET_CLOSE_TASK_RELATED = "close_task_related"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_EXECUTOR = "executor"
    public static final String DATASET_MANEUVER_RELATED = "maneuver_related"
    public static final String DATASET_MANEUVER_TASK_RELATED = "maneuver_task_related"
    public static final String DATASET_MY_ALL_TASK = "my_all_task"
    public static final String DATASET_MY_CANCELED_TASK = "my_canceled_task"
    public static final String DATASET_MY_DONE_TASK = "my_done_task"
    public static final String DATASET_MY_MANEUVER = "my_maneuver"
    public static final String DATASET_MY_TODO_TASK = "my_todo_task"
    public static final String DATASET_NOT_CLOSE = "not_close"
    public static final String DATASET_NOT_CLOSE_TASK = "not_close_task"
    public static final String DATASET_NOT_CLOSE_TASK_RELATED = "not_close_task_related"
    public static final String DATASET_NOT_RELATED_TASK_AND_MANEUVER = "not_related_task_and_maneuver"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_WEEKLYACTIVITIES = "weeklyActivities"
    private static Task _instance
    void setInstance(Task instance) {
        _instance = instance
    }
    static Task getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TaskDTO create(TaskDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TaskDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TaskDTO update(TaskDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TaskDTO.class)
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
    TaskDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TaskDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TaskDTO getDraft(TaskDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TaskDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TaskDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TaskDTO save(TaskDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TaskDTO.class)
    }

    /**
     * 行为：异步新建活动时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_MANEUVERTOWORKPROGRESS)
    def asyncManeuvertoworkprogress(TaskDTO dto) throws Throwable {
        this.execute(ACTION_ASYNC_MANEUVERTOWORKPROGRESS, dto, TaskDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(TaskDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, TaskDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(TaskDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, TaskDTO.class)
    }

    /**
     * 行为：取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CANCEL_RELATION)
    def cancelRelation(TaskDTO dto) throws Throwable {
        this.execute(ACTION_CANCEL_RELATION, dto, TaskDTO.class)
    }

    /**
     * 行为：关闭任务/活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLOSED_TASK)
    def closedTask(TaskDTO dto) throws Throwable {
        this.execute(ACTION_CLOSED_TASK, dto, TaskDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(TaskDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, TaskDTO.class)
    }

    /**
     * 行为：商机取消关联任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEAL_CANCEL_RELATION)
    def dealCancelRelation(TaskDTO dto) throws Throwable {
        this.execute(ACTION_DEAL_CANCEL_RELATION, dto, TaskDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(TaskDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, TaskDTO.class)
    }

    /**
     * 行为：线索取消关联任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_LEAD_CANCEL_RELATION)
    def leadCancelRelation(TaskDTO dto) throws Throwable {
        this.execute(ACTION_LEAD_CANCEL_RELATION, dto, TaskDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(TaskDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, TaskDTO.class)
    }

    /**
     * 行为：新建活动时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MANEUVERTOWORKPROGRESS)
    def maneuverToWorkProgress(TaskDTO dto) throws Throwable {
        this.execute(ACTION_MANEUVERTOWORKPROGRESS, dto, TaskDTO.class)
    }

    /**
     * 行为：关联任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RELATE_TASK_AND_MANEUVER)
    def relateTaskAndManeuver(TaskDTO dto) throws Throwable {
        this.execute(ACTION_RELATE_TASK_AND_MANEUVER, dto, TaskDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TaskDTO> fetchDefault(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TaskDTO.class)
    }

    /**
     * 数据集：所有活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL_MANEUVER)
    Page<TaskDTO> fetchAllManeuver(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL_MANEUVER, context, TaskDTO.class)
    }

    /**
     * 数据集：所有任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL_TASK)
    Page<TaskDTO> fetchAllTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE)
    Page<TaskDTO> fetchClose(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE, context, TaskDTO.class)
    }

    /**
     * 数据集：关闭的活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE_MANEUVER)
    Page<TaskDTO> fetchCloseManeuver(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE_MANEUVER, context, TaskDTO.class)
    }

    /**
     * 数据集：关闭的任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE_TASK)
    Page<TaskDTO> fetchCloseTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：关闭的任务（关联） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOSE_TASK_RELATED)
    Page<TaskDTO> fetchCloseTaskRelated(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOSE_TASK_RELATED, context, TaskDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<TaskDTO> fetchCreateman(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, TaskDTO.class)
    }

    /**
     * 数据集：执行人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR)
    Page<TaskDTO> fetchExecutor(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR, context, TaskDTO.class)
    }

    /**
     * 数据集：活动(关联) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MANEUVER_RELATED)
    Page<TaskDTO> fetchManeuverRelated(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MANEUVER_RELATED, context, TaskDTO.class)
    }

    /**
     * 数据集：已完成的任务和历史活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MANEUVER_TASK_RELATED)
    Page<TaskDTO> fetchManeuverTaskRelated(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MANEUVER_TASK_RELATED, context, TaskDTO.class)
    }

    /**
     * 数据集：我的所有任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_ALL_TASK)
    Page<TaskDTO> fetchMyAllTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_ALL_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：我已取消的任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_CANCELED_TASK)
    Page<TaskDTO> fetchMyCanceledTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_CANCELED_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：我完成的任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_DONE_TASK)
    Page<TaskDTO> fetchMyDoneTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DONE_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：我的活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_MANEUVER)
    Page<TaskDTO> fetchMyManeuver(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_MANEUVER, context, TaskDTO.class)
    }

    /**
     * 数据集：我的待办任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_TODO_TASK)
    Page<TaskDTO> fetchMyTodoTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_TODO_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：未关闭的 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CLOSE)
    Page<TaskDTO> fetchNotClose(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CLOSE, context, TaskDTO.class)
    }

    /**
     * 数据集：未关闭的任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CLOSE_TASK)
    Page<TaskDTO> fetchNotCloseTask(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CLOSE_TASK, context, TaskDTO.class)
    }

    /**
     * 数据集：未关闭的任务（关联） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_CLOSE_TASK_RELATED)
    Page<TaskDTO> fetchNotCloseTaskRelated(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_CLOSE_TASK_RELATED, context, TaskDTO.class)
    }

    /**
     * 数据集：未关联的任务和活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOT_RELATED_TASK_AND_MANEUVER)
    Page<TaskDTO> fetchNotRelatedTaskAndManeuver(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOT_RELATED_TASK_AND_MANEUVER, context, TaskDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<TaskDTO> fetchOwner(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, TaskDTO.class)
    }

    /**
     * 数据集：周报活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WEEKLYACTIVITIES)
    Page<TaskDTO> fetchWeeklyActivities(TaskFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WEEKLYACTIVITIES, context, TaskDTO.class)
    }

}