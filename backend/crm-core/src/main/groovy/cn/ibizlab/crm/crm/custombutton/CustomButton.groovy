package cn.ibizlab.crm.crm.custombutton

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.custombutton.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CUSTOM_BUTTON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CustomButton extends GroovyDataEntityRuntime<CustomButton,CustomButtonDTO,CustomButtonFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CREATEMAN = "createman"
    public static final String DATASET_OWNER = "owner"
    private static CustomButton _instance
    void setInstance(CustomButton instance) {
        _instance = instance
    }
    static CustomButton getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CustomButtonDTO create(CustomButtonDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CustomButtonDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CustomButtonDTO update(CustomButtonDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CustomButtonDTO.class)
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
    CustomButtonDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CustomButtonDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CustomButtonDTO getDraft(CustomButtonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CustomButtonDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CustomButtonDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CustomButtonDTO save(CustomButtonDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CustomButtonDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CustomButtonDTO> fetchDefault(CustomButtonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CustomButtonDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<CustomButtonDTO> fetchAll(CustomButtonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, CustomButtonDTO.class)
    }

    /**
     * 数据集：创建者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CREATEMAN)
    Page<CustomButtonDTO> fetchCreateman(CustomButtonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CREATEMAN, context, CustomButtonDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<CustomButtonDTO> fetchOwner(CustomButtonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, CustomButtonDTO.class)
    }

}