// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.csd.descriptors;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.CaseFormat;

public enum CsdLoggingType {
  /**
   * CM auto-generates the following ParamSpecs for a role that uses this method:
   * <ol>
   * <li>Log Threshold
   * <li>Max file size
   * <li>Max backup index size
   * <li>Log4j safety valve
   * </ol>
   * <p>
   * It also creates a ConfigFileGenerator for log4j.properties file for the role.
   */
  LOG4J,
  /** CM doesn't do anything automatically for this logging type. */
  OTHER;

  @JsonValue
  public String toJson() {
    return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name());
  }
}
