package com.example.carrot_market

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.carrot_market.databinding.ActivityMainBinding
import com.example.carrot_market.home.HomeFragment
import com.example.carrot_market.mypage.MypageFragment

//당근 마켓 클론 코딩
//더미데이터 이용
private const val TAG_HOME = "home_fragment" //홈
private const val TAG_TOWN = "town_fragment" // 동네 생활
private const val TAG_NEARBY = "nearby_fragment" // 내 근처
private const val TAG_CHAT = "chat_fragment" //채팅
private const val TAG_MYPAGE = "mypage_fragment" //나의 당근
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFragment(TAG_HOME, HomeFragment())

        binding.navigationView.setOnItemSelectedListener{ item ->
            when(item.itemId){
                R.id.homeFragment -> setFragment(TAG_HOME, HomeFragment())
                R.id.townFragment -> setFragment(TAG_TOWN, TownFragment())
                R.id.nearbyFragment -> setFragment(TAG_NEARBY, NearbyFragment())
                R.id.chatFragment -> setFragment(TAG_CHAT, ChatFragment())
                R.id.mypageFragment -> setFragment(TAG_MYPAGE, MypageFragment())
            }
            true
        }

    }

    private fun setFragment(tag: String, fragment : Fragment){
        val manager : FragmentManager = supportFragmentManager
        val fragmentTransaction = manager.beginTransaction()

        if(manager.findFragmentByTag(tag)==null){
            fragmentTransaction.add(R.id.mainFrameLayout,fragment,tag)
        }
        val home = manager.findFragmentByTag(TAG_HOME)
        val town = manager.findFragmentByTag(TAG_TOWN)
        val nearby = manager.findFragmentByTag(TAG_NEARBY)
        val chat = manager.findFragmentByTag(TAG_CHAT)
        val mypage = manager.findFragmentByTag(TAG_MYPAGE)
        if(home != null){
            fragmentTransaction.hide(home)
        }
        if(town != null){
            fragmentTransaction.hide(town)
        }
        if(nearby != null){
            fragmentTransaction.hide(nearby)
        }
        if(chat != null){
            fragmentTransaction.hide(chat)
        }
        if(mypage != null){
            fragmentTransaction.hide(mypage)
        }
        if(tag == TAG_HOME){
            if(home!=null){
                fragmentTransaction.show(home)
            }
        } else if(tag == TAG_TOWN){
            if(town!=null){
                fragmentTransaction.show(town)
            }
        } else if(tag == TAG_NEARBY){
            if(nearby != null){
                fragmentTransaction.show(nearby)
            }
        } else if(tag == TAG_CHAT){
            if(chat != null){
                fragmentTransaction.show(chat)
            }
        } else if(tag == TAG_MYPAGE){
            if(mypage != null){
                fragmentTransaction.show(mypage)
            }
        }
        fragmentTransaction.commitAllowingStateLoss()
    }
}