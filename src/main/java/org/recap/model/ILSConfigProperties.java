
package org.recap.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ILSConfigProperties {
    /* ILS Connection Properties */
    @SerializedName("ils.server")
    @Expose
    public String host;
    @SerializedName("ils.server.port")
    @Expose
    public int port;
    @SerializedName("ils.server.operator.user.id")
    @Expose
    public String operatorUserId;
    @SerializedName("ils.server.operator.password")
    @Expose
    public String operatorPassword;
    @SerializedName("ils.server.operator.location")
    @Expose
    public String operatorLocation;
    @SerializedName("ils.protocol")
    @Expose
    public String protocol;

/*
    @SerializedName("ftp.submit.collection.cgdprotected.dir")
    @Expose
    public String ftpSubmitCollectionCgdprotectedDir;
    @SerializedName("auth.service.logout")
    @Expose
    public String authServiceLogout;


    @SerializedName("ils.nypl.cross.partner.patron.id")
    @Expose
    public String ilsNyplCrossPartnerPatronId;
    @SerializedName("ils.pul.edd.patron.id")
    @Expose
    public String ilsPulEddPatronId;
    @SerializedName("ils.cul.edd.patron.id")
    @Expose
    public String ilsCulEddPatronId;
    @SerializedName("ftp.accession.reconciliation.processed.dir")
    @Expose
    public String ftpAccessionReconciliationProcessedDir;
    @SerializedName("ftp.submit.collection.report.dir")
    @Expose
    public String ftpSubmitCollectionReportDir;
    @SerializedName("ils.edd.patron.id")
    @Expose
    public String ilsEddPatronId;
    @SerializedName("accession.reconciliation.workdir")
    @Expose
    public String accessionReconciliationWorkdir;
    @SerializedName("auth.type")
    @Expose
    public String authType;
    @SerializedName("ftp.accession.reconciliation.dir")
    @Expose
    public String ftpAccessionReconciliationDir;
    @SerializedName("auth.service.login")
    @Expose
    public String authServiceLogin;
    @SerializedName("submit.collection.fileprocess.workdir")
    @Expose
    public String submitCollectionFileprocessWorkdir;
    @SerializedName("auth.service.prefix")
    @Expose
    public String authServicePrefix;
    @SerializedName("email.recall.request.to")
    @Expose
    public String emailRecallRequestTo;


    @SerializedName("ils.pul.cross.partner.patron.id")
    @Expose
    public String ilsPulCrossPartnerPatronId;
    @SerializedName("ils.cul.cross.partner.patron.id")
    @Expose
    public String ilsCulCrossPartnerPatronId;
    @SerializedName("ftp.submit.collection.cgdnotprotected.dir")
    @Expose
    public String ftpSubmitCollectionCgdnotprotectedDir;
    @SerializedName("ils.nypl.edd.patron.id")
    @Expose
    public String ilsNyplEddPatronId;  */

    /* ILS General Properties */

    /* Matching Algo Reports Properties */
    @SerializedName("email.matching.reports.to")
    @Expose
    public String emailMatchingReportsTo;

    /* Accession Properties */
    @SerializedName("email.accession.reconciliation.cc")
    @Expose
    public String emailAccessionReconciliationCc;
    @SerializedName("email.accession.reports.to")
    @Expose
    public String emailAccessionReportsTo;
    @SerializedName("email.accession.reconciliation.to")
    @Expose
    public String emailAccessionReconciliationTo;

    /* Submit Collection Properties */
    @SerializedName("email.submit.collection.to")
    @Expose
    public String emailSubmitCollectionTo;
    @SerializedName("email.submit.collection.cc")
    @Expose
    public String emailSubmitCollectionCc;

    /* Data Dump Properties */
    @SerializedName("email.data.dump.to")
    @Expose
    public String emailDataDumpTo;
    @SerializedName("email.data.dump.cc")
    @Expose
    public String emailDataDumpCc;

    @SerializedName("datadump.marc")
    @Expose
    public String datadumpMarc;

    /* Email Request Properties */
    @SerializedName("email.recall.request.to")
    @Expose
    public String emailRecallRequestTo;
    @SerializedName("email.request.recall.cc")
    @Expose
    public String emailRequestRecallCc;
    @SerializedName("email.request.initial.load.to")
    @Expose
    public String emailRequestInitialLoadTo;
    @SerializedName("email.request.refile.to")
    @Expose
    public String emailRequestRefileTo;

    /* Other Email Properties */
    @SerializedName("email.admin.role.to")
    @Expose
    public String emailAdminRoleTo;
    @SerializedName("email.technical.support.to")
    @Expose
    public String emailTechnicalSupportTo;

    /* ILS OAuth Properties */
    @SerializedName("oauth2.client.clientid")
    @Expose
    public String oauth2ClientClientid;
    @SerializedName("oauth2.client.clientSecret")
    @Expose
    public String oauth2ClientClientSecret;
    @SerializedName("oauth2.client.registered-redirect-uri")
    @Expose
    public String oauth2ClientRegisteredRedirectUri;
    @SerializedName("oauth2.resource.jwt.key-value")
    @Expose
    public String oauth2ResourceJwtKeyValue;
    @SerializedName("oauth2.client.scope")
    @Expose
    public String oauth2ClientScope;
    @SerializedName("oauth2.client.pre-established-redirect-uri")
    @Expose
    public String oauth2ClientPreEstablishedRedirectUri;
    @SerializedName("oauth.resource.jwt.key-value")
    @Expose
    public String oauthResourceJwtKeyValue;
    @SerializedName("oauth.token.api.url")
    @Expose
    public String oauthTokenApiUrl;

    /* ILS Rest Properties */
    @SerializedName("ils.rest.data.api")
    @Expose
    public String ilsRestDataApi;
    @SerializedName("ils.rest.polling.max.timeout")
    @Expose
    public String ilsRestPollingMaxTimeout;
    @SerializedName("ils.bibdata.api.parameter")
    @Expose
    public String ilsBibdataApiParameter;
    @SerializedName("ils.bibdata.api.endpoint")
    @Expose
    public String ilsBibdataApiEndpoint;
    @SerializedName("ils.bibdata.api.auth")
    @Expose
    public String ilsBibdataApiAuth;
    @SerializedName("bibdata.format")
    @Expose
    public String bibDataFormat;
    @SerializedName("ils.refile.endpoint.protocol")
    @Expose
    public String ilsRefileEndpointProtocol;

    @SerializedName("submitCollection.protected.ftpDir")
    @Expose
    public String submitCollectionProtectedFtpDir;

    @SerializedName("submitCollection.protected.localDir")
    @Expose
    public String submitCollectionProtectedLocalDir;

    @SerializedName("submitCollection.notProtected.ftpDir")
    @Expose
    public String submitCollectionNotProtectedFtpDir;

    @SerializedName("submitCollection.notProtected.localDir")
    @Expose
    public String submitCollectionNotProtectedLocalDir;

    @SerializedName("ftp.accession.reconciliation.dir")
    @Expose
    public String ftpAccessionReconciliationDir;

    @SerializedName("ftp.accession.reconciliation.processed.dir")
    @Expose
    public String ftpAccessionReconciliationProcessedDir;

    @SerializedName("accession.reconciliation.filePath")
    @Expose
    public String accessionReconciliationFilepath;

    @SerializedName("accession.reconciliation.workdir")
    @Expose
    public String accessionReconciliationWorkdir;

    @SerializedName("accession.reconciliation.ftp.routeId")
    @Expose
    public String accessionReconciliationFtpRouteId;

    @SerializedName("accession.reconciliation.direct.routeId")
    @Expose
    public String accessionReconciliationDirectRouteId;

    @SerializedName("etl.incremental.dump")
    @Expose
    public String etlIncrementalDump;

    @SerializedName("etl.deleted.dump")
    @Expose
    public String etlDeletedDump;

    @SerializedName("etl.initial.data.loaded.date")
    @Expose
    public String etlInitialDataLoadedDate;

    @SerializedName("ftp.request.initial.accession.dir")
    @Expose
    public String ftpRequestInitialAccessionDir;

    @SerializedName("ftp.request.initial.accession.error.file")
    @Expose
    public String ftpRequestInitialAccessionErrorFile;

    @SerializedName("request.initial.load.workdir")
    @Expose
    public String requestInitialLoadWorkdir;

    @SerializedName("request.initial.load.filepath")
    @Expose
    public String requestInitialLoadFilepath;

    @SerializedName("ils.agency.id")
    @Expose
    public String ncipAgencyId;

    @SerializedName("ils.scheme")
    @Expose
    public String ncipScheme;

    @SerializedName("ils.api.key")
    @Expose
    public String ilsApiKey;

}