package com.sharry.lib.scompressor.recycleable;

/**
 * @author Sharry <a href="xiaoyu.zhu@1hai.cn">Contact me.</a>
 * @version 1.0
 * @since 2019-12-18 17:05
 */
public interface ByteArrayPool {

    /**
     * A standard size to use to increase hit rates when the required size isn't defined.
     * Currently 64KB.
     */
    int STANDARD_BUFFER_SIZE_BYTES = 64 * 1024;


    /**
     * Optionally adds the given array of the given type to the pool.
     *
     * <p>Arrays may be ignored, for example if the array is larger than the maximum size of the
     * pool.
     */
    void put(byte[] array);

    /**
     * Returns a non-null array of the given type with a length >= to the given size.
     *
     * <p>If an array of the given size isn't in the pool, a new one will be allocated.
     *
     * <p>This class makes no guarantees about the contents of the returned array.
     */
    byte[] get(int size);

}
