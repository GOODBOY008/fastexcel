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
 * Legacy short alias for {@link FesodSheet}.
 *
 * <p><strong>DEPRECATED:</strong> This class has been deprecated as part of the project's evolution
 * from "FastExcel" to "Apache Fesod". Users should migrate to {@link FesodSheet} for all new development.
 *
 * <h3>Migration Guide</h3>
 * <p>Replace all occurrences of {@code FastExcel} with {@code FesodSheet} in your codebase:
 *
 * <table border="1">
 *   <caption>Migration Examples</caption>
 *   <tr>
 *     <th>Old Code (Deprecated)</th>
 *     <th>New Code (Recommended)</th>
 *   </tr>
 *   <tr>
 *     <td>{@code FastExcel.read("data.xlsx", DemoData.class, listener)}</td>
 *     <td>{@code FesodSheet.read("data.xlsx", DemoData.class, listener)}</td>
 *   </tr>
 *   <tr>
 *     <td>{@code FastExcel.write("output.xlsx", DemoData.class)}</td>
 *     <td>{@code FesodSheet.write("output.xlsx", DemoData.class)}</td>
 *   </tr>
 *   <tr>
 *     <td>{@code FastExcel.readSheet(0)}</td>
 *     <td>{@code FesodSheet.readSheet(0)}</td>
 *   </tr>
 *   <tr>
 *     <td>{@code FastExcel.writerSheet("MySheet")}</td>
 *     <td>{@code FesodSheet.writerSheet("MySheet")}</td>
 *   </tr>
 * </table>
 *
 * <h3>Why Deprecated?</h3>
 * <p>This class was originally named "FastExcel" to provide a short, memorable entry point
 * for the library. However, following the project's acceptance into the Apache Software Foundation
 * as Apache Fesod (incubating), it has been superseded by "FesodSheet" to align with the official
 * project branding. The functionality remains identical; only the class name has changed.
 *
 * <h3>Historical Context</h3>
 * <p>The name "FastExcel" emphasized the library's high-performance characteristics and ease of use.
 * The Apache Fesod name (Fast Easy Spreadsheet and Other Documents) retains this heritage while
 * fitting Apache naming conventions.
 *
 * <h3>Relationship with FastExcelFactory</h3>
 * <p>Both {@code FastExcel} and {@link FastExcelFactory} are deprecated aliases pointing to
 * the same underlying implementation. {@code FastExcel} was the short, convenient alias while
 * {@code FastExcelFactory} used the explicit "Factory" suffix.
 *
 * <h3>Removal Timeline</h3>
 * <p>This class is marked for removal in a future major version. All functionality is
 * available in {@link FesodSheet}.
 *
 * @deprecated Since version 1.0.0. Use {@link FesodSheet} instead.
 *             This class will be removed in a future major release.
 * @see FesodSheet
 * @see FastExcelFactory
 */
@Deprecated
public class FastExcel extends FesodSheet {}
