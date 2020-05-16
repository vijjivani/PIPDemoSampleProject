package com.cts.pipdemoproject.UserDetails.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.cts.pipdemoproject.R
import com.cts.pipdemoproject.model.Question
import kotlinx.android.synthetic.main.activity_listitem.view.*

class ListAdapter :RecyclerView.Adapter<com.cts.pipdemoproject.UserDetails.view.ListAdapter.QuestionViewHolder>{
    private val context: Context
    private val mQuestions: List<Question>
    private val mRowlayout: Int

    constructor(context: Context, mQuestions: List<Question>, mRowlayout: Int) {
        this.context = context
        this.mQuestions = mQuestions
        this.mRowlayout = mRowlayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.activity_listitem,parent,false)
        return QuestionViewHolder(view)
    }

    override fun getItemCount(): Int {

        return mQuestions.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {

        holder.postionNumber?.text=(position).toString()
        holder.link?.text=mQuestions[position].link
        holder.title?.text=mQuestions[position].title
        holder.containerView.setOnClickListener{
            Toast.makeText(context, "Clicked on: " + holder.title.text, Toast.LENGTH_SHORT).show();
        }
    }

    class QuestionViewHolder(val containerView: View) : RecyclerView.ViewHolder(containerView){
        val postionNumber=containerView.PostionNumber
        val title=containerView.title
        val link=containerView.link

    }
}
