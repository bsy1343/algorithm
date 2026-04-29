# [Platinum I] 親密なシェフ (Intimate Chef) - 33176

[문제 링크](https://www.acmicpc.net/problem/33176)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 51, 정답: 13, 맞힌 사람: 11, 정답 비율: 23.913%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘, 너비 우선 탐색, 세그먼트 트리, 오프라인 쿼리, 우선순위 큐, 이분 탐색, 자료 구조, 정렬

### 문제 설명

<p>あるボリビア料理レストランでは <var>1</var> から <var>N</var> までの番号が付けられている <var>N</var> 人のシェフが働いている．シェフ <var>i</var> (<var>1 ≦ i ≦ N</var>) は<b>美味しさ</b>が <var>A<sub>i</sub></var> であるシルパンチョと美味しさが <var>B<sub>i</sub></var> であるピケマチョを作ることができる．</p>

<p>ただし，シェフはこだわりが強いため仲が悪い <var>2</var> 人組が <var>M</var> 組いる．仲が悪い <var>2</var> 人組の <var>j</var> 番目 (<var>1 ≦ j ≦ M</var>) はシェフ <var>U<sub>j</sub></var> とシェフ <var>V<sub>j</sub></var> の <var>2</var> 人組である．</p>

<p>このレストランに来店する客は以下のようにして料理を食べる．</p>

<ul>
	<li><var>1 ≦ p &lt; q ≦ N</var> を満たす整数 <var>p, q</var> を選び，シェフ <var>p</var> とシェフ <var>q</var> の <var>2</var> 人組に料理を作ることを依頼する．ただし，仲が悪い <var>2</var> 人組に料理を作ることを依頼することはできない．</li>
	<li>シルパンチョとピケマチョの各料理はシェフ <var>p</var> とシェフ <var>q</var> のうち美味しさがより高いものを作ることができるシェフが作る．ある料理について <var>2</var> 人が同じ美味しさの料理を作ることができるとき，どちらか <var>1</var> 人のシェフが作る．<var>1</var> 人のシェフが <var>2</var> つの料理を作ることも可能であることに注意せよ．</li>
	<li>客の<b>満足度</b>はシルパンチョの美味しさとピケマチョの美味しさの合計である．</li>
</ul>

<p>このレストランに <var>1</var> から <var>Q</var> までの番号が付けられている <var>Q</var> 人の客が来店した．</p>

<p>客 <var>k</var> (<var>1 ≦ k ≦ Q</var>) は，料理を作ることを依頼することができる <var>2</var> 人組のうち，満足度が <var>X<sub>k</sub></var> 番目に高くなる <var>2</var> 人組に料理を作ることを依頼した．具体的には満足度を <var>S</var> として，<var>S × N<sup>2</sup> + p × N + q</var> が <var>X<sub>k</sub></var> 番目に高くなるシェフ <var>p</var> とシェフ <var>q</var> (<var>1 ≦ p &lt; q ≦ N</var>) の <var>2</var> 人組に料理を作ることを依頼した．</p>

<p>レストランのシェフと客の情報が与えられたとき，客 <var>k</var> (<var>1 ≦ k ≦ Q</var>) の満足度を求めるプログラムを作成せよ．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre><var>N</var> <var>M</var> <var>Q</var>
<var>A<sub>1</sub></var> <var>A<sub>2</sub></var> <var>…</var> <var>A<sub>N</sub></var>
<var>B<sub>1</sub></var> <var>B<sub>2</sub></var> <var>…</var> <var>B<sub>N</sub></var>
<var>U<sub>1</sub></var> <var>V<sub>1</sub></var>
<var>U<sub>2</sub></var> <var>V<sub>2</sub></var>
<var>:</var>
<var>U<sub>M</sub></var> <var>V<sub>M</sub></var>
<var>X<sub>1</sub></var> <var>X<sub>2</sub></var> <var>…</var> <var>X<sub>Q</sub></var></pre>

### 출력

<p><var>Q</var> 行に出力せよ．<var>k</var> 行目 (<var>1 ≦ k ≦ Q</var>) には客 <var>k</var> の満足度を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 400 000</var>．</li>
	<li><var>1 ≦ A<sub>i</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>1 ≦ B<sub>i</sub> ≦ 10<sup>9</sup></var> (<var>1 ≦ i ≦ N</var>)．</li>
	<li><var>0 ≦ M ≦ 400 000</var>．</li>
	<li><var>M &lt; N(N - 1)÷2</var>．</li>
	<li><var>1 ≦ U<sub>j</sub> &lt; V<sub>j</sub> ≦ N</var> (<var>1 ≦ j ≦ M</var>)．</li>
	<li><var>(U<sub>i</sub>, V<sub>i</sub>) ≠ (U<sub>j</sub>, V<sub>j</sub>)</var> (<var>1 ≦ i &lt; j ≦ M</var>)．</li>
	<li><var>1 ≦ Q ≦ 400 000</var>．</li>
	<li><var>1 ≦ X<sub>k</sub> ≦ 400 000</var> (<var>1 ≦ k ≦ Q</var>)．</li>
	<li><var>X<sub>k</sub> ≦ N(N - 1)÷2 - M</var> (<var>1 ≦ k ≦ Q</var>)．
	<ul>
		<li>入力される値はすべて整数である．</li>
	</ul>
	</li>
</ul>