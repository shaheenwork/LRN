package com.example.lrn.test.ui.users.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lrn.test.data.model.User
import com.example.lrn.databinding.FragmentShowUsersBinding
import com.example.lrn.test.ui.users.view.adapter.UserAdapter
import com.example.lrn.test.ui.users.viewmodel.UsersActivityViewModel


class ShowUsersFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var viewModel: UsersActivityViewModel
    private lateinit var binding: FragmentShowUsersBinding
    private lateinit var adapter: UserAdapter
    private var userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=FragmentShowUsersBinding.inflate(layoutInflater)
       viewModel= UsersActivityViewModel(requireActivity().application)

        adapter = UserAdapter()
        binding.fragmentTwoUsersRecyclerView.adapter = adapter


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.fragmentTwoUsersRecyclerView.layoutManager = LinearLayoutManager(requireActivity())


        viewModel.allUsers.observe(viewLifecycleOwner, Observer {

            if (it.isNotEmpty()){
                adapter.setSource(it)
                adapter.notifyDataSetChanged()
            }

        })


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return binding.root
    }

    companion object {

        /*fun newInstance(param1: String, param2: String) =
            FragmentTwo().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }*/
    }
}