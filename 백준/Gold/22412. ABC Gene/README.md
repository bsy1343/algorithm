# [Gold II] ABC Gene - 22412

[문제 링크](https://www.acmicpc.net/problem/22412)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 19, 맞힌 사람: 18, 정답 비율: 34.615%

### 분류

문자열, 브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>文字列 <code>ABC</code> で表される遺伝子配列がある。あなたは次の操作を何回か行い、この遺伝子配列を書き換えていくことができる。</p>

<ul>
	<li>文字 <code>A</code>，<code>B</code>，<code>C</code> のうち $1$ つを選ぶ。これを $x$ とおく。遺伝子配列に含まれるすべての $x$ をそれぞれ <code>ABC</code> へ同時に置き換える。</li>
</ul>

<p><code>A</code>，<code>B</code>，<code>C</code> だけからなる文字列 $S$ が与えられる。遺伝子配列を $S$ に一致させられるか判定せよ。</p>

### 입력

<p>入力は以下の形式で標準入力から与えられる。</p>

<blockquote>
<p>$S$</p>
</blockquote>

### 출력

<p>遺伝子配列を $S$ に一致させられるならば <code>Yes</code> を、一致させられないならば <code>No</code> を一行に出力せよ。</p>

### 제한

<ul>
	<li>$1\leq|S|\leq5,000$</li>
	<li>$S$ は <code>A</code>，<code>B</code>，<code>C</code> だけからなる。</li>
</ul>