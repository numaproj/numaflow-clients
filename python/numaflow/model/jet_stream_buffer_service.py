"""
    Numaflow

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: v0.7.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from numaflow.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from numaflow.exceptions import ApiAttributeError


def lazy_import():
    from numaflow.model.container_template import ContainerTemplate
    from numaflow.model.metadata import Metadata
    from numaflow.model.persistence_strategy import PersistenceStrategy
    from numaflow.model.v1_affinity import V1Affinity
    from numaflow.model.v1_local_object_reference import V1LocalObjectReference
    from numaflow.model.v1_pod_security_context import V1PodSecurityContext
    from numaflow.model.v1_toleration import V1Toleration
    globals()['ContainerTemplate'] = ContainerTemplate
    globals()['Metadata'] = Metadata
    globals()['PersistenceStrategy'] = PersistenceStrategy
    globals()['V1Affinity'] = V1Affinity
    globals()['V1LocalObjectReference'] = V1LocalObjectReference
    globals()['V1PodSecurityContext'] = V1PodSecurityContext
    globals()['V1Toleration'] = V1Toleration


class JetStreamBufferService(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'affinity': (V1Affinity,),  # noqa: E501
            'buffer_config': (str,),  # noqa: E501
            'container_template': (ContainerTemplate,),  # noqa: E501
            'encryption': (bool,),  # noqa: E501
            'image_pull_secrets': ([V1LocalObjectReference],),  # noqa: E501
            'metadata': (Metadata,),  # noqa: E501
            'metrics_container_template': (ContainerTemplate,),  # noqa: E501
            'node_selector': ({str: (str,)},),  # noqa: E501
            'persistence': (PersistenceStrategy,),  # noqa: E501
            'priority': (int,),  # noqa: E501
            'priority_class_name': (str,),  # noqa: E501
            'reloader_container_template': (ContainerTemplate,),  # noqa: E501
            'replicas': (int,),  # noqa: E501
            'security_context': (V1PodSecurityContext,),  # noqa: E501
            'service_account_name': (str,),  # noqa: E501
            'settings': (str,),  # noqa: E501
            'start_args': ([str],),  # noqa: E501
            'tls': (bool,),  # noqa: E501
            'tolerations': ([V1Toleration],),  # noqa: E501
            'version': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'affinity': 'affinity',  # noqa: E501
        'buffer_config': 'bufferConfig',  # noqa: E501
        'container_template': 'containerTemplate',  # noqa: E501
        'encryption': 'encryption',  # noqa: E501
        'image_pull_secrets': 'imagePullSecrets',  # noqa: E501
        'metadata': 'metadata',  # noqa: E501
        'metrics_container_template': 'metricsContainerTemplate',  # noqa: E501
        'node_selector': 'nodeSelector',  # noqa: E501
        'persistence': 'persistence',  # noqa: E501
        'priority': 'priority',  # noqa: E501
        'priority_class_name': 'priorityClassName',  # noqa: E501
        'reloader_container_template': 'reloaderContainerTemplate',  # noqa: E501
        'replicas': 'replicas',  # noqa: E501
        'security_context': 'securityContext',  # noqa: E501
        'service_account_name': 'serviceAccountName',  # noqa: E501
        'settings': 'settings',  # noqa: E501
        'start_args': 'startArgs',  # noqa: E501
        'tls': 'tls',  # noqa: E501
        'tolerations': 'tolerations',  # noqa: E501
        'version': 'version',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """JetStreamBufferService - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            affinity (V1Affinity): [optional]  # noqa: E501
            buffer_config (str): Optional configuration for the streams, consumers and buckets to be created in this JetStream service, if specified, it will be merged with the default configuration in numaflow-controller-config. It accepts a YAML format configuration, it may include 4 sections, \"stream\", \"consumer\", \"otBucket\" and \"procBucket\". Available fields under \"stream\" include \"retention\" (e.g. interest, limits, workerQueue), \"maxMsgs\", \"maxAge\" (e.g. 72h), \"replicas\" (1, 3, 5), \"duplicates\" (e.g. 5m). Available fields under \"consumer\" include \"ackWait\" (e.g. 60s) Available fields under \"otBucket\" include \"maxValueSize\", \"history\", \"ttl\" (e.g. 72h), \"maxBytes\", \"replicas\" (1, 3, 5). Available fields under \"procBucket\" include \"maxValueSize\", \"history\", \"ttl\" (e.g. 72h), \"maxBytes\", \"replicas\" (1, 3, 5).. [optional]  # noqa: E501
            container_template (ContainerTemplate): [optional]  # noqa: E501
            encryption (bool): Whether encrypt the data at rest, defaults to false Enabling encryption might impact the performance, see https://docs.nats.io/running-a-nats-service/nats_admin/jetstream_admin/encryption_at_rest for the detail Toggling the value will impact encypting/decrypting existing messages.. [optional]  # noqa: E501
            image_pull_secrets ([V1LocalObjectReference]): ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod. [optional]  # noqa: E501
            metadata (Metadata): [optional]  # noqa: E501
            metrics_container_template (ContainerTemplate): [optional]  # noqa: E501
            node_selector ({str: (str,)}): NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/. [optional]  # noqa: E501
            persistence (PersistenceStrategy): [optional]  # noqa: E501
            priority (int): The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/. [optional]  # noqa: E501
            priority_class_name (str): If specified, indicates the Redis pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/. [optional]  # noqa: E501
            reloader_container_template (ContainerTemplate): [optional]  # noqa: E501
            replicas (int): Redis StatefulSet size. [optional]  # noqa: E501
            security_context (V1PodSecurityContext): [optional]  # noqa: E501
            service_account_name (str): ServiceAccountName applied to the pod. [optional]  # noqa: E501
            settings (str): JetStream configuration, if not specified, global settings in numaflow-controller-config will be used. See https://docs.nats.io/running-a-nats-service/configuration#jetstream. Only configure \"max_memory_store\" or \"max_file_store\", do not set \"store_dir\" as it has been hardcoded.. [optional]  # noqa: E501
            start_args ([str]): Optional arguments to start nats-server. For example, \"-D\" to enable debugging output, \"-DV\" to enable debugging and tracing. Check https://docs.nats.io/ for all the available arguments.. [optional]  # noqa: E501
            tls (bool): Whether enable TLS, defaults to false Enabling TLS might impact the performance. [optional]  # noqa: E501
            tolerations ([V1Toleration]): If specified, the pod's tolerations.. [optional]  # noqa: E501
            version (str): JetStream version, such as \"2.7.1\". [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """JetStreamBufferService - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            affinity (V1Affinity): [optional]  # noqa: E501
            buffer_config (str): Optional configuration for the streams, consumers and buckets to be created in this JetStream service, if specified, it will be merged with the default configuration in numaflow-controller-config. It accepts a YAML format configuration, it may include 4 sections, \"stream\", \"consumer\", \"otBucket\" and \"procBucket\". Available fields under \"stream\" include \"retention\" (e.g. interest, limits, workerQueue), \"maxMsgs\", \"maxAge\" (e.g. 72h), \"replicas\" (1, 3, 5), \"duplicates\" (e.g. 5m). Available fields under \"consumer\" include \"ackWait\" (e.g. 60s) Available fields under \"otBucket\" include \"maxValueSize\", \"history\", \"ttl\" (e.g. 72h), \"maxBytes\", \"replicas\" (1, 3, 5). Available fields under \"procBucket\" include \"maxValueSize\", \"history\", \"ttl\" (e.g. 72h), \"maxBytes\", \"replicas\" (1, 3, 5).. [optional]  # noqa: E501
            container_template (ContainerTemplate): [optional]  # noqa: E501
            encryption (bool): Whether encrypt the data at rest, defaults to false Enabling encryption might impact the performance, see https://docs.nats.io/running-a-nats-service/nats_admin/jetstream_admin/encryption_at_rest for the detail Toggling the value will impact encypting/decrypting existing messages.. [optional]  # noqa: E501
            image_pull_secrets ([V1LocalObjectReference]): ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod. [optional]  # noqa: E501
            metadata (Metadata): [optional]  # noqa: E501
            metrics_container_template (ContainerTemplate): [optional]  # noqa: E501
            node_selector ({str: (str,)}): NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/. [optional]  # noqa: E501
            persistence (PersistenceStrategy): [optional]  # noqa: E501
            priority (int): The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/. [optional]  # noqa: E501
            priority_class_name (str): If specified, indicates the Redis pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/. [optional]  # noqa: E501
            reloader_container_template (ContainerTemplate): [optional]  # noqa: E501
            replicas (int): Redis StatefulSet size. [optional]  # noqa: E501
            security_context (V1PodSecurityContext): [optional]  # noqa: E501
            service_account_name (str): ServiceAccountName applied to the pod. [optional]  # noqa: E501
            settings (str): JetStream configuration, if not specified, global settings in numaflow-controller-config will be used. See https://docs.nats.io/running-a-nats-service/configuration#jetstream. Only configure \"max_memory_store\" or \"max_file_store\", do not set \"store_dir\" as it has been hardcoded.. [optional]  # noqa: E501
            start_args ([str]): Optional arguments to start nats-server. For example, \"-D\" to enable debugging output, \"-DV\" to enable debugging and tracing. Check https://docs.nats.io/ for all the available arguments.. [optional]  # noqa: E501
            tls (bool): Whether enable TLS, defaults to false Enabling TLS might impact the performance. [optional]  # noqa: E501
            tolerations ([V1Toleration]): If specified, the pod's tolerations.. [optional]  # noqa: E501
            version (str): JetStream version, such as \"2.7.1\". [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")