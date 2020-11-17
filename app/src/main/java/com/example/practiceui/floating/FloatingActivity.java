package com.example.practiceui.floating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.practiceui.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingActivity extends AppCompatActivity {
    private FloatingActionButton btn_floating_add,btn_floating_left,btn_floating_down,btn_floating_right;
    private boolean isRotate = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating);

        Init();
    }
    private void Init(){
        btn_floating_add = (FloatingActionButton)findViewById(R.id.btn_floating_add);
        btn_floating_left = (FloatingActionButton)findViewById(R.id.btn_floating_left);
        btn_floating_down = (FloatingActionButton)findViewById(R.id.btn_floating_down);
        btn_floating_right = (FloatingActionButton)findViewById(R.id.btn_floating_right);

        btn_floating_add.setOnClickListener(onClickListener);
        btn_floating_left.setOnClickListener(onClickListener);
        btn_floating_down.setOnClickListener(onClickListener);
        btn_floating_right.setOnClickListener(onClickListener);

        ViewAnimation.Init(btn_floating_left);
        ViewAnimation.Init(btn_floating_down);
        ViewAnimation.Init(btn_floating_right);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_floating_add:
                    isRotate = ViewAnimation.rotateTab(view,!isRotate);
                    if(isRotate){
                        ViewAnimation.showIn(btn_floating_left);
                        ViewAnimation.showIn(btn_floating_down);
                        ViewAnimation.showIn(btn_floating_right);
                    }else{
                        ViewAnimation.showOut(btn_floating_left);
                        ViewAnimation.showOut(btn_floating_down);
                        ViewAnimation.showOut(btn_floating_right);
                    }
                    break;
                case R.id.btn_floating_left:
                    ViewAnimation.showOut(btn_floating_left);
                    ViewAnimation.showOut(btn_floating_down);
                    ViewAnimation.showOut(btn_floating_right);
                    showToast("left");
                    break;
                case R.id.btn_floating_down:
                    ViewAnimation.showOut(btn_floating_left);
                    ViewAnimation.showOut(btn_floating_down);
                    ViewAnimation.showOut(btn_floating_right);
                    showToast("down");
                    break;
                case R.id.btn_floating_right:
                    ViewAnimation.showOut(btn_floating_left);
                    ViewAnimation.showOut(btn_floating_down);
                    ViewAnimation.showOut(btn_floating_right);
                    showToast("right");
                    break;
                default:
                    break;
            }
        }
    };

    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}