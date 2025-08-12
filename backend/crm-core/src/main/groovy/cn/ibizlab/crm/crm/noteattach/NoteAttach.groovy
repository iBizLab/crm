package cn.ibizlab.crm.crm.noteattach

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.noteattach.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[NOTE_ATTACH]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class NoteAttach extends GroovyDataEntityRuntime<NoteAttach,NoteAttachDTO,NoteAttachFilterDTO> {

    public static final String ACTION_ASYNC_EVALUATETOWORKPROGRESS = "Async_evaluateToWorkProgress"
    public static final String ACTION_EVALUATETOWORKPROGRESS = "evaluateToWorkProgress"
    public static final String DATASET_BYOWNER = "ByOwner"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    private static NoteAttach _instance
    void setInstance(NoteAttach instance) {
        _instance = instance
    }
    static NoteAttach getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    NoteAttachDTO create(NoteAttachDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, NoteAttachDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    NoteAttachDTO update(NoteAttachDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, NoteAttachDTO.class)
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
    NoteAttachDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, NoteAttachDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    NoteAttachDTO getDraft(NoteAttachDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, NoteAttachDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(NoteAttachDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    NoteAttachDTO save(NoteAttachDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, NoteAttachDTO.class)
    }

    /**
     * 行为：异步新建评估时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_EVALUATETOWORKPROGRESS)
    def asyncEvaluatetoworkprogress(NoteAttachDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_EVALUATETOWORKPROGRESS, dto, Object.class)
    }

    /**
     * 行为：新建评估时添加到工作进展 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EVALUATETOWORKPROGRESS)
    def evaluateToWorkProgress(NoteAttachDTO dto) throws Throwable {
        this.execute(ACTION_EVALUATETOWORKPROGRESS, dto, NoteAttachDTO.class)
    }

    /**
     * 数据集：ByOwner 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BYOWNER)
    Page<NoteAttachDTO> fetchByOwner(NoteAttachFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BYOWNER, context, NoteAttachDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<NoteAttachDTO> fetchDefault(NoteAttachFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, NoteAttachDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<NoteAttachDTO> fetchAll(NoteAttachFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, NoteAttachDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<NoteAttachDTO> fetchCreateman(NoteAttachFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, NoteAttachDTO.class)
    }

}