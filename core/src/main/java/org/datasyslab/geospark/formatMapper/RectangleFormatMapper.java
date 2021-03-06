/*
 * FILE: RectangleFormatMapper
 * Copyright (c) 2015 - 2018 GeoSpark Development Team
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package org.datasyslab.geospark.formatMapper;

import org.datasyslab.geospark.enums.FileDataSplitter;
import org.datasyslab.geospark.enums.GeometryType;

public class RectangleFormatMapper
        extends FormatMapper
{

    /**
     * Instantiates a new rectangle format mapper.
     *
     * @param Splitter the splitter
     * @param carryInputData the carry input data
     */
    public RectangleFormatMapper(FileDataSplitter Splitter, boolean carryInputData)
    {
        super(0, 3, Splitter, carryInputData, GeometryType.RECTANGLE);
    }

    /**
     * Instantiates a new rectangle format mapper.
     *
     * @param startOffset the start offset
     * @param Splitter the splitter
     * @param carryInputData the carry input data
     */
    public RectangleFormatMapper(Integer startOffset, FileDataSplitter Splitter,
            boolean carryInputData)
    {
        super(startOffset, startOffset+3, Splitter, carryInputData, GeometryType.RECTANGLE);
    }
}
