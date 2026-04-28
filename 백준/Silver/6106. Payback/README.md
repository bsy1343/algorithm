# [Silver I] Payback - 6106

[문제 링크](https://www.acmicpc.net/problem/6106)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 334, 정답: 122, 맞힌 사람: 106, 정답 비율: 38.406%

### 분류

그리디 알고리즘

### 문제 설명

<p>&quot;Never a borrower nor a lender be.&quot; O how Bessie wishes she had taken that advice! She has borrowed from or lent money to each of N (1 &lt;= N &lt;= 100,000) friends, conveniently labeled 1..N.</p>

<p>Payback day has finally come. She knows she is owed more money than she owes to the other cows. They have all lined up in a straight line, cow i standing i meters from the barn. Bessie is going to traverse the line collecting money from those who owe her and reimbursing money to those she owes.</p>

<p>As she moves down the line, she can request any cow who owes her money to give her the money. When she has enough money to pay off any or all of her debts, she can pay the (recently collected) money to those she owes. Cow i owes Bessie D_i money (-1,000 &lt;= D_i &lt;= 1,000; D_i != 0). A negative debt means that Bessie owes money to the cow instead of vice-versa.</p>

<p>Bessie starts at the barn, location 0. What is the minimum distance she must travel to collect her money and pay all those she owes? She must end her travels at the end of the line.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: D_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the total metric distance Bessie must travel in order to collect or pay each cow.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<pre>
Barn  100  -200  250 -200  200
 |     |     |    |    |    |
 ***&gt;**+**&gt;*****&gt;**+
                   *            &lt; Bessie has 350
             -**&lt;***
             *                  &lt; Bessie has 150
             ***&gt;****&gt;****&gt;**+
                             *  &lt; Bessie has 350
                       -**&lt;***
                       *     
                       ***&gt;***  &lt; Bessie ends her travels with 150*</pre>

<p>&nbsp;</p>