package com.artishevsky.android.notes.features.note.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
