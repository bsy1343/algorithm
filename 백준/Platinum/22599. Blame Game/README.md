# [Platinum II] Blame Game - 22599

[문제 링크](https://www.acmicpc.net/problem/22599)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 16, 맞힌 사람: 13, 정답 비율: 37.143%

### 분류

그래프 이론, 게임 이론, 최대 유량, 이분 매칭

### 문제 설명

<p>Alice and Bob are in a factional dispute. Recently a big serious problem arised in a project both Alice and Bob had been working for. This problem was caused by lots of faults of Alice&#39;s and Bob&#39;s sides; those faults are closely related.</p>

<p>Alice and Bob started to blame each other. First, Alice claimed it was caused by Bob&#39;s fault. Then Bob insisted his fault was led by Alice&#39;s fault. Soon after, Alice said that her fault should not have happened without Bob&#39;s another fault. So on so forth. It was terrible. It was totally a blame game. Still, they had their pride. They would not use the same fault more than once in their claims.</p>

<p>All right, let&#39;s see the situation in terms of a game.</p>

<p>Alice and Bob have a number of faults. Some pairs of Alice and Bob faults have direct relationship between them. This relationship is bidirectional; if a fault X is led by another fault Y, they can say either &quot;X was due to Y.&quot; or &quot;even with X, the problem could be avoided without Y.&quot; Note that not both, since they never pick up the same fault in their claims.</p>

<p>Alice and Bob take their turns alternatively. Alice takes the first turn by claiming any of Bob&#39;s faults. Then Bob makes his claim with Alice&#39;s fault directly related to the claimed fault. Afterward, in each turn, one picks up another&#39;s fault directly related to the fault claimed in the previous turn. If he/she has no faults that have not been claimed, then he/she loses this game.</p>

<p>By the way, you have been working both under Alice and Bob. You know all the faults and relationships. Your task is to write a program to find out which would win this game, under the assumption that they always take their optimal strategies. If you could choose the winning side, you would not have to take the responsibility for the arisen problem.</p>

### 입력

<p>Each input contains one test case. The first line of the input contains two integers&nbsp;<var>N</var>&nbsp;and&nbsp;<var>M</var>&nbsp;(0 &le;&nbsp;<var>N</var>,&nbsp;<var>M</var>&nbsp;&le; 500), which denote the numbers of Alice&#39;s and Bob&#39;s faults respectively. Alice&#39;s faults are numbered from 1 to&nbsp;<var>N</var>; so are Bob&#39;s from 1 to&nbsp;<var>M</var>. Then&nbsp;<var>N</var>&nbsp;lines follow to describe the relationships among the faults. The&nbsp;<var>i</var>-th line begins with a non-negative integer&nbsp;<var>K<sub>i</sub></var>&nbsp;(0 &le;&nbsp;<var>K<sub>i</sub></var>&nbsp;&le;&nbsp;<var>M</var>). It is then followed by&nbsp;<var>K<sub>i</sub></var>&nbsp;positive integers, where the&nbsp;<var>j</var>-th number&nbsp;<var>b<sub>i,j</sub></var>&nbsp;(1 &le;&nbsp;<var>b<sub>i,j</sub></var>&nbsp;&le;&nbsp;<var>M</var>) indicates there is a direct relationship between the&nbsp;<var>i</var>-th Alice&#39;s fault and the&nbsp;<var>b<sub>i,j</sub></var>-th Bob&#39;s fault. It is guaranteed that&nbsp;<var>b<sub>i,j</sub></var>&nbsp;!=&nbsp;<var>b<sub>i,j&#39;</sub></var>&nbsp;for all&nbsp;<var>i</var>,&nbsp;<var>j</var>,&nbsp;<var>j&#39;</var>&nbsp;such that 1 &le;&nbsp;<var>i</var>&nbsp;&le;&nbsp;<var>N</var>&nbsp;and 1 &le;&nbsp;<var>j</var>&nbsp;&lt;&nbsp;<var>j&#39;</var>&nbsp;&le;&nbsp;<var>K<sub>i</sub></var>.</p>

### 출력

<p>Print either &quot;Alice&quot; or &quot;Bob&quot; to indicate the winner of the blame game.</p>