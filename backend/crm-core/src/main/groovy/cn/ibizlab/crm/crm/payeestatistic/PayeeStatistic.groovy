package cn.ibizlab.crm.crm.payeestatistic

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.payeestatistic.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PAYEE_STATISTIC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PayeeStatistic extends GroovyDataEntityRuntime<PayeeStatistic,PayeeStatisticDTO,PayeeStatisticFilterDTO> {

    public static final String ACTION_ASYNC_CALCULATION = "Async_Calculation"
    public static final String ACTION_CALCULATION = "Calculation"
    public static final String ACTION_ALL_STATISTIC = "all_statistic"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_SORTBYNAME = "SortbyName"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_FINDPLAN_PAYEE = "findplan_payee"
    public static final String DATASET_OWNER = "owner"
    public static final String DATASET_STATISTIC = "statistic"
    private static PayeeStatistic _instance
    void setInstance(PayeeStatistic instance) {
        _instance = instance
    }
    static PayeeStatistic getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PayeeStatisticDTO create(PayeeStatisticDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PayeeStatisticDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PayeeStatisticDTO update(PayeeStatisticDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PayeeStatisticDTO.class)
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
    PayeeStatisticDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PayeeStatisticDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PayeeStatisticDTO getDraft(PayeeStatisticDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PayeeStatisticDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PayeeStatisticDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PayeeStatisticDTO save(PayeeStatisticDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PayeeStatisticDTO.class)
    }

    /**
     * 行为：异步计算统计数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNC_CALCULATION)
    def asyncCalculation(PayeeStatisticDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNC_CALCULATION, dto, Object.class)
    }

    /**
     * 行为：计算统计数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CALCULATION)
    def calculation(PayeeStatisticDTO dto) throws Throwable {
        this.execute(ACTION_CALCULATION, dto, PayeeStatisticDTO.class)
    }

    /**
     * 行为：将计划数据更新到统计表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ALL_STATISTIC)
    def allStatistic(PayeeStatisticDTO dto) throws Throwable {
        this.execute(ACTION_ALL_STATISTIC, dto, PayeeStatisticDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PayeeStatisticDTO> fetchDefault(PayeeStatisticFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PayeeStatisticDTO.class)
    }

    /**
     * 数据集：通过情况名来排序 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SORTBYNAME)
    Page<PayeeStatisticDTO> fetchSortbyName(PayeeStatisticFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SORTBYNAME, context, PayeeStatisticDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<PayeeStatisticDTO> fetchAll(PayeeStatisticFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, PayeeStatisticDTO.class)
    }

    /**
     * 数据集：附加记录/计划信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FINDPLAN_PAYEE)
    Page<PayeeStatisticDTO> fetchFindplanPayee(PayeeStatisticFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FINDPLAN_PAYEE, context, PayeeStatisticDTO.class)
    }

    /**
     * 数据集：所有者 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OWNER)
    Page<PayeeStatisticDTO> fetchOwner(PayeeStatisticFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OWNER, context, PayeeStatisticDTO.class)
    }

    /**
     * 数据集：统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_STATISTIC)
    Page<PayeeStatisticDTO> fetchStatistic(PayeeStatisticFilterDTO context) throws Throwable {
        return this.fetch(DATASET_STATISTIC, context, PayeeStatisticDTO.class)
    }

}