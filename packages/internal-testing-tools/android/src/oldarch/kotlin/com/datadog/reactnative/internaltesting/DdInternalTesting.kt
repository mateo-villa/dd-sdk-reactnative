/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache License Version 2.0.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2016-Present Datadog, Inc.
 */

package com.datadog.reactnative.internaltesting

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

/**
 * The entry point to use Datadog's internal testing feature.
 */
class DdInternalTesting(
    reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    private val implementation = DdInternalTestingImplementation()

    override fun getName(): String = DdInternalTestingImplementation.NAME

    /**
     * Enable native testing module.
     */
    @ReactMethod
    fun enable(promise: Promise) {
        implementation.enable(promise)
    }
}
