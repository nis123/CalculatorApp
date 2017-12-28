package com.example.nishanth.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calc = Calc()
        var val1 : String = ""
        var val2 : String = ""
        var state : Boolean = true
        var tmp_op : String = "";

        /**
         * These are on click listeners for the various numbers a user can enter
         */
        button1.setOnClickListener(){v -> input.setText(input.text.toString() + button1.text.toString())
            if(state)
                val1 += button1.text.toString();
            else
                val2 += button1.text.toString();
        }
        button2.setOnClickListener(){v -> input.setText(input.text.toString() + button2.text.toString())
            if(state)
                val1 += button2.text.toString();
            else
                val2 += button2.text.toString();
        }
        button3.setOnClickListener(){v -> input.setText(input.text.toString() + button3.text.toString())
            if(state)
                val1 += button3.text.toString();
            else
                val2 += button3.text.toString();
        }
        button4.setOnClickListener(){v -> input.setText(input.text.toString() + button4.text.toString())
            if(state)
                val1 += button4.text.toString();
            else
                val2 += button4.text.toString();
        }
        button5.setOnClickListener(){v -> input.setText(input.text.toString() + button5.text.toString())
            if(state)
                val1 += button5.text.toString();
            else
                val2 += button5.text.toString();
        }
        button6.setOnClickListener(){v -> input.setText(input.text.toString() + button6.text.toString())
            if(state)
                val1 += button6.text.toString();
            else
                val2 += button6.text.toString();
        }
        button7.setOnClickListener(){v -> input.setText(input.text.toString() + button7.text.toString())
            if(state)
                val1 += button7.text.toString();
            else
                val2 += button7.text.toString();
        }
        button8.setOnClickListener(){v -> input.setText(input.text.toString() + button8.text.toString())
            if(state)
                val1 += button8.text.toString();
            else
                val2 += button8.text.toString();
        }
        button9.setOnClickListener(){v -> input.setText(input.text.toString() + button9.text.toString())
            if(state)
                val1 += button9.text.toString();
            else
                val2 += button9.text.toString();
        }
        button0.setOnClickListener(){v -> input.setText(input.text.toString() + button0.text.toString())
            if(state)
                val1 += button0.text.toString();
            else
                val2 += button0.text.toString();
        }

        button_add.setOnClickListener(){v -> input.setText(input.text.toString() + button_add.text.toString())
            if(state){
                state = false;
                if(calc.isEmpty)tmp_op = button_add.text.toString();
                calc.addOp(val1);
            }else{
                state = true;
                calc.addOp(val2);
                if(!tmp_op.equals("")) {
                    calc.addOp(button_add.text.toString())
                    tmp_op = button_add.text.toString();
                }else{
                    calc.addOp(button_add.text.toString())
                }
            }
        }

        button_sub.setOnClickListener(){v -> input.setText(input.text.toString() + button_sub.text.toString())
            if(state){
                state = false;
                if(calc.isEmpty)tmp_op = button_sub.text.toString();
                calc.addOp(val1);
            }else{
                state = true;
                calc.addOp(val2);
                if(!tmp_op.equals("")) {
                    calc.addOp(button_sub.text.toString())
                    tmp_op = button_sub.text.toString();
                }else{
                    calc.addOp(button_sub.text.toString())
                }
            }
        }

        button_mult.setOnClickListener(){v -> input.setText(input.text.toString() + button_mult.text.toString())
            if(state){
                state = false;
                if(calc.isEmpty)tmp_op = button_mult.text.toString();
                calc.addOp(val1);
            }else{
                state = true;
                calc.addOp(val2);
                if(!tmp_op.equals("")) {
                    calc.addOp(button_mult.text.toString())
                    tmp_op = button_mult.text.toString();
                }else{
                    calc.addOp(button_mult.text.toString())
                }
            }
        }

        button_div.setOnClickListener(){v -> input.setText(input.text.toString() + button_div.text.toString())
            if(state){
                state = false;
                if(calc.isEmpty)tmp_op = button_div.text.toString();
                calc.addOp(val1);
            }else{
                state = true;
                calc.addOp(val2);
                if(!tmp_op.equals("")) {
                    calc.addOp(button_div.text.toString())
                    tmp_op = button_div.text.toString();
                }else{
                    calc.addOp(button_div.text.toString())
                }
            }
        }

        button_enter.setOnClickListener(){v ->
            calc.addOp(val2)
            calc.addOp(tmp_op)
            input.setText(calc.value.toString())
            val1 = input.text.toString()
            state = true
            tmp_op = ""
        }
    }
}
