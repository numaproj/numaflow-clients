

# GSSAPI

GSSAPI represents a SASL GSSAPI config

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | valid inputs - KRB5_USER_AUTH, KRB5_KEYTAB_AUTH  Possible enum values:  - &#x60;\&quot;KRB5_KEYTAB_AUTH\&quot;&#x60; represents the password method KRB5KeytabAuth &#x3D; \&quot;KRB5_KEYTAB_AUTH\&quot; &#x3D; 2  - &#x60;\&quot;KRB5_USER_AUTH\&quot;&#x60; represents the password method KRB5UserAuth &#x3D; \&quot;KRB5_USER_AUTH\&quot; &#x3D; 1 |  |
|**kerberosConfigSecret** | **V1SecretKeySelector** |  |  [optional] |
|**keytabSecret** | **V1SecretKeySelector** |  |  [optional] |
|**passwordSecret** | **V1SecretKeySelector** |  |  [optional] |
|**realm** | **String** |  |  |
|**serviceName** | **String** |  |  |
|**usernameSecret** | **V1SecretKeySelector** |  |  |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| KEYTAB_AUTH | &quot;KRB5_KEYTAB_AUTH&quot; |
| USER_AUTH | &quot;KRB5_USER_AUTH&quot; |



