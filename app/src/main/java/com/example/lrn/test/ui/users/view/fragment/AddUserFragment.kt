package com.example.lrn.test.ui.users.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lrn.test.data.model.User
import com.example.lrn.test.data.repository.UserRepository
import com.example.lrn.databinding.FragmentAddUsersBinding
import com.example.lrn.test.ui.users.viewmodel.UsersActivityViewModel


class AddUserFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentAddUsersBinding
    private lateinit var viewModel: UsersActivityViewModel
    private lateinit var db: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentAddUsersBinding.inflate(layoutInflater)
        binding.fragmentOneAddButton.setOnClickListener(this)
        viewModel = UsersActivityViewModel(requireActivity().application)
        db = UserRepository(requireActivity())

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.allUsers.observe(viewLifecycleOwner, androidx.lifecycle.Observer {

            binding.fragmentOneUserCountTextView.text = it.size.toString()

        })

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    companion object {
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.fragmentOneAddButton -> {
                db.insert(
                    User(
                        binding.fragmentOneNameEditText.text.toString(),
                        binding.fragmentOnePlaceEditText.text.toString()
                    )
                )

            }
        }
    }
}

