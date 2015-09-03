/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.livespark.formmodeler.editor.client.editor.fields;

import javax.enterprise.context.Dependent;

import org.livespark.formmodeler.editor.model.impl.basic.BigDecimalBoxFieldDefinition;
import org.livespark.formmodeler.editor.model.impl.basic.DoubleBoxFieldDefinition;

/**
 * Created by pefernan on 7/27/15.
 */
@Dependent
public class DoubleBoxLayoutComponent extends AbstractInputLayoutComponent<DoubleBoxFieldDefinition> {

    public DoubleBoxLayoutComponent() {
    }

    public DoubleBoxLayoutComponent( String formId, DoubleBoxFieldDefinition fieldDefinition ) {
        init( formId, fieldDefinition );
    }

    @Override
    public DoubleBoxLayoutComponent newInstance( String formId, DoubleBoxFieldDefinition fieldDefinition ) {
        return new DoubleBoxLayoutComponent( formId, fieldDefinition );
    }

    @Override
    public String getSupportedFieldDefinition() {
        return DoubleBoxFieldDefinition.class.getName();
    }
}
