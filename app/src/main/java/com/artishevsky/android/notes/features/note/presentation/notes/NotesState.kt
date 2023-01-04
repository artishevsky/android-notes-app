package com.artishevsky.android.notes.features.note.presentation.notes

import com.artishevsky.android.notes.features.note.domain.model.Note
import com.artishevsky.android.notes.features.note.domain.util.NoteOrder
import com.artishevsky.android.notes.features.note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
