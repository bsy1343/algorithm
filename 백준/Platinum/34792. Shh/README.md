# [Platinum IV] Shh - 34792

[문제 링크](https://www.acmicpc.net/problem/34792)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

(분류 없음)

### 문제 설명

<p>Theo is a little overconfident. His Spotify password has just been leaked and he needs to change it. However, he likes to say his password out loud as he types it, so he changes it so that it has $k$ different instances of the substring <code>shh</code>.</p>

<p>A string $b$ is a <em>substring</em> of a string $a$ if $b$ can be obtained from $a$ by deletion of several (possibly, zero or all) characters from the beginning and several (possibly, zero or all) characters from the end. In particular, a string is a substring of itself. Two substrings are considered to be different instances if a different number of characters are deleted from either the beginning or the end, or both, even if the final strings are the same.</p>

<p>Given the original password, compute the minimum number of characters that Theo needs to change so that it has exactly $k$ different instances of the substring <code>shh</code>. Furthermore, compute the number of distinct passwords Theo could construct by changing exactly this many characters that also have exactly $k$ different instances of the substring <code>shh</code>.</p>

### 입력

<p>The first line contains two integers, $n$ and $k$ ($1 \le n \le 67, 0 \le 3k \le n$). The second line contains a string of $n$ lowercase letters, Theo's original password.</p>

### 출력

<p>Let $c$ be the minimum number of characters Theo needs to change. Let $w$ be the number of distinct passwords with exactly $k$ different instances of the substring <code>shh</code> that can be obtained by changing exactly $c$ characters. Output two integers: $c$, and the remainder when $w$ is divided by the prime $67$.</p>

### 힌트

<p>For sample 1, we can show that at least 5 characters must be changed. The four passwords that can be obtained which satisfy the given constraints are <code>shhovishhn</code>, <code>eshhvishhn</code>, <code>eushhishhn</code>, and <code>eurshhshhn</code>.</p>