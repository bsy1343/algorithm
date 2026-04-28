# [Gold I] エゴイ展 (EGOI Exhibition) - 24424

[문제 링크](https://www.acmicpc.net/problem/24424)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 117, 정답: 57, 맞힌 사람: 49, 정답 비율: 60.494%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리

### 문제 설명

<p>JOI 美術館には，<var>N</var>&nbsp;枚の絵が横一列に飾られている．美術館に展示されている絵には&nbsp;<var>M</var>&nbsp;個の種類があり，<var>1</var>&nbsp;から&nbsp;<var>M</var>&nbsp;までの番号が付けられている．左から&nbsp;<var>i</var>&nbsp;番目 (<var>1 ≦ i ≦ N</var>) の絵の種類は&nbsp;<var>A<sub>i</sub></var>&nbsp;であり，価値は&nbsp;<var>V<sub>i</sub></var>&nbsp;である．<strong>ここで，<var>V<sub>i</sub></var>&nbsp;は負の数になることもある．</strong></p>

<p>来月，JOI 美術館では「エゴイ展 2022」が開催予定であり，多くの来客が見込まれるため，見栄えを良くしたい．そこで館長の理恵さんは，隣り合う絵が同じ種類にならないように，いくつかの絵を撤去することにした．</p>

<p>一方で，評判を高めるため，残された絵の価値の合計をできるだけ大きくしたい．</p>

<p>絵の枚数，絵の種類数，<var>N</var>&nbsp;枚の絵の情報が与えられたとき，残された絵の価値の合計として考えられる最大値を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>M</var>
<var>A<sub>1</sub></var> <var>V<sub>1</sub></var>
<var>A<sub>2</sub></var> <var>V<sub>2</sub></var>
:
<var>A<sub>N</sub></var> <var>V<sub>N</sub></var></pre>

### 출력

<p>標準出力に，残された絵の価値の合計として考えられる最大値を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 150&nbsp;000</var>．</li>
	<li><var>1 ≦ M ≦ N</var>．</li>
	<li><var>1 ≦ A<sub>i</sub>&nbsp;≦ M</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>- 10&nbsp;000 ≦ V<sub>i</sub>&nbsp;≦ 10&nbsp;000</var>&nbsp;(<var>1 ≦ i ≦ N</var>)．</li>
	<li>入力される値はすべて整数である．</li>
</ul>