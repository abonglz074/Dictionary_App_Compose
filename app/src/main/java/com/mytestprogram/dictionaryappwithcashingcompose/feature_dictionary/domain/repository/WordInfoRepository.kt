package com.mytestprogram.dictionaryappwithcashingcompose.feature_dictionary.domain.repository

import com.mytestprogram.dictionaryappwithcashingcompose.core.util.Resource
import com.mytestprogram.dictionaryappwithcashingcompose.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}