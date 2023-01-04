package com.artishevsky.android.notes.features.note.presentation.notes

import com.artishevsky.android.notes.features.note.domain.model.Note
import com.artishevsky.android.notes.features.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
