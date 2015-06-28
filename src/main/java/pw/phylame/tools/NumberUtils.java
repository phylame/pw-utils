/*
 * Copyright 2015 Peng Wan <phylame@163.com>
 *
 * This file is part of Jem utility.
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

package pw.phylame.tools;

import java.util.Random;

/**
 * Utility class for number operations.
 */
public final class NumberUtils {

    private static Random random = null;

    private static Random getRandom() {
        if (random == null) {
            random = new Random(System.currentTimeMillis());
        }
        return random;
    }

    /**
     * Generates a random integer number between {@code bottom} and {@code top}.
     * @param bottom the lower limit
     * @param top the upper limit
     * @return a random number
     */
    public static int randInteger(int bottom, int top) {
        return getRandom().nextInt(top-bottom) + bottom;
    }

    /**
     * Generates a random long number between {@code bottom} and {@code top}.
     * @param bottom the lower limit
     * @param top the upper limit
     * @return a random number
     */
    public static Long randLong(long bottom, long top) {
        return getRandom().nextInt((int) (top-bottom)) + bottom;
    }
}
