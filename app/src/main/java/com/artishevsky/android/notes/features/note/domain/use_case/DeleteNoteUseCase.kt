package com.artishevsky.android.notes.features.note.domain.use_case

import com.artishevsky.android.notes.features.note.domain.model.Note
import com.artishevsky.android.notes.features.note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
