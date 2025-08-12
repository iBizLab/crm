export default {
  codeListTag: 'crm__activityType',
  codeListType: 'STATIC',
  codeName: 'crm__activityType',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'task',
      data: '{"n_type_eq":"TASK"}',
      sysCss: {
        cssName: 'green-span',
      },
      text: '任务',
      textCls: 'green-span',
      value: 'TASK',
      id: 'task',
    },
    {
      codeName: 'maneuver',
      data: '{"n_type_eq":"MANEUVER"}',
      sysCss: {
        cssName: 'blue-span',
      },
      text: '活动',
      textCls: 'blue-span',
      value: 'MANEUVER',
      id: 'maneuver',
    },
  ],
  enableCache: true,
  name: '任务活动类型',
  id: 'crmweb.crm__activitytype',
};
