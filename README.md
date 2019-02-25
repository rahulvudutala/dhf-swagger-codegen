# Use this command to autogenarate API client stubs and tests

java -jar swagger-codegen-cli-3.0.0-rc1.jar generate -i swagger.json --api-package com.marklogic.hub.client.api --model-package com.marklogic.hub.client.model   --invoker-package com.marklogic.hub.client.invoker --group-id com.marklogic --artifact-id qs-datahub-codegen-api --artifact-version 0.0.1-SNAPSHOT -l java  --library resttemplate -o qs-datahub-codegen-api
