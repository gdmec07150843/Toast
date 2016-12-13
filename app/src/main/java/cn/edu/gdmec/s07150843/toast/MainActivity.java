package cn.edu.gdmec.s07150843.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"你会了没有啊",Toast.LENGTH_SHORT).show();
    }
    public void b2(View v){

        LayoutInflater lf=getLayoutInflater();

        View vroot=lf.inflate(R.layout.toastroot,null);

        LinearLayout ll= (LinearLayout) vroot.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastroot,ll);
        //创建toast，然后把建立好的适配器加载到toast中
        Toast toast=new Toast(this);
        toast.setView(vroot);
        //toast的show实现显示，但注意的是：一定要获取上下文。例如Toast toast=new Toast(this);
        toast.show();
    }
    public  void b3(View v){
        //直接的显示内容
        Toast toast=Toast.makeText(this,"我是小黄人-图文显示",Toast.LENGTH_LONG);

        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage=new ImageView(this);
        mImage.setImageResource(R.drawable.yellowman);
        View toastView=toast.getView();
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }
}
