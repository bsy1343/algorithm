# [Platinum II] Kingdom Roadmap - 3505

[문제 링크](https://www.acmicpc.net/problem/3505)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 123, 정답: 62, 맞힌 사람: 41, 정답 비율: 55.405%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>The Kingdom consists of n cities connected by n &minus; 1 roads in such a way that there is exactly one way to travel from one city to another.</p>

<p>The King is a busy man and he constantly travels from city to city. Unfortunately, during one of his travels one of the roads got damaged and needed serious repairs. As a result, the King was unable to reach his destination in time.</p>

<p>After the incident the King decided to improve reliability of the road system. It was decided that the improved road system shall be able to withstand one damaged road, i.e. there shall always be a path from one city to another even when one road in the Kingdom is damaged. As always, the budget is limited so you need to minimize the number of new roads.</p>

<p>For example, the picture below shows 5 Kingdom&rsquo;s cities numbered from 1 to 5 and roads between them in solid lines. One of the ways to build new roads is shown in dashed lines.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3505.%E2%80%85Kingdom%E2%80%85Roadmap/eeb661ff.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3505.%E2%80%85Kingdom%E2%80%85Roadmap/eeb661ff.png" data-original-src="https://www.acmicpc.net/upload/images2/roadmap.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:134px; width:208px" /></p>

<p>Your task is to build as few new roads as possible so that there is always a path between any two cities even if one of the roads gets unusable for any reason. There may be multiple optimal solutions. Any one can be used.</p>

### 입력

<p>The first line of the input file contains integer n &mdash; the number of cities in the kingdom (2 &le; n &le; 100 000). The following n &minus; 1 lines contain two integers u<sub>i</sub>, v<sub>i</sub> each &mdash; the cities connected by i-th road (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n).</p>

### 출력

<p>The first line of the output file shall contain one integer k &mdash; the number of roads to be built. The following k lines shall contain two integers a<sub>i</sub>, b<sub>i</sub> each &mdash; the cities which should be connected by i-th new road (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n).</p>