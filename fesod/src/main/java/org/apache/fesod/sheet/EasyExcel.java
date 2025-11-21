/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.fesod.sheet;

/**
 * Legacy alias for {@link FesodSheet}.
 *
 * <p><strong>DEPRECATED:</strong> This class has been deprecated as part of the project's transition
 * to the Apache Fesod branding. Users should migrate to {@link FesodSheet} for all new development.
 *
 * <h3>Migration Guide</h3>
 * <p>Replace all occurrences of {@code EasyExcel} with {@code FesodSheet} in your codebase:
 *
 * <table border="1">
 *   <caption>Migration Examples</caption>
 *   <tr>
 *     <th>Old Code (Deprecated)</th>
 *     <th>New Code (Recommended)</th>
 *   </tr>
 *   <tr>
 *     <td>{@code EasyExcel.read(file, DemoData.class, listener)}</td>
 *     <td>{@code FesodSheet.read(file, DemoData.class, listener)}</td>
 *   </tr>
 *   <tr>
 *     <td>{@code EasyExcel.write(file, DemoData.class)}</td>
 *     <td>{@code FesodSheet.write(file, DemoData.class)}</td>
 *   </tr>
 *   <tr>
 *     <td>{@code EasyExcel.readSheet(0)}</td>
 *     <td>{@code FesodSheet.readSheet(0)}</td>
 *   </tr>
 *   <tr>
 *     <td>{@code EasyExcel.writerSheet("Sheet1")}</td>
 *     <td>{@code FesodSheet.writerSheet("Sheet1")}</td>
 *   </tr>
 * </table>
 *
 * <h3>Why Deprecated?</h3>
 * <p>This class was originally named "EasyExcel" but has been superseded by "FesodSheet"
 * to align with Apache Fesod's official branding and naming conventions. The functionality
 * remains identical; only the class name has changed.
 *
 * <h3>Removal Timeline</h3>
 * <p>This class is marked for removal in a future major version. All functionality is
 * available in {@link FesodSheet}.
 *
 * @deprecated Since version 1.0.0. Use {@link FesodSheet} instead.
 *             This class will be removed in a future major release.
 * @see FesodSheet
 */
@Deprecated
public class EasyExcel extends FesodSheet {}
