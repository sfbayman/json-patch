/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.jsonpatch;

public final class JsonPatchMessages
{
    public static final String NULL_INPUT = "input cannot be null";
    public static final String NO_SUCH_PARENT
        = "parent of node to add does not exist";
    public static final String NOT_AN_INDEX
        = "reference token is not an array index";
    public static final String NO_SUCH_INDEX
        = "no such index in target array";
    public static final String NO_SUCH_PATH
        = "no such path in target JSON document";
    public static final String VALUE_TEST_FAILURE
        = "value differs from expectations";

    private JsonPatchMessages()
    {
    }
}
