package com.jasonyoo.choco.screen.details

import androidx.appcompat.widget.Toolbar
import com.jasonyoo.choco.R
import com.jasonyoo.choco.databinding.FragmentOrderDetailsBinding
import com.jasonyoo.choco.screen.base.BaseFragment
import com.jasonyoo.choco.util.viewBinding

class OrderDetailsFragment : BaseFragment(R.layout.fragment_order_details) {

    private val binding by viewBinding(FragmentOrderDetailsBinding::bind)
    override fun getFragmentToolbar(): Toolbar = binding.detailsToolbar
}
