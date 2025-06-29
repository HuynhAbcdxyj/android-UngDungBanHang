package com.campuscoders.posterminalapp.domain.use_case.edit

import com.campuscoders.posterminalapp.domain.repository.locale.EditRepository
import com.campuscoders.posterminalapp.utils.Resource
import javax.inject.Inject

class DeleteCategoryByIdUseCase @Inject constructor(private val repository: EditRepository) {
    suspend fun executeDeleteCategoryById(categoryId: Int): Resource<Boolean> {
        return try {
            val response = repository.deleteCategoryById(categoryId)
            if (response > 0) {
                Resource.Success(true)
            } else {
                Resource.Error(false,"Không xóa được danh mục!")
            }
        } catch (e: Exception) {
            Resource.Error(false,e.localizedMessage?:"Error - (executeDeleteCategoryById)")
        }
    }
}