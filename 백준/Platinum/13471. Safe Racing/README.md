# [Platinum III] Safe Racing - 13471

[문제 링크](https://www.acmicpc.net/problem/13471)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 58, 맞힌 사람: 55, 정답 비율: 80.882%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>Tomorrow is racing day. There will be yet another grand&nbsp;prix in yet another country. Beside the safety car, there&nbsp;are various other security measures in order to make sure&nbsp;that everybody is as safe as possible. Among these safety&nbsp;measures are the track marshals: special race officials&nbsp;standing along the track with an assortment of flags that&nbsp;they can use to signal various messages to the drivers. For&nbsp;instance, the yellow flag warns the drivers of a dangerous&nbsp;situation, and the blue flag is used to order a lapped car&nbsp;to make way for one of the faster cars.</p>

<p>Every marshal should be stationed in a so-called marshal booth, a kind of protected cage that&nbsp;is clearly visible from the race track. These booths are located at regular intervals of ten&nbsp;metres (one decametre) along the track. The track is circular and L decametres long and&nbsp;therefore contains exactly L booths.</p>

<p>Not every booth needs to be used. International racing regulations require that the distance&nbsp;between two consecutive marshals should be at most S decametres, meaning that every S&nbsp;consecutive booths should contain at least one marshal. The marshals are not responsible for&nbsp;waving the finish flag, so it is not required (but also not forbidden) to have a marshal at the&nbsp;start/finish.</p>

<p>This leaves you with many ways of assigning marshals to the various booths along the track.&nbsp;Out of sheer curiosity you decide to calculate the total number of valid marshal assignments.&nbsp;Reduce your answer modulo 123 456 789 in case it gets too large.</p>

### 입력

<p>The input consists of two integers L, the length of the track, and S, the maximal distance&nbsp;between consecutive marshals along the track, satisfying 1 &le; S &le; L &le; 10<sup>6</sup>.</p>

### 출력

<p>Output the integer W, the number of ways to put marshals modulo 123 456 789. (Your answer&nbsp;must satisfy 0 &le; W &lt; 123 456 789.)</p>

### 힌트

<p>In the first sample test case, the four solutions are to put marshals at distances 0 and 1, at distances 0 and 2, at distances 1 and 2, or, at distances 0, 1 and 2 (in decametres) from the start.</p>