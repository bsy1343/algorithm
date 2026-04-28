# [Bronze II] 運動会 (Sports Day) - 24088

[문제 링크](https://www.acmicpc.net/problem/24088)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 228, 정답: 183, 맞힌 사람: 157, 정답 비율: 83.511%

### 분류

구현, 문자열

### 문제 설명

<p>JOI 高校には&nbsp;<var>N</var>&nbsp;人の生徒がおり，<var>1</var>&nbsp;から&nbsp;<var>N</var>&nbsp;までの出席番号が付けられている．</p>

<p>来月 JOI 高校では運動会が開催され，<var>N</var>&nbsp;人の生徒全員がこれに参加する．生徒のうち&nbsp;<var>K</var>&nbsp;人が赤組に，残りの&nbsp;<var>N-K</var>&nbsp;人が白組に属している．</p>

<p>出席番号&nbsp;<var>N</var>&nbsp;番の葵は，自分がどちらの組に属しているかを忘れてしまった．そこで，自分以外の生徒&nbsp;<var>N-1</var>&nbsp;人それぞれがどちらの組に属しているかを聞いてまわることで，自分がどちらの組に属しているかを判断することにした．</p>

<p>葵以外の&nbsp;<var>N-1</var>&nbsp;人の組み分けの情報は，長さ&nbsp;<var>N-1</var>&nbsp;の文字列&nbsp;<var>S</var>&nbsp;で表される．<var>S</var>&nbsp;の各文字は&nbsp;<code>R</code>，<code>W</code>&nbsp;のいずれかであり，その意味は次の通りである．</p>

<ul>
	<li><var>S</var>&nbsp;の&nbsp;<var>i</var>&nbsp;文字目 (<var>1 ≦ i ≦ N-1</var>) が&nbsp;<code>R</code>&nbsp;の場合は，出席番号&nbsp;<var>i</var>&nbsp;番の生徒が赤組に属していることを表す．</li>
	<li><var>S</var>&nbsp;の&nbsp;<var>i</var>&nbsp;文字目 (<var>1 ≦ i ≦ N-1</var>) が&nbsp;<code>W</code>&nbsp;の場合は，出席番号&nbsp;<var>i</var>&nbsp;番の生徒が白組に属していることを表す．</li>
</ul>

<p>葵が赤組に属しているならば&nbsp;<code>R</code>&nbsp;と，白組に属しているならば&nbsp;<code>W</code>&nbsp;と出力せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>K</var>
<var>S</var></pre>

### 출력

<p>葵が赤組に属しているならば&nbsp;<code>R</code>&nbsp;と，白組に属しているならば&nbsp;<code>W</code>&nbsp;と出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 2000</var>．</li>
	<li><var>1 ≦ K ≦ N-1</var>．</li>
	<li><var>S</var>&nbsp;は長さ&nbsp;<var>N-1</var>&nbsp;の文字列である．</li>
	<li><var>S</var>&nbsp;の各文字は&nbsp;<code>R</code>，<code>W</code>&nbsp;のいずれかである．</li>
	<li><var>S</var>&nbsp;に含まれる&nbsp;<code>R</code>&nbsp;の個数は&nbsp;<var>K-1</var>&nbsp;個または&nbsp;<var>K</var>&nbsp;個である．</li>
	<li><var>N, K</var>&nbsp;は整数である．</li>
</ul>