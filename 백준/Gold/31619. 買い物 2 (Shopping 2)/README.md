# [Gold I] 買い物 2 (Shopping 2) - 31619

[문제 링크](https://www.acmicpc.net/problem/31619)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 153, 정답: 56, 맞힌 사람: 49, 정답 비율: 65.333%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 누적 합

### 문제 설명

<p>JOI 商店には <var>N</var> 個の商品があり，商品には <var>1</var> から <var>N</var> までの番号が付けられている．</p>

<p>それぞれの商品には，<strong>定価</strong>と<strong>種類</strong>が定められている．商品 <var>i</var> (<var>1 ≦ i ≦ N</var>) の定価は <var>P<sub>i</sub></var> 円である．商品の種類は <var>1</var> 以上 <var>M</var> 以下の整数で表され，商品 <var>i</var> (<var>1 ≦ i ≦ N</var>) の種類は <var>A<sub>i</sub></var> である．</p>

<p>JOI 商店は，セールを行うことにした．セールは <var>M</var> 日間続き，<var>j</var> 日目 (<var>1 ≦ j ≦ M</var>) には種類 <var>j</var> の商品をすべて定価の半額で買うことができる．</p>

<p>セールの期間中に，<var>Q</var> 人の客が JOI 商店を訪れた．客には <var>1</var> から <var>Q</var> までの番号が付けられている．客 <var>k</var> (<var>1 ≦ k ≦ Q</var>) はセールの <var>T<sub>k</sub></var> 日目に JOI 商店を訪れ，商品 <var>L<sub>k</sub>, L<sub>k+1</sub>, &hellip;, R<sub>k</sub></var> を <var>1</var> つずつ買った．</p>

<p>セールの効果を調査するため，それぞれの客が商品を買うのにかかった金額を知りたい．</p>

<p>商品の情報と客の情報が与えられたとき，それぞれの客が商品を買うのにかかった金額を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>   <var>M</var>   <var>Q</var>
<var>P<sub>1</sub></var>   <var>A<sub>1</sub></var>
<var>P<sub>2</sub></var>   <var>A<sub>2</sub></var>
<var>︙</var>
<var>P<sub>N</sub></var>   <var>A<sub>N</sub></var>
<var>T<sub>1</sub></var>   <var>L<sub>1</sub></var>   <var>R<sub>1</sub></var>
<var>T<sub>2</sub></var>   <var>L<sub>2</sub></var>   <var>R<sub>2</sub></var>
<var>︙</var>
<var>T<sub>Q</sub></var>   <var>L<sub>Q</sub></var>   <var>R<sub>Q</sub></var></pre>

### 출력

<p><var>Q</var> 行出力せよ．<var>k</var> 行目 (<var>1 ≦ k ≦ Q</var>) には，客 <var>k</var> が商品を買うのにかかった金額を，単位 (円) を省いて出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 200 000</var>．</li>
	<li><var>1 ≦ M≦ 200 000</var>．</li>
	<li><var>1 ≦ Q ≦ 200 000</var>．</li>
	<li><var>2 ≦ P<sub>i</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>P<sub>i</sub></var> は偶数である (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ M</var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ T<sub>k</sub> ≦ M</var> (<var>1 ≦ k ≦ Q</var>)．</li>
	<li><var>1 ≦ L<sub>k</sub> ≦ R<sub>k</sub> ≦ N</var> (<var>1 ≦ k ≦ Q</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>