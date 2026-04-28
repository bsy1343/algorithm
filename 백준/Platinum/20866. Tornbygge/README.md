# [Platinum V] Tornbygge - 20866

[문제 링크](https://www.acmicpc.net/problem/20866)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Lille Dirk Ref vill bygga ett s&aring; h&ouml;gt torn som m&ouml;jligt med sina N klossar. Alla klossar &auml;r r&auml;tblock med en kvadratisk botten, och ett torn &auml;r en m&auml;ngd med klossar som &auml;r staplade direkt ovanp&aring; varandra (det f&aring;r inte ligga tv&aring; klossar bredvid varandra). F&ouml;r att tornet inte ska bli instabilt och rasa m&aring;ste varje kloss bredd (allts&aring; sidan p&aring; den kvadratiska botten den st&aring;r p&aring;) alltid vara strikt mindre &auml;n bredden av klossen den st&aring;r p&aring;. Allts&aring; byggs tornet med de bredaste klossarna i botten, och smalare klossar ju h&ouml;gre upp man kommer. Dessutom m&aring;ste &auml;ven varje kloss vara minst lika h&ouml;gt som klossen nedanf&ouml;r, f&ouml;r att tornet ska bli snyggt. Hj&auml;lp Dirk att r&auml;kna ut hur h&ouml;gt torn han maximalt kan bygga.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$, antalet klossar Dirk har. D&auml;refter f&ouml;ljer $N$ rader, en f&ouml;r varje kloss. P&aring; den $i$:te av dessa rader st&aring;r tv&aring; heltal, det $i$:te blockets bredd $W_i$, $1 \leq W_i \leq 10^9$ och h&ouml;jd $H_i$, $1 \leq H_i \leq 10^9$.</p>

### 출력

<p>Skriv ut en rad med ett heltal: den maximala h&ouml;jden som Dirk kan bygga.</p>

### 제한

<ul>
	<li>$ 1 \le N \le 10^5$</li>
</ul>