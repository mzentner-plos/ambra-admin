/*
 * $HeadURL$
 * $Id$
 * Copyright (c) 2006-2012 by Public Library of Science http://plos.org http://ambraproject.org
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ambraproject.admin;

import org.ambraproject.BaseTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * Common Base test for admin test classes so that we can specify a new config location for the context.xml
 * @author Alex Kudick  1/11/12
 */
@ContextConfiguration(locations = "adminTestContext.xml")
public class AdminBaseTest extends BaseTest {


}