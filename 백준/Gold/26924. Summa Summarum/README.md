# [Gold IV] Summa Summarum - 26924

[문제 링크](https://www.acmicpc.net/problem/26924)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

정렬, 이분 탐색

### 문제 설명

<p>Anders och Beatrice har varsin lista med heltal. Dessa tv&aring; listor inneh&aring;ller lika m&aring;nga tal. Anders har en dr&ouml;m. Han har en dr&ouml;m om att summan av alla tal i hans lista ska vara lika med summan av alla tal i Beatrices lista (f&ouml;r att det skulle g&ouml;ra henne imponerad). Anders har l&auml;st flera &aring;r p&aring; h&ouml;gskolan, s&aring; han vet att s&aring; inte alltid &auml;r fallet. Anders har dock en plan f&ouml;r att komma n&auml;rmare sin dr&ouml;m.</p>

<p>Anders vill se till att skillnaden mellan de tv&aring; summorna &auml;r s&aring; liten som m&ouml;jligt. Anders kan ta ett av talen i sin egen lista och byta ut mot ett av talen i Beatrices lista, n&auml;r hon inte ser det. Observera att han endast v&aring;gar g&ouml;ra ett s&aring;dant byte, annars blir det f&ouml;r misst&auml;nkt.</p>

<p>Givet att han m&aring;ste g&ouml;ra precis ett s&aring;dant byte, vilken &auml;r den <em>minimala skillnad</em> mellan summorna som Anders kan &aring;stadkomma?</p>

### 입력

<p>P&aring; f&ouml;rsta raden i indata st&aring;r ett heltal $N$, antalet tal i Anders och Beatrices listor. P&aring; andra raden i indata f&ouml;ljer en lista med $N$ heltal som beskriver talen i Anders lista. P&aring; tredje och sista raden i indata f&ouml;ljer en lista med $N$ heltal som beskriver talen i Beatrices lista. F&ouml;r varje tal $X$ i listorna i indata s&aring; g&auml;ller att $-10^5 \leq X \leq 10^5$.</p>

### 출력

<p>Utdata ska best&aring; av ett heltal: den minimala skillnaden mellan summorna av Anders och Beatrices listor, efter att Anders har utf&ouml;rt bytet som beskrevs ovan.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 10^{5}$</li>
</ul>

### 힌트

<p>Anta att Anders och Beatrices listor &auml;r $[5,2,3,5,1]$ respektive $[1,4,3,4,2]$. Om vi tar en femma i den f&ouml;rsta listan och byter ut mot en fyra i den andra listan s&aring; kommer listorna inneh&aring;lla exakt samma tal. Det inneb&auml;r att b&aring;da summorna kommer vara $15$, och vi svarar d&aring; $0$.</p>