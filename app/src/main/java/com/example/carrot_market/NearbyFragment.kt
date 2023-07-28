package com.example.carrot_market

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carrot_market.databinding.FragmentMypageBinding
import com.example.carrot_market.databinding.FragmentNearbyBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NearbyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NearbyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentNearbyBinding? = null //binding? null check해제
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNearbyBinding.inflate(inflater,container,false)
        binding.hidden.visibility = View.GONE
        binding.nearbymovebtn.setOnClickListener {
            if(binding.hidden.visibility==View.GONE){
                binding.hidden.visibility = View.VISIBLE
                binding.nearbymovebtn.setText("이사ㆍ용달")
                //binding.nearbymovebtn.setBackgroundResource(R.drawable.baseline_king_bed_24)
            } else{
                //용달관련 기능실행
            }
        }
        binding.expandlessbtn.setOnClickListener {
            binding.nearbymovebtn.setText("더보기")
            binding.hidden.visibility = View.GONE
            //binding.nearbymovebtn.setBackgroundResource(R.drawable.baseline_expand_circle_down_24)
        }
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NearbyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NearbyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}