package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class AsyncActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        val backgroundTask = BackgroundAsyncTask(
            findViewById(R.id.progressBar),
            findViewById(R.id.progressBarText)
        )

        (findViewById<TextView>(R.id.start)).setOnClickListener {
            backgroundTask.execute()
        }

        (findViewById<TextView>(R.id.stop)).setOnClickListener {
            backgroundTask.cancel(true)
        }

        (findViewById<TextView>(R.id.shot)).setOnClickListener {
            Log.d("testt", "SHOT!!!!")
        }
    }
}

class BackgroundAsyncTask(
    val progressbar: ProgressBar,
    val progressText: TextView
) : AsyncTask<Int, Int, Int>() {
    // 코루틴 -> 멀티 태스킹, 비동기 및 동기 관련 프로그램
    // Params -> doinbackground에서 사용할 타입
    // Progress -> onProgressUpdate에서 사용할 타입
    // Result -> onPostExcute에서 사용할 타입


    var percent: Int = 0

    // 영상 다운로드 등 백그라운드에서 해야하는 코드
    override fun doInBackground(vararg params: Int?): Int {
        while (isCancelled() == false) {
            percent++
            if (percent > 100) break
            else {
                publishProgress(percent)
            }
            Thread.sleep(100)

        }
        return percent
    }

    // BackgroundAsyncTask를 실행하기 전
    override fun onPreExecute() {
        percent = 0
        progressbar.setProgress(percent)
    }

    // BackgroundAsyncTask를 실행한 후
    override fun onPostExecute(result: Int?) {
        progressText.text = "작업이 완료되었습니다"
    }

    // 진행 중에 업데이트 해야할 코드
    override fun onProgressUpdate(vararg values: Int?) {
        progressbar.setProgress(values[0] ?: 0)
        progressText.text = "퍼센트 : " + values[0]
    }

    // BackgroundAsyncTask가 멈췄을 때
    override fun onCancelled() {
        progressbar.setProgress(0)
        progressText.text = "작업이 취소되었습니다"
    }
}