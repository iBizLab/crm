package cn.ibizlab.crm.crm.user

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.user.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[USER]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射，开启RTCode模式会导致映射功能失效
 */
class User extends GroovyDataEntityRuntime<User,UserDTO,UserFilterDTO> {

    public static final String ACTION_ADD_ACCOUNT_RELUSER = "add_account_reluser"
    public static final String ACTION_CREATESYSPERSON = "createSysPerson"
    public static final String ACTION_UNLINK = "unlink"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_SALESLEADER = "SalesLeader"
    public static final String DATASET_ACCOUNT_RELUSER = "account_reluser"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_CURUSER = "curuser"
    private static User _instance
    void setInstance(User instance) {
        _instance = instance
    }
    static User getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    UserDTO create(UserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, UserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    UserDTO update(UserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, UserDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    UserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, UserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    UserDTO getDraft(UserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, UserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(UserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    UserDTO save(UserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, UserDTO.class)
    }

    /**
     * 行为：添加关联销售 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_ADD_ACCOUNT_RELUSER)
    def addAccountReluser(UserDTO dto) throws Throwable {
        this.execute(ACTION_ADD_ACCOUNT_RELUSER, dto, UserDTO.class)
    }

    /**
     * 行为：创建账号 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATESYSPERSON)
    def createSysPerson(UserDTO dto) throws Throwable {
        this.execute(ACTION_CREATESYSPERSON, dto, UserDTO.class)
    }

    /**
     * 行为：取消关联 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UNLINK)
    def unlink(UserDTO dto) throws Throwable {
        this.execute(ACTION_UNLINK, dto, UserDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<UserDTO> fetchDefault(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, UserDTO.class)
    }

    /**
     * 数据集：销售领导 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_SALESLEADER)
    Page<UserDTO> fetchSalesLeader(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SALESLEADER, context, UserDTO.class)
    }

    /**
     * 数据集：客户关联销售 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ACCOUNT_RELUSER)
    Page<UserDTO> fetchAccountReluser(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ACCOUNT_RELUSER, context, UserDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ALL)
    Page<UserDTO> fetchAll(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, UserDTO.class)
    }

    /**
     * 数据集：当前用户 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_CURUSER)
    Page<UserDTO> fetchCuruser(UserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURUSER, context, UserDTO.class)
    }

}