/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import junit.framework.TestSuite;

/**
 * All J2ObjC protobuf-lite unit tests to be run on Blaze.
 */
public class BlazeLiteTests extends TestSuite {

  public static TestSuite suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(BlazeOnlyTest.class);
    suite.addTestSuite(ByteStringTest.class);
    suite.addTestSuite(GeneratedExtensionRegistryTest.class);
    suite.addTestSuite(InternalCompatibilityTest.class);
    return suite;
  }
}
