package com.example.mainactivity.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainactivity.R
import com.example.mainactivity.model.Produto
import org.w3c.dom.Text

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val item1 = itemView.findViewById<TextView>(R.id.item1)
            item1.text = produto.nome

            val descricao = itemView.findViewById<TextView>(R.id.item2)
            descricao.text = produto.descricao

            val valor = itemView.findViewById<TextView>(R.id.valorItens)
            valor.text = produto.valor.toPlainString()
        }
    }

    //pegar a view que vai apresentar e personalizar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    //a posição e o que a gente quer fazer com a informação (text, etc..)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    //quantos itens a gente que apresentar, tem que usar collections
    override fun getItemCount(): Int {
        return produtos.size
    }


}
