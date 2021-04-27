package com.example.msi_modern.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View decorView;
    Button[] btn = new Button[19];
    private TextView screenExpression, screenResult;
    float firstNumber = 0, secondeNumber = 0;
    int operators = 0;
    int numbers = 0;
    boolean isEqualPressed = false, isPoint = false, isOperator = false;
    String expression = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                if (visibility == 0) {
                    hideSystemBar();
                }
            }
        });

        screenExpression = findViewById(R.id.expression);
        screenResult = findViewById(R.id.result);

        btn[10] = findViewById(R.id.ac);
        btn[11] = findViewById(R.id.del);
        btn[12] = findViewById(R.id.modulo);
        btn[13] = findViewById(R.id.divide);
        btn[14] = findViewById(R.id.multiply);
        btn[15] = findViewById(R.id.subtract);
        btn[16] = findViewById(R.id.add);
        btn[17] = findViewById(R.id.point);
        btn[18] = findViewById(R.id.equal);
        //------------------------------------
        btn[0] = findViewById(R.id.zero);
        btn[1] = findViewById(R.id.one);
        btn[2] = findViewById(R.id.two);
        btn[3] = findViewById(R.id.three);
        btn[4] = findViewById(R.id.four);
        btn[5] = findViewById(R.id.five);
        btn[6] = findViewById(R.id.six);
        btn[7] = findViewById(R.id.seven);
        btn[8] = findViewById(R.id.eight);
        btn[9] = findViewById(R.id.nine);

        screenExpression.setText("");
        screenResult.setText("");
        for (int i = 0; i < 19; i++) {
            final int func = i;
             btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView thisButton = (TextView) view;
                    String ID_of_Button = getResources().getResourceEntryName(thisButton.getId());
                    switch(ID_of_Button) {
                        case "zero":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "0";
                                isEqualPressed = false;
                            } else expression += '0';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
                            break;
                        case "one":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "1";
                                isEqualPressed = false;
                            } else expression += '1';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                            break;
                        case "two":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "2";
                                isEqualPressed = false;
                            } else expression += '2';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                            break;
                        case "three":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "3";
                                isEqualPressed = false;
                            } else expression += '3';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                            break;
                        case "four":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "4";
                                isEqualPressed = false;
                            } else expression += '4';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
                            break;
                        case "five":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "5";
                                isEqualPressed = false;
                            } else expression += '5';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_SHORT).show();
                            break;
                        case "six":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "6";
                                isEqualPressed = false;
                            } else expression += '6';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                            break;
                        case "seven":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "7";
                                isEqualPressed = false;
                            } else expression += '7';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_SHORT).show();
                            break;
                        case "eight":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "8";
                                isEqualPressed = false;
                            } else expression += '8';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "8", Toast.LENGTH_SHORT).show();
                            break;
                        case "nine":
                            isOperator = false;
                            if (operators == 1) numbers = 2;
                            else numbers = 1;
                            if (isEqualPressed) {
                                expression = "9";
                                isEqualPressed = false;
                            } else expression += '9';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_SHORT).show();
                            break;
                        case "ac":
                            expression = "";
                            operators = 0;
                            isPoint = false;
                            isEqualPressed = false;
                            isOperator = true;
                            numbers = 0;
                            screenExpression.setText(expression);
                            screenResult.setText(expression);
                            //Toast.makeText(getApplicationContext(), "ac", Toast.LENGTH_SHORT).show();
                            break;
                        case "del":
                            if (expression == "") break;
                            char character = expression.charAt(expression.length() - 1);
                            if (character == '.') isPoint = false;
                            if (character == '-' || character == '+' || character == 'x' || character == '%' || character == '/') {
                                isOperator = false;
                                operators -= 1;
                            }
                            if (expression.length() > 1) {
                                expression = expression.substring(0,expression.length() - 1);
                            } else {
                                expression = "";
                                operators = 0;
                                isPoint = false;
                                isEqualPressed = false;
                                isOperator = true;
                                numbers = 0;
                                screenResult.setText(expression);
                            }
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "del", Toast.LENGTH_SHORT).show();
                            break;
                        case "modulo":
                            if (isOperator) break;
                            if (expression == "") break;
                            operators += 1;
                            isEqualPressed = false;
                            isPoint = false;
                            isOperator = true;
                            if (operators == 2) {
                                expression = processExpression(expression);
                                screenResult.setText(expression);
                                operators -= 1;
                            }
                            expression += '%';
                            screenExpression.setText(expression);

                            //Toast.makeText(getApplicationContext(), "%", Toast.LENGTH_SHORT).show();
                            break;
                        case "divide":
                            if (isOperator) break;
                            if (expression == "") break;
                            operators += 1;
                            isEqualPressed = false;
                            isPoint = false;
                            isOperator = true;
                            if (operators == 2) {
                                expression = processExpression(expression);
                                screenResult.setText(expression);
                                operators -= 1;
                            }
                            expression += '/';
                            screenExpression.setText(expression);

                            //Toast.makeText(getApplicationContext(), "/", Toast.LENGTH_SHORT).show();
                            break;
                        case "multiply":
                            if (isOperator) break;
                            if (expression == "") break;
                            operators += 1;
                            isEqualPressed = false;
                            isPoint = false;
                            isOperator = true;
                            if (operators == 2) {
                                expression = processExpression(expression);
                                screenResult.setText(expression);
                                operators -= 1;
                            }
                            expression += 'x';
                            screenExpression.setText(expression);

                            //Toast.makeText(getApplicationContext(), "x", Toast.LENGTH_SHORT).show();
                            break;
                        case "subtract":
                            if (isOperator) break;
                            operators += 1;
                            isEqualPressed = false;
                            isPoint = false;
                            isOperator = true;
                            if (operators == 2) {
                                expression = processExpression(expression);
                                screenResult.setText(expression);
                                operators -= 1;
                            }
                            expression += '-';
                            screenExpression.setText(expression);

                            //Toast.makeText(getApplicationContext(), "-", Toast.LENGTH_SHORT).show();
                            break;
                        case "add":
                            if (isOperator) break;
                            operators += 1;
                            isEqualPressed = false;
                            isPoint = false;
                            isOperator = true;
                            if (operators == 2) {
                                expression = processExpression(expression);
                                screenResult.setText(expression);
                                operators -= 1;
                            }
                            expression += '+';
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), "+", Toast.LENGTH_SHORT).show();
                            break;
                        case "point":
                            if (isPoint || isOperator) break;
                            expression += '.';
                            isPoint = true;
                            isOperator = false;
                            screenExpression.setText(expression);
                            //Toast.makeText(getApplicationContext(), ".", Toast.LENGTH_SHORT).show();
                            break;
                        case "equal":
                            if (numbers < 2) break;
                            expression = processExpression(expression);
                            operators = 0;
                            isPoint = false;
                            isOperator = false;
                            numbers = 0;
                            isEqualPressed = true;
                            screenResult.setText(expression);
                            //Toast.makeText(getApplicationContext(), "=", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            break;
                    }
                }
            });
        }


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            decorView.setSystemUiVisibility(hideSystemBar());
        }
    }

    private int hideSystemBar() {
        return View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }

    String processExpression(String expression) {
        int cur = 0;
        float [] nums = new float[2];
        float result = 0;
        int sign = 1;
        if (expression.charAt(0) == '-' || expression.charAt(0) == '+') {
            if (expression.charAt(0) == '-' ) sign = - 1;
            expression = expression.substring(1, expression.length());
        }
        //Log.d("cal", expression);
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (character == '-' || character == '+' || character == 'x' || character == '%' || character == '/') {
                nums[0] = Float.valueOf(expression.substring(0, i)) * sign;
                if (i+1 == expression.length()) nums[1] = 0;
                else nums[1] = Float.valueOf(expression.substring(i+1, expression.length()));
                //Log.d("cal", Float.toString(nums[0]) + " " + Float.toString(nums[1]));
                switch (character) {
                    case '+':
                        result = nums[0] + nums[1];
                        break;
                    case '-':
                        result = nums[0] - nums[1];
                        break;
                    case 'x':
                        result = nums[0] * nums[1];
                        break;
                    case '/':
                        result = nums[0] / nums[1];
                        break;
                    case '%':
                        result = nums[0] % nums[1];
                        break;
                    default:
                        break;
                }
            }
        }
        float ans = result;
        float checkResult = (float) Math.floor((double)ans);
        if (result - checkResult > 0.0001) {
            return Float.toString(result);
        } else {
            return Integer.toString((int)checkResult);
        }
    }
}
