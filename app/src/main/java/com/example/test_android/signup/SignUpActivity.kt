package com.example.test_android.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.test_android.R
import com.example.test_android.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        signUpDoneButtonClickListener()
    }

    private fun signUpDoneButtonClickListener() = binding.btnSignUpDone.setOnClickListener {
        with(binding) {
            val id = etId.text.toString()
            val pw = etPw.text.toString()
            if (id == "" || pw == "") {
                Toast.makeText(this@SignUpActivity, "회원정보를 모두 입력해주세요.", Toast.LENGTH_LONG).show()
            } else {
                val checkId = Toast.makeText(this@SignUpActivity, "가입 완료 되었습니다.", Toast.LENGTH_LONG).show()
                //가입 완료 시 로그인 페이지로 이동 구현
                //아이디가 db에 존재할 경우 조건 추가
            }
        }
    }

}