# [Platinum III] Bounty Hunter II - 10850

[문제 링크](https://www.acmicpc.net/problem/10850)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 206, 정답: 113, 맞힌 사람: 87, 정답 비율: 55.414%

### 분류

이분 매칭

### 문제 설명

<p>aSpike the bounty hunter is tracking another criminal through space. Luckily for him hyperspace travel has made the task of visiting several planets a lot easier. Each planet has a number of Astral Gates; each gate connects with a gate on another planet. These hyperspace connections are, for obvious safety reasons, one-way only with one gate being the entry point and the other gate being the exit point from hyperspace. Furthermore, the network of hyperspace connections must be loop-free to prevent the Astral Gates from exploding, a tragic lesson learned in the gate accident of 2022 that destroyed most of the moon.</p>

<p>While looking at his star map Spike wonders how many friends he needs to conduct a search on every planet. Each planet should not be visited by more than one friend otherwise the criminal might get suspicious and flee before he can be captured. While each person can start at a planet of their choosing and travel along the hyperspace connections from planet to planet they are still bound by the limitations of hyperspace travel.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10850.%E2%80%85Bounty%E2%80%85Hunter%E2%80%85II/d5bc6b18.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10850.%E2%80%85Bounty%E2%80%85Hunter%E2%80%85II/d5bc6b18.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10850/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:120px; width:275px" /></p>

<p>Figure B.1: Illustration of the Sample Inputs.</p>

### 입력

<p>The input begins with an integer N specifying the number of planets (0 &lt; N &le; 1000). The planets are numbered from 0 to N &minus;1. The following N lines specify the hyperspace connections. The i-th of those lines first contains the count of connections K (0 &le; K &le; N &minus;1) from planet i followed by K integers specifying the destination planets.</p>

### 출력

<p>Output the minimum number of persons needed to visit every planet.</p>