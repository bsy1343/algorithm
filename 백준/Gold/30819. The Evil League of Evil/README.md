# [Gold II] The Evil League of Evil - 30819

[문제 링크](https://www.acmicpc.net/problem/30819)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 3, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bad Horse is recruiting to The Evil League of Evil! He used his hoof to write down a long string $s$, consisting of letters &quot;&#39;texttt{(}&quot;, &quot;&#39;texttt{)}&quot; and &quot;<code>?</code>&quot;, and sent it to all applicants. Each person willing to join Evil League has to replace all characters &quot;<code>?</code>&quot; with either opening bracket or closing bracket. The invitation to join The Evil League of Evil will be send to the person who&#39;s resulting string contains the longest possible <strong>subsequence</strong>, that is correct bracket sequence.</p>

<p><em>Subsequence</em> of the string $s$ is the string that can be obtained by removing some characters (possibly none) from $s$. For example, strings &quot;&#39;texttt{abc}&quot;, &quot;<code>ac</code>&quot;, &quot;<code>bcc</code>&quot; and &quot;<code>abbcc</code>&quot; are subsequences of &quot;<code>abbcc</code>&quot;, while &quot;<code>cb</code>&quot; and &quot;<code>ba</code>&quot; are not. Note, that the empty string is a subsequence of any string.</p>

<p>The sequence of brackets is called <em>correct</em> if:</p>

<ol>
	<li>it&#39;s empty;</li>
	<li>it&#39;s a correct sequence of brackets, enclosed in a pair of opening and closing brackets;</li>
	<li>it&#39;s a concatenation of two correct sequences of brackets.</li>
</ol>

<p>For example, the sequences &quot;<code>()()</code>&quot; and &quot;<code>((()))()</code>&quot; are correct, while &quot;<code>)(()</code>&quot;, &quot;<code>(((((</code>&quot; and &quot;<code>())</code>&quot; are not.</p>

<p>Dr. Horrible was dreaming of joining Evil League of Evil for year, but his pacifism blocks him from doing bad things. He is also bad in solving problems and asks you to deal with the Horse&#39;s puzzle.</p>

### 입력

<p>The only line of the input contains the string $s$ ($1 \leqslant |s| \leqslant 10\,000\,000$).</p>

<p>It&#39;s guaranteed that $s$ consists of letters &quot;<code>(</code>&quot;, &quot;<code>)</code>&quot; and &quot;<code>?</code>&quot; only.</p>

### 출력

<p>Print the solution to the Evil Horse&#39;s puzzle that guarantees Doctor Horrible will be invited to join The Evil League of Evil. That is, replace &quot;<code>?</code>&quot; with either &quot;<code>(</code>&quot; or &quot;<code>)</code>&quot;, to maximize the length of maximum correct bracket subsequence of the string. If there are many optimal answers, you may print any of them.</p>

### 힌트

<p>In the first sample, the resulting string contains correct bracket subsequence of length $4$: &quot;<code>()()</code>&quot;.</p>

<p>In the second sample, the resulting string contains correct bracket subsequence of length $4$: &quot;<code>(())</code>&quot;.</p>