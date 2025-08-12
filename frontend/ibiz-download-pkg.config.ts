// eslint-disable-next-line import/no-extraneous-dependencies
import { defineDownloadPkgConfig } from '@ibiz-template/cli';
import { refAppPkgConfig } from './ibiz-ref-app-pkg.config';

export default defineDownloadPkgConfig({
  clean: true,
  registry: 'http://172.16.240.221:8081/repository/ibizsys/',
  outDir: './public/plugins',
  dependencies: [
    ...refAppPkgConfig,
    '@ibiz-template-crm/anchor-point-nav@0.0.2-dev.18',
    '@ibiz-template-plm/html-comment@0.0.2-dev.138',
    '@ibiz-template-plm/personnel-info@0.0.2-dev.79',
    '@ibiz-template-plugin/change-password@0.0.3-dev.60',
    '@ibiz-template-crm/tab-search-bar@0.0.2-dev.15',
    '@ibiz-template-plugin/number-grid@0.0.3-dev.190',
    '@ibiz-template-plugin/file-upload@0.1.3-alpha.17',
    '@ibiz-template-plugin/file-download@0.1.3-alpha.17',
    '@ibiz-template-plm/comment-item@0.0.2-dev.98',
    '@ibiz-template-plm/attachment-grid@0.0.3-dev.48',
  ],
});
