package com.example.day1_jatpack;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.example.day1_jatpack.databinding.ActivityMainBinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ObservableField<String> test_Text=new ObservableField<>();
//    ObservableInt observableInt=new ObservableInt();
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding=DataBindingUtil.setContentView(this,R.layout.activity_main);

//        observableInt.set(10);
//        observableInt.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
//            @Override
//            public void onPropertyChanged(Observable sender, int propertyId) {
//
//            }
//        });


//        ArrayList<String> list = new ArrayList<>();
//        list.add("aaa");
//
//        //获得类型
//        Class<? extends ArrayList> clazz = list.getClass();
//        //通过类型拿到方法
//        Method[] methods = clazz.getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            //找到 add 方法
//            if (methods[i].getName().equals("add")){
//                try {
//                    //判断方法参数个数是否为1
//                    if (methods[i].getGenericExceptionTypes().length==1){
//                        //假泛型  编译器编译是进行泛型擦除
//                        methods[i].invoke(list,10);
//                        methods[i].invoke(list,100.0F);
//                        methods[i].invoke(list,1000L);
//                    }
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

    }




}
