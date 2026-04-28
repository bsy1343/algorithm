# [Platinum V] FizzBuzz - 22478

[문제 링크](https://www.acmicpc.net/problem/22478)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 40, 맞힌 사람: 32, 정답 비율: 69.565%

### 분류

수학, 문자열, 매개 변수 탐색

### 문제 설명

<p>FizzBuzzとは、1以上の整数を順に、以下のルールに従って発言していくゲームである。</p>

<ul>
	<li>
	<p>3で割り切れる時には「Fizz」</p>
	</li>
	<li>
	<p>5で割り切れる時には「Buzz」</p>
	</li>
	<li>
	<p>3と5の両方で割り切れる時には「FizzBuzz」</p>
	</li>
	<li>
	<p>それ以外の時はその数字</p>
	</li>
</ul>

<p>ゲームの進行状況の例を以下に示す。</p>

<p>1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, &hellip;</p>

<p>得られた発言を1つの文字列に結合し得られた文字列をFizzBuzz Stringと呼ぶ。インデックスsが与えられるので、FizzBuzz Stringのs文字目から20文字を出力せよ。但し、インデックスは1から始まるものとし、得られた文字列の長さは十分に大きい（s+20以上）としてよい。</p>

### 입력

<p>入力は以下の形式で与えられる</p>

<pre>
s
</pre>

### 출력

<p>FizzBuzz Stringのs文字目から20文字を1行に出力せよ

### 제한

<ul>
	<li>
	<p><var>s</var>は整数である</p>
	</li>
	<li>
	<p>1 &le; <var>s</var> &le; 10<sup>18</sup></p>
	</li>
</ul>