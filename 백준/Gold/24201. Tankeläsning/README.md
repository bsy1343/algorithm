# [Gold V] Tankeläsning - 24201

[문제 링크](https://www.acmicpc.net/problem/24201)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 30, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

수학, 구현, 사칙연산, 많은 조건 분기

### 문제 설명

<p>Ett vanligt magitrick g&aring;r till p&aring; f&ouml;ljande vis:</p>

<p>T&auml;nk p&aring; ett tal. Subtrahera 1 fr&aring;n talet du t&auml;nkte p&aring;. Multiplicera resultatet med 3 och l&auml;gg till 9. Dela svaret med 3. Addera 5. Subtrahera talet du t&auml;nkte p&aring; fr&aring;n b&ouml;rjan. Talet du har kvar &auml;r 7.</p>

<p>Sj&auml;lvklart &auml;r ingen verklig tankel&auml;sning involverad. Om vi kallar det ursprungliga talet f&ouml;r $x$ f&aring;r vi genom att utf&ouml;ra operationerna uttrycken</p>

<p>\[\begin{array}{rcl} (x) - 1 &amp; = &amp; x - 1 \\ (x - 1) * 3 &amp; = &amp; 3x - 3 \\ (3x - 3) + 9 &amp; = &amp; 3x + 6 \\ (3x + 6)\ /\ 3 &amp; = &amp; x + 2 \\ (x + 2) + 5 &amp; = &amp; x + 7 \\ (x + 7) - x &amp; = &amp; 7 \end{array}\]</p>

<p>Allts&aring; kommer vi alltid f&aring; talet 7 p&aring; slutet!</p>

<p>Johan vill imponera p&aring; sina kompisar genom att utf&ouml;ra en liknande tankel&auml;sning. Tyv&auml;rr &auml;r han inte s&aring; bra p&aring; matte, s&aring; han beh&ouml;ver hj&auml;lp att ta reda p&aring; om hans eget magitrick faktiskt fungerar.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$ ($1 \le N \le 10$) - antalet operationer som magitricket best&aring;r av.</p>

<p>De n&auml;sta $N$ raderna beskriver varje operation med hj&auml;lp av tv&aring; mellanslagsseparerade tecken. Det f&ouml;rsta tecknet kommer att vara ett av &#39;+&#39;, &#39;-&#39;, &#39;*&#39; och &#39;/&#39;, och beskriver operationen som utf&ouml;rs. Det andra tecknet anger talet operationen utf&ouml;rs med, och kommer att vara antingen en siffra 0-9, eller ett &#39;x&#39;. I det senare fallet ska du utf&ouml;ra operationen med talet som man ursprungligen t&auml;nkte p&aring; i st&auml;llet.</p>

<p>Du kommer aldrig f&aring; kommandot &quot;/ x&quot; eller &quot;/ 0&quot;.</p>

### 출력

<p>Om magitricket fungerar, d.v.s.\ om man alltid f&aring;r samma tal i slutet oavsett vad man b&ouml;rjade med, och det talet dessutom &auml;r ett heltal, ska du skriva ut talet. I annat fall ska du skriva ut &quot;Nej&quot;.</p>

<p>Observera att det enbart &auml;r sluttalet som m&aring;ste vara ett heltal - tal som upptr&auml;der i utr&auml;kningen beh&ouml;ver inte vara det.</p>