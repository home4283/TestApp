package com.a10510323.user.test2;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class fg_bus extends Fragment{
    private Spinner buslist;
    private WebView wb;
    private Button btgo, btback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fg_bus, container, false);
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View v = getView();
        buslist = v.findViewById(R.id.buslist);
        wb = v.findViewById(R.id.wbbus);
        btgo = v.findViewById(R.id.go);
        btback = v.findViewById(R.id.back);

        final ArrayList<String> buslistgo = new ArrayList<>();
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17528&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17530&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16740&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17500&sec=0");
        buslistgo.add("http://www.taiwanbus.tw/DyBus.aspx");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17575&sec=0");
        buslistgo.add("http://ebus.klcba.gov.tw/klebus/dmap/tw/map?rid=5992&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16677&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16678&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16976&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16975&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16676&sec=0");
        buslistgo.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16679&sec=0");

        final ArrayList<String> buslistback = new ArrayList<>();
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17528&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17530&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16740&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17500&sec=1");
        buslistback.add("http://www.taiwanbus.tw/DyBus.aspx");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=17703&sec=0");
        buslistback.add("http://ebus.klcba.gov.tw/klebus/dmap/Tw/Map?rid=5992&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16677&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16678&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16976&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16975&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16676&sec=1");
        buslistback.add("http://routes.5284.com.tw/ntpcebus/Tw/Map?rid=16679&sec=1");

        ArrayAdapter<CharSequence>list = ArrayAdapter.createFromResource(getActivity(),R.array.bus,android.R.layout.simple_spinner_dropdown_item);
        buslist.setAdapter(list);
        buslist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {
                //buslist.getItemIdAtPosition(i);
                wb.loadUrl(buslistgo.get(i));
                WebSettings webSettings = wb.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.setSupportZoom(true);
                webSettings.setBuiltInZoomControls(true);
                wb.setInitialScale(100);
                wb.setWebViewClient(new WebViewClient());
                wb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                wb.setWebChromeClient(new WebChromeClient(){
                    @Override
                    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                        return super.onJsAlert(view, url, message, result);
                    }
                });
                btgo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        wb.loadUrl(buslistgo.get(buslist.getSelectedItemPosition()));
                        WebSettings webSettings = wb.getSettings();
                        webSettings.setJavaScriptEnabled(true);
                        wb.setInitialScale(100);
                        wb.setWebViewClient(new WebViewClient());
                        wb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                        wb.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                                return super.onJsAlert(view, url, message, result);
                            }
                        });
                    }
                });
                //Toast.makeText(getActivity(),buslistback.get(i),Toast.LENGTH_SHORT).show();
                btback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        wb.loadUrl(buslistback.get(buslist.getSelectedItemPosition()));
                        WebSettings webSettings = wb.getSettings();
                        webSettings.setJavaScriptEnabled(true);
                        wb.setInitialScale(100);
                        wb.setWebViewClient(new WebViewClient());
                        wb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                        wb.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                                return super.onJsAlert(view, url, message, result);
                            }
                        });
                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
