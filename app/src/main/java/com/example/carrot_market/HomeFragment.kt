package com.example.carrot_market

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrot_market.Adapters.HomeListAdapter
import com.example.carrot_market.data.homelistdata

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    //private lateinit var binding: FragmentHomeBinding 뷰바인딩
    private lateinit var adapter : HomeListAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var homelistArrayList : ArrayList<homelistdata>

    lateinit var homeitemtitle : Array<String>
    lateinit var homeitemtxt : Array<String>
    lateinit var homeitemprice : Array<String>
    lateinit var homelist : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.homelistRecyclerView) //리사이클러뷰 연결
        recyclerView.layoutManager = layoutManager //
        recyclerView.setHasFixedSize(true) //hasfixedsize가 false인경우 전체 레이아웃 재 설정
        //리사이클러뷰의 크기가 고정된다는 것을 알려줌.
        adapter = HomeListAdapter(homelistArrayList)
        recyclerView.adapter = adapter //어댑터 연결
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                HomeFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
    private fun dataInitialize(){
        homelistArrayList = arrayListOf<homelistdata>()
        homeitemtitle = arrayOf(
            "사과 1박스 나눔합니다",
            "기프티콘 팝니다",
            "강아지 간식 팝니다.",
            "고양이 장난감 팔아요"
        )
        homeitemtxt = arrayOf(
            "중계 1동",
            "남양주시 별내동",
            "성북구 석관동",
            "하계2동"
        )
        homeitemprice = arrayOf(
            "나눔",
            "12,000원",
            "5,000원",
            "8,000원"
        )
        for(i in homeitemtitle.indices){
            val homelistitem = homelistdata(homeitemtitle[i],homeitemtxt[i],homeitemprice[i])
            homelistArrayList.add(homelistitem)
        }
    }
}