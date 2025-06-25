package com.campuscoders.posterminalapp.domain.use_case.edit

import com.campuscoders.posterminalapp.domain.model.Categories
import com.campuscoders.posterminalapp.domain.repository.locale.EditRepository
import com.campuscoders.posterminalapp.utils.Resource
import javax.inject.Inject

class UpdateCategoryUseCase @Inject constructor(private val repository: EditRepository) {
    suspend fun executeUpdateCategory(categories: Categories): Resource<String> {
        return try {
            val response = repository.updateCategory(categories)
            if (response > 0) Resource.Success("Thể loại đã cập nhật.")
            else Resource.Error(null,"Quá trình cập nhật không thành công.")
        } catch (e: Exception) {
            Resource.Error(null,e.localizedMessage?:"update fail")
        }
    }
}