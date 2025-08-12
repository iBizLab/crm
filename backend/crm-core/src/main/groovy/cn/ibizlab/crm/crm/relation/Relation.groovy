package cn.ibizlab.crm.crm.relation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.relation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RELATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Relation extends GroovyDataEntityRuntime<Relation,RelationDTO,RelationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    private static Relation _instance
    void setInstance(Relation instance) {
        _instance = instance
    }
    static Relation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    RelationDTO create(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RelationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RelationDTO update(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RelationDTO.class)
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
    RelationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RelationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RelationDTO getDraft(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RelationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RelationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RelationDTO save(RelationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RelationDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<RelationDTO> fetchDefault(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, RelationDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<RelationDTO> fetchAll(RelationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, RelationDTO.class)
    }

}