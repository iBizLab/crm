package cn.ibizlab.crm.crm.orderallocate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.orderallocate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ORDER_ALLOCATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class OrderAllocate extends GroovyDataEntityRuntime<OrderAllocate,OrderAllocateDTO,OrderAllocateFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    private static OrderAllocate _instance
    void setInstance(OrderAllocate instance) {
        _instance = instance
    }
    static OrderAllocate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    OrderAllocateDTO create(OrderAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, OrderAllocateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    OrderAllocateDTO update(OrderAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, OrderAllocateDTO.class)
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
    OrderAllocateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, OrderAllocateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    OrderAllocateDTO getDraft(OrderAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, OrderAllocateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(OrderAllocateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    OrderAllocateDTO save(OrderAllocateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, OrderAllocateDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<OrderAllocateDTO> fetchDefault(OrderAllocateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, OrderAllocateDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<OrderAllocateDTO> fetchAll(OrderAllocateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, OrderAllocateDTO.class)
    }

}