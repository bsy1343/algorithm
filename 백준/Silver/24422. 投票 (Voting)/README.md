# [Silver II] 投票 (Voting) - 24422

[문제 링크](https://www.acmicpc.net/problem/24422)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 140, 정답: 93, 맞힌 사람: 77, 정답 비율: 83.696%

### 분류

누적 합

### 문제 설명

<p>JOI 高校において，ある議題に関して「賛成」か「反対」かを問う採決が行われ，<var>N</var>&nbsp;人の生徒が順番に投票を行った．生徒は自分の投票前に，それまでに投票した他の生徒がどちらに投票したかを知ることができた．</p>

<p><var>i</var>&nbsp;番目 (<var>1 ≦ i ≦ N</var>) に投票した生徒は，次の条件を満たしたとき「賛成」に投票し，満たさなかったとき「反対」に投票した．</p>

<ul>
	<li>直前に投票した&nbsp;<var>X<sub>i</sub></var>&nbsp;人の生徒，すなわち&nbsp;<var>i - 1,&nbsp;i - 2,&nbsp;...,&nbsp;i - X<sub>i</sub></var>&nbsp;番目に投票した生徒のうち，<var>Y<sub>i</sub></var>&nbsp;人以上が「賛成」に投票した．</li>
</ul>

<p>ただし，&nbsp;<var>Y<sub>i</sub>&nbsp;= 0</var>&nbsp;のときは他の生徒の投票に関わらず「賛成」に投票し，<var>Y<sub>i</sub>&nbsp;= X<sub>i</sub>&nbsp;+ 1</var>&nbsp;のときは他の生徒の投票に関わらず「反対」に投票したとする．</p>

<p>各生徒の投票についての情報が与えられたとき，「賛成」に投票した生徒の人数を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>X<sub>1</sub></var> <var>Y<sub>1</sub></var>
<var>X<sub>2</sub></var> <var>Y<sub>2</sub></var>
:
<var>X<sub>N</sub></var> <var>Y<sub>N</sub></var></pre>

### 출력

<p>標準出力に，「賛成」に投票した生徒の人数を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 500&nbsp;000</var>．</li>
	<li><var>0 ≦ X<sub>i</sub>&nbsp;≦ i - 1</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>0 ≦ Y<sub>i</sub>&nbsp;≦ X<sub>i</sub>&nbsp;+ 1</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>