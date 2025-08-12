package cn.ibizlab.crm.crm.payeeallocate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.payeeallocate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PAYEE_ALLOCATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PayeeAllocate extends GroovyDataEntityRuntime<PayeeAllocate,PayeeAllocateDTO,PayeeAllocateFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    private static PayeeAllocate _instance
    void setInstance(PayeeAllocate instance) {
        _instance = instance
    }
    static PayeeAllocate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PayeeAllocateDTO create(PayeeAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PayeeAllocateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PayeeAllocateDTO update(PayeeAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PayeeAllocateDTO.class)
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
    PayeeAllocateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PayeeAllocateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PayeeAllocateDTO getDraft(PayeeAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PayeeAllocateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PayeeAllocateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PayeeAllocateDTO save(PayeeAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PayeeAllocateDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PayeeAllocateDTO> fetchDefault(PayeeAllocateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PayeeAllocateDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<PayeeAllocateDTO> fetchAll(PayeeAllocateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, PayeeAllocateDTO.class)
    }

}