package com.example.novitaapldatateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_friends.*

class FriendsFragment : Fragment () {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman=ArrayList()
        listTeman.add(
            MyFriend("Rifki Dhany", "Laki-laki", "RifDhany@gmail.com",
        "082344544111", "Malang")
        )
        listTeman.add(
            MyFriend("Aulia Salsabillah", "Perempuan", "aulia@gmail.com",
                "0812652767322", "Malang")
        )
        listTeman.add(
            MyFriend("Safira Maulina", "Perempuan", "safira@gmail.com",
                "081262546571", "Malang")
        )
        listTeman.add(
            MyFriend("Andy Yahya", "Laki-laki", "andyhyh@gmail.com",
                "081654577887", "Malang")
        )
        listTeman.add(
            MyFriend("Viqri Suryansyah", "Laki-laki", "viqri@gmail.com",
                "081567687888", "Malang")
        )
        listTeman.add(
            MyFriend("Tasya ", "Perempuan", "Tasya@gmail.com",
                "08121356664", "Surabaya")
        )
    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}