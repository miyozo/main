package myProgram;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Dentaku myCalculator = new Dentaku("my電卓");
		myCalculator.setBounds(100, 100, 300, 250);
		myCalculator.setVisible(true);
		// 閉じられたらプログラムも終了する
		myCalculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

class Dentaku extends JFrame 
{
	// 数値 表示部分
	JTextField text = new JTextField("0", 16);
	// 数字ボタン
	numBTN bt0 = new numBTN("0");
	numBTN bt1 = new numBTN("1");
	numBTN bt2 = new numBTN("2");
	numBTN bt3 = new numBTN("3");
	numBTN bt4 = new numBTN("4");
	numBTN bt5 = new numBTN("5");
	numBTN bt6 = new numBTN("6");
	numBTN bt7 = new numBTN("7");
	numBTN bt8 = new numBTN("8");
	numBTN bt9 = new numBTN("9");

	// 演算子ボタン
	funBTN bttasu = new funBTN("+");
	funBTN btkakeru = new funBTN("×");
	funBTN bthiku = new funBTN("-");
	funBTN btwaru = new funBTN("÷");
	funBTN bteq = new funBTN("=");
	funBTN btp = new funBTN(".");
	funBTN btc = new funBTN("C");
	funBTN btpm = new funBTN("+/-");
	funBTN btsq = new funBTN("√ ");

	/*
	 * 電卓計算用変数を一括宣言 operand1: 第一被演算子,perand2: 第二被演算子 operator:
	 * double型ではなくBigDecimal型に変更
	 * 演算子
	 */
	BigDecimal operand1 = BigDecimal.ZERO;
	BigDecimal operand2 = BigDecimal.ZERO;
	String operator = "";
	// 小数点入力フラグ
	boolean period = false;
	// 小数9桁まで表示
	private DecimalFormat fmt = new DecimalFormat("0.#########");

	Dentaku(String str) 
	{
		super(str);
		createDentaku();
	}

	void createDentaku() 
	{
		/*
		 * displayは電卓の表示部 bodyは表示部以外の本体部 numPanelに数値ボタンを、funPanelに機能ボタンを配置
		 */
		JPanel display = new JPanel(); // パネル用意
		JPanel body = new JPanel();
		JPanel numPanel = new JPanel();
		JPanel funPanel = new JPanel();

		/*
		 * □□□□□ displayをNORTHに配置、bodyをCENTERに配置 ■■■□□ bodyにnumPanelとfunPanelを配置 ■■■□□
		 * CENTERにnumPanel、EASTにfunPanel
		 */
		body.add(numPanel, BorderLayout.CENTER);
		body.add(funPanel, BorderLayout.EAST);
		getContentPane().add(display, BorderLayout.NORTH);
		getContentPane().add(body, BorderLayout.CENTER);

		// displayパネル実装メソッドを呼び出す
		setDisplay(display);
		// numPanelパネル実装メソッドを呼び出す
		setNumPanel(numPanel);
		// funPanelパネル実装メソッドを呼び出す
		setFunPanel(funPanel);
	}

	void setDisplay(JPanel p) 
	{
		// displayパネルを実装、２つのラベルを張り付ける
		text.setHorizontalAlignment(JTextField.RIGHT);
		text.setEditable(false);
		p.add(text);
	}

	void setNumPanel(JPanel p) 
	{
		p.setLayout(new GridLayout(5, 4));
		p.add(btc);
		p.add(btpm);
		p.add(btsq);
		p.add(bt7);
		p.add(bt8);
		p.add(bt9);
		p.add(bt4);
		p.add(bt5);
		p.add(bt6);
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		p.add(bt0);
		p.add(btp);
	}

	void setFunPanel(JPanel p) 
	{
		// funPanelの残りの演算子ボタンを配置
		p.setLayout(new GridLayout(5, 1));
		p.add(btwaru);
		p.add(btkakeru);
		p.add(bthiku);
		p.add(bttasu);
		p.add(bteq);
	}

	// 数値ボタン専用クラス：numBTN
	class numBTN extends JButton implements ActionListener 
	{
		public numBTN(String label) 
		{
			super(label);
			// ボタンにActionListnenerを付ける
			this.addActionListener(this);
		}

		public void actionPerformed(ActionEvent evt) 
		{
			// クリックされたボタンのラベルを取得
			String str = this.getText();

			if (period) 
			{
				str = "." + str;
				period = false;
			}
			try 
			{
				if (operator.isEmpty()) 
				{
					// operand1にlabelの値（文字列）を実数変換して保存
					operand1 = new BigDecimal(operand1.toString() + str);
					text.setText(operand1.toString());

				}
				// 記録中のoperator値があれば、つまりoperand1はすでに値がある、
				// labelの値は第二被演算子に該当するからoperand2に記録
				else 
				{
					operand2 = new BigDecimal(operand2.toString() + str);
					text.setText(operand2.toString());
				}
			}
			catch (NumberFormatException e) 
			{
				// ピリオドが複数回入力された場合、無視する
			}
		}
	}

	// 演算子ボタン専用クラス:funBTN
	class funBTN extends JButton implements ActionListener 
	{
		funBTN(String label) 
		{
			super(label);
			// ボタンにActionListenerを付ける
			this.addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) 
		{
			// クリックされた演算子ボタンのラベルを取得
			String str = this.getText();

			// クリックされた演算子ボタンが = の場合、operatorをクリア
			if (str.equals("=")) 
			{
				// クリックに対応する計算ルール
				if (operator.equals("+")) 
				{
					operand1 = operand1.add(operand2);
				} 
				else if (operator.equals("-")) 
				{
					operand1 = operand1.subtract(operand2);
				} 
				else if (operator.equals("×")) 
				{
					operand1 = operand1.multiply(operand2);
				} 
				else if (operator.equals("÷")) 
				{
					//0で割った時の挙動
					if (operand2.equals(BigDecimal.ZERO)) 
					{
						operand1 = BigDecimal.ZERO;
					}
					
					else 
					{
						operand1 = operand1.divide(operand2, 9, RoundingMode.HALF_EVEN);
					}
				}
				
				// 結果をtextに反映
				text.setText("" + fmt.format(operand1));
				operand2 = BigDecimal.ZERO; // operand2の初期化
				operator = "";
			}
			// クリックされた演算子が + の場合、operatorに + を保存
			if (str.equals("+")) 
			{
				operator = "+";
			}
			else if (str.equals("-")) 
			{
				operator = "-";
			} 
			else if (str.equals("×")) 
			{
				operator = "×";
			} 
			else if (str.equals("÷")) 
			{
				operator = "÷";
			}
			
			else if (str.equals("+/-")) 
			{
				BigDecimal fugou = new BigDecimal("-1");
				operand1 = operand1.multiply(fugou);
				operator = "";
				text.setText("" + fmt.format(operand1));
			}
			
			else if (str.equals("√ ")) 
			{
				MathContext mc = new MathContext(9);
				operand1 = operand1.sqrt(mc);
				operator = "";
				text.setText("" + fmt.format(operand1));
			}
			
			else if (str.equals("C")) 
			{
				operand1 = operand2 = BigDecimal.ZERO;
				operator = "";
				text.setText("0");
			} 
			else if (str.equals(".")) 
			{
				period = true;
			}
		}
	}
}
