package com.example.aitc_459_project;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Selection1 extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection1);
        //each button from a-z is found by its unique id
        Button LetterA = findViewById(R.id.letter_a);
        Button LetterB = findViewById(R.id.letter_b);
        Button LetterC = findViewById(R.id.letter_c);
        Button LetterE = findViewById(R.id.letter_e);
        Button LetterF = findViewById(R.id.letter_f);
        Button LetterG = findViewById(R.id.letter_g);
        Button LetterH = findViewById(R.id.letter_h);
        Button LetterI = findViewById(R.id.letter_i);
        Button LetterJ = findViewById(R.id.letter_j);
        Button LetterK = findViewById(R.id.letter_k);
        Button LetterL = findViewById(R.id.letter_l);
        Button LetterM = findViewById(R.id.letter_m);
        Button LetterN = findViewById(R.id.letter_n);
        Button LetterO = findViewById(R.id.letter_o);
        Button LetterP = findViewById(R.id.letter_p);
        Button LetterQ = findViewById(R.id.letter_q);
        Button LetterR = findViewById(R.id.letter_r);
        Button LetterS = findViewById(R.id.letter_s);
        Button LetterT = findViewById(R.id.letter_t);
        Button LetterU = findViewById(R.id.letter_u);
        Button LetterV = findViewById(R.id.letter_v);
        Button LetterW = findViewById(R.id.letter_w);
        Button LetterY = findViewById(R.id.letter_y);
        Button LetterZ = findViewById(R.id.letter_z);


        LetterA.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        //when each individual letter gets click, the sound of the letter is activated.
        switch (v.getId()){
            case R.id.letter_a:
                final MediaPlayer letter_aMediaPlayer = MediaPlayer.create(this, R.raw.a);

                final Button playLetterA = (Button) this.findViewById(R.id.letter_a);

                playLetterA.setOnClickListener(view -> letter_aMediaPlayer.start());

            case R.id.letter_b:
                final MediaPlayer letter_bMediaPlayer = MediaPlayer.create(this, R.raw.b);

                final Button playLetterB = (Button) this.findViewById(R.id.letter_b);

                playLetterB.setOnClickListener(view -> letter_bMediaPlayer.start());

            case R.id.letter_c:
                final MediaPlayer letter_cMediaPlayer = MediaPlayer.create(this, R.raw.c);

                final Button playLetterC = (Button) this.findViewById(R.id.letter_c);

                playLetterC.setOnClickListener(view -> letter_cMediaPlayer.start());

            case R.id.letter_d:
                final MediaPlayer letter_dMediaPlayer = MediaPlayer.create(this, R.raw.d);

                final Button playLetterD = (Button) this.findViewById(R.id.letter_d);

                playLetterD.setOnClickListener(view -> letter_dMediaPlayer.start());

            case R.id.letter_e:
                final MediaPlayer letter_eMediaPlayer = MediaPlayer.create(this, R.raw.e);

                final Button playLetterE = (Button) this.findViewById(R.id.letter_e);

                playLetterE.setOnClickListener(view -> letter_eMediaPlayer.start());

            case R.id.letter_f:
                final MediaPlayer letter_fMediaPlayer = MediaPlayer.create(this, R.raw.f);

                final Button playLetterF = (Button) this.findViewById(R.id.letter_f);

                playLetterF.setOnClickListener(view -> letter_fMediaPlayer.start());

            case R.id.letter_g:
                final MediaPlayer letter_gMediaPlayer = MediaPlayer.create(this, R.raw.g);

                final Button playLetterG = (Button) this.findViewById(R.id.letter_g);

                playLetterG.setOnClickListener(view -> letter_gMediaPlayer.start());

            case R.id.letter_h:
                final MediaPlayer letter_hMediaPlayer = MediaPlayer.create(this, R.raw.h);

                final Button playLetterH = (Button) this.findViewById(R.id.letter_h);

                playLetterH.setOnClickListener(view -> letter_hMediaPlayer.start());

            case R.id.letter_i:
                final MediaPlayer letter_iMediaPlayer = MediaPlayer.create(this, R.raw.i);

                final Button playLetterI = (Button) this.findViewById(R.id.letter_i);

                playLetterI.setOnClickListener(view -> letter_iMediaPlayer.start());

            case R.id.letter_j:
                final MediaPlayer letter_jMediaPlayer = MediaPlayer.create(this, R.raw.j);

                final Button playLetterJ = (Button) this.findViewById(R.id.letter_j);

                playLetterJ.setOnClickListener(view -> letter_jMediaPlayer.start());

            case R.id.letter_k:
                final MediaPlayer letter_kMediaPlayer = MediaPlayer.create(this, R.raw.k);

                final Button playLetterK = (Button) this.findViewById(R.id.letter_k);

                playLetterK.setOnClickListener(view -> letter_kMediaPlayer.start());

            case R.id.letter_l:
                final MediaPlayer letter_lMediaPlayer = MediaPlayer.create(this, R.raw.l);

                final Button playLetterL = (Button) this.findViewById(R.id.letter_l);

                playLetterL.setOnClickListener(view -> letter_lMediaPlayer.start());

            case R.id.letter_m:
                final MediaPlayer letter_mMediaPlayer = MediaPlayer.create(this, R.raw.m);

                final Button playLetterM = (Button) this.findViewById(R.id.letter_m);

                playLetterM.setOnClickListener(view -> letter_mMediaPlayer.start());

            case R.id.letter_n:
                final MediaPlayer letter_nMediaPlayer = MediaPlayer.create(this, R.raw.n);

                final Button playLetterN = (Button) this.findViewById(R.id.letter_n);

                playLetterN.setOnClickListener(view -> letter_nMediaPlayer.start());

            case R.id.letter_o:
                final MediaPlayer letter_oMediaPlayer = MediaPlayer.create(this, R.raw.o);

                final Button playLetterO = (Button) this.findViewById(R.id.letter_o);

                playLetterO.setOnClickListener(view -> letter_oMediaPlayer.start());

            case R.id.letter_p:
                final MediaPlayer letter_pMediaPlayer = MediaPlayer.create(this, R.raw.p);

                final Button playLetterP = (Button) this.findViewById(R.id.letter_p);

                playLetterP.setOnClickListener(view -> letter_pMediaPlayer.start());

            case R.id.letter_q:
                final MediaPlayer letter_qMediaPlayer = MediaPlayer.create(this, R.raw.q);

                final Button playLetterQ = (Button) this.findViewById(R.id.letter_q);

                playLetterQ.setOnClickListener(view -> letter_qMediaPlayer.start());

            case R.id.letter_r:
                final MediaPlayer letter_rMediaPlayer = MediaPlayer.create(this, R.raw.r);

                final Button playLetterR = (Button) this.findViewById(R.id.letter_r);

                playLetterR.setOnClickListener(view -> letter_rMediaPlayer.start());

            case R.id.letter_s:
                final MediaPlayer letter_sMediaPlayer = MediaPlayer.create(this, R.raw.s);

                final Button playLetterS = (Button) this.findViewById(R.id.letter_s);

                playLetterS.setOnClickListener(view -> letter_sMediaPlayer.start());

            case R.id.letter_t:
                final MediaPlayer letter_tMediaPlayer = MediaPlayer.create(this, R.raw.t);

                final Button playLetterT = (Button) this.findViewById(R.id.letter_t);

                playLetterT.setOnClickListener(view -> letter_tMediaPlayer.start());

            case R.id.letter_u:
                final MediaPlayer letter_uMediaPlayer = MediaPlayer.create(this, R.raw.u);

                final Button playLetterU = (Button) this.findViewById(R.id.letter_u);

                playLetterU.setOnClickListener(view -> letter_uMediaPlayer.start());

            case R.id.letter_v:
                final MediaPlayer letter_vMediaPlayer = MediaPlayer.create(this, R.raw.v);

                final Button playLetterV = (Button) this.findViewById(R.id.letter_v);

                playLetterV.setOnClickListener(view -> letter_vMediaPlayer.start());

            case R.id.letter_w:
                final MediaPlayer letter_wMediaPlayer = MediaPlayer.create(this, R.raw.w);

                final Button playLetterW = (Button) this.findViewById(R.id.letter_w);

                playLetterW.setOnClickListener(view -> letter_wMediaPlayer.start());

            case R.id.letter_x:
                final MediaPlayer letter_xMediaPlayer = MediaPlayer.create(this, R.raw.x);

                final Button playLetterX = (Button) this.findViewById(R.id.letter_x);

                playLetterX.setOnClickListener(view -> letter_xMediaPlayer.start());

            case R.id.letter_y:
                final MediaPlayer letter_yMediaPlayer = MediaPlayer.create(this, R.raw.y);

                final Button playLetterY = (Button) this.findViewById(R.id.letter_y);

                playLetterY.setOnClickListener(view -> letter_yMediaPlayer.start());

            case R.id.letter_z:
                final MediaPlayer letter_zMediaPlayer = MediaPlayer.create(this, R.raw.z);

                final Button playLetterZ = (Button) this.findViewById(R.id.letter_z);

                playLetterZ.setOnClickListener(view -> letter_zMediaPlayer.start());

        }

    }
}
