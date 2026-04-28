# [Silver I] Zoo - 20813

[문제 링크](https://www.acmicpc.net/problem/20813)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 17, 맞힌 사람: 15, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Esmeralda bygger ett zoo med $N$ burar i en l&aring;ng rad. Varje bur ska fyllas med ett djur. Hon har $K$ olika djurarter att v&auml;lja p&aring;, som vi kallar A, B, C, o.s.v. Hon kan ha flera burar med samma djurart, men inte precis intill varandra. Dessutom vet hon att vissa djur inte trivs bra ihop. N&auml;rmare best&auml;mt s&aring; finns det $M$ stycken &quot;br&aring;kiga grupper&quot; av djurarter, och Esmeralda vill inte placera tv&aring; djur ur samma br&aring;kiga grupp i burar intill varandra. P&aring; hur m&aring;nga s&auml;tt kan Esmeralda placera ut djur i burarna?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal: $2\le N \le 15$, antalet deltagare, $2\le K \le 10$, antalet djurarter, och $2 \le M\le 5$, antalet br&aring;kiga grupper. P&aring; var och en av de f&ouml;ljande $M$ raderna st&aring;r en str&auml;ng som best&aring;r av mellan $2$ och $K$ bokst&auml;ver: en br&aring;kig grupp av djurarter som parvis inte tolererar varandra. Endast de $K$ f&ouml;rsta bokst&auml;verna i alfabetet (och endast versaler) kan f&ouml;rekomma i str&auml;ngarna och en bokstav f&ouml;rekommer inte flera g&aring;nger i samma str&auml;ng.</p>

### 출력

<p>Programmet ska skriva ut ett heltal, antal s&auml;tt Esmeralda kan placera ut djur p&aring;. F&ouml;r givna indata kommer svaret aldrig &ouml;verstiga 2 miljarder.</p>

### 힌트

<p>I det f&ouml;rsta exemplet trivs alla arter ihop. I f&ouml;rsta buren kan Esmeralda v&auml;lja mellan 4 djurarter. F&ouml;r andra och tredje buren finns tre m&ouml;jligheter vardera, eftersom det inte f&aring;r vara samma art som i den f&ouml;reg&aring;ende. Totalt finns $4\cdot 3\cdot 3=36$ m&ouml;jliga placeringar.</p>

<p>I det andra exemplet vet vi att Babian och Elefant inte f&aring;r vara intill varandra. Vi vet ocks&aring; att Babian, Antilop, Dingo och Citronfj&auml;ril alla &auml;r fiender, och inga av dessa kan d&auml;rf&ouml;r s&auml;ttas intill varandra. Esmeralda m&aring;ste s&aring;lunda s&auml;tta en elefant i varannan bur och v&auml;lja fritt mellan antilop, dingo och citronfj&auml;ril i de &ouml;vriga. Detta ger 9 m&ouml;jligheter om hon b&ouml;rjar med elefant och 9 m&ouml;jligheter om hon b&ouml;rjar med n&aring;got av de andra djuren.</p>