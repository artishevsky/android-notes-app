package com.artishevsky.android.notes.features.note.domain.use_case

import com.artishevsky.android.notes.features.note.domain.model.InvalidNoteException
import com.artishevsky.android.notes.features.note.domain.model.Note
import com.artishevsky.android.notes.features.note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}
