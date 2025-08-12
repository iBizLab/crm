package cn.ibizlab.crm.crm.tag

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.tag.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[TAG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Tag extends GroovyDataEntityRuntime<Tag,TagDTO,TagFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Tag _instance
    void setInstance(Tag instance) {
        _instance = instance
    }
    static Tag getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    TagDTO create(TagDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, TagDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    TagDTO update(TagDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, TagDTO.class)
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
    TagDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, TagDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    TagDTO getDraft(TagDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, TagDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(TagDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    TagDTO save(TagDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, TagDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<TagDTO> fetchDefault(TagFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, TagDTO.class)
    }

}