VERSION?=main


.PHONY: codegen
codegen:
	curl -L -o swagger.json https://raw.githubusercontent.com/numaproj/numaflow/$(VERSION)/api/openapi-spec/swagger.json
	VERSION=$(VERSION) make --directory java generate
