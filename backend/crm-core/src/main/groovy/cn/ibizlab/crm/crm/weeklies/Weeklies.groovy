package cn.ibizlab.crm.crm.weeklies

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.weeklies.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[WEEKLIES]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Weeklies extends GroovyDataEntityRuntime<Weeklies,WeekliesDTO,WeekliesFilterDTO> {

    public static final String ACTION_GET_LINK_TYPE = "get_link_type"
    public static final String ACTION_NOTHING = "nothing"
    public static final String ACTION_UPDATERELATION = "updateRelation"
    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_PERIOD = "period"
    private static Weeklies _instance
    void setInstance(Weeklies instance) {
        _instance = instance
    }
    static Weeklies getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    WeekliesDTO create(WeekliesDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, WeekliesDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    WeekliesDTO update(WeekliesDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, WeekliesDTO.class)
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
    WeekliesDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, WeekliesDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    WeekliesDTO getDraft(WeekliesDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, WeekliesDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(WeekliesDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    WeekliesDTO save(WeekliesDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, WeekliesDTO.class)
    }

    /**
     * 行为：获取链接视图类型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_LINK_TYPE)
    def getLinkType(WeekliesDTO dto) throws Throwable {
        return this.execute(ACTION_GET_LINK_TYPE, dto, WeekliesDTO.class)
    }

    /**
     * 行为：无操作 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NOTHING)
    def nothing(WeekliesDTO dto) throws Throwable {
        this.execute(ACTION_NOTHING, dto, WeekliesDTO.class)
    }

    /**
     * 行为：根据统计时间更新关联信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATERELATION)
    def updateRelation(WeekliesDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATERELATION, dto, WeekliesDTO.class)
    }

    /**
     * 数据集：所有的周报 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<WeekliesDTO> fetchALL(WeekliesFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, WeekliesDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<WeekliesDTO> fetchDefault(WeekliesFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, WeekliesDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<WeekliesDTO> fetchCreateman(WeekliesFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, WeekliesDTO.class)
    }

    /**
     * 数据集：周报期间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PERIOD)
    Page<WeekliesDTO> fetchPeriod(WeekliesFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PERIOD, context, WeekliesDTO.class)
    }

}