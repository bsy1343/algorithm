# [Gold III] Joust Sort - 35248

[문제 링크](https://www.acmicpc.net/problem/35248)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>We are going to organise the letters of the word using a novel algorithm based on the natural instincts of the hoarse chestnut tree: a <em>grand tournament</em> between its constituent letters.</p>

<p>We will pick several pairs of letters and have them face off. The result of a match between these letters determines their relative order. For example, if $a &lt; b$, then all occurrences of $a$ in a well-organised word should come before all occurrences of $b$ in that word. If there is no case for $a &lt; b$ or $b &lt; a$, then the individual letters $a$ and $b$ may intersperse among each other in any order.</p>

<p>Given a word, and several such matches, determine a fair rearrangement of the word to meet all of the constraints given. It is possible that multiple such rearrangements exists, or that none exist at all.</p>

### 입력

<ul>
<li>One line containing the number of orders to follow, $n$ ($1 \le n \le 700$).</li>
<li>$n$ further lines, each containing a distinct ordering of two lowercase letters $a$ and $b$ separated by a <code>&lt;</code> or <code>&gt;</code> character and spaces.</li>
<li>One final line containing the word to improve, $s$ ($1 \le |s| \le 100,000)$.</li>
</ul>

### 출력

<p>Output a sorted version of the word, or <code>IMPOSSIBLE</code> if the word cannot be sorted according to all of the rules at once.</p>

<p>In case there are multiple answers, you may output any one of them.</p>