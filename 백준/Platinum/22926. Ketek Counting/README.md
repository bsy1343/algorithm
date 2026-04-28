# [Platinum I] Ketek Counting - 22926

[문제 링크](https://www.acmicpc.net/problem/22926)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 64 MB (추가 메모리 없음)

### 통계

제출: 61, 정답: 31, 맞힌 사람: 26, 정답 비율: 52.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Define a <em>Ketek</em> to be a sentence that reads the same forwards and backwards, by word. For example, &#39;fall leaves after leaves fall&#39; is a <em>Ketek</em> since the words in reverse order are the same as the original order.</p>

<p>Given a string consisting of lower-case letters and the character &#39;<code>?</code>&#39;, count the number of distinct <em>Keteks</em> you can make by replacing every &#39;<code>?</code>&#39; with lower-case letters (one letter per &#39;<code>?</code>&#39;), and optionally adding spaces between any letters. Note that a <em>Ketek</em> cannot contain any <code>?</code>&#39;s; they all must be replaced exclusively by lower-case letters.</p>

<p>For example, if we start with the string &#39;<code>ababa</code>&#39;, we can form 3 different <em>Keteks</em>: &#39;<code>ababa</code>&#39;, &#39;<code>a bab a</code>&#39;&nbsp;and &#39;<code>a b a b a</code>&#39;.</p>

<p>If we start with the string &#39;<code>?x?z</code>&#39; instead, we can form 703 different <em>Keteks</em>:</p>

<ul>
	<li>There are $26^2 = 676$ ways to replace the <code>?</code>&#39;s and form a one-word <em>Ketek</em>.</li>
	<li>Add spaces to form &#39;<code>? x? z</code>&#39;. There are $26$ ways to form a <em>Ketek</em> (the first &#39;<code>?</code>&#39; must be <code>z</code>; the other can be any lower-case letter).</li>
	<li>Add a space to form &#39;<code>?x ?z</code>&#39;. There is no way to form a <em>Ketek</em>.</li>
	<li>Add spaces to form &#39;<code>? x ? z</code>&#39;. There is one way to form a <em>Ketek</em> (the first &#39;<code>?</code>&#39; must be <code>z</code>; the second must be <code>x</code>).</li>
</ul>

<p>The total is $676 + 26 + 0 + 1 = 703$.</p>

<p>Two <em>Keteks</em> are different if they have a different number of words, or there is some word index where the words are not the same.</p>

### 입력

<p>The single line of input contains a string $s$ ($1 \le |s| \le 30\,000$), which consists of lower-case letters (&#39;<code>a</code>&#39;--&#39;<code>z</code>&#39;) and the character &#39;<code>?</code>&#39;.</p>

### 출력

<p>Output the number of distinct <em>Keteks</em> that can be formed by replacing the <code>?</code>&#39;s with lower-case letters and adding spaces. Since this number may be large, output it modulo $998\,244\,353$.</p>