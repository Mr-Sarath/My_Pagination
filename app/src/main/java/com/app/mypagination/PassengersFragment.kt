package com.app.mypagination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.mypagination.databinding.FragmentPassengersBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class PassengersFragment : Fragment() {

    private lateinit var viewModel: PassengersViewModel
    private var binding:FragmentPassengersBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPassengersBinding.inflate(inflater,container,false)
        return binding?.root
     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val factory = PassengersViewModelFactory(MyApi())
        viewModel = ViewModelProvider(this, factory).get(PassengersViewModel::class.java)

        val passengersAdapter = PassengersAdapter()
        binding?.recyclerView?.layoutManager = LinearLayoutManager(requireContext())
        binding?.recyclerView?.setHasFixedSize(true)

         binding?.recyclerView?.adapter = passengersAdapter.withLoadStateHeaderAndFooter(
            header = PassengersLoadStateAdapter { passengersAdapter.retry() },
            footer = PassengersLoadStateAdapter { passengersAdapter.retry() }
        )

        lifecycleScope.launch {
            viewModel.passengers.collectLatest { pagedData ->
                passengersAdapter.submitData(pagedData)
            }
        }
    }
    }

