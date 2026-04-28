# [Platinum II] Cable TV Network - 3784

[문제 링크](https://www.acmicpc.net/problem/3784)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>The interconnection of the relays in a cable TV network is bi-directional. The network is connected if there is at least one interconnection path between each pair of relays present in the network. Otherwise the network is disconnected. An empty network or a network&nbsp;with a single relay is considered connected. The safety factor f of a network with n relays is:</p>

<ol>
	<li>n, if the net remains connected regardless the number of relays removed from the net.</li>
	<li>The minimal number of relays that disconnect the network when removed.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3784.%E2%80%85Cable%E2%80%85TV%E2%80%85Network/535446c2.png" data-original-src="https://upload.acmicpc.net/666397bd-1754-42c4-a352-d9db3ae2ab0b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 360px; height: 110px;" /></p>

<p style="text-align: center;">Figure 1. Cable TV networks</p>

<p>For example, consider the nets from figure 1, where the circles mark the relays and the solid lines correspond to interconnection cables. The network (a) is connected regardless the number of relays that are removed and, according to rule (1), f=n=3. The network (b) is disconnected when 0 relays are removed, hence f=0 by rule (2). The network (c) is disconnected when the relays 1 and 2 or 1 and 3 are removed. The safety factor is 2.</p>

<p>Write a program that reads several data sets and computes the safety factor for the cable networks encoded by the data sets.</p>

### 입력

<p>Each data set starts with two integers: 0&le;n&le;50, the number of relays in the net, and m, the number of cables in the net. Follow m data pairs (u,v), u &lt; v, where u and v are relay identifiers (integers in the range 0..n-1). The pair (u,v) designates the cable that interconnects the relays u and v. The pairs may occur in any order. Except the (u,v) pairs, which do not contain white spaces, white spaces can occur freely in input. Input data terminate with an end of file and are correct.</p>

### 출력

<p>For each data set, the program prints on the standard output, from the beginning of a line, the safety factor of the encoded net.</p>