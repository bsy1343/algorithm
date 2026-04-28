# [Silver II] Robottävling - 20837

[문제 링크](https://www.acmicpc.net/problem/20837)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 18, 맞힌 사람: 17, 정답 비율: 89.474%

### 분류

애드 혹, 해 구성하기, 그리디 알고리즘, 정렬

### 문제 설명

<p>Du har byggt en robot till en robott&auml;vling. En av uppgifterna som roboten ska l&ouml;sa g&aring;r ut p&aring; att r&auml;kna antalet kuber i ett kvadratiskt rutn&auml;t. Rutn&auml;tet har $N$ rader och $N$ kolumner, och i varje ruta finns en stapel med $1$ till $5$ identiska kuber. Tyv&auml;rr &auml;r din robot inte s&auml;rskilt bra p&aring; att samla information. Det enda den kan g&ouml;ra &auml;r att hitta h&ouml;jden p&aring; den h&ouml;gsta stapeln i varje rad och kolumn. Du hade t&auml;nkt kompensera f&ouml;r detta genom att g&ouml;ra roboten v&auml;ldigt smart. Skriv ett program som, givet informationen roboten samlade in, r&auml;knar ut det minsta och det st&ouml;rsta m&ouml;jliga antalet kuber i rutn&auml;tet.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $N$, antalet rader och kolumner i rutn&auml;tet. P&aring; andra raden st&aring;r $N$ heltal $r_i$ $(1 \leq r_i \leq 5)$, h&ouml;jden av h&ouml;gsta stapeln i rad $i$. P&aring; tredje raden st&aring;r $N$ heltal $c_i$ $(1 \leq c_i \leq 5)$, h&ouml;jden av h&ouml;gsta stapeln i kolumn $i$. Det &auml;r garanterat att det inte finns n&aring;gra mots&auml;gelser i indatan, det vill s&auml;ga det kommer alltid att finnas minst en giltig utplacering av kuber som ger de givna v&auml;rdena.</p>

### 출력

<p>Programmet ska skriva ut tv&aring; heltal: det minsta m&ouml;jliga och det st&ouml;rsta m&ouml;jliga totala antal kuber i rutn&auml;tet.</p>

### 제한

<ul>
	<li>$3 \le N \le 10$</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20837.%E2%80%85Robott%C3%A4vling/6e306275.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/20837.%E2%80%85Robott%C3%A4vling/6e306275.png" data-original-src="https://upload.acmicpc.net/8e5f98fa-d9c6-4bf9-8d02-77a4dc5cb38c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 373px; height: 168px;" /></p>

<p>Dessa tre &auml;r de enda m&ouml;jliga konfigurationerna f&ouml;r det f&ouml;rsta exemplet. B&aring;da de tv&aring; f&ouml;rsta har totalt 14 kuber och den tredje har totalt 15 kuber. Svaret blir allts&aring; att det minsta m&ouml;jliga totala antalet kuber &auml;r 14, och det st&ouml;rsta m&ouml;jliga &auml;r 15.</p>