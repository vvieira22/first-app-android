package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class CadastroProdutoActivity :
    AppCompatActivity(R.layout.activity_cadastro_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoCadastro = findViewById<Button>(R.id.botaoCadastrar)
                botaoCadastro.setOnClickListener {
                    val nome = findViewById<EditText>(R.id.nomeProduto)
                    val valorNome = nome.text.toString()

                    val preco = findViewById<EditText>(R.id.precoCadastrado)
                    val valorPreco = preco.text.toString()

                    val descricao = findViewById<EditText>(R.id.descricaoProduto)
                    val valorDescricao = descricao.text.toString()

                    Log.i("janelaCadastro:", "Nome:$valorNome")
                    Log.i("janelaCadastro:", "Preço:$valorPreco")
                    Log.i("janelaCadastro:", "Descricao:$valorDescricao")
                }
    }
}