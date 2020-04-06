package com.example.ka_1week

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1: EditText = findViewById(R.id.editname)
        val editText2: EditText = findViewById(R.id.editid)
        val editText3: EditText = findViewById(R.id.editpw)
        val editText4: EditText = findViewById(R.id.editpc)
        val editText5: EditText = findViewById(R.id.editbirth)
        val editText6: EditText = findViewById(R.id.editplace)
        val imageButton: ImageButton = findViewById(R.id.imagefinish) // 가입완료버튼

        imageButton.setOnClickListener{
            // 분양추천창으로 넘어가도록

            // 조건1) editText가 빈칸일 경우 toast 띄우기
            if(editText1.text.toString() == "" || editText2.text.toString() == "" || editText3.text.toString() == "" ||
                editText4.text.toString() == "" || editText5.text.toString() == ""|| editText6.text.toString() == "") {
                Toast.makeText(this, "회원정보를 모두 채워주세요.", Toast.LENGTH_SHORT).show()
                Log.d("with nhj", "sign in activity is created")
            }
            // 조건2) 비밀번호와 비밀번호 확인이 같지않으면 toast 띄우기
            else if(editText3.text.toString() != editText4.text.toString()){
                Toast.makeText(this, "비밀번호 확인이 틀립니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this@MainActivity, PuppyInfoActivity::class.java)
                startActivity(intent)
            }

        }

        /*
        editText5.setOnClickListener{
            var calendar = Calendar.getInstance()
            var year = calendar.get(Calendar.YEAR)
            var month = calendar.get(Calendar.MONTH)
            var day = calendar.get(Calendar.DAY_OF_MONTH)

            var data_listener = object : DatePickerDialog.OnDateSetListener{
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                    var y= year.toString()
                    editText5.setText("${year}/${month+1}/${dayOfMonth}") // .text로는 왜 안되지?
                }
            }

            var builder = DatePickerDialog(this, data_listener, year, month, day)
            builder.show()
        }
        */
/*
        // 생년월일 숫자만 받도록 함.
        // 생년월일 xxxx/yy/zz 로 끊어서나오도록.
        editText5.addTextChangedListener(object : TextWatcher {
            private var _beforeLenght: Int = 0;
            private var _afterLenght: Int = 0;

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { // 입력하기전
                _beforeLenght = s.length;
            }
            override fun onTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { // 타이핑되는 텍스트에 변화있으면 작동
                _afterLenght = s.length;

                // 삭제 중
                if (_beforeLenght > _afterLenght) {
                    // 삭제 중에 마지막에 -는 자동으로 지우기
                    if (s.toString().endsWith("-")) {
                        edtInput.setText(s.toString().substring(0, s.length() - 1));
                    }
                }
                // 입력 중
                else if (_beforeLenght < _afterLenght) {
                    if (_afterLenght == 5 && s.toString().indexOf("-") < 0) {
                        edtInput.setText(s.toString().subSequence(0, 4) + "-" + s.toString().substring(4, s.length()));
                    } else if (_afterLenght == 10) {
                        edtInput.setText(s.toString().subSequence(0, 9) + "-" + s.toString().substring(9, s.length()));
                    } else if (_afterLenght == 15) {
                        edtInput.setText(s.toString().subSequence(0, 14) + "-" + s.toString().substring(14, s.length()));
                    }
                }

            }
            override fun afterTextChanged(s: Editable?) { // 입력 끝날때 작동

            }
        })
*/

    }
}
