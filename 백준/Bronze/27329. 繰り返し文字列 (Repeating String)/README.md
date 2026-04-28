# [Bronze III] 繰り返し文字列 (Repeating String) - 27329

[문제 링크](https://www.acmicpc.net/problem/27329)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 490, 정답: 427, 맞힌 사람: 393, 정답 비율: 87.919%

### 분류

구현, 문자열

### 문제 설명

<p>同じ文字列を <var>2</var> つつなげて得られる文字列を<strong>繰り返し文字列</strong>と呼ぶことにする．</p>

<p>例えば，<code>OIOI</code> や <code>JJJJJJ</code>，<code>JOIOIJOIOI</code> は繰り返し文字列であるが，<code>IOOI</code> や <code>JOIIOI</code> は繰り返し文字列ではない．</p>

<p>長さ <var>N</var> の文字列 <var>S</var> が与えられる．<var>N</var> は偶数であり，<var>S</var> の各文字は <code>J</code>，<code>O</code>，<code>I</code> のいずれかである．</p>

<p><var>S</var> が繰り返し文字列である場合は <code>Yes</code> を，そうでない場合は <code>No</code> を出力せよ．</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる．</p>

<pre>
<var>N</var>
<var>S</var></pre>

### 출력

<p><var>S</var> が繰り返し文字列である場合は <code>Yes</code> を，そうでない場合は <code>No</code> を出力せよ．</p>

### 제한

<ul>
	<li><var>2 ≦ N ≦ 100</var>．</li>
	<li><var>N</var> は偶数である．</li>
	<li><var>S</var> は長さ <var>N</var> の文字列である．</li>
	<li><var>S</var> の各文字は <code>J</code>，<code>O</code>，<code>I</code> のいずれかである．</li>
</ul>