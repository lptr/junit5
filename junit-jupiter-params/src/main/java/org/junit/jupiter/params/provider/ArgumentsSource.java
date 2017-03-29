/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.params.provider;

import static org.junit.platform.commons.meta.API.Usage.Experimental;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.platform.commons.meta.API;

/**
 * {@code @ArgumentsSource} is a {@linkplain Repeatable repeatable} annotation
 * that is used to register {@linkplain ArgumentsProvider providers} for the
 * annotated test class or test method.
 *
 * @see org.junit.jupiter.params.provider.ArgumentsProvider
 * @since 5.0
 */
@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(ArgumentsSources.class)
@API(Experimental)
public @interface ArgumentsSource {

	Class<? extends ArgumentsProvider> value();

}
