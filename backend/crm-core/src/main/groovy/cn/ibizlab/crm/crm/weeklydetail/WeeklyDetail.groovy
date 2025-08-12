package cn.ibizlab.crm.crm.weeklydetail

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.weeklydetail.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WEEKLY_DETAIL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class WeeklyDetail extends GroovyDataEntityRuntime<WeeklyDetail,WeeklyDetailDTO,WeeklyDetailFilterDTO> {

    public static final String DATASET_ACTIVITIES = "Activities"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NOTES = "Notes"
    public static final String DATASET_TODOTASK = "TodoTask"
    private static WeeklyDetail _instance
    void setInstance(WeeklyDetail instance) {
        _instance = instance
    }
    static WeeklyDetail getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WeeklyDetailDTO create(WeeklyDetailDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WeeklyDetailDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WeeklyDetailDTO update(WeeklyDetailDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WeeklyDetailDTO.class)
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
    WeeklyDetailDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WeeklyDetailDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WeeklyDetailDTO getDraft(WeeklyDetailDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WeeklyDetailDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WeeklyDetailDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WeeklyDetailDTO save(WeeklyDetailDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WeeklyDetailDTO.class)
    }

    /**
     * 数据集：周报关联活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ACTIVITIES)
    Page<WeeklyDetailDTO> fetchActivities(WeeklyDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ACTIVITIES, context, WeeklyDetailDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WeeklyDetailDTO> fetchDefault(WeeklyDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WeeklyDetailDTO.class)
    }

    /**
     * 数据集：周报关联评估 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTES)
    Page<WeeklyDetailDTO> fetchNotes(WeeklyDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTES, context, WeeklyDetailDTO.class)
    }

    /**
     * 数据集：下周任务计划 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_TODOTASK)
    Page<WeeklyDetailDTO> fetchTodoTask(WeeklyDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_TODOTASK, context, WeeklyDetailDTO.class)
    }

}