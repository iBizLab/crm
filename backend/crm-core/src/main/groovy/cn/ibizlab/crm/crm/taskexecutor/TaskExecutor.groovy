package cn.ibizlab.crm.crm.taskexecutor

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.taskexecutor.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TASK_EXECUTOR]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class TaskExecutor extends GroovyDataEntityRuntime<TaskExecutor,TaskExecutorDTO,TaskExecutorFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_EXECUTOR_NOTIFY = "executor_notify"
    private static TaskExecutor _instance
    void setInstance(TaskExecutor instance) {
        _instance = instance
    }
    static TaskExecutor getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TaskExecutorDTO create(TaskExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TaskExecutorDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TaskExecutorDTO update(TaskExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TaskExecutorDTO.class)
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
    TaskExecutorDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TaskExecutorDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TaskExecutorDTO getDraft(TaskExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TaskExecutorDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TaskExecutorDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TaskExecutorDTO save(TaskExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TaskExecutorDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TaskExecutorDTO> fetchDefault(TaskExecutorFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TaskExecutorDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<TaskExecutorDTO> fetchAll(TaskExecutorFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, TaskExecutorDTO.class)
    }

    /**
     * 数据集：任务通知对象 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EXECUTOR_NOTIFY)
    Page<TaskExecutorDTO> fetchExecutorNotify(TaskExecutorFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EXECUTOR_NOTIFY, context, TaskExecutorDTO.class)
    }

}