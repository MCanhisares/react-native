/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.uimanager

/** Incremental counter for React Root View tag. */
public object ReactRootViewTagGenerator {

  // Keep in sync with ReactIOSTagHandles JS module - see that file for an explanation on why the
  // increment here is 10.
  private const val ROOT_VIEW_TAG_INCREMENT = 10
  private var nextRootViewTag = 1

  @JvmStatic
  @Synchronized
  public fun getNextRootViewTag(): Int =
      nextRootViewTag.also { nextRootViewTag += ROOT_VIEW_TAG_INCREMENT }
}
