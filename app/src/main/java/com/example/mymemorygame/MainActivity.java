package com.example.mymemorygame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView image_1_1, image_1_2, image_1_3, image_1_4, image_2_1, image_2_2, image_2_3, image_2_4, image_3_1, image_3_2, image_3_3, image_3_4;

    Integer[] cardsArr = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;

    int clickFirst, clickSecond;

    int cardNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_1_1 = (ImageView) findViewById(R.id.image_1_1);
        image_1_2 = (ImageView) findViewById(R.id.image_1_2);
        image_1_3 = (ImageView) findViewById(R.id.image_1_3);
        image_1_4 = (ImageView) findViewById(R.id.image_1_4);
        image_2_1 = (ImageView) findViewById(R.id.image_2_1);
        image_2_2 = (ImageView) findViewById(R.id.image_2_2);
        image_2_3 = (ImageView) findViewById(R.id.image_2_3);
        image_2_4 = (ImageView) findViewById(R.id.image_2_4);
        image_3_1 = (ImageView) findViewById(R.id.image_3_1);
        image_3_2 = (ImageView) findViewById(R.id.image_3_2);
        image_3_3 = (ImageView) findViewById(R.id.image_3_3);
        image_3_4 = (ImageView) findViewById(R.id.image_3_4);

        image_1_1.setTag("0");
        image_1_2.setTag("1");
        image_1_3.setTag("2");
        image_1_4.setTag("3");
        image_2_1.setTag("4");
        image_2_2.setTag("5");
        image_2_3.setTag("6");
        image_2_4.setTag("7");
        image_3_1.setTag("8");
        image_3_2.setTag("9");
        image_3_3.setTag("10");
        image_3_4.setTag("11");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArr));

        image_1_1.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_1_1, card);
        });

        image_1_2.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_1_2, card);
        });

        image_1_3.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_1_3, card);
        });

        image_1_4.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_1_4, card);
        });

        image_2_1.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_2_1, card);
        });

        image_2_2.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_2_2, card);
        });

        image_2_3.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_2_3, card);
        });

        image_2_4.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_2_4, card);
        });

        image_3_1.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_3_1, card);
        });

        image_3_2.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_3_2, card);
        });

        image_3_3.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_3_3, card);
        });

        image_3_4.setOnClickListener(v -> {
            int card = Integer.parseInt((String) v.getTag());
            imageMatcher(image_3_4, card);
        });
    }

    private void imageMatcher(ImageView iv, int card) {
        if (cardsArr[card] == 101) {
            iv.setImageResource(image101);
        } else if (cardsArr[card] == 102) {
            iv.setImageResource(image102);
        } else if (cardsArr[card] == 103) {
            iv.setImageResource(image103);
        } else if (cardsArr[card] == 104) {
            iv.setImageResource(image104);
        } else if (cardsArr[card] == 105) {
            iv.setImageResource(image105);
        } else if (cardsArr[card] == 106) {
            iv.setImageResource(image106);
        } else if (cardsArr[card] == 201) {
            iv.setImageResource(image201);
        } else if (cardsArr[card] == 202) {
            iv.setImageResource(image202);
        } else if (cardsArr[card] == 203) {
            iv.setImageResource(image203);
        } else if (cardsArr[card] == 204) {
            iv.setImageResource(image204);
        } else if (cardsArr[card] == 205) {
            iv.setImageResource(image205);
        } else if (cardsArr[card] == 206) {
            iv.setImageResource(image206);
        }

        if (cardNum == 1) {
            firstCard = cardsArr[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNum = 2;
            clickFirst = card;

            iv.setEnabled(false);
        } else if (cardNum == 2) {
            secondCard = cardsArr[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNum = 1;
            clickSecond = card;

            image_1_1.setEnabled(false);
            image_1_2.setEnabled(false);
            image_1_3.setEnabled(false);
            image_1_4.setEnabled(false);
            image_2_1.setEnabled(false);
            image_2_2.setEnabled(false);
            image_2_3.setEnabled(false);
            image_2_4.setEnabled(false);
            image_3_1.setEnabled(false);
            image_3_2.setEnabled(false);
            image_3_3.setEnabled(false);
            image_3_4.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(this::calculate, 1000);
        }
    }

    private void calculate() {
        if (firstCard == secondCard) {
            if (clickFirst == 0) {
                image_1_1.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 1) {
                image_1_2.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 2) {
                image_1_3.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 3) {
                image_1_4.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 4) {
                image_2_1.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 5) {
                image_2_2.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 6) {
                image_2_3.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 7) {
                image_2_4.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 8) {
                image_3_1.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 9) {
                image_3_2.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 10) {
                image_3_3.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 11) {
                image_3_4.setVisibility(View.INVISIBLE);
            }

            if (clickSecond == 0) {
                image_1_1.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 1) {
                image_1_2.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 2) {
                image_1_3.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 3) {
                image_1_4.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 4) {
                image_2_1.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 5) {
                image_2_2.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 6) {
                image_2_3.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 7) {
                image_2_4.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 8) {
                image_3_1.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 9) {
                image_3_2.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 10) {
                image_3_3.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 11) {
                image_3_4.setVisibility(View.INVISIBLE);
            }
        } else {
            image_1_1.setImageResource(R.drawable.ic_baseline_memory_24);
            image_1_2.setImageResource(R.drawable.ic_baseline_memory_24);
            image_1_3.setImageResource(R.drawable.ic_baseline_memory_24);
            image_1_4.setImageResource(R.drawable.ic_baseline_memory_24);
            image_2_1.setImageResource(R.drawable.ic_baseline_memory_24);
            image_2_2.setImageResource(R.drawable.ic_baseline_memory_24);
            image_2_3.setImageResource(R.drawable.ic_baseline_memory_24);
            image_2_4.setImageResource(R.drawable.ic_baseline_memory_24);
            image_3_1.setImageResource(R.drawable.ic_baseline_memory_24);
            image_3_2.setImageResource(R.drawable.ic_baseline_memory_24);
            image_3_3.setImageResource(R.drawable.ic_baseline_memory_24);
            image_3_4.setImageResource(R.drawable.ic_baseline_memory_24);
        }

        image_1_1.setEnabled(true);
        image_1_2.setEnabled(true);
        image_1_3.setEnabled(true);
        image_1_4.setEnabled(true);
        image_2_1.setEnabled(true);
        image_2_2.setEnabled(true);
        image_2_3.setEnabled(true);
        image_2_4.setEnabled(true);
        image_3_1.setEnabled(true);
        image_3_2.setEnabled(true);
        image_3_3.setEnabled(true);
        image_3_4.setEnabled(true);

        checkEnd();
    }

    private void checkEnd() {
        if (image_1_1.getVisibility() == View.INVISIBLE &&
                image_1_2.getVisibility() == View.INVISIBLE &&
                image_1_3.getVisibility() == View.INVISIBLE &&
                image_1_4.getVisibility() == View.INVISIBLE &&
                image_2_1.getVisibility() == View.INVISIBLE &&
                image_2_2.getVisibility() == View.INVISIBLE &&
                image_2_3.getVisibility() == View.INVISIBLE &&
                image_2_4.getVisibility() == View.INVISIBLE &&
                image_3_1.getVisibility() == View.INVISIBLE &&
                image_3_2.getVisibility() == View.INVISIBLE &&
                image_3_3.getVisibility() == View.INVISIBLE &&
                image_3_4.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\n" + "YOu WIN!")
                    .setCancelable(false)
                    .setPositiveButton("NEW", (dialog, which) -> {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    })
                    .setNegativeButton("EXIT", (dialog, which) -> finish());

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources() {
        image101 = R.drawable.ic_afraid_1;
        image102 = R.drawable.ic_full_1;
        image103 = R.drawable.ic_hug_1;
        image104 = R.drawable.ic_peep_1;
        image105 = R.drawable.ic_snore_1;
        image106 = R.drawable.ic_tired_1;
        image201 = R.drawable.ic_afraid_2;
        image202 = R.drawable.ic_full_2;
        image203 = R.drawable.ic_hug_2;
        image204 = R.drawable.ic_peep_2;
        image205 = R.drawable.ic_snore_2;
        image206 = R.drawable.ic_tired_2;
    }
}