package com.example.bbws

import android.app.ProgressDialog
import android.app.VoiceInteractor
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.io.BufferedReader;

class MainActivity : AppCompatActivity() {
    private val data_url =
        "http://189.128.xx.12/Mr_Brohid/getdata.php" // kasih link prosesnya contoh : http://domainname or ip/folderproses/namaproses

    var mRecyclerView: RecyclerView
    var mAdapter: RecyclerView.Adapter<*>
    var mManager: RecyclerView.LayoutManager
    var pd: ProgressDialog
    var mItems: ArrayList<ModelData>

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pd = ProgressDialog(this@MainActivity)
        mRecyclerView = findViewById(R.id.list_data) as RecyclerView
        mItems = ArrayList<ModelData>()
        mManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        mRecyclerView.layoutManager = mManager
        mAdapter = AdapterProcess(this@MainActivity, mItems)
        mRecyclerView.adapter = mAdapter

        loadjson()
    }

    //proses mengambil data
    private fun loadjson() {
        pd.setMessage("Mengambil Data")
        pd.setCancelable(false)
        pd.show()

        val arrayRequest =
            JsonArrayRequest(VoiceInteractor.Request.Method.POST, data_url, null, object : Response.Listener<JSONArray>() {
                fun onResponse(response: JSONArray) {
                    pd.cancel()
                    Log.d("volley", "response : $response")
                    for (i in 0 until response.length()) {
                        try {
                            val data = response.getJSONObject(i)
                            val md = ModelData()
                            md.setNamaData(data.getString("nama_data")) // memanggil nama array yang kita buat
                            mItems.add(md)
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        }

                    }
                    mAdapter.notifyDataSetChanged()
                }
            }, object : Response.ErrorListener() {

                fun onErrorResponse(error: VolleyError) {
                    pd.cancel()
                    Log.d("volley", "error : " + error.getMessage())
                }
            })
        Controller.getInstance().addToRequestQueue(arrayRequest)
    }
}
