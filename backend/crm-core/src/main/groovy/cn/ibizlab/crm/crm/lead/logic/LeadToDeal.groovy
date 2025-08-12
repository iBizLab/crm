package cn.ibizlab.crm.crm.lead.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[LEAD]处理逻辑[线索转商机]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class LeadToDeal extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(LeadToDeal.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            case "Begin":
                //执行逻辑节点[开始]
                executeBegin(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM1":
                //执行逻辑节点[线索属性值转换为商机属性值]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[创建商机]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION2":
                //执行逻辑节点[根据线索id查询线索]
                executeDEACTION2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL3":
                //执行逻辑节点[附件线索转商机]
                executeRAWSQLCALL3(iDELogicSession, iPSDELogicNode)
                break
            case "END1":
                //执行逻辑节点[结束]
                executeEND1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL1":
                //执行逻辑节点[relation中线索转为商机]
                executeRAWSQLCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL2":
                //执行逻辑节点[进展评估线索转商机]
                executeRAWSQLCALL2(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL4":
                //执行逻辑节点[更新工作进展数据]
                executeRAWSQLCALL4(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION3":
                //执行逻辑节点[删除线索]
                executeDEACTION3(iDELogicSession, iPSDELogicNode)
                break
            default:
                super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode)
        }
    }

    /**
     * 执行逻辑节点[开始]，逻辑类型[BEGIN]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBegin(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[线索属性值转换为商机属性值]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[创建商机]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[根据线索id查询线索]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[附件线索转商机]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[relation中线索转为商机]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[进展评估线索转商机]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新工作进展数据]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[删除线索]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

