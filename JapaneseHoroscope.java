package com.theatomicpineapple.japanesehoroscope;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ChineseHoroscope extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        // Set the layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_horoscope);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        // Get user's input
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String months = extras.getString(MainActivity.MONTH);
        String days = extras.getString(MainActivity.DATE);
        String years = extras.getString(MainActivity.YEAR);
        
        // Initiate vars
        String zodiacNm = "NOT VALID";
        String zodiacLuck = "NOT VALID";
        String zodiacStngandWeak = "NOT VALID";
        String era = "NOT VALID";
        String eraYear = "NOT VALID";
        String zodiac = "NOT VALID";
        int day = 0;
        int month = 0;
        years = years.replace(" ", "");
        int year = Integer.parseInt(years.replace("年", ""));
        
        // Determine what day person was born on
        if (days.equals("一日")){
            day = 1;
        }if (days.equals("二日")){
            day = 2;
        }if (days.equals("三日")){
            day = 3;
        }if (days.equals("四日")){
            day = 4;
        }if (days.equals("五日")){
            day = 5;
        }if (days.equals("六日")){
            day = 6;
        }if (days.equals("七日")){
            day = 7;
        }if (days.equals("八日")){
            day = 8;
        }if (days.equals("九日")){
            day = 9;
        }if (days.equals("十日")){
            day = 10;
        }if (days.equals("十一日")){
            day = 11;
        }if (days.equals("十二日")){
            day = 12;
        }if (days.equals("十三日")){
            day = 13;
        }if (days.equals("十四日")){
            day = 14;
        }if (days.equals("十五日")){
            day = 15;
        }if (days.equals("十六日")){
            day = 16;
        }if (days.equals("十七日")){
            day = 17;
        }if (days.equals("十八日")){
            day = 18;
        }if (days.equals("十九日")){
            day = 19;
        }if (days.equals("二十日")){
            day = 20;
        }if (days.equals("二十一日")){
            day = 21;
        }if (days.equals("二十二日")){
            day = 22;
        }if (days.equals("二十三日")){
            day = 23;
        }if (days.equals("二十四日")){
            day = 24;
        }if (days.equals("二十五日")){
            day = 25;
        }if (days.equals("二十六日")){
            day = 26;
        }if (days.equals("二十七日")){
            day = 27;
        }if (days.equals("二十八日")){
            day = 28;
        }if (days.equals("二十九日")){
            day = 29;
        }if (days.equals("三十日")){
            day = 30;
        }if (days.equals("三十一日")) {
            day = 31;
        }

        // Determine what month the person was born in
        if (months.equals("一月")){
            month = 1;
        }if (months.equals("二月")){
            month = 2;
        }if (months.equals("三月")){
            month = 3;
        }if (months.equals("四月")){
            month = 4;
        }if (months.equals("五月")){
            month = 5;
        }if (months.equals("六月")){
            month = 6;
        }if (months.equals("七月")){
            month = 7;
        }if (months.equals("八月")){
            month = 8;
        }if (months.equals("九月")){
            month = 9;
        }if (months.equals("十月")){
            month = 10;
        }if (months.equals("十一月")){
            month = 11;
        }if (months.equals("十二月")){
            month = 12;
        }
        
        // Determine relevant zodiac based on Japanese imperial calendar
        // INSANELY LONG IF STAEMENT CHAIN because of difficulty converting from Gregorian to imperial calendar
        // (Also, I did this when I was very early on in my "coding career")
        
        // Check if zodiac is rat/mouse
        if ((year == 1912 && month > 2) || (year == 1912 && month == 2 && day >= 18)){
            zodiac = "鼠";
        }if ((year == 1913 && month < 2) || (year == 1913 && month == 2 && day < 5)){
            zodiac = "鼠";
        }if ((year == 1924 && month > 2) || (year == 1924 && month == 2 && day >= 5)){
            zodiac = "鼠";
        }if ((year == 1925 && month < 1) || (year == 1925 && month == 1 && day < 23)){
            zodiac = "鼠";
        }if ((year == 1936 && month > 1) || (year == 1936 && month == 1 && day >= 24)){
            zodiac = "鼠";
        }if ((year == 1937 && month < 2) || (year == 1937 && month == 2 && day < 10)){
            zodiac = "鼠";
        }if ((year == 1948 && month > 2) || (year == 1948 && month == 2 && day >= 10)){
            zodiac = "鼠";
        }if ((year == 1949 && month < 1) || (year == 1949 && month == 1 && day < 28)){
            zodiac = "鼠";
        }if ((year == 1960 && month > 1) || (year == 1960 && month == 1 && day >= 28)){
            zodiac = "鼠";
        }if ((year == 1961 && month < 2) || (year == 1961 && month == 2 && day < 14)){
            zodiac = "鼠";
        }if ((year == 1972 && month > 2) || (year == 1972 && month == 2 && day >= 15)){
            zodiac = "鼠";
        }if ((year == 1973 && month < 2) || (year == 1973 && month == 2 && day < 2)){
            zodiac = "鼠";
        }if ((year == 1984 && month > 2) || (year == 1984 && month == 2 && day >= 2)){
            zodiac = "鼠";
        }if ((year == 1985 && month < 2) || (year == 1985 && month == 2 && day < 19)){
            zodiac = "鼠";
        }if ((year == 1996 && month > 2) || (year == 1996 && month == 2 && day >= 19)){
            zodiac = "鼠";
        }if ((year == 1997 && month < 2) || (year == 1997 && month == 2 && day < 6)){
            zodiac = "鼠";
        }if ((year == 2008 && month > 2) || (year == 2008 && month == 2 && day >= 6)){
            zodiac = "鼠";
        }if ((year == 2009 && month < 1) || (year == 2009 && month == 1 && day < 25)){
            zodiac = "鼠";
        }if ((year == 2020 && month > 1) || (year == 2020 && month == 1 && day >= 25)){
            zodiac = "鼠";
        }if ((year == 2021 && month < 2) || (year == 2021 && month == 2 && day < 11)){
            zodiac = "鼠";
        }if ((year == 2032 && month > 2) || (year == 2032 && month == 2 && day >= 11)){
            zodiac = "鼠";
        }if ((year == 2033 && month < 1) || (year == 2033 && month == 1 && day < 30)){
            zodiac = "鼠";
        }if ((year == 2044 && month > 1) || (year == 2044 && month == 1 && day >= 30)){
            zodiac = "鼠";
        }if ((year == 2045 && month < 2) || (year == 2045 && month == 2 && day < 16)){
            zodiac = "鼠";
        }
        
        // Check if zodiac is bull
        if ((year == 1913 && month > 2) || (year == 1913 && month == 2 && day >= 6)){
            zodiac = "雄牛";
        }if ((year == 1914 && month < 1) || (year == 1914 && month == 1 && day < 25)){
            zodiac = "雄牛";
        }if ((year == 1925 && month > 1) || (year == 1925 && month == 1 && day >= 24)){
            zodiac = "雄牛";
        }if ((year == 1926 && month < 2) || (year == 1926 && month == 2 && day < 12)){
            zodiac = "雄牛";
        }if ((year == 1937 && month > 2) || (year == 1937 && month == 2 && day >= 11)){
            zodiac = "雄牛";
        }if ((year == 1938 && month < 1) || (year == 1938 && month == 1 && day < 30)){
            zodiac = "雄牛";
        }if ((year == 1949 && month > 1) || (year == 1949 && month == 1 && day >= 29)){
            zodiac = "雄牛";
        }if ((year == 1950 && month < 2) || (year == 1950 && month == 2 && day < 16)){
            zodiac = "雄牛";
        }if ((year == 1961 && month > 2) || (year == 1961 && month == 2 && day >= 15)){
            zodiac = "雄牛";
        }if ((year == 1962 && month < 2) || (year == 1962 && month == 2 && day < 4)){
            zodiac = "雄牛";
        }if ((year == 1973 && month > 2) || (year == 1973 && month == 2 && day >= 3)){
            zodiac = "雄牛";
        }if ((year == 1974 && month < 1) || (year == 1974 && month == 1 && day < 22)){
            zodiac = "雄牛";
        }if ((year == 1985 && month > 2) || (year == 1985 && month == 2 && day >= 20)){
            zodiac = "雄牛";
        }if ((year == 1986 && month < 2) || (year == 1986 && month == 2 && day < 8)){
            zodiac = "雄牛";
        }if ((year == 1997 && month > 2) || (year == 1997 && month == 2 && day >= 7)){
            zodiac = "雄牛";
        }if ((year == 1998 && month < 1) || (year == 1998 && month == 1 && day < 27)){
            zodiac = "雄牛";
        }if ((year == 2009 && month > 1) || (year == 2009 && month == 1 && day >= 26)){
            zodiac = "雄牛";
        }if ((year == 2010 && month < 2) || (year == 2010 && month == 2 && day < 13)){
            zodiac = "雄牛";
        }if ((year == 2021 && month > 2) || (year == 2021 && month == 2 && day >= 11)){
            zodiac = "雄牛";
        }if ((year == 2022 && month < 1) || (year == 2022 && month == 1 && day < 31)){
            zodiac = "雄牛";
        }if ((year == 2033 && month > 1) || (year == 2033 && month == 1 && day >= 31)){
            zodiac = "雄牛";
        }if ((year == 2034 && month < 1) || (year == 2034 && month == 1 && day < 18)){
            zodiac = "雄牛";
        }if ((year == 2045 && month > 2) || (year == 2045 && month == 2 && day >= 17)){
            zodiac = "雄牛";
        }if ((year == 2046 && month < 2) || (year == 2046 && month == 2 && day < 5)){
            zodiac = "雄牛";
        }
        
        // Check if zodiac is tiger
        if ((year == 1914 && month > 1) || (year == 1914 && month == 1 && day >= 26)){
            zodiac = "虎";
        }if ((year == 1915 && month < 2) || (year == 1915 && month == 2 && day < 13)){
            zodiac = "虎";
        }if ((year == 1926 && month > 2) || (year == 1926 && month == 2 && day >= 13)){
            zodiac = "虎";
        }if ((year == 1927 && month < 2) || (year == 1927 && month == 2 && day < 1)){
            zodiac = "虎";
        }if ((year == 1938 && month > 1) || (year == 1938 && month == 1 && day >= 31)){
            zodiac = "虎";
        }if ((year == 1939 && month < 2) || (year == 1939 && month == 2 && day < 18)){
            zodiac = "虎";
        }if ((year == 1950 && month > 2) || (year == 1950 && month == 2 && day >= 17)){
            zodiac = "虎";
        }if ((year == 1951 && month < 2) || (year == 1951 && month == 2 && day < 5)){
            zodiac = "虎";
        }if ((year == 1962 && month > 2) || (year == 1962 && month == 2 && day >= 5)){
            zodiac = "虎";
        }if ((year == 1963 && month < 1) || (year == 1963 && month == 1 && day < 24)){
            zodiac = "虎";
        }if ((year == 1974 && month > 1) || (year == 1974 && month == 1 && day >= 23)){
            zodiac = "虎";
        }if ((year == 1975 && month < 2) || (year == 1975 && month == 2 && day < 10)){
            zodiac = "虎";
        }if ((year == 1986 && month > 2) || (year == 1986 && month == 2 && day >= 9)){
            zodiac = "虎";
        }if ((year == 1987 && month < 1) || (year == 1987 && month == 1 && day < 28)){
            zodiac = "虎";
        }if ((year == 1998 && month > 1) || (year == 1998 && month == 1 && day >= 28)){
            zodiac = "虎";
        }if ((year == 1999 && month < 2) || (year == 1999 && month == 2 && day < 15)){
            zodiac = "虎";
        }if ((year == 2010 && month > 2) || (year == 2010 && month == 2 && day >= 14)){
            zodiac = "虎";
        }if ((year == 2011 && month < 2) || (year == 2011 && month == 2 && day < 2)){
            zodiac = "虎";
        }if ((year == 2022 && month > 2) || (year == 2022 && month == 2 && day >= 1)){
            zodiac = "虎";
        }if ((year == 2023 && month < 1) || (year == 2023 && month == 1 && day < 21)){
            zodiac = "虎";
        }if ((year == 2034 && month > 1) || (year == 2034 && month == 1 && day >= 19)){
            zodiac = "虎";
        }if ((year == 2035 && month < 2) || (year == 2035 && month == 2 && day < 7)){
            zodiac = "虎";
        }if ((year == 2046 && month > 2) || (year == 2046 && month == 2 && day >= 6)){
            zodiac = "虎";
        }if ((year == 2047 && month < 1) || (year == 2047 && month == 1 && day < 25)){
            zodiac = "虎";
        }
        
        // Check if zodiac is rabbit
        if ((year == 1915 && month > 2) || (year == 1915 && month == 2 && day >= 14)){
            zodiac = "兎";
        }if ((year == 1916 && month < 2) || (year == 1916 && month == 2 && day < 2)){
            zodiac = "兎";
        }if ((year == 1927 && month > 2) || (year == 1927 && month == 2 && day >= 2)){
            zodiac = "兎";
        }if ((year == 1928 && month < 1) || (year == 1928 && month == 1 && day < 22)){
            zodiac = "兎";
        }if ((year == 1939 && month > 2) || (year == 1939 && month == 2 && day >= 19)){
            zodiac = "兎";
        }if ((year == 1940 && month < 2) || (year == 1940 && month == 2 && day < 8)){
            zodiac = "兎";
        }if ((year == 1951 && month > 2) || (year == 1951 && month == 2 && day >= 6)){
            zodiac = "兎";
        }if ((year == 1952 && month < 1) || (year == 1952 && month == 1 && day < 26)){
            zodiac = "兎";
        }if ((year == 1963 && month > 1) || (year == 1963 && month == 1 && day >= 25)){
            zodiac = "兎";
        }if ((year == 1964 && month < 2) || (year == 1964 && month == 2 && day < 12)){
            zodiac = "兎";
        }if ((year == 1975 && month > 2) || (year == 1975 && month == 2 && day >= 11)){
            zodiac = "兎";
        }if ((year == 1976 && month < 1) || (year == 1976 && month == 1 && day < 30)){
            zodiac = "兎";
        }if ((year == 1987 && month > 1) || (year == 1987 && month == 1 && day >= 29)){
            zodiac = "兎";
        }if ((year == 1988 && month < 2) || (year == 1988 && month == 2 && day < 16)){
            zodiac = "兎";
        }if ((year == 1999 && month > 2) || (year == 1999 && month == 2 && day >= 16)){
            zodiac = "兎";
        }if ((year == 2000 && month < 2) || (year == 2000 && month == 2 && day < 4)){
            zodiac = "兎";
        }if ((year == 2011 && month > 2) || (year == 2011 && month == 2 && day >= 3)){
            zodiac = "兎";
        }if ((year == 2012 && month < 1) || (year == 2012 && month == 1 && day < 22)){
            zodiac = "兎";
        }if ((year == 2023 && month > 1) || (year == 2023 && month == 1 && day >= 22)){
            zodiac = "兎";
        }if ((year == 2024 && month < 2) || (year == 2024 && month == 2 && day < 9)){
            zodiac = "兎";
        }if ((year == 2035 && month > 2) || (year == 2035 && month == 2 && day >= 8)){
            zodiac = "兎";
        }if ((year == 2036 && month < 2) || (year == 2036 && month == 2 && day < 27)){
            zodiac = "兎";
        }if ((year == 2047 && month > 1) || (year == 2047 && month == 1 && day >= 26)){
            zodiac = "兎";
        }if ((year == 2048 && month < 2) || (year == 2048 && month == 2 && day < 13)){
            zodiac = "兎";
        }
        
        // Check if zodiac is dragon
        if ((year == 1916 && month > 2) || (year == 1916 && month == 2 && day >= 3)){
            zodiac = "竜";
        }if ((year == 1917 && month < 1) || (year == 1917 && month == 1 && day < 22)){
            zodiac = "竜";
        }if ((year == 1928 && month > 2) || (year == 1928 && month == 2 && day >= 23)){
            zodiac = "竜";
        }if ((year == 1929 && month < 2) || (year == 1929 && month == 2 && day < 9)){
            zodiac = "竜";
        }if ((year == 1940 && month > 2) || (year == 1940 && month == 2 && day >= 9)){
            zodiac = "竜";
        }if ((year == 1941 && month < 1) || (year == 1941 && month == 1 && day < 26)){
            zodiac = "竜";
        }if ((year == 1952 && month > 1) || (year == 1952 && month == 1 && day >= 27)){
            zodiac = "竜";
        }if ((year == 1953 && month < 2) || (year == 1953 && month == 2 && day < 13)){
            zodiac = "竜";
        }if ((year == 1964 && month > 2) || (year == 1964 && month == 2 && day >= 13)){
            zodiac = "竜";
        }if ((year == 1965 && month < 2) || (year == 1965 && month == 2 && day < 1)){
            zodiac = "竜";
        }if ((year == 1976 && month > 1) || (year == 1976 && month == 1 && day >= 31)){
            zodiac = "竜";
        }if ((year == 1977 && month < 2) || (year == 1977 && month == 2 && day < 17)){
            zodiac = "竜";
        }if ((year == 1988 && month > 2) || (year == 1988 && month == 2 && day >= 17)){
            zodiac = "竜";
        }if ((year == 1989 && month < 2) || (year == 1989 && month == 2 && day < 5)){
            zodiac = "竜";
        }if ((year == 2000 && month > 2) || (year == 2000 && month == 2 && day >= 5)){
            zodiac = "竜";
        }if ((year == 2001 && month < 1) || (year == 2001 && month == 1 && day < 23)){
            zodiac = "竜";
        }if ((year == 2012 && month > 1) || (year == 2012 && month == 1 && day >= 23)){
            zodiac = "竜";
        }if ((year == 2013 && month < 2) || (year == 2013 && month == 2 && day < 9)){
            zodiac = "竜";
        }if ((year == 2024 && month > 2) || (year == 2024 && month == 2 && day >= 10)){
            zodiac = "竜";
        }if ((year == 2025 && month < 1) || (year == 2025 && month == 1 && day < 25)){
            zodiac = "竜";
        }if ((year == 2036 && month > 2) || (year == 2036 && month == 2 && day >= 28)){
            zodiac = "竜";
        }if ((year == 2037 && month < 2) || (year == 2037 && month == 2 && day < 14)){
            zodiac = "竜";
        }if ((year == 2048 && month > 2) || (year == 2048 && month == 2 && day >= 24)){
            zodiac = "竜";
        }if ((year == 2049 && month < 2) || (year == 2049 && month == 2 && day < 1)){
            zodiac = "竜";
        }
        
        // Check if zodiac is snake
        if ((year == 1917 && month > 1) || (year == 1917 && month == 1 && day >= 23)){
            zodiac = "蛇";
        }if ((year == 1918 && month < 2) || (year == 1918 && month == 2 && day < 10)){
            zodiac = "蛇";
        }if ((year == 1929 && month > 2) || (year == 1929 && month == 2 && day >= 10)){
            zodiac = "蛇";
        }if ((year == 1930 && month < 1) || (year == 1930 && month == 1 && day < 29)){
            zodiac = "蛇";
        }if ((year == 1941 && month > 1) || (year == 1941 && month == 1 && day >= 27)){
            zodiac = "蛇";
        }if ((year == 1942 && month < 2) || (year == 1942 && month == 2 && day < 14)){
            zodiac = "蛇";
        }if ((year == 1953 && month > 2) || (year == 1953 && month == 2 && day >= 14)){
            zodiac = "蛇";
        }if ((year == 1954 && month < 2) || (year == 1954 && month == 2 && day < 2)){
            zodiac = "蛇";
        }if ((year == 1965 && month > 2) || (year == 1965 && month == 2 && day >= 2)){
            zodiac = "蛇";
        }if ((year == 1966 && month < 1) || (year == 1966 && month == 1 && day < 20)){
            zodiac = "蛇";
        }if ((year == 1977 && month > 2) || (year == 1977 && month == 2 && day >= 18)){
            zodiac = "蛇";
        }if ((year == 1978 && month < 2) || (year == 1978 && month == 2 && day < 6)){
            zodiac = "蛇";
        }if ((year == 1989 && month > 2) || (year == 1989 && month == 2 && day >= 6)){
            zodiac = "蛇";
        }if ((year == 1990 && month < 1) || (year == 1990 && month == 1 && day < 26)){
            zodiac = "蛇";
        }if ((year == 2001 && month > 1) || (year == 2001 && month == 1 && day >= 24)){
            zodiac = "蛇";
        }if ((year == 2002 && month < 2) || (year == 2002 && month == 2 && day < 11)){
            zodiac = "蛇";
        }if ((year == 2013 && month > 2) || (year == 2013 && month == 2 && day >= 10)){
            zodiac = "蛇";
        }if ((year == 2014 && month < 1) || (year == 2014 && month == 1 && day < 30)){
            zodiac = "蛇";
        }if ((year == 2025 && month > 1) || (year == 2025 && month == 1 && day >= 29)){
            zodiac = "蛇";
        }if ((year == 2026 && month < 2) || (year == 2026 && month == 2 && day < 16)){
            zodiac = "蛇";
        }if ((year == 2037 && month > 2) || (year == 2037 && month == 2 && day >= 15)){
            zodiac = "蛇";
        }if ((year == 2038 && month < 2) || (year == 2038 && month == 2 && day < 3)){
            zodiac = "蛇";
        }if ((year == 2049 && month > 2) || (year == 2049 && month == 2 && day >= 2)){
            zodiac = "蛇";
        }if ((year == 2050 && month < 1) || (year == 2050 && month == 1 && day < 22)){
            zodiac = "蛇";
        }
        
        // Check if zodiac is horse
        if ((year == 1918 && month > 2) || (year == 1918 && month == 2 && day >= 11)){
            zodiac = "馬";
        }if ((year == 1919 && month < 1) || (year == 1919 && month == 1 && day < 31)){
            zodiac = "馬";
        }if ((year == 1930 && month > 1) || (year == 1930 && month == 1 && day >= 30)){
            zodiac = "馬";
        }if ((year == 1931 && month < 2) || (year == 1931 && month == 2 && day < 16)){
            zodiac = "馬";
        }if ((year == 1942 && month > 2) || (year == 1942 && month == 2 && day >= 15)){
            zodiac = "馬";
        }if ((year == 1943 && month < 2) || (year == 1943 && month == 2 && day < 4)){
            zodiac = "馬";
        }if ((year == 1954 && month > 2) || (year == 1954 && month == 2 && day >= 3)){
            zodiac = "馬";
        }if ((year == 1955 && month < 1) || (year == 1955 && month == 1 && day < 23)){
            zodiac = "馬";
        }if ((year == 1966 && month > 1) || (year == 1966 && month == 1 && day >= 21)){
            zodiac = "馬";
        }if ((year == 1967 && month < 2) || (year == 1967 && month == 2 && day < 8)){
            zodiac = "馬";
        }if ((year == 1978 && month > 2) || (year == 1978 && month == 2 && day >= 7)){
            zodiac = "馬";
        }if ((year == 1979 && month < 1) || (year == 1979 && month == 1 && day < 27)){
            zodiac = "馬";
        }if ((year == 1990 && month > 1) || (year == 1990 && month == 1 && day >= 27)){
            zodiac = "馬";
        }if ((year == 1991 && month < 2) || (year == 1991 && month == 2 && day < 14)){
            zodiac = "馬";
        }if ((year == 2002 && month > 2) || (year == 2002 && month == 2 && day >= 12)){
            zodiac = "馬";
        }if ((year == 2003 && month < 1) || (year == 2003 && month == 1 && day < 31)){
            zodiac = "馬";
        }if ((year == 2014 && month > 1) || (year == 2014 && month == 1 && day >= 31)){
            zodiac = "馬";
        }if ((year == 2015 && month < 2) || (year == 2015 && month == 2 && day < 18)){
            zodiac = "馬";
        }if ((year == 2026 && month > 2) || (year == 2026 && month == 2 && day >= 17)){
            zodiac = "馬";
        }if ((year == 2027 && month < 2) || (year == 2027 && month == 2 && day < 5)){
            zodiac = "馬";
        }if ((year == 2038 && month > 2) || (year == 2038 && month == 2 && day >= 4)){
            zodiac = "馬";
        }if ((year == 2039 && month < 1) || (year == 2039 && month == 1 && day < 23)){
            zodiac = "馬";
        }if ((year == 2050 && month > 1) || (year == 2050 && month == 1 && day >= 23)){
            zodiac = "馬";
        }if ((year == 2051 && month < 2) || (year == 2051 && month == 2 && day < 10)){
            zodiac = "馬";
        }
        
        // Check if zodiac is goat
        if ((year == 1919 && month > 2) || (year == 1919 && month == 2 && day >= 1)){
            zodiac = "ヤギ";
        }if ((year == 1920 && month < 2) || (year == 1920 && month == 2 && day < 19)){
            zodiac = "ヤギ";
        }if ((year == 1931 && month > 2) || (year == 1931 && month == 2 && day >= 17)){
            zodiac = "ヤギ";
        }if ((year == 1932 && month < 2) || (year == 1932 && month == 2 && day < 5)){
            zodiac = "ヤギ";
        }if ((year == 1943 && month > 2) || (year == 1943 && month == 2 && day >= 5)){
            zodiac = "ヤギ";
        }if ((year == 1944 && month < 1) || (year == 1944 && month == 1 && day < 24)){
            zodiac = "ヤギ";
        }if ((year == 1955 && month > 1) || (year == 1955 && month == 1 && day >= 24)){
            zodiac = "ヤギ";
        }if ((year == 1956 && month < 2) || (year == 1956 && month == 2 && day < 11)){
            zodiac = "ヤギ";
        }if ((year == 1967 && month > 2) || (year == 1967 && month == 2 && day >= 9)){
            zodiac = "ヤギ";
        }if ((year == 1968 && month < 1) || (year == 1968 && month == 1 && day < 29)){
            zodiac = "ヤギ";
        }if ((year == 1979 && month > 1) || (year == 1979 && month == 1 && day >= 28)){
            zodiac = "ヤギ";
        }if ((year == 1980 && month < 2) || (year == 1980 && month == 2 && day < 15)){
            zodiac = "ヤギ";
        }if ((year == 1991 && month > 2) || (year == 1991 && month == 2 && day >= 15)){
            zodiac = "ヤギ";
        }if ((year == 1992 && month < 2) || (year == 1992 && month == 2 && day < 3)){
            zodiac = "ヤギ";
        }if ((year == 2003 && month > 2) || (year == 2003 && month == 2 && day >= 1)){
            zodiac = "ヤギ";
        }if ((year == 2004 && month < 1) || (year == 2004 && month == 1 && day < 21)){
            zodiac = "ヤギ";
        }if ((year == 2015 && month > 2) || (year == 2015 && month == 2 && day >= 19)){
            zodiac = "ヤギ";
        }if ((year == 2016 && month < 2) || (year == 2016 && month == 2 && day < 7)){
            zodiac = "ヤギ";
        }if ((year == 2027 && month > 2) || (year == 2027 && month == 2 && day >= 6)){
            zodiac = "ヤギ";
        }if ((year == 2028 && month < 1) || (year == 2028 && month == 1 && day < 25)){
            zodiac = "ヤギ";
        }if ((year == 2039 && month > 1) || (year == 2039 && month == 1 && day >= 24)){
            zodiac = "ヤギ";
        }if ((year == 2040 && month < 2) || (year == 2040 && month == 2 && day < 11)){
            zodiac = "ヤギ";
        }if ((year == 2051 && month > 2) || (year == 2051 && month == 2 && day >= 11)){
            zodiac = "ヤギ";
        }if ((year == 2052 && month < 1) || (year == 2052 && month == 1 && day < 31)){
            zodiac = "ヤギ";
        }
        
        // Check if zodiac is monkey
        if ((year == 1920 && month > 2) || (year == 1920 && month == 2 && day >= 20)){
            zodiac = "猿";
        }if ((year == 1921 && month < 2) || (year == 1921 && month == 2 && day < 7)){
            zodiac = "猿";
        }if ((year == 1932 && month > 2) || (year == 1932 && month == 2 && day >= 6)){
            zodiac = "猿";
        }if ((year == 1933 && month < 1) || (year == 1933 && month == 1 && day < 25)){
            zodiac = "猿";
        }if ((year == 1944 && month > 1) || (year == 1944 && month == 1 && day >= 25)){
            zodiac = "猿";
        }if ((year == 1945 && month < 2) || (year == 1945 && month == 2 && day < 12)){
            zodiac = "猿";
        }if ((year == 1956 && month > 2) || (year == 1956 && month == 2 && day >= 12)){
            zodiac = "猿";
        }if ((year == 1957 && month < 1) || (year == 1957 && month == 1 && day < 30)){
            zodiac = "猿";
        }if ((year == 1968 && month > 1) || (year == 1968 && month == 1 && day >= 30)){
            zodiac = "猿";
        }if ((year == 1969 && month < 2) || (year == 1969 && month == 2 && day < 16)){
            zodiac = "猿";
        }if ((year == 1980 && month > 2) || (year == 1980 && month == 2 && day >= 16)){
            zodiac = "猿";
        }if ((year == 1981 && month < 2) || (year == 1981 && month == 2 && day < 4)){
            zodiac = "猿";
        }if ((year == 1992 && month > 2) || (year == 1992 && month == 2 && day >= 4)){
            zodiac = "猿";
        }if ((year == 1993 && month < 1) || (year == 1993 && month == 1 && day < 22)){
            zodiac = "猿";
        }if ((year == 2004 && month > 1) || (year == 2004 && month == 1 && day >= 22)){
            zodiac = "猿";
        }if ((year == 2005 && month < 2) || (year == 2005 && month == 2 && day < 8)){
            zodiac = "猿";
        }if ((year == 2016 && month > 2) || (year == 2016 && month == 2 && day >= 8)){
            zodiac = "猿";
        }if ((year == 2017 && month < 1) || (year == 2017 && month == 1 && day < 27)){
            zodiac = "猿";
        }if ((year == 2028 && month > 1) || (year == 2028 && month == 1 && day >= 26)){
            zodiac = "猿";
        }if ((year == 2029 && month < 2) || (year == 2029 && month == 2 && day < 12)){
            zodiac = "猿";
        }if ((year == 2040 && month > 2) || (year == 2040 && month == 2 && day >= 12)){
            zodiac = "猿";
        }if ((year == 2041 && month < 2) || (year == 2041 && month == 2 && day < 28)){
            zodiac = "猿";
        }if ((year == 2052 && month > 2) || (year == 2052 && month == 2 && day >= 1)){
            zodiac = "猿";
        }if ((year == 2053 && month < 2) || (year == 2053 && month == 2 && day < 18)){
            zodiac = "猿";
        }
        
        // Check if zodiac is rooster
        if ((year == 1921 && month > 2) || (year == 1921 && month == 2 && day >= 8)){
            zodiac = "おんどり";
        }if ((year == 1922 && month < 1) || (year == 1922 && month == 1 && day < 27)){
            zodiac = "おんどり";
        }if ((year == 1933 && month > 1) || (year == 1933 && month == 1 && day >= 26)){
            zodiac = "おんどり";
        }if ((year == 1934 && month < 2) || (year == 1934 && month == 2 && day < 13)){
            zodiac = "おんどり";
        }if ((year == 1945 && month > 2) || (year == 1945 && month == 2 && day >= 13)){
            zodiac = "おんどり";
        }if ((year == 1946 && month < 2) || (year == 1946 && month == 2 && day < 1)){
            zodiac = "おんどり";
        }if ((year == 1957 && month > 1) || (year == 1957 && month == 1 && day >= 31)){
            zodiac = "おんどり";
        }if ((year == 1958 && month < 2) || (year == 1958 && month == 2 && day < 17)){
            zodiac = "おんどり";
        }if ((year == 1969 && month > 2) || (year == 1969 && month == 2 && day >= 17)){
            zodiac = "おんどり";
        }if ((year == 1970 && month < 2) || (year == 1970 && month == 2 && day < 5)){
            zodiac = "おんどり";
        }if ((year == 1981 && month > 2) || (year == 1981 && month == 2 && day >= 5)){
            zodiac = "おんどり";
        }if ((year == 1982 && month < 1) || (year == 1982 && month == 1 && day < 24)){
            zodiac = "おんどり";
        }if ((year == 1993 && month > 1) || (year == 1993 && month == 1 && day >= 23)){
            zodiac = "おんどり";
        }if ((year == 1994 && month < 2) || (year == 1994 && month == 2 && day < 9)){
            zodiac = "おんどり";
        }if ((year == 2005 && month > 2) || (year == 2005 && month == 2 && day >= 9)){
            zodiac = "おんどり";
        }if ((year == 2006 && month < 1) || (year == 2006 && month == 1 && day < 28)){
            zodiac = "おんどり";
        }if ((year == 2017 && month > 1) || (year == 2017 && month == 1 && day >= 28)){
            zodiac = "おんどり";
        }if ((year == 2018 && month < 2) || (year == 2018 && month == 2 && day < 15)){
            zodiac = "おんどり";
        }if ((year == 2029 && month > 2) || (year == 2029 && month == 2 && day >= 13)){
            zodiac = "おんどり";
        }if ((year == 2030 && month < 2) || (year == 2030 && month == 2 && day < 2)){
            zodiac = "おんどり";
        }if ((year == 2041 && month > 3) || (year == 2041 && month == 3 && day >= 1)){
            zodiac = "おんどり";
        }if ((year == 2042 && month < 1) || (year == 2042 && month == 1 && day < 21)){
            zodiac = "おんどり";
        }if ((year == 2053 && month > 2) || (year == 2053 && month == 2 && day >= 19)){
            zodiac = "おんどり";
        }if ((year == 2054 && month < 2) || (year == 2054 && month == 2 && day < 7)){
            zodiac = "おんどり";
        }
        
        // Check if zodiac is dog
        if ((year == 1922 && month > 1) || (year == 1922 && month == 1 && day >= 28)){
            zodiac = "犬";
        }if ((year == 1923 && month < 2) || (year == 1923 && month == 2 && day < 15)){
            zodiac = "犬";
        }if ((year == 1934 && month > 2) || (year == 1934 && month == 2 && day >= 14)){
            zodiac = "犬";
        }if ((year == 1935 && month < 2) || (year == 1935 && month == 2 && day < 3)){
            zodiac = "犬";
        }if ((year == 1946 && month > 2) || (year == 1946 && month == 2 && day >= 2)){
            zodiac = "犬";
        }if ((year == 1947 && month < 1) || (year == 1947 && month == 1 && day < 21)){
            zodiac = "犬";
        }if ((year == 1958 && month > 2) || (year == 1958 && month == 2 && day >= 18)){
            zodiac = "犬";
        }if ((year == 1959 && month < 2) || (year == 1959 && month == 2 && day < 7)){
            zodiac = "犬";
        }if ((year == 1970 && month > 2) || (year == 1970 && month == 2 && day >= 6)){
            zodiac = "犬";
        }if ((year == 1971 && month < 1) || (year == 1971 && month == 1 && day < 26)){
            zodiac = "犬";
        }if ((year == 1982 && month > 1) || (year == 1982 && month == 1 && day >= 25)){
            zodiac = "犬";
        }if ((year == 1983 && month < 2) || (year == 1983 && month == 2 && day < 12)){
            zodiac = "犬";
        }if ((year == 1994 && month > 2) || (year == 1994 && month == 2 && day >= 10)){
            zodiac = "犬";
        }if ((year == 1995 && month < 1) || (year == 1995 && month == 1 && day < 30)){
            zodiac = "犬";
        }if ((year == 2006 && month > 1) || (year == 2006 && month == 1 && day >= 29)){
            zodiac = "犬";
        }if ((year == 2007 && month < 2) || (year == 2007 && month == 2 && day < 17)){
            zodiac = "犬";
        }if ((year == 2018 && month > 2) || (year == 2018 && month == 2 && day >= 16)){
            zodiac = "犬";
        }if ((year == 2019 && month < 2) || (year == 2019 && month == 2 && day < 4)){
            zodiac = "犬";
        }if ((year == 2030 && month > 2) || (year == 2030 && month == 2 && day >= 3)){
            zodiac = "犬";
        }if ((year == 2031 && month < 1) || (year == 2031 && month == 1 && day < 22)){
            zodiac = "犬";
        }if ((year == 2042 && month > 1) || (year == 2042 && month == 1 && day >= 22)){
            zodiac = "犬";
        }if ((year == 2043 && month < 2) || (year == 2043 && month == 2 && day < 9)){
            zodiac = "犬";
        }if ((year == 2054 && month > 2) || (year == 2054 && month == 2 && day >= 8)){
            zodiac = "犬";
        }if ((year == 2055 && month < 1) || (year == 2055 && month == 1 && day < 27)){
            zodiac = "犬";
        }
        
        // Check if zodiac is pig
        if ((year == 1923 && month > 2) || (year == 1923 && month == 2 && day >= 16)){
            zodiac = "豚";
        }if ((year == 1924 && month < 2) || (year == 1924 && month == 2 && day < 4)){
            zodiac = "豚";
        }if ((year == 1935 && month > 2) || (year == 1935 && month == 2 && day >= 4)){
            zodiac = "豚";
        }if ((year == 1936 && month < 1) || (year == 1936 && month == 1 && day < 23)){
            zodiac = "豚";
        }if ((year == 1947 && month > 1) || (year == 1947 && month == 1 && day >= 22)){
            zodiac = "豚";
        }if ((year == 1948 && month < 2) || (year == 1948 && month == 2 && day < 9)){
            zodiac = "豚";
        }if ((year == 1959 && month > 2) || (year == 1959 && month == 2 && day >= 8)){
            zodiac = "豚";
        }if ((year == 1960 && month < 1) || (year == 1960 && month == 1 && day < 27)){
            zodiac = "豚";
        }if ((year == 1971 && month > 1) || (year == 1971 && month == 1 && day >= 27)){
            zodiac = "豚";
        }if ((year == 1972 && month < 2) || (year == 1972 && month == 2 && day < 24)){
            zodiac = "豚";
        }if ((year == 1983 && month > 2) || (year == 1983 && month == 2 && day >= 13)){
            zodiac = "豚";
        }if ((year == 1984 && month < 2) || (year == 1984 && month == 2 && day < 1)){
            zodiac = "豚";
        }if ((year == 1995 && month > 1) || (year == 1995 && month == 1 && day >= 31)){
            zodiac = "豚";
        }if ((year == 1996 && month < 2) || (year == 1996 && month == 2 && day < 18)){
            zodiac = "豚";
        }if ((year == 2007 && month > 2) || (year == 2007 && month == 2 && day >= 18)){
            zodiac = "豚";
        }if ((year == 2008 && month < 2) || (year == 2008 && month == 2 && day < 6)){
            zodiac = "豚";
        }if ((year == 2019 && month > 2) || (year == 2019 && month == 2 && day >= 5)){
            zodiac = "豚";
        }if ((year == 2020 && month < 1) || (year == 2020 && month == 1 && day < 24)){
            zodiac = "豚";
        }if ((year == 2031 && month > 1) || (year == 2031 && month == 1 && day >= 23)){
            zodiac = "豚";
        }if ((year == 2032 && month < 2) || (year == 2032 && month == 2 && day < 10)){
            zodiac = "豚";
        }if ((year == 2043 && month > 2) || (year == 2043 && month == 2 && day >= 10)){
            zodiac = "豚";
        }if ((year == 2044 && month < 1) || (year == 2044 && month == 1 && day < 29)){
            zodiac = "豚";
        }if ((year == 2055 && month > 1) || (year == 2055 && month == 1 && day >= 28)){
            zodiac = "豚";
        }if ((year == 2056 && month < 2) || (year == 2056 && month == 2 && day < 14)){
            zodiac = "豚";
        }
        

        // Account for different imperial eras
        if (year >= 1912 && year < 1926){
            eraYear =  Integer.toString(year - 1911);
            era = "年号: " + "大正 (たいしょう) " + eraYear;
        } if (year >= 1926 && year < 1989){
            eraYear =  Integer.toString(year - 1925);
            era = "年号: " + "昭和 (しょうわ) " + eraYear;
        } if (year >= 1989){
            eraYear =  Integer.toString(year - 1988);
            era = "年号: " + "平成 (へいせい) " + eraYear;
        }
        
        
        // Select horoscope text based on user's horoscope
        if (zodiac.equals("鼠")){
            // Zodiac is rat/mouse
            zodiacNm = "鼠 (ねずみ)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 二, 三\n" + "ラッキーカラー: 金, あお, みどり\n" + "吉方 (えほう): 南東, 北東";
            zodiacStngandWeak =
                    "強み (つよみ):\n" +
                    "頭がいい (あたまがいい), アラート, 陽気な (ようきな)\n" +
                    "Smart, alert, cheerful\n" +
                    "弱点 (じゃくてん):\n" +
                    "臆病な (おくびょうな), 頑固な (がんこな), ぐちっぽい\n" +
                    "Timid, stubborn, querulous";
        } else if (zodiac.equals("雄牛")){
            // Zodiac is bull
            zodiacNm = "雄牛 (おすうし)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 一, 九\n" + "ラッキーカラー: あか, あお, むらさき\n" + "吉方 (えほう): 南東, 南, 北";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "正直な(しょうじきな), 患者 (かんじゃ), しつこいです \n" +
                    "Honest, patient, persistent \n" +
                    "弱点 (じゃくてん): \n" +
                    "頑固な(がんこな), 口がきけません, 遠く (とうく) \n" +
                    "Obstinate, inarticulate, distant";
        } else if (zodiac.equals("虎")){
            // Zodiac is tiger
            zodiacNm = "虎 (とら)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 一, 三, 四\n" + "ラッキーカラー: ねずみ/はい, あお, しろ, オレンジ\n" + "吉方 (えほう): 南, 東, 南東";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "忠実な (ちゅうじつな), 勇敢な (ゆうかんな), 頭がいい (あたまがいい) \n" +
                    "Loyal, courageous, smart \n" +
                    "弱点 (じゃくてん): \n" +
                    "傲慢な (ごうまんな), 気が短いです (きがみじかいです), 性急な (性急な) \n" +
                    "Arrogant, short-tempered, hasty";
        } else if (zodiac.equals("兎")){
            // Zodiac is rabbit
            zodiacNm = "兎 (うさぎ)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 三, 四, 九\n" + "ラッキーカラー: あか, あお, ピンク / もも, むらさき\n" + "吉方 (えほう): 南東, 南";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "穏やか (おだやか), 情け深い (なさけふかい), 控えめな (ひかえめな) \n" +
                    "Gentle, compassionate, modest \n" +
                    "弱点 (じゃくてん): \n" +
                    "ためらって, 頑固な (がんこな), 臆病な (おくびょうな) \n" +
                    "Hesitant, stubborn, timid";
        } else if (zodiac.equals("竜")){
            // Zodiac is dragon
            zodiacNm = "竜 (りゅう)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 一, 七 , 六\n" + "ラッキーカラー: 金, 銀, しらがらさき\n" + "吉方 (えほう): 西, 北, 北西";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "決定的 (けっていてき), 鼓舞する (こぶする), ロマンチック \n" +
                    "Decisive, inspiring, romantic \n" +
                    "弱点 (じゃくてん): \n" +
                    "エキセントリック, 偏狭な (へんきょうな), 非現実的 (ひげんじつてき) \n" +
                    "Eccentric, intolerant, unrealistic";
        } else if (zodiac.equals("蛇")){
            // Zodiac is snake
            zodiacNm = "蛇 (ヘビ)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 二, 八, 九\n" + "ラッキーカラー: あか, きいろ, くろ\n" + "吉方 (えほう): 北東, 南西, 南";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "滑稽 (こっけい), 決定 (けってい), 頭がいい (あたまがいい) \n" +
                    "Humorous, determined, smart \n" +
                    "弱点 (じゃくてん): \n" +
                    "嫉妬深いです (しっとぶかいです), 狡い (こすい),  気まぐれな \n" +
                    "Jealous, sly, fickle";
        } else if (zodiac.equals("馬")){
            // Zodiac is horse
            zodiacNm = "馬 (うま)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 二, 三, 七\n" + "ラッキーカラー: ちゃい,  きいろ, むらさき\n" + "吉方 (えほう): 北東, 南西, 北西";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "正直な(しょうじきな), のんきな, ポジティブ, フレキシブル \n" +
                    "Honest, easy going, positive \n" +
                    "弱点 (じゃくてん): \n" +
                    "お金を費やして大好き (おかねをついやしてだいすき), 露骨 (ろこつ), 持続性の欠如 (じぞくせいのけつじょ) \n" +
                    "Love spending money, frank, lack of persistence";
        } else if (zodiac.equals("ヤギ")){
            // Zodiac is goat
            zodiacNm = "山羊 (ヤギ)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 三, 四, 九\n" + "ラッキーカラー: みどり, あか, むらさき\n" + "吉方 (えほう): 東, 南東, 南";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "穏やか (おだやか), 魅力的 (みりきてき), 勤勉な (きんべんな) \n" +
                    "Gentle, attractive, hardworking \n" +
                    "弱点 (じゃくてん): \n" +
                    "優柔不断な (ゆうじゅうふだんな), 臆病な (おくびょうな), 誇らしい (ほこらしい) \n" +
                    "Indecisive, timid, vain";
        } else if (zodiac.equals("猿")){
            // Zodiac is monkey
            zodiacNm = "猿 (さる)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 一, 七 , 八\n" + "ラッキーカラー: しろ, 金, あお\n" + "吉方 (えほう): 北, 北西, 西";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "熱狂的な (ねっきょうてきな), 自信のあります (じしんのあります), 社交的な (しゃこうてきな) \n" +
                    "Enthusiastic, self-assured, sociable \n" +
                    "弱点 (じゃくてん): \n" +
                    "嫉妬深いです (しっとぶかいです), 狡い (こすい), 傲慢な (ごうまんな) \n" +
                    "Jealous, cunning, arrogant";
        } else if (zodiac.equals("おんどり")){
            // Zodiac is rooster
            zodiacNm = "雄鳥 (おんどり)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 五, 七, 八\n" + "ラッキーカラー: 金, ちゃい, きいろ\n" + "吉方 (えほう): 西, 南西, 北東";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "独立の (どくりつの), できます, 心の迅速な (こころのじんそくな) \n" +
                    "Independent, capable, quick minded \n" +
                    "弱点 (じゃくてん): \n" +
                    "せっかち, エキセントリック, 利己的 ( りこてき) \n" +
                    "Impatient, eccentric, selfish";
        } else if (zodiac.equals("犬")){
            // Zodiac is dog
            zodiacNm = "犬 (いぬ)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 三, 四 , 九\n" + "ラッキーカラー: みどり, あか, むらさき\n" + "吉方 (えほう): 東, 南西, 南";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "忠実な (ちゅうじつな), 責任 (せきにん), 勇敢な (ゆうかんな) \n" +
                    "Loyal, responsible, courageous \n" +
                    "弱点 (じゃくてん): \n" +
                    "敏感 (びんかん), 頑固な (がんこな), 感情の (かんじょうの) \n" +
                    "Sensitive, stubborn, emotional";
        } else if (zodiac.equals("豚")){
            // Zodiac is pig
            zodiacNm = "豚 (ぶた)";
            zodiacLuck = "幸運の数字 (こうんのすうじ): 二, 五, 八\n" + "ラッキーカラー: きいろ, ねずみ/はい, ちゃい, 金\n" + "吉方 (えほう): 南東, 北東";
            zodiacStngandWeak =
                    "強み (つよみ): \n" +
                    "忠実な (ちゅうじつな), 正直な(しょうじきな), 穏やか (おだやか) \n" +
                    "Loyal, honest, gentle \n" +
                    "弱点 (じゃくてん): \n" +
                    "素朴な (そぼくな),  だまされやすいです, 気が短いです (きがみじかいです) \n" +
                    "Naive, gullible, short-tempered";
        }

        // Display resulting horoscope
        TextView zodiacName = (TextView) findViewById(R.id.zodiacName);
        zodiacName.setText(zodiacNm);
        TextView luck = (TextView) findViewById(R.id.luck);
        luck.setText(zodiacLuck);
        TextView strngandweak = (TextView) findViewById(R.id.strngandweak);
        strngandweak.setText(zodiacStngandWeak);
        TextView Era = (TextView) findViewById(R.id.era);
        Era.setText(era);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, Translation.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
