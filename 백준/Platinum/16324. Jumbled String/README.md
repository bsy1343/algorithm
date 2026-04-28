# [Platinum IV] Jumbled String - 16324

[문제 링크](https://www.acmicpc.net/problem/16324)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 245, 정답: 78, 맞힌 사람: 75, 정답 비율: 32.751%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Recall that a subsequence of a string is any string obtained by removing some subset of characters from the string, for instance &ldquo;string&rdquo;, &ldquo;sing&rdquo;, &ldquo;i&rdquo; and &ldquo;sg&rdquo; are all subsequences of &ldquo;string&rdquo;. If the same subsequence can be obtained in exactly t different ways, by removing different subsets of characters, we say that the subsequence occurs t times.</p>

<p>Jingfei wants to create a nonempty bit string that has the following properties:</p>

<ol>
	<li>the subsequence 00 occurs a times,</li>
	<li>the subsequence 01 occurs b times,</li>
	<li>the subsequence 10 occurs c times, and</li>
	<li>the subsequence 11 occurs d times.</li>
</ol>

<p>However, Jingfei does not know how to create such a string &ndash; or whether it is even possible. Could you help her?</p>

### 입력

<p>The input consists of a single line with four integers a, b, c, and d (0 &le; a, b, c, d &le; 10<sup>9</sup>).</p>

### 출력

<p>Output a bit string that satisfies the given requirements. If there are several solutions, output any one of them. If there are no solutions, output &ldquo;impossible&rdquo;.</p>