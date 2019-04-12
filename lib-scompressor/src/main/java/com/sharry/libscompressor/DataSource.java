package com.sharry.libscompressor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * The description of data.
 *
 * @author Sharry <a href="xiaoyu.zhu@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 4/2/2019 11:04 AM
 */
interface DataSource<SourceType> {

    /**
     * Get generic SourceType class.
     *
     * @return a class of generic SourceType type.
     */
    @NonNull
    Class<SourceType> getType();

    /**
     * Get an input source.
     *
     * @return an instance of generic SourceType type(will be null).
     */
    @Nullable
    SourceType getSource();

}
