# [Platinum V] Mascot Naming - 33602

[문제 링크](https://www.acmicpc.net/problem/33602)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 42, 정답: 26, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

그리디 알고리즘, 문자열, 해 구성하기

### 문제 설명

<p>When organizing a big event, organizers often handle side tasks outside their expertise. For example, the chief judge of EUC 2025 must find a name for the event’s official mascot while satisfying certain constraints:</p>

<ul>
	<li>The name must include specific words as subsequences<sup>*</sup> , such as the event name and location. You are given the list $s_1, s_2, \dots , s_n$ of the $n$ required words.</li>
	<li>The name must not contain as a subsequence<sup>*</sup> the name t of last year’s mascot.</li>
</ul>

<p>Please help the chief judge find a valid mascot name or determine that none exists.</p>

<p><sup>*</sup>A string $x$ is a <em>subsequence</em> of a string $y$ if $x$ can be obtained from $y$ by erasing some characters (at any positions) while keeping the remaining characters in the same order. For example, <code>abc</code> is a subsequence of <code>axbycz</code> but not of <code>acbxyz</code>.</p>

### 입력

<p>The first line contains an integer $n$ ($1 ≤ n ≤ 200\, 000$) — the number of words that shall appear as subsequences.</p>

<p>The $i$-th of the following $n$ lines contains the string $s_i$ ($1 ≤ |s_i | ≤ 200\, 000$, $s_i$ consists of lowercase English letters) — the $i$-th word in the list of words that shall appear as subsequences. The total length of these $n$ words is at most $200\, 000$, i.e., $|s_1| + |s_2| + \cdots + |s_n| ≤ 200\, 000$.</p>

<p>The last line contains the string $t$ ($1 ≤ |t| ≤ 200\, 000$, $t$ consists of lowercase English letters) — the name of last year’s mascot.</p>

### 출력

<p>Print <code>YES</code> if there is a valid name for the mascot. Otherwise, print <code>NO</code>.</p>

<p>If there is a valid name, on the next line print a valid name. The string you print must have length at most $1\, 000\, 000$ and must consist of lowercase English letters. One can prove that if a valid name for the mascot exists, then there is one satisfying these additional constraints.</p>

<p>If there are multiple solutions, print any of them.</p>