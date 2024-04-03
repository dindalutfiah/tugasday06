package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;

public class DetailKosmetik extends AppCompatActivity implements View.OnClickListener {

    private String nama, jenis, harga, deskripsi;
    private int gambar;
    private ImageView imgDetail;
    private TextView txtDetailNama, txtDetailJenis, txtDetailHarga, txtDetailDeskripsi;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kosmetik);

        imgDetail = findViewById(R.id.imgDetail);
        txtDetailNama = findViewById(R.id.txtDetailNama);
        txtDetailJenis = findViewById(R.id.txtDetailJenis);
        txtDetailHarga = findViewById(R.id.txtDetailHarga);
        txtDetailDeskripsi = findViewById(R.id.txtDetailDeskripsi);
        btnShare = findViewById(R.id.btnShare);

        nama = getIntent().getStringExtra("Nama");
        jenis = getIntent().getStringExtra("Jenis");
        harga = getIntent().getStringExtra("Harga");
        deskripsi = getIntent().getStringExtra("Deskripsi");
        gambar = getIntent().getIntExtra("Gambar", 0);

        txtDetailNama.setText(nama);
        txtDetailJenis.setText(jenis);
        txtDetailHarga.setText(harga);
        txtDetailDeskripsi.setText(deskripsi);
        imgDetail.setImageResource(gambar);
        btnShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnShare) {
            shareImageAndText();
        }
    }

    private void shareImageAndText() {
        Bitmap bitmap = ((BitmapDrawable) imgDetail.getDrawable()).getBitmap();
        String text = txtDetailNama.getText().toString() + "\n" +
                txtDetailJenis.getText().toString() + "\n" +
                txtDetailHarga.getText().toString() + "\n" +
                txtDetailDeskripsi.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");

        Uri uri = getImageUri(this, bitmap);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.putExtra(Intent.EXTRA_TEXT, text);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "Share melalui"));
        } else {
            Toast.makeText(this, "Tidak ada aplikasi yang dapat menangani intent ini", Toast.LENGTH_SHORT).show();
        }
    }

    private Uri getImageUri(Context context, Bitmap bitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", null);
        return Uri.parse(path);
    }
}
