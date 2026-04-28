# [Bronze IV] 三連続 (Three Consecutive) - 31636

[문제 링크](https://www.acmicpc.net/problem/31636)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 1025, 정답: 777, 맞힌 사람: 729, 정답 비율: 75.622%

### 분류

구현, 문자열

### 문제 설명

<p>長さ <var>N</var> の文字列 <var>S</var> が与えられる．<var>S</var> の各文字は <code>o</code> か <code>x</code> のいずれかである．</p>

<p><var>S</var> に <code>o</code> が <var>3</var> つ連続している箇所があれば <code>Yes</code> を，そうでないならば <code>No</code> を， <var>1</var> 行で出力せよ．</p>

<p>ただし， <code>o</code> が <var>3</var> つ連続している箇所の隣に <code>o</code> があっても良いものとする．</p>

### 입력

<p>入力は以下の形式で与えられる．</p>

<pre>
<var>N</var>
<var>S</var></pre>

### 출력

<p><var>S</var> に <code>o</code> が <var>3</var> つ連続している箇所があれば <code>Yes</code> を，そうでないならば <code>No</code> を出力せよ．</p>

### 제한

<ul>
	<li><var>1 ≦ N ≦ 100 000</var>．</li>
	<li><var>S</var> は長さ <var>N</var> の文字列である．</li>
	<li><var>S</var> の各文字は <code>o</code> か <code>x</code> のいずれかである．</li>
	<li><var>N</var> は整数である．</li>
</ul>