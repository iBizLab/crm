package cn.ibizlab.crm.crm.reservation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crm.reservation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESERVATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Reservation extends GroovyDataEntityRuntime<Reservation,ReservationDTO,ReservationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Reservation _instance
    void setInstance(Reservation instance) {
        _instance = instance
    }
    static Reservation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReservationDTO create(ReservationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReservationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReservationDTO update(ReservationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReservationDTO.class)
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
    ReservationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReservationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReservationDTO getDraft(ReservationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReservationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReservationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReservationDTO save(ReservationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReservationDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReservationDTO> fetchDefault(ReservationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReservationDTO.class)
    }

}