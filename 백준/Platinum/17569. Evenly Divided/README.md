# [Platinum V] Evenly Divided - 17569

[문제 링크](https://www.acmicpc.net/problem/17569)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 16, 맞힌 사람: 13, 정답 비율: 48.148%

### 분류

휴리스틱, 무작위화

### 문제 설명

<p>The Association of Chartered Mountaineers oversaw a sharp resurgence in membership this year, and must now face the inevitable strains of growth: the group photo they usually take can no longer fit everyone in one long row.</p>

<p>Members have been split into two groups: Tall and Short, so that the picture can be doubled up with taller people standing behind shorter people in two rows of n/2 each.</p>

<p>Every cloud has a silver lining, especially when mountaineering. This is an opportunity for the members to meet people. Many new joiners. were assigned a mentor from the members who had already signed up before they joined; the organisation wants to choose a way of arranging the rows such that nobody is standing directly in front of or behind their mentor, assuming they have one.</p>

<p>Find a way of arranging the two rows such that this is possible. The number of tall people is always the same as the number of short people.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>a line consisting of the number of members in the mountaineering society, which is a positive even integer m (1 &le; m &le; 10<sup>5</sup>).</li>
	<li>m further lines, with the ith line (1 &le; i &le; m) consisting of an integer indicating whether the ith member is short (0) or tall (1), then the number of the ith member&rsquo;s mentor, t<sub>i</sub> (0 &le; t &le; m). When t<sub>i</sub> = i, this indicates that the ith member did not have a mentor.</li>
</ul>

### 출력

<p>If an arrangement is possible, output 2 lines of n/2 numbers each to show which member should stand where.</p>

<p>Every number of type 1 should occur somewhere on the first row, and every number of type 0 should occur somewhere on the second row. Nobody should share a column with their mentor.</p>

<p>Otherwise, output impossible.</p>