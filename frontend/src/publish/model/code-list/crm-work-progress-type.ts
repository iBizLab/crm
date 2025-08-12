export default {
  codeListTag: 'crm__work_progress_type',
  codeListType: 'STATIC',
  codeName: 'crm__work_progress_type',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'lead',
      text: '线索',
      value: 'LEAD',
      id: 'lead',
    },
    {
      codeName: 'deal',
      text: '商机',
      value: 'DEAL',
      id: 'deal',
    },
    {
      codeName: 'maneuver',
      text: '活动',
      value: 'MANEUVER',
      id: 'maneuver',
    },
    {
      codeName: 'project',
      text: '订单',
      value: 'PROJECT',
      id: 'project',
    },
    {
      codeName: 'payee',
      text: '收款记录',
      value: 'PAYEE',
      id: 'payee',
    },
    {
      codeName: 'task',
      text: '任务',
      value: 'TASK',
      id: 'task',
    },
  ],
  enableCache: true,
  name: '工作进展对象类型',
  id: 'crmweb.crm__work_progress_type',
};
