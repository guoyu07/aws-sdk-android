/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AnonymousAWSCredentials;

import org.junit.Test;

public class AmazonWebServiceRequestTest {

    @Test
    public void testSetCredentials() {
        AmazonWebServiceRequest awsr = new TestRequest();
        AWSCredentials creds = new AnonymousAWSCredentials();
        awsr.setRequestCredentials(creds);
        assertSame(awsr.getRequestCredentials(), creds);

    }

    @Test
    public void testGetRequestClientOptions() {
        AmazonWebServiceRequest awsr = new TestRequest();
        assertNotNull(awsr.getRequestClientOptions());
    }

    private class TestRequest extends AmazonWebServiceRequest {
    }
}
