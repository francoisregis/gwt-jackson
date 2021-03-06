/*
 * Copyright 2014 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.nmorel.gwtjackson.rebind.property;

import com.google.gwt.thirdparty.guava.common.base.Optional;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableMap;

/**
 * @author Nicolas Morel
 */
public class PropertiesContainer {

    private final ImmutableMap<String, PropertyInfo> properties;

    private final Optional<PropertyInfo> valuePropertyInfo;

    private final Optional<PropertyInfo> anyGetterPropertyInfo;

    private final Optional<PropertyInfo> anySetterPropertyInfo;

    public PropertiesContainer( ImmutableMap<String, PropertyInfo> properties, Optional<PropertyInfo> valuePropertyInfo,
                                Optional<PropertyInfo> anyGetterPropertyInfo, Optional<PropertyInfo> anySetterPropertyInfo ) {
        this.properties = properties;
        this.valuePropertyInfo = valuePropertyInfo;
        this.anyGetterPropertyInfo = anyGetterPropertyInfo;
        this.anySetterPropertyInfo = anySetterPropertyInfo;
    }

    public ImmutableMap<String, PropertyInfo> getProperties() {
        return properties;
    }

    public Optional<PropertyInfo> getValuePropertyInfo() {
        return valuePropertyInfo;
    }

    public Optional<PropertyInfo> getAnyGetterPropertyInfo() {
        return anyGetterPropertyInfo;
    }

    public Optional<PropertyInfo> getAnySetterPropertyInfo() {
        return anySetterPropertyInfo;
    }
}
