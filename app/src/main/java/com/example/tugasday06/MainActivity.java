package com.example.tugasday06;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KosmetikAdapter kosmetikAdapter;
    private ArrayList<KosmetikModel> kosmetikModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        kosmetikAdapter = new KosmetikAdapter(kosmetikModel, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(kosmetikAdapter);
    }

    private void getData() {
        kosmetikModel = new ArrayList<>();
        kosmetikModel.add(new KosmetikModel("Bedak Maybelline", "Jenis : Matte + Poreless", "Harga : Rp. 86.500,00",getString(R.string.bedak_maybelline),R.drawable.bedak));
        kosmetikModel.add(new KosmetikModel("Lipstik Vinyl Maybelline", "Jenis : Lipmatte", "Harga : 102.450,00",getString(R.string.lipstik_vinyl_maybelline),R.drawable.vinyl));
        kosmetikModel.add(new KosmetikModel("Sunscreen Maybelline", "Jenis : Matte + Poreless", "Harga : 83.000,00",getString(R.string.sunscreen_maybelline),R.drawable.sunscreen));
        kosmetikModel.add(new KosmetikModel("BB Dream Maybelline", "Jenis : Cream", "Harga : 56.000,00",getString(R.string.bb_dream_maybelline),R.drawable.bb_dream));
        kosmetikModel.add(new KosmetikModel("Eyeliner Maybelline","Jenis : INK Pen", "Harga : 38.599,00",getString(R.string.eye_liner_maybelline),R.drawable.eyeliner));
        kosmetikModel.add(new KosmetikModel("Eye Shadow Maybelline", "Jenis : The Burgandary Bar", "Harga : 41.000,00",getString(R.string.eye_shadow_maybelline),R.drawable.eyeshadow));
        kosmetikModel.add(new KosmetikModel("Foundation Maybelline", "Jenis : Cream", "Harga : 68.999,00",getString(R.string.foundation_maybelline),R.drawable.foundation));
        kosmetikModel.add(new KosmetikModel("Highlighter Maybelline", "Jenis : Metalic", "Harga : 35.000,00",getString(R.string.highlighter_maybelline),R.drawable.highlighter));
        kosmetikModel.add(new KosmetikModel("Lifter Gloss Maybelline", "Jenis : Glossy", "Harga : 89.000,00",getString(R.string.lifter_gloss_maybelline),R.drawable.lifter));
        kosmetikModel.add(new KosmetikModel("Liquid Blush Maybelline", "Jenis : Check Heat", "Harga : 55.000,00",getString(R.string.blush_maybelline),R.drawable.liquid_blush));
        kosmetikModel.add(new KosmetikModel("Maskara Maybelline", "Jenis : Surreal", "Harga : 45.000,00",getString(R.string.mascara_maybelline),R.drawable.maskara));
        kosmetikModel.add(new KosmetikModel("Master Blush Maybelline", "Jenis : Color Highlight Kit", "Harga : 50.500,00",getString(R.string.master_maybelline),R.drawable.master_blush));
        kosmetikModel.add(new KosmetikModel("Matte Ink Maybelline", "Jenis : Matte", "Harga : 86.500,00",getString(R.string.matte_ink_maybelline),R.drawable.matte));
        kosmetikModel.add(new KosmetikModel("Pensil Alis Maybelline", "Jenis : Define & Blend", "Harga : 37.000,00",getString(R.string.pensil_alis_maybelline),R.drawable.pensil_alis));
        kosmetikModel.add(new KosmetikModel("Powder Maybelline", "Jenis : Natural Coverage", "Harga : 86.500,00", getString(R.string.powder_maybelline),R.drawable.powder));
    }
}