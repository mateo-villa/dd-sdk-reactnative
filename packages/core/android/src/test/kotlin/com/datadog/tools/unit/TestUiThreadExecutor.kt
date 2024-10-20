/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache License Version 2.0.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2016-Present Datadog, Inc.
 */

package com.datadog.tools.unit

import com.datadog.reactnative.UiThreadExecutor

internal class TestUiThreadExecutor : UiThreadExecutor {
    override fun runOnUiThread(runnable: Runnable) {
        // Run immediately in the same thread for tests
        runnable.run()
    }
}
