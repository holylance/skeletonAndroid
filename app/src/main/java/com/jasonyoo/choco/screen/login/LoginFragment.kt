package com.jasonyoo.choco.screen.login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jasonyoo.choco.R
import com.jasonyoo.choco.databinding.FragmentLoginBinding
import com.jasonyoo.choco.screen.base.BaseFragment
import com.jasonyoo.choco.util.ViewState
import com.jasonyoo.choco.util.observe
import com.jasonyoo.choco.util.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    private val binding by viewBinding(FragmentLoginBinding::bind)

    override val viewModel by viewModel<LoginViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            viewModel.login("user@choco.com", "chocorian")
        }
    }

    override fun observeViewState() {
        observe(viewModel.viewState) { state ->
            when (state) {
                is ViewState.Success -> navigateToMain()
                is ViewState.Error -> toastError(state.cause.toString())
                else -> toastError("unknown error")
            }
        }
    }

    private fun navigateToMain() {
        safeNavigate(R.id.to_fragment_main)
    }

    private fun toastError(cause: String) {
        Toast.makeText(requireContext(), cause, Toast.LENGTH_SHORT).show()
    }
}
