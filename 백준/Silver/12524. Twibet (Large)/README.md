# [Silver II] Twibet (Large) - 12524

[문제 링크](https://www.acmicpc.net/problem/12524)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 77, 맞힌 사람: 73, 정답 비율: 84.884%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>The holy country of Twibet has&nbsp;<strong>N</strong>&nbsp;monks. Each monk has a unique number, from 1 to&nbsp;<strong>N</strong>. They do not use names for religious reasons. The monks are constantly on the move, slowly walking around Twibet. Each monk follows exactly one other monk.</p>

<p>Most of the time, every monk is silent, but on day K, monk number K stops, turns around and whispers the 140 Words of Wisdom. The whisper is quiet, so only the monk&#39;s immediate followers can hear it. At that point, each of his followers stops, turns around and whispers the same words to each of his own followers. This chain continues -- each follower who has just heard the Words, but has not yet whispered the Words today, stops and whispers to his followers.</p>

<p>After all of the monks who could have heard the words have whispered them, they all turn back around and continue walking as usual... until the next day, when this all starts again, but this time starting with a different monk.</p>

<p>How many monks will whisper the 140 Words of Wisdom on day K, for each K between 1 and&nbsp;<strong>N</strong>?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each one starts with a line containing a single integer&nbsp;<strong>N</strong>. The next line contains&nbsp;<strong>N</strong>&nbsp;space-separated integers&nbsp;<strong>F<sub>1</sub></strong>,&nbsp;<strong>F<sub>2</sub></strong>, ...,&nbsp;<strong>F<sub>N</sub></strong>. Monk 1 follows monk&nbsp;<strong>F<sub>1</sub></strong>. Monk 2 follows monk&nbsp;<strong>F<sub>2</sub></strong>, etc.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>No monk will immediately follow himself (<strong>F<sub>k</sub></strong>&nbsp;is never equal to&nbsp;<strong>k</strong>).</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the case number (starting from 1). Then output&nbsp;<strong>N</strong>&nbsp;lines, one for each day. The first line should contain the number of monks who will whisper the Words on day 1. The next line -- on day 2, etc.</p>

### 힌트

<p>In Case #1, all 3 monks are walking around in a circle. Whenever one of them whispers the Words, his follower whispers next, and the the remaining monk whispers after that. On each of the 3 days, all 3 monks will eventually whisper the Words.</p>

<p>In Case #2, 1 follows 2, 2 follows 3, 3 follows 2, and 4 follows 1. On day 1, when monk 1 whispers first, monk 4 hears and whispers next; monks 2 and 3 will not hear the words that day. On day 2, monk 2 whispers first; monks 1 and 3 hear and whisper next; finally, monk 4 hears monk 1 and whispers last. On day 3, monks whisper in the order 3, 2, 1, 4. On day 4, monk 4 whispers the Words and no one hears him.</p>