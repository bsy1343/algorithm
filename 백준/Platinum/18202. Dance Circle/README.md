# [Platinum III] Dance Circle - 18202

[문제 링크](https://www.acmicpc.net/problem/18202)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색, 누적 합

### 문제 설명

<p>It&rsquo;s Halloween, and you&rsquo;ve organized a bonfire and dance for the neighborhood children. The n children have gathered into a ring to dance around the fire. Each child is wearing one of two fun yet spooky costumes: orange pumpkin, or black bat. Since it&rsquo;s dark outside, you can only see a few children at a time, as they pass behind the bonfire. The children are not standing evenly so the number of children you can see at each time differs. In particular, numbering the children 0, 1, . . . , n &minus; 1 clockwise around the dance circle, at any given time you can see child i in the center of your view, as well as l<sub>i</sub> children before child i and r<sub>i</sub> children after child i around the circle (i.e., child i&minus;l<sub>i</sub> , . . . , i&minus;1, i, i+1, . . . , i+r<sub>i</sub> , where the indices are of course taken modulo n).</p>

<p>To help pass the time while the children dance, you wonder to yourself: suppose you only knew, for each child i, whether an even or odd number of the l<sub>i</sub> + r<sub>i</sub> + 1 children centered at child i is wearing the orange pumpkin costume. Would you be able to uniquely reconstruct what costume each child is wearing? Clearly this is possible when l<sub>i</sub> = r<sub>i</sub> = 0. But what if l<sub>i</sub> and r<sub>i</sub> are not always zero? Maybe there are multiple possible solutions, or none at all? You decide to investigate, later in the evening once you&rsquo;re back at your computer.</p>

### 입력

<p>The first line of the input consists of a single integer n, indicating that there are n children in the ring (1 &le; n &le; 200 000). The following n lines describe the children you can see at different times. The ith line (indexed starting from zero) contains three space-separated non-negative integers l<sub>i</sub>, r<sub>i</sub>, x<sub>i</sub> (l<sub>i</sub> + r<sub>i</sub> + 1 &le; n, 0 &le; x<sub>i</sub> &le; 1): you can see l<sub>i</sub> + r<sub>i</sub> + 1 children when child i is in the center of view (l<sub>i</sub> to the left and r<sub>i</sub> to the right of child i). If x<sub>i</sub> = 0 then an even number of them are wearing the orange pumpkin costume. If x<sub>i</sub> = 1 then an odd number of them are wearing the orange pumpkin costume.</p>

### 출력

<p>Compute the number of ways of assigning a costume to each child, consistent with your observations. Since this number might be large, print the result modulo 10<sup>9</sup> + 7. (If it&rsquo;s impossible to find any costume assignment that matches all parity constraints, print 0).</p>