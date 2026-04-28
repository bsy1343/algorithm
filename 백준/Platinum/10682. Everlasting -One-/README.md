# [Platinum III] Everlasting -One- - 10682

[문제 링크](https://www.acmicpc.net/problem/10682)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 26, 맞힌 사람: 21, 정답 비율: 53.846%

### 분류

조합론, 자료 구조, 분리 집합, 그래프 이론, 수학

### 문제 설명

<p>\(&quot;Everlasting -One-&quot; is an award-winning online game launched this year. This game has rapidly become famous for its large number of characters you can play.</p>

<p>In this game, a character is characterized by <em>attributes</em>. There are \(N\) attributes in this game, numbered \(1\) through \(N\). Each attribute takes one of the two states, <em>light</em> or <em>darkness</em>. It means there are \(2^N\) kinds of characters in this game.</p>

<p>You can change your character by job change. Although this is the only way to change your character&#39;s attributes, it is allowed to change jobs as many times as you want.</p>

<p>The rule of job change is a bit complex. It is possible to change a character from \(A\) to \(B\) if and only if there exist two attributes \(a\) and \(b\) such that they satisfy the following four conditions:</p>

<ul>
	<li>
	<p>The state of attribute \(a\) of character \(A\) is <em>light</em>.</p>
	</li>
	<li>
	<p>The state of attribute \(b\) of character \(B\) is <em>light</em>.</p>
	</li>
	<li>
	<p>There exists no attribute \(c\) such that both characters \(A\) and \(B\) have the <em>light</em> state of attribute \(c\).</p>
	</li>
	<li>
	<p>A pair of attribute \((a, b)\) is <em>compatible</em>.</p>
	</li>
</ul>

<p>Here, we say a pair of attribute \((a, b)\) is <em>compatible</em> if there exists a sequence of attributes \(c_1, c_2, \ldots, c_n\) satisfying the following three conditions:</p>

<ul>
	<li>
	<p>\(c_1 = a\).</p>
	</li>
	<li>
	<p>\(c_n = b\).</p>
	</li>
	<li>
	<p>Either \((c_i, c_{i+1})\) or \((c_{i+1}, c_i)\) is a special pair for all \(i = 1, 2, \ldots, n-1\). You will be given the list of special pairs.</p>
	</li>
</ul>

<p>Since you love this game with enthusiasm, you are trying to play the game with all characters (it&#39;s really crazy). However, you have immediately noticed that one character can be changed to a limited set of characters with this game&#39;s job change rule. We say character \(A\) and \(B\) are <em>essentially different</em> if you cannot change character \(A\) into character \(B\) by repeating job changes.</p>

<p>Then, the following natural question arises; how many essentially different characters are there? Since the output may be very large, you should calculate the answer modulo \(1{,}000{,}000{,}007\).</p>

### 입력

<p>The input is a sequence of datasets. The number of datasets is not more than \(50\) and the total size of input is less than \(5\) MB.</p>

<p>Each dataset is formatted as follows.</p>

<pre>
N M
a<sub>1</sub> b<sub>1</sub>
:
:
a<sub>M</sub> b<sub>M</sub>
</pre>

<p>The first line of each dataset contains two integers \(N\) and \(M\) (\(1 \le N \le 10^5\) and \(0 \le M \le 10^5\)). Then \(M\) lines follow. The \(i\)-th line contains two integers \(a_i\) and \(b_i\) (\(1 \le a_i \lt b_i \le N\)) which denote the \(i\)-th special pair. The input is terminated by two zeroes.</p>

<p>It is guaranteed that \((a_i, b_i) \ne (a_j, b_j)\) if \(i \ne j\).</p>

### 출력

<p>For each dataset, output the number of essentially different characters modulo \(1{,}000{,}000{,}007\).</p>