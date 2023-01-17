VERSION ?= main

SDK_VERSION := $(shell if [[ "$(VERSION)" =~ ^v[0-9]+\.[0-9]+\.[0-9]+.*  ]]; then echo ${VERSION} | cut -c2-; elif [[ "$(VERSION)" =~ ^main$$  ]]; then echo 0.0.0-pre; else echo $(VERSION); fi)

GENERATOR_VERSION := v5.4.0

DOCKER = docker run --rm -v `pwd -P`:/base --workdir /base

publish: generate
	echo TODO

generate:
	rm -Rf ./docs ./test ./numaflow/models/ ./numaflow/model/
	mkdir -p ./dist
	cat ../swagger.json | ../hack/swaggerfilter.py io.numaproj.numaflow | \
		sed 's/io.k8s.api.core.//' | \
		sed 's/io.k8s.apimachinery.pkg.apis.meta.//' | \
		sed 's/io.k8s.apimachinery.pkg.api.//' | \
		sed 's/io.numaproj.numaflow.v1alpha1.//' \
		> ./dist/swagger.json
	$(DOCKER) openapitools/openapi-generator-cli:$(GENERATOR_VERSION) \
		generate \
		-i /base/dist/swagger.json \
		-g python \
		-o /base \
		--additional-properties packageVersion=${SDK_VERSION} \
		--additional-properties packageName="numaflow" \
		--additional-properties projectName="numaflow" \
		--additional-properties hideGenerationTimestamp=true \
		--remove-operation-id-prefix \
		--model-name-prefix '' \
		--model-name-suffix '' \
		--artifact-id numaflow-python-client \
		--global-property modelTests=false \
		--global-property packageName=numaflow \
		--import-mappings V1ResourceRequirements="from kubernetes.client import V1ResourceRequirements" \
		--import-mappings V1SecretKeySelector="from kubernetes.client import V1SecretKeySelector" \
		--generate-alias-as-model
	echo "kubernetes >= 22.6.0" >> requirements.txt

install:
	pip3 install ./
