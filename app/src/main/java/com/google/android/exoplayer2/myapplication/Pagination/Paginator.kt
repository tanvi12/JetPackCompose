package com.google.android.exoplayer2.myapplication.Pagination

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}

