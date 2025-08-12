package cn.ibizlab.crm.crm.contact

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.contact.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CONTACT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Contact extends GroovyDataEntityRuntime<Contact,ContactDTO,ContactFilterDTO> {

    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_OWNER = "owner"
    private static Contact _instance
    void setInstance(Contact instance) {
        _instance = instance
    }
    static Contact getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ContactDTO create(ContactDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ContactDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ContactDTO update(ContactDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ContactDTO.class)
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
    ContactDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ContactDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ContactDTO getDraft(ContactDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ContactDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ContactDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ContactDTO save(ContactDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ContactDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(ContactDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, ContactDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(ContactDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, ContactDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(ContactDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, ContactDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(ContactDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, ContactDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(ContactDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, ContactDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ContactDTO> fetchDefault(ContactFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ContactDTO.class)
    }

    /**
     * 数据集：全部联系人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ContactDTO> fetchAll(ContactFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ContactDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<ContactDTO> fetchCreateman(ContactFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, ContactDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<ContactDTO> fetchOwner(ContactFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, ContactDTO.class)
    }

}