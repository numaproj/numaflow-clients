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



class GetRedisStatefulSetSpecReq(ModelNormal):
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
        return {
            'conf_config_map_name': (str,),  # noqa: E501
            'credential_secret_name': (str,),  # noqa: E501
            'health_config_map_name': (str,),  # noqa: E501
            'init_container_image': (str,),  # noqa: E501
            'labels': ({str: (str,)},),  # noqa: E501
            'metrics_exporter_image': (str,),  # noqa: E501
            'pvc_name_if_needed': (str,),  # noqa: E501
            'redis_container_port': (int,),  # noqa: E501
            'redis_image': (str,),  # noqa: E501
            'redis_metrics_container_port': (int,),  # noqa: E501
            'scripts_config_map_name': (str,),  # noqa: E501
            'sentinel_container_port': (int,),  # noqa: E501
            'sentinel_image': (str,),  # noqa: E501
            'service_name': (str,),  # noqa: E501
            'tls_enabled': (bool,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'conf_config_map_name': 'ConfConfigMapName',  # noqa: E501
        'credential_secret_name': 'CredentialSecretName',  # noqa: E501
        'health_config_map_name': 'HealthConfigMapName',  # noqa: E501
        'init_container_image': 'InitContainerImage',  # noqa: E501
        'labels': 'Labels',  # noqa: E501
        'metrics_exporter_image': 'MetricsExporterImage',  # noqa: E501
        'pvc_name_if_needed': 'PvcNameIfNeeded',  # noqa: E501
        'redis_container_port': 'RedisContainerPort',  # noqa: E501
        'redis_image': 'RedisImage',  # noqa: E501
        'redis_metrics_container_port': 'RedisMetricsContainerPort',  # noqa: E501
        'scripts_config_map_name': 'ScriptsConfigMapName',  # noqa: E501
        'sentinel_container_port': 'SentinelContainerPort',  # noqa: E501
        'sentinel_image': 'SentinelImage',  # noqa: E501
        'service_name': 'ServiceName',  # noqa: E501
        'tls_enabled': 'TLSEnabled',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, conf_config_map_name, credential_secret_name, health_config_map_name, init_container_image, labels, metrics_exporter_image, pvc_name_if_needed, redis_container_port, redis_image, redis_metrics_container_port, scripts_config_map_name, sentinel_container_port, sentinel_image, service_name, tls_enabled, *args, **kwargs):  # noqa: E501
        """GetRedisStatefulSetSpecReq - a model defined in OpenAPI

        Args:
            conf_config_map_name (str):
            credential_secret_name (str):
            health_config_map_name (str):
            init_container_image (str):
            labels ({str: (str,)}):
            metrics_exporter_image (str):
            pvc_name_if_needed (str):
            redis_container_port (int):
            redis_image (str):
            redis_metrics_container_port (int):
            scripts_config_map_name (str):
            sentinel_container_port (int):
            sentinel_image (str):
            service_name (str):
            tls_enabled (bool):

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

        self.conf_config_map_name = conf_config_map_name
        self.credential_secret_name = credential_secret_name
        self.health_config_map_name = health_config_map_name
        self.init_container_image = init_container_image
        self.labels = labels
        self.metrics_exporter_image = metrics_exporter_image
        self.pvc_name_if_needed = pvc_name_if_needed
        self.redis_container_port = redis_container_port
        self.redis_image = redis_image
        self.redis_metrics_container_port = redis_metrics_container_port
        self.scripts_config_map_name = scripts_config_map_name
        self.sentinel_container_port = sentinel_container_port
        self.sentinel_image = sentinel_image
        self.service_name = service_name
        self.tls_enabled = tls_enabled
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
    def __init__(self, conf_config_map_name, credential_secret_name, health_config_map_name, init_container_image, labels, metrics_exporter_image, pvc_name_if_needed, redis_container_port, redis_image, redis_metrics_container_port, scripts_config_map_name, sentinel_container_port, sentinel_image, service_name, tls_enabled, *args, **kwargs):  # noqa: E501
        """GetRedisStatefulSetSpecReq - a model defined in OpenAPI

        Args:
            conf_config_map_name (str):
            credential_secret_name (str):
            health_config_map_name (str):
            init_container_image (str):
            labels ({str: (str,)}):
            metrics_exporter_image (str):
            pvc_name_if_needed (str):
            redis_container_port (int):
            redis_image (str):
            redis_metrics_container_port (int):
            scripts_config_map_name (str):
            sentinel_container_port (int):
            sentinel_image (str):
            service_name (str):
            tls_enabled (bool):

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

        self.conf_config_map_name = conf_config_map_name
        self.credential_secret_name = credential_secret_name
        self.health_config_map_name = health_config_map_name
        self.init_container_image = init_container_image
        self.labels = labels
        self.metrics_exporter_image = metrics_exporter_image
        self.pvc_name_if_needed = pvc_name_if_needed
        self.redis_container_port = redis_container_port
        self.redis_image = redis_image
        self.redis_metrics_container_port = redis_metrics_container_port
        self.scripts_config_map_name = scripts_config_map_name
        self.sentinel_container_port = sentinel_container_port
        self.sentinel_image = sentinel_image
        self.service_name = service_name
        self.tls_enabled = tls_enabled
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