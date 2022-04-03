package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class TablayoutPagerActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout_pager_two)

        val tabLayout = findViewById<TabLayout>(R.id.tablayout)
        val viewPager = findViewById<ViewPager2>(R.id.viewpager)

        // 탭 레이아웃에 탭을 추가하는 방법
        tabLayout.addTab(tabLayout.newTab().setText("첫 번째"))
        tabLayout.addTab(tabLayout.newTab().setText("두 번째"))
        tabLayout.addTab(tabLayout.newTab().setText("세 번째"))

        // Pager에 adapter를 장착하는 방법
        viewPager.adapter = FragmentAdapter(this, 3)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}

class FragmentAdapter(
    fragmentActivity: FragmentActivity,
    val tabCount: Int
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return tabCount
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Fragment()
            1 -> return Fragment()
            else -> return Fragment()
        }
    }
}
