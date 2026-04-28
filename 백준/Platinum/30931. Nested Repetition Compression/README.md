# [Platinum IV] Nested Repetition Compression - 30931

[문제 링크](https://www.acmicpc.net/problem/30931)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 63, 맞힌 사람: 58, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>You have a number of strings of lowercase letters to be sent in e-mails, but some of them are so long that typing as they are would be tiresome. As you found repeated parts in them, you have decided to try out a simple compression method in which repeated sequences are enclosed in parentheses, prefixed with digits meaning the numbers of repetitions. For example, the string &ldquo;<code>abababaaaaa</code>&rdquo; can be represented as &ldquo;<code>3(ab)5(a)</code>&rdquo; or &ldquo;<code>a3(ba)4(a)</code>&rdquo;. The syntax of compressed representations is given below in Backus-Naur form with the start symbol $S$.</p>

<blockquote>
<p>&lt;$S$&gt; ::= &lt;$R$&gt; | &lt;$R$&gt; &lt;$S$&gt;</p>

<p>&lt;$R$&gt; ::= &lt;$L$&gt; | &lt;$D$&gt; <code>(</code>&lt;$S$&gt;<code>)</code></p>

<p>&lt;$D$&gt; ::= <code>2</code> | <code>3</code> | <code>4</code> | <code>5</code> | <code>6</code> | <code>7</code> | <code>8</code> | <code>9</code></p>

<p>&lt;$L$&gt; ::= <code>a</code> | <code>b</code> | <code>c</code> | <code>d</code> | <code>e</code> | <code>f</code> | <code>g</code> | <code>h</code> | <code>i</code> | <code>j</code> | <code>k</code> | <code>l</code> | <code>m</code> | <code>n</code> | <code>o</code> | <code>p</code> | <code>q</code> | <code>r</code> | <code>s</code> | <code>t</code> | <code>u</code> | <code>v</code> | <code>w</code> | <code>x</code> | <code>y</code> | <code>z</code></p>
</blockquote>

<p>Note that numbers of repetitions are specified by a single digit, and thus at most nine, but more repetitions can be specified by nesting them. A string of thirty <code>a</code>&rsquo;s can be represented as &ldquo;<code>6(5(a))</code>&rdquo; or &ldquo;<code>3(5(2(a)))</code>&rdquo;, for example.</p>

<p>Find the shortest possible representation of the given string in this compression scheme.</p>

### 입력

<p>The input is a line containing a string of lowercase letters. The number of letters in the string is at least one and at most $200$.</p>

### 출력

<p>Output a single line containing the shortest possible representation of the input string. If there exist two or more shortest representations, any of them is acceptable.</p>