export default {
  getDataAppDEActionId: 'get',
  redirectAppViewRefs: [
    {
      navigateContexts: [
        {
          key: 'CALL',
          value: 'schedule',
          name: 'CALL',
          id: 'call',
        },
      ],
      realTitle: '通话编辑视图',
      refAppViewId: 'crmweb.call_edit_view',
      name: 'EDITVIEW:CALL',
      id: 'editview:call',
    },
    {
      navigateContexts: [
        {
          key: 'EVENT',
          value: 'schedule',
          name: 'EVENT',
          id: 'event',
        },
      ],
      realTitle: '会议编辑视图',
      refAppViewId: 'crmweb.event_edit_view',
      name: 'EDITVIEW:EVENT',
      id: 'editview:event',
    },
    {
      navigateContexts: [
        {
          key: 'RESERVATION',
          value: 'schedule',
          name: 'RESERVATION',
          id: 'reservation',
        },
      ],
      realTitle: '预留编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.RESERVATION.EDITVIEW',
      },
      refAppViewId: 'crmweb.reservation_edit_view',
      name: 'EDITVIEW:RESERVATION',
      id: 'editview:reservation',
    },
    {
      navigateContexts: [
        {
          key: 'TASK',
          value: 'schedule',
          name: 'TASK',
          id: 'task',
        },
      ],
      realTitle: '任务编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.TASK.EDIT_VIEW',
      },
      refAppViewId: 'crmweb.task_task_edit_view',
      name: 'EDITVIEW:TASK',
      id: 'editview:task',
    },
  ],
  typeAppDEFieldId: 'type',
  enableWorkflow: true,
  funcViewMode: 'REDIRECTVIEW',
  deviewCodeName: 'RedirectView',
  deviewId: '0c4e5eac3bcc4c602a82be538508823b',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'DE.LNAME.SCHEDULE',
  },
  caption: '日程',
  codeName: 'schedule_redirect_view',
  appDataEntityId: 'crmweb.schedule',
  controls: [
    {
      capLanguageRes: {
        lanResTag: 'DE.LNAME.SCHEDULE',
      },
      caption: '日程',
      codeName: 'redirect_view_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'crmweb.schedule',
      controlParam: {},
      name: 'captionbar',
      id: 'redirect_view_captionbar',
    },
  ],
  viewLayoutPanel: {
    layoutBodyOnly: true,
    useDefaultLayout: true,
    layoutPanel: true,
    codeName: 'layoutpanel',
    controlStyle: 'APPDEREDIRECTVIEW',
    controlType: 'VIEWLAYOUTPANEL',
    appDataEntityId: 'crmweb.schedule',
    controlParam: {},
    id: 'layoutpanel',
  },
  title: '日程数据重定向视图',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.SCHEDULE.REDIRECTVIEW',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DEREDIRECTVIEW',
  enableDP: true,
  redirectView: true,
  showCaptionBar: true,
  modelId: '797cbf8ebe51c9d95653f276b7cce604',
  modelType: 'PSAPPDEVIEW',
  name: 'scheduleRedirectView',
  id: 'crmweb.schedule_redirect_view',
};
