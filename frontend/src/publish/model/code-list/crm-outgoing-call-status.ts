export default {
  codeListTag: 'crm__outgoing_call_status',
  codeListType: 'STATIC',
  codeName: 'crm__outgoing_call_status',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'scheduled',
      text: '已安排',
      value: 'Scheduled',
      id: 'scheduled',
    },
    {
      codeName: 'overdue',
      text: '过期',
      value: 'Overdue',
      id: 'overdue',
    },
  ],
  enableCache: true,
  name: '去电通话状态',
  id: 'crmweb.crm__outgoing_call_status',
};
