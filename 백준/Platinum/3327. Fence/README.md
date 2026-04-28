# [Platinum I] Fence - 3327

[문제 링크](https://www.acmicpc.net/problem/3327)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

볼록 껍질을 이용한 최적화, 볼록 껍질, 다이나믹 프로그래밍, 플로이드–워셜, 기하학, 그래프 이론, 선분 교차 판정, 볼록 다각형 내부의 점 판정, 최단 경로

### 문제 설명

<p>One morning, fruit farmer Fred visits his apple trees and notices that one of them was cut overnight. This means a loss of 111e &ndash; the money he can make from the apples of a tree on average. In order to prevent further losses, he decides to erect a fence on his plantation.</p>

<p>The fence consists of posts connected by wire. The fence posts can only be placed at a given set of pre-drilled holes. While Fred can get wire for free, he needs to buy the fence posts for 20&euro; each. So it might not always be worth or even possible to fence in all of his trees.</p>

<p>The plantation is square and 1 000&times;1 000 m<sup>2</sup> large. In bird&rsquo;s eye view, the lower left corner has coordinates (0, 0), the upper right (1 000, 1 000).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3327.%E2%80%85Fence/a6485704.png" data-original-src="https://upload.acmicpc.net/b3aa7c20-1ffa-48f4-9642-9120a017bd95/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 218px; height: 217px;" /></p>

<p>In this example there are four pre-drilled holes (circles) and three trees (squares). It is optimal to buy three fence posts and put them into selected holes (filled circles), to connect them by wire (lines), and to leave the upper left hole empty. The cost of erecting the fence is 3 &middot; 20&euro; + 1 &middot; 111&euro; = 171&euro; since three posts were bought and one tree could not be fenced in (which means a loss of that tree&rsquo;s harvest).</p>

<p>Write a program that reads the positions of the pre-drilled holes and the trees on Fred&rsquo;s plantation and outputs the minimum cost of erecting a fence or erecting no fence at all. You can neglect the actual shape of the trees and calculate with their positions only.</p>

### 입력

<p>The first line contains two integers N and M (3 &le; N &le; 100, 1 &le; M &le; 100). N is the number of pre-drilled holes, and M is the number of trees. This line is followed by N lines that describe the positions of the holes, and then by M lines that describe the positions of the trees. All positions are given as pairs of integers x y on one line (0 &le; x, y &le; 1 000). You can expect that no two positions (of holes and trees) coincide and that no three positions are colinear.</p>

### 출력

<p>Output a single line containing one integer: Fred&rsquo;s minimum cost. In case Fred buys P posts and fails to fence in T trees, his cost are 20P + 111T.</p>