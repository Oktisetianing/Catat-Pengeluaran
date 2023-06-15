package com.example.catatpengeluaran;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.KontakViewHolder> {
    private final LayoutInflater mInflater;
    private List<ContacModel> contaclist;
    private LayoutInflater layoutInflater;
    private Context context;
    final KontakAdapter.OnItemClickListerner listener;

    public KontakAdapter(LayoutInflater mInflater, List<ContacModel> contaclist, LayoutInflater layoutInflater, Context context, KontakAdapter.OnItemClickListener listener) {
        this.mInflater = mInflater;
        this.contaclist = contaclist;
        this.layoutInflater = layoutInflater;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public KontakAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_contact, null);
        return new KontakAdapter.KontakViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter holder, int position) {
        holder.bindData(contaclist.get(position));

    }

    @Override
    public int getItemCount() {
        return contaclist.size();
    }

    public interface OnItemClickListerner {
    }

    public class KontakViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvNohp, tvStatus;
        ImageView ivAvatar;

        public KontakViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNohp = itemView.findViewById(R.id.tvNohp);
            tvStatus = itemView.findViewById(R.id.tvstatus);
        }

        public void bindData(final ContacModel Item){
            ivAvatar.setColorFilter(Color.parseColor(Item.getColor(), PorterDuff.Mode.SRC_IN);
            tvNama.setText(Item.getNama());
            tvNohp.setText(Item.getHp());
            tvStatus.setText(Item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }
}
