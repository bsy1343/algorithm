# [Platinum I] Toys - 15304

[문제 링크](https://www.acmicpc.net/problem/15304)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 13, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

번사이드 보조정리, 조합론, 분할 정복을 이용한 거듭제곱, 수학, 모듈로 곱셈 역원, 정수론

### 문제 설명

<p>The World Finals Contest marshals are continuously walking back and forth across the contest area and it is only a matter of time until one of them trips over a power or network cable, ruining the whole event. To keep them occupied with something less dangerous, the GNYR head judge decides to make them a little toy!</p>

<p>It consists of two discs (a red and a blue one), connected by an axis through their centers, around which both discs can turn independently (see the diagram below, red discs are on the left and blue discs are on the right). At the edges of the red and blue discs, there are n and m equidistant clamps, respectively. Some of the clamps on the red disc may be connected to some of the clamps on the blue disc via flexible strings. There can be multiple strings attached to each clamp but there is at most one string between any two clamps. How many different toys can the head judge produce (modulo 1,000,000,007) for fixed n and m? Two toys are considered the same if one can be obtained from the other by turning the discs by any angle (not necessarily the same!) around the toy&#39;s axis. Also, it is only relevant which two clamps a string connects, not which path it describes in the space between them.</p>

<p>Figure 1: (a) and (b) are the same toy (you can obtain (b) from (a) by turning the red (left) disk one and the blue (right) disk 4 steps counterclockwise). (c) is a different toy.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15304.%E2%80%85Toys/92930d63.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15304/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:174px; width:621px" /></p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently. Each data set consists of a single line of input. It contains the data set number, K, followed by the space separated integers n and m (2 &le; n, m &le; 10,000,000).</p>

### 출력

<p>For each data set there is a single line of output. The single output line consists of the data set number, K, followed by a single space followed by the total number toys modulo 1,000,000,007 possible for the input n, m.</p>