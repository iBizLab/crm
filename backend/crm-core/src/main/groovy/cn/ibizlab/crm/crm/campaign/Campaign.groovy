package cn.ibizlab.crm.crm.campaign

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.campaign.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CAMPAIGN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Campaign extends GroovyDataEntityRuntime<Campaign,CampaignDTO,CampaignFilterDTO> {

    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Campaign _instance
    void setInstance(Campaign instance) {
        _instance = instance
    }
    static Campaign getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CampaignDTO create(CampaignDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CampaignDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CampaignDTO update(CampaignDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CampaignDTO.class)
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
    CampaignDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CampaignDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CampaignDTO getDraft(CampaignDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CampaignDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CampaignDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CampaignDTO save(CampaignDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CampaignDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(CampaignDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, CampaignDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(CampaignDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, CampaignDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(CampaignDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, CampaignDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(CampaignDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, CampaignDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(CampaignDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, CampaignDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CampaignDTO> fetchDefault(CampaignFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CampaignDTO.class)
    }

}