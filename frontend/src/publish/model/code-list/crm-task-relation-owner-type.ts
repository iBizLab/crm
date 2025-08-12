export default {
  codeListTag: 'crm__task_relation_owner_type',
  codeListType: 'STATIC',
  codeName: 'crm__task_relation_owner_type',
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
      codeName: 'account',
      text: '客户',
      value: 'ACCOUNT',
      id: 'account',
    },
    {
      codeName: 'contact',
      text: '联系人',
      value: 'CONTACT',
      id: 'contact',
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
    {
      codeName: 'product',
      text: '产品',
      value: 'PRODUCT',
      id: 'product',
    },
    {
      codeName: 'maneuver',
      text: '活动',
      value: 'MANEUVER',
      id: 'maneuver',
    },
  ],
  enableCache: true,
  name: '任务关联所有者类型',
  id: 'crmweb.crm__task_relation_owner_type',
};
