package com.campuscoders.posterminalapp.presentation.password

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.campuscoders.posterminalapp.domain.use_case.password.UpdateMainUserPasswordUseCase
import com.campuscoders.posterminalapp.domain.use_case.password.UpdateTerminalUserPasswordUseCase
import com.campuscoders.posterminalapp.utils.Constants
import com.campuscoders.posterminalapp.utils.Constants.VKN_TCKN
import com.campuscoders.posterminalapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResetPasswordViewModel @Inject constructor(
    private val updateMainUserPasswordUseCase: UpdateMainUserPasswordUseCase,
    private val updateTerminalUserPasswordUseCase: UpdateTerminalUserPasswordUseCase
) : ViewModel(){

    private var _statusIsUpdated = MutableLiveData<Resource<Boolean>>()
    val statusIsUpdated: LiveData<Resource<sẻ
            val responseFromMainUserPasswordUseCase = updateMainUserPasswordUseCase.executeUpdateMainUserPassword(VKN_TCKN,newPassword)
            when(responseFromMainUserPasswordUseCase) {
                is Resource.Success -> {
                    val responseFromTerminalUserPasswordUseCase = updateTerminalUserPasswordUseCase.executeUpdateTerminalUserPassword(VKN_TCKN,newPassword)
                    when(responseFromTerminalUserPasswordUseCase) {
                        is Resource.Success -> {
                            _statusIsUpdated.value = Resource.Success(true)
                        }
                        is Resource.Loading -> {
                            _statusIsUpdated.value = Resource.Loading(null)
                        }
                        is Resource.Error -> {
                            _statusIsUpdated.value = Resource.Error(false,responseFromMainUserPasswordUseCase.message?:"Update failedd")
                        }
                    }
                    //_statusIsUpdated.value = Resource.Success(true)
                }
                is Resource.Loading -> {
                    _statusIsUpdated.value = Resource.Loading(null)
                }
                is Resource.Error -> {
                    _statusIsUpdated.value = Resource.Error(false,responseFromMainUserPasswordUseCase.message?:"Update failedd")
                }
            }
        }
    }
}
