# [Platinum II] FarmCraft - 10131

[문제 링크](https://www.acmicpc.net/problem/10131)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 347, 정답: 126, 맞힌 사람: 107, 정답 비율: 34.295%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>In a village called Byteville, there are n houses connected with n-1 roads. For each pair of houses, there is a unique way to get from one to another. The houses are numbered from 1 to n. The house no. 1 belongs to the village administrator Byteasar. As part of enabling modern technologies for rural areas framework, n computers have been delivered to Byteasar&#39;s house. Every house is to be supplied with a computer, and it is Byteasar&#39;s task to distribute them. The citizens of Byteville have already agreed to play the most recent version of FarmCraft (the game) as soon as they have their computers.</p>

<p>Byteasar has loaded all the computers on his pickup truck and is about to set out to deliver the goods. He has just the right amount of gasoline to drive each road twice. In each house, Byteasar leaves one computer, and immediately continues on his route. In each house, as soon as house dwellers get their computer, they turn it on and install FarmCraft. The time it takes to install and set up the game very much depends on one&#39;s tech savviness, which is fortunately known for each household. After he delivers all the computers, Byteasar will come back to his house and install the game on his computer. The travel time along each road linking two houses is exactly 1 minute, and (due to citizens&#39; eagerness to play) the time to unload a computer is negligible.</p>

<p>Help Byteasar in determining a delivery order that allows all Byteville&#39;s citizens (including Byteasar) to start playing together as soon as possible. In other words, find an order that minimizes the time when everyone has FarmCraft installed.</p>

### 입력

<p>The first line of the standard input contains a single integer n(2 &le; n &le; 500,000) that gives the number of houses in Byteville. The second line contains n integers c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>n</sub>(1 &le; ci &le; 10<sup>9</sup>), separated by single spaces; ci is the installation time (in minutes) for the dwellers of house no. i.</p>

<p>The next n-1 lines specify the roads linking the houses. Each such line contains two positive integers a and b (1 &le; a &lt; b &le; n), separated by a single space. These indicate that there is a direct road between the houses no. a and b.</p>

<p>You may assume that in tests worth 10% of the total points, the condition n &le; 7000 holds.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer: the (minimum) number of minutes after which all citizens will be able to play FarmCraft together.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10131.%E2%80%85FarmCraft/a2ecc0c3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10131.%E2%80%85FarmCraft/a2ecc0c3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10131/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Byteasar should deliver the computers to the houses in the following order: 3, 2, 4, 5, 6, and 1. The game will be installed after 11, 10, 10, 10, 8, and 9 minutes respectively, in the house number order. Thus everyone can play after 11 minutes.</p>

<p>If Byteasar delivered the game in the following order: 3, 4, 5, 6, 2, and 1, then the game would be installed after: 11, 16, 10, 8, 6, and 7 minutes respectively. Hence, everyone could play only after 16 minutes,</p>