package org.pojomatic.internal;

import java.lang.reflect.Field;

public class PropertyField extends AbstractPropertyElement<Field> {
  public PropertyField(Field propertyField, String name) {
    super(propertyField, name.length() == 0 ? propertyField.getName() : name);
  }

  @Override
  public String getElementName() {
    return element.getName();
  }

  @Override
  public String getType() {
    return "field";
  }

  @Override
  public Class<?> getPropertyType() {
    return element.getType();
  }
}
