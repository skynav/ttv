/*
 * Copyright 2014 Skynav, Inc. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
package com.skynav.ttv.util;

import java.util.Map;
import java.util.Set;

import com.skynav.ttv.util.NullReporter;
import com.skynav.ttv.util.TextReporter;
import com.skynav.ttv.util.XMLReporter;

public class Reporters {

    public static Reporter getDefaultReporter() {
        return TextReporter.REPORTER;
    }

    public static String getDefaultReporterName() {
        return getDefaultReporter().getName();
    }

    private static Map<String,Reporter> reporterMap;

    static {
        reporterMap = new java.util.TreeMap<String,Reporter>();
        reporterMap.put(NullReporter.REPORTER.getName(), NullReporter.REPORTER);
        reporterMap.put(TextReporter.REPORTER.getName(), TextReporter.REPORTER);
        reporterMap.put(XMLReporter.REPORTER.getName(), XMLReporter.REPORTER);
    }

    public static Set<String> getReporterNames() {
        return reporterMap.keySet();
    }

    public static String getReporterNamesJoined() {
        StringBuffer sb = new StringBuffer();
        for (String name : getReporterNames()) {
            if (sb.length() > 0)
                sb.append('|');
            sb.append(name);
        }
        return sb.toString();
    }

    public static Reporter getReporter(String name) {
        return reporterMap.get(name);
    }

}
