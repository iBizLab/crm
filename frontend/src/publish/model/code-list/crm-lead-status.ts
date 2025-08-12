export default {
  codeListTag: 'crm__lead_status',
  codeListType: 'STATIC',
  codeName: 'crm__lead_status',
  emptyText: '未定义',
  appDataEntityId: 'crmweb.lead',
  codeItems: [
    {
      codeName: 'item_10',
      text: '确认有效性过程中',
      value: '10',
      id: 'item_10',
    },
    {
      codeName: 'item_20',
      text: '持续转化商机过程中',
      value: '20',
      id: 'item_20',
    },
    {
      codeName: 'item_30',
      text: '（关闭线索）有商机成果',
      value: '30',
      id: 'item_30',
    },
    {
      codeName: 'item_40',
      text: '（关闭线索）无商机成果',
      value: '40',
      id: 'item_40',
    },
    {
      codeName: 'item_50',
      text: '（关闭线索）不实线索',
      value: '50',
      id: 'item_50',
    },
  ],
  enableCache: true,
  name: '线索状态',
  id: 'crmweb.crm__lead_status',
};
