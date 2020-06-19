package com.vonage.tutorial.voice

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.vonage.tutorial.R
import com.vonage.tutorial.voice.extension.observe
import com.vonage.tutorial.voice.extension.toast
import kotlinx.android.synthetic.main.fragment_main.*
import kotlin.properties.Delegates

class MainFragment : Fragment(R.layout.fragment_main), BackPressHandler {

    private var dataLoading: Boolean by Delegates.observable(false) { _, _, newValue ->
        callAppButton.isEnabled = !newValue
        callPhoneButton.isEnabled = !newValue
        progressBar.isVisible = newValue
    }

    private val viewModel by viewModels<MainViewModel>()
    private val args: MainFragmentArgs by navArgs()

    private val toastObserver = Observer<String> {
        context?.toast(it)
    }

    private val loadingObserver = Observer<Boolean> {
        dataLoading = it
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ToDo pass user object in the args
        viewModel.onInit(args.userName)

        observe(viewModel.toastLiveData, toastObserver)
        observe(viewModel.loadingLiveData, loadingObserver)

        userNameTextView.text = args.userName

        callAppButton.setOnClickListener {
            viewModel.startInAppCall()
        }

        callPhoneButton.setOnClickListener {
            viewModel.startPhoneCall()
        }
    }

    override fun onBackPressed() {
        viewModel.onBackPressed()
    }
}
