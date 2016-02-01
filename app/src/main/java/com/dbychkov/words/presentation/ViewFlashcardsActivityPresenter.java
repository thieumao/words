package com.dbychkov.words.presentation;

import com.dbychkov.domain.Flashcard;
import com.dbychkov.domain.repository.FlashcardRepository;
import com.dbychkov.words.activity.ViewFlashcardsView;
import com.dbychkov.words.thread.PostExecutionThread;
import com.dbychkov.words.thread.ThreadExecutor;
import com.dbychkov.words.util.SpeechService;

import javax.inject.Inject;
import java.util.List;

/**
 * Presenter
 */
public class ViewFlashcardsActivityPresenter extends FlashcardsActivityPresenter {

    private ViewFlashcardsView viewFlashcardsView;

    @Inject
    public ViewFlashcardsActivityPresenter(ThreadExecutor threadExecutor,
            PostExecutionThread postExecutionThread, FlashcardRepository flashcardRepository,
            SpeechService speechService) {
        super(threadExecutor, postExecutionThread, flashcardRepository, speechService);
    }

    public void setView(ViewFlashcardsView viewFlashcardsView) {
        super.setView(viewFlashcardsView);
        this.viewFlashcardsView = viewFlashcardsView;
    }

    public void showFlashCards(List<Flashcard> flashcards) {
        viewFlashcardsView.renderFlashcards(flashcards);
    }

}