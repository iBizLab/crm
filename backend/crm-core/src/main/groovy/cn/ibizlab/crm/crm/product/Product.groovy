package cn.ibizlab.crm.crm.product

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.product.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PRODUCT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Product extends GroovyDataEntityRuntime<Product,ProductDTO,ProductFilterDTO> {

    public static final String ACTION_ADD_PRODUCT = "add_product"
    public static final String ACTION_ADD_TAGS = "add_tags"
    public static final String ACTION_BATCH_UPDATE = "batch_update"
    public static final String ACTION_CREATE_TASK = "create_task"
    public static final String ACTION_DELETE_TAGS = "delete_tags"
    public static final String ACTION_MAIN_VIEW_DR_COUNT = "main_view_dr_count"
    public static final String ACTION_UNLINK = "unlink"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_RELATION_TARGET = "relation_target"
    private static Product _instance
    void setInstance(Product instance) {
        _instance = instance
    }
    static Product getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ProductDTO create(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ProductDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ProductDTO update(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ProductDTO.class)
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
    ProductDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ProductDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ProductDTO getDraft(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ProductDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ProductDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ProductDTO save(ProductDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ProductDTO.class)
    }

    /**
     * 行为：添加产品 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_PRODUCT)
    def addProduct(ProductDTO dto) throws Throwable {
        this.execute(ACTION_ADD_PRODUCT, dto, ProductDTO.class)
    }

    /**
     * 行为：批添加标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TAGS)
    def addTags(ProductDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TAGS, dto, ProductDTO.class)
    }

    /**
     * 行为：批更新 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCH_UPDATE)
    def batchUpdate(ProductDTO dto) throws Throwable {
        this.execute(ACTION_BATCH_UPDATE, dto, ProductDTO.class)
    }

    /**
     * 行为：批创建任务 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE_TASK)
    def createTask(ProductDTO dto) throws Throwable {
        this.execute(ACTION_CREATE_TASK, dto, ProductDTO.class)
    }

    /**
     * 行为：批移除标签 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE_TAGS)
    def deleteTags(ProductDTO dto) throws Throwable {
        this.execute(ACTION_DELETE_TAGS, dto, ProductDTO.class)
    }

    /**
     * 行为：main_view_dr计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIN_VIEW_DR_COUNT)
    def mainViewDrCount(ProductDTO dto) throws Throwable {
        this.execute(ACTION_MAIN_VIEW_DR_COUNT, dto, ProductDTO.class)
    }

    /**
     * 行为：取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UNLINK)
    def unlink(ProductDTO dto) throws Throwable {
        this.execute(ACTION_UNLINK, dto, ProductDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ProductDTO> fetchDefault(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ProductDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<ProductDTO> fetchAll(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, ProductDTO.class)
    }

    /**
     * 数据集：关联的目标产品 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RELATION_TARGET)
    Page<ProductDTO> fetchRelationTarget(ProductFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RELATION_TARGET, context, ProductDTO.class)
    }

}