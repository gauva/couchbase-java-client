/**
 * Copyright (C) 2015 Couchbase, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALING
 * IN THE SOFTWARE.
 */
package com.couchbase.client.java.query.dsl.path;

import com.couchbase.client.java.query.dsl.Expression;
import com.couchbase.client.java.query.dsl.element.UnsetElement;

import static com.couchbase.client.java.query.dsl.Expression.x;

public class DefaultInitialUpdateUnsetPath extends DefaultMutateWherePath implements InitialUpdateUnsetPath {

  public DefaultInitialUpdateUnsetPath(AbstractPath parent) {
    super(parent);
  }

  @Override
  public UpdateUnsetPath unset(String path) {
    element(new UnsetElement(UnsetElement.UnsetPosition.INITIAL, x(path), null));
    return new DefaultUpdateUnsetPath(this);
  }

  @Override
  public UpdateUnsetPath unset(String path, Expression updateFor) {
    element(new UnsetElement(UnsetElement.UnsetPosition.INITIAL, x(path), updateFor));
    return new DefaultUpdateUnsetPath(this);
  }

  @Override
  public UpdateUnsetPath unset(Expression path) {
    element(new UnsetElement(UnsetElement.UnsetPosition.INITIAL, path, null));
    return new DefaultUpdateUnsetPath(this);
  }

  @Override
  public UpdateUnsetPath unset(Expression path, Expression updateFor) {
    element(new UnsetElement(UnsetElement.UnsetPosition.INITIAL, path, updateFor));
    return new DefaultUpdateUnsetPath(this);
  }
}
