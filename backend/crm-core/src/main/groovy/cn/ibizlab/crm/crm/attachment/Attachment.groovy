package cn.ibizlab.crm.crm.attachment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.attachment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTACHMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Attachment extends GroovyDataEntityRuntime<Attachment,AttachmentDTO,AttachmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    private static Attachment _instance
    void setInstance(Attachment instance) {
        _instance = instance
    }
    static Attachment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttachmentDTO create(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttachmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttachmentDTO update(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttachmentDTO.class)
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
    AttachmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttachmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttachmentDTO getDraft(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttachmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttachmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttachmentDTO save(AttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttachmentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttachmentDTO> fetchDefault(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttachmentDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<AttachmentDTO> fetchAll(AttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, AttachmentDTO.class)
    }

}