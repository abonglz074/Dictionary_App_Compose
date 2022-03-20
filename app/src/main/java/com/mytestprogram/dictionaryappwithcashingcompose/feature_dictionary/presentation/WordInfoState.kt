package com.mytestprogram.dictionaryappwithcashingcompose.feature_dictionary.presentation

import com.mytestprogram.dictionaryappwithcashingcompose.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
