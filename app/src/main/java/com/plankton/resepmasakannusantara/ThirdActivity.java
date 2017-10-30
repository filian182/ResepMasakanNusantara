package com.plankton.resepmasakannusantara;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbarThird);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("CatagoryName"));}

        if (mToolbar.getTitle().toString().equalsIgnoreCase("1. Gulai aceh ikan bawal khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh1));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh1);


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("2. Mie Kocok khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh2));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh2);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("3. Roti Jala khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh3));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh3);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("4. Udang asam keueung khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh4));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh4);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("5. Ikan Kayu khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh5));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh5);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("6. Mie Aceh simple khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh6));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh6);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("7. Dep Dep teri belah dan kentang khas aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh7));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh7);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("8. Pepes Ikan Bilis Khas Aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh8));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh8);


        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("9. Ikan Keumamah khas Aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh9));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh9);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("10. Ayam Tangkep khas Aceh")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.aceh10));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.aceh10);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("11. Pempek Adaan khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang1));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang1);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("12. Srikayo khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang2));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang2);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("13. Pindang Ikan khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang3));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang3);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("14. Mie celor khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang4));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang4);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("15. Pindang Seruni khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang5));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang5);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("16. Maksuba khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang6));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang6);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("17. Pempek Asli khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang7));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang7);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("18. Tekwan khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang8));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang8);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("19. Laksan khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang9));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang9);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("20. Burgo khas Palembang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.palembang10));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.palembang10);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("21. Sambal Balado Ikan tempoyak khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang1));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang1);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("22. Ikan Balado Pedas Manis khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang2));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang2);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("23. Ayam Balado Kuah khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang3));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang3);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("24. Dendeng Balado Batokok khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang4));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang4);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("25. Rendang Pedas khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang5));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang5);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("26. Balado Daging Suwir khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang6));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang6);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("27. Balado Cumi Isi khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang7));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang7);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("28. Udang saos khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang8));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang8);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("29. Balado ati ampela khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang9));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang9);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("30. Ikan Kembung Panggang Bumbu khas Padang")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.padang10));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.padang10);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("31. Karedok tanpa kacang khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat1));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat1);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("32. Soto Bandung khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat2));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat2);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("33. Seblak Ceker Sayur Super Pedas khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat3));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat3);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("34. Nasi Liwet khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat4));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat4);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("35. Pindang Ikan khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat5));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat5);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("36. Pepes Tahu Tanpa Daun khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat6));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat6);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("37. Cireng banjur isi ayam khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat7));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat7);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("38. Pepes tahu ikan asin khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat8));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat8);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("39. Pesmol ikan nila khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat9));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat9);

        }else if (mToolbar.getTitle().toString().equalsIgnoreCase("40. Resep Empal Ayam Mentega khas Sunda")) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ThirdActivity.this,R.drawable.jawabarat10));
            mToolbar.setBackgroundColor(ContextCompat.getColor(ThirdActivity.this, R.color.colorAccent));
            textView.setText(R.string.jawabarat10);

        }
    }
}
