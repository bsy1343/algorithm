# [Platinum V] 마술사 남정훈 - 17217

[문제 링크](https://www.acmicpc.net/problem/17217)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 213, 정답: 43, 맞힌 사람: 16, 정답 비율: 18.391%

### 분류

(분류 없음)

### 문제 설명

<p>정훈이는 마술사 1급 자격증을 가지고 세계에서 활약하는 일류 마술사이다.</p>

<p>정훈이는 이번 공연의 카드마술쇼에서&nbsp;마술의&nbsp;난이도를 높이기 위해 카드를 특별 주문 제작하여&nbsp;번호가 1부터 26번까지 있는 트럼프카드를 사용한다.</p>

<p>테이블에는 26장의 카드가 오름차순으로 놓여있으며, 각 카드의 모양은 스페이드(S), 다이아몬드(D), 하트(H), 클로버(C) 중 하나이다.</p>

<p>정훈이가 아래와 같은 마법의 주문들을 외치면 주문에 따라 카드들의 모양이 변한다.&nbsp;</p>

<ol>
	<li>Epahs lasrever&nbsp;: 모든 카드의 S와 C, D와 H의 모양을 서로 바꾼다.
	<ul>
		<li>예) SSSSSSSSSSCCCCCCCCCCDDDHHH&nbsp;-&gt; E -&gt;&nbsp;CCCCCCCCCCSSSSSSSSSSHHHDDD</li>
	</ul>
	</li>
	<li>Roloc&nbsp;lasrever: 모든 카드의 S와 H, C와 D의 모양을 서로 바꾼다.
	<ul>
		<li>예) CCCCCCCCCCSSSSSSSSSSHHHDDD -&gt; R -&gt; DDDDDDDDDDHHHHHHHHHHSSSCCC</li>
	</ul>
	</li>
	<li>Gnitfihs(N): 1번&nbsp;카드부터 카드의 모양을 N번째 앞에 놓인 카드의 모양으로 바꾼다. 이때 1번의 앞은 26번이다. (1 &le; N &le; 26)
	<ul>
		<li>예) DDDDDDDDDDHHHHHHHHHHSSSCCC -&gt;&nbsp;(G 3) -&gt;&nbsp;CCCDDDDDDDDDDHHHHHHHHHHSSS</li>
	</ul>
	</li>
	<li>Tniop-taht-egnahc(N, P): N번&nbsp;카드의 모양을 P로 바꾼다.
	<ul>
		<li>예)&nbsp;CCCDDDDDDDDDDHHHHHHHHHHSSS -&gt;&nbsp;(T 26 D) -&gt; CCCDDDDDDDDDDHHHHHHHHHHSSD</li>
	</ul>
	</li>
	<li>Aliov: 1부터 26까지 카드들의 모양을 순서대로 관객들에게 보여준다.</li>
</ol>

<p>정훈이가 외치는&nbsp;주문에 맞춰서 카드를&nbsp;바꿔 주는 프로그램을 작성해보자.&nbsp;</p>

### 입력

<p>첫 번째 줄에 정훈이가 외칠 주문의 수 M이 주어진다. M은 10,000,000 보다 작은 자연수이다.</p>

<p>두 번째 줄에 처음 카드의&nbsp;배열이 주어진다. 카드의 배열은 S, D, H, C로 이루어진 26자의 문자열이다.</p>

<p>세 번째 줄부터 M개 줄에 걸쳐 각 주문의 첫 글자(E, R, G, T, A)와 파라미터가 있다면 파라미터를 입력한다.&nbsp;</p>

### 출력

<p>Aliov 주문이 들어올 때마다 관객들에게 보여줄 카드의&nbsp;배열을 출력한다.</p>