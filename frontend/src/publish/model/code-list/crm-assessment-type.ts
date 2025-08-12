export default {
  codeListTag: 'crm__assessment_type',
  codeListType: 'STATIC',
  codeName: 'crm__assessment_type',
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
      codeName: 'task',
      text: '任务',
      value: 'TASK',
      id: 'task',
    },
    {
      codeName: 'project',
      text: '订单',
      value: 'PROJECT',
      id: 'project',
    },
  ],
  enableCache: true,
  name: '评估对象类型',
  id: 'crmweb.crm__assessment_type',
};
