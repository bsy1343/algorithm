# [Gold IV] Haiku - 17932

[문제 링크](https://www.acmicpc.net/problem/17932)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 30, 맞힌 사람: 20, 정답 비율: 28.986%

### 분류

자료 구조, 다이나믹 프로그래밍

### 문제 설명

<p>A haiku is a Japanese form of poetry. It consists of three phrases of $5$, $7$ and $5$ syllables each.</p>

<p>Once a year, HiQ has a haiku contest, where employees submit their best poems. The poems are then judged based on a wide range of aspects, such as</p>

<ul>
	<li>creativity</li>
	<li>simplicity</li>
	<li>beauty</li>
	<li>whether the poem is actually a haiku</li>
</ul>

<p>This last point turned out to be quite a challenge for the judges (many problems arose when half the judges indexed syllables starting at $0$ and the other half at $1$).</p>

<p>Can you help the judges to determine whether a submitted poem is a haiku, given a set of syllables? Note that there <strong>may exist multiple decompositions</strong>&nbsp;of a single word in the poem into syllables. In this case, you should determine whether <strong>some</strong>&nbsp;decomposition is a haiku.</p>

### 입력

<p>The first line of input contains a single integer $1 \le S \le 100$, the number of syllables. The next line contains $S$ words separated by spaces (the syllables). Each syllable contains at most $7$ lowercase letters <code>a-z</code>.</p>

<p>Then, three lines containing the poem follow. Each line contains a (non-empty) list of words separated by spaces, representing a phrase. The words contain only lowercase letters <code>a-z</code>. The length of each line is at most $100$ characters (including spaces).</p>

<p>It is guaranteed that there exists <strong>at least one</strong>&nbsp;decomposition of the poem into the given syllables.</p>

### 출력

<p>Output <code>&quot;haiku&quot;</code>&nbsp;if the given poem is a haiku, and <code>&quot;come back next year&quot;</code> otherwise (without the quotes).</p>