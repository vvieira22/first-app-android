package com.example.mainactivity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainactivity.R
import com.example.mainactivity.model.Produto
import com.example.mainactivity.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

//formatar, ctrl + alt + l

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val barraTopo: TextView = findViewById<TextView>(R.id.BarraTopo)
//        barraTopo.text = ("Meu primeiro App.");
//
//        val item1: TextView = findViewById<TextView>(R.id.item1)
//        item1.text = ("Salada de Frutas");
//
//        val item2: TextView = findViewById<TextView>(R.id.item2)
//        item2.text = ("Salada de Legumes");
//
//        val valorItens: TextView = findViewById<TextView>(R.id.valorItens)
//        valorItens.text = ("19,99 R$");
//
//        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recyclerViewFruta)
//        recyclerView.adapter = ListaProdutosAdapter(
//            context = this, produtos = listOf(
//                Produto(
//                    nome = "Melancia",
//                    descricao = "gostosa",
//                    valor = BigDecimal("19.99")
//                ),
//                Produto(
//                    nome = "Limão",
//                    descricao = "vale a pena",
//                    valor = BigDecimal("19.99")
//                ),
//                Produto(
//                    nome = "Beterraba",
//                    descricao = "deliciosa",
//                    valor = BigDecimal("19.99")
//                )
//            )
//        )
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}