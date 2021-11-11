package com.jasonyoo.choco.screen.login

import android.os.Bundle
import android.view.View
import com.jasonyoo.choco.R
import com.jasonyoo.choco.databinding.FragmentLoginBinding
import com.jasonyoo.choco.screen.base.BaseFragment
import com.jasonyoo.choco.util.viewBinding

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    private val binding by viewBinding(FragmentLoginBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            safeNavigate(R.id.to_fragment_main)
        }
    }
}
