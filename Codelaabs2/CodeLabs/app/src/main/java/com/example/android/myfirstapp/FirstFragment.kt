package com.example.android.myfirstapp

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.android.myfirstapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {



        _binding = FragmentFirstBinding.inflate(inflater, container, false)


        return binding.root

    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
        //****************************
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            println(" First 1")
            val showCountTextView = view.findViewById<TextView>(R.id.textview_first)
            println(" First 2")
            val currentCount = showCountTextView.text.toString().toInt()
            println(" First 3")
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(currentCount)
            println(" First 4")
            findNavController().navigate(action)
            println(" First 5")
        }




        //****************************
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            val myToast= Toast.makeText(context, "helooo", Toast.LENGTH_SHORT);
            myToast.show();
        }
        //****************************
        view.findViewById<Button>(R.id.button).setOnClickListener {
            val showCountAdd = view.findViewById<TextView>(R.id.textview_first);
            val countString = showCountAdd.text.toString();
            var count = countString.toInt();
            count++;
            showCountAdd.setText(count.toString());
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}

//view.findViewById<Button>(R.id.random_button).setOnClickListener {
//    findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//}
//
//override fun onCreateView(
//    inflater: LayoutInflater, container: ViewGroup?,
//    savedInstanceState: Bundle?
//
//): View? {
//
//    _binding = FragmentFirstBinding.inflate(inflater, container, false)
//    return binding.root
//
//}