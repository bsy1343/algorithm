# [Platinum III] L番目のK番目の数 (LthKthNumber) - 15479

[문제 링크](https://www.acmicpc.net/problem/15479)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 57, 맞힌 사람: 52, 정답 비율: 88.136%

### 분류

이분 탐색, 두 포인터

### 문제 설명

<p>横一列に並べられた&nbsp;<var>N</var>&nbsp;枚のカードがある．左から&nbsp;<var>i</var>&nbsp;枚目(<var>1 ≦ i ≦ N</var>)のカードには，整数&nbsp;<var>a_i</var>&nbsp;が書かれている．</p>

<p>JOI 君は，これらのカードを用いて次のようなゲームを行う．連続する&nbsp;<var>K</var>&nbsp;枚以上のカードの列を選び，次の操作を行う．</p>

<ul>
	<li>選んだカードを，書かれている整数が小さい順に左から並べる．</li>
	<li>並べたカードのうち，左から&nbsp;<var>K</var>&nbsp;番目のカードに書かれた整数を紙に書き出す．</li>
	<li>選んだカードを，すべて元の位置に戻す．</li>
</ul>

<p>この操作を，連続する&nbsp;<var>K</var>&nbsp;枚以上のカードの列すべてに対して行う．すなわち，<var>1 ≦ l ≦ r ≦ N</var>&nbsp;かつ&nbsp;<var>K ≦ r - l + 1</var>&nbsp;を満たすすべての&nbsp;<var>(l,r)</var>&nbsp;について，<var>a_l, a_{l+1}, ..., a_r</var>&nbsp;のうち&nbsp;<var>K</var>&nbsp;番目に小さな整数を書き出す．</p>

<p>こうして書き出された整数を，左から小さい順に並べる．並べた整数のうち，左から&nbsp;<var>L</var>&nbsp;番目のものがこのゲームにおける JOI 君の得点である．JOI 君の得点を求めよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var> <var>K</var> <var>L</var>
<var>a_1</var> <var>a_2</var> <var>...</var> <var>a_N</var>
</pre>

### 출력

<p>JOI 君の得点を&nbsp;<var>1</var>&nbsp;行で出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 200000</var></li>
	<li><var>1 ≦ K ≦ N</var></li>
	<li><var>1 ≦ a_i ≦ N</var></li>
	<li><var>1 ≦ L</var></li>
	<li>JOI 君が書き出す整数は&nbsp;<var>L</var>&nbsp;個以上である．</li>
</ul>