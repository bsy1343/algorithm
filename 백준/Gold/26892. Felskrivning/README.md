# [Gold V] Felskrivning - 26892

[문제 링크](https://www.acmicpc.net/problem/26892)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

조합론, 수학

### 문제 설명

<p>Gunilla ska g&aring; in p&aring; sin favorithemsida. Ibland blandar hon dock ihop vissa bokst&auml;ver, och r&aring;kar ist&auml;llet g&aring; in p&aring; en annan hemsida. Intressant nog g&ouml;r hon aldrig exakt samma fel tv&aring; g&aring;nger i samma adress.</p>

<p>Givet adressen till hennes favorithemsida och en beskrivning av vilka bokst&auml;ver hon brukar blanda ihop, skriv ut l&auml;ngden p&aring; den lista &ouml;ver addresser som hackers borde registrera f&ouml;r att lura in henne p&aring; sin hemsida.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r en str&auml;ng: adressen till Gunillas favorithemsida. Endast bokst&auml;verna a-z samt punkt f&ouml;rekommer, och l&auml;ngden &auml;r mellan 2 och 20 tecken. Det &auml;r inte n&ouml;dv&auml;ndigtvis en verklig adress eller ens en korrekt strukturerad adress. P&aring; andra raden st&aring;r ett heltal $N$  (d&auml;r $1 \le N \le 13$), antalet grupper av bokst&auml;ver som Gunilla blandar ihop. Var och en av de f&ouml;ljande $N$ raderna inneh&aring;ller en str&auml;ng med mellan 2 och 26 bokst&auml;ver, alla olika och valda bland a-z. Bokst&auml;verna i varje str&auml;ng utg&ouml;r en grupp d&auml;r alla bokst&auml;ver kan blandas ihop med varandra. Exempelvis, om str&auml;ngen &auml;r &quot;boi&quot; inneb&auml;r det att &quot;b&quot; kan bytas mot &quot;o&quot; eller &quot;i&quot;, att &quot;o&quot; kan bytas mot &quot;b&quot; eller &quot;i&quot;, och att &quot;i&quot; kan bytas mot &quot;b&quot; eller &quot;o&quot;. Ingen bokstav f&ouml;rekommer i mer &auml;n en grupp.</p>

### 출력

<p>Ett heltal: antalet adresser som Gunilla kan hamna p&aring; genom att skriva fel minst en g&aring;ng, men utan att g&ouml;ra exakt samma felskrivning (byta ut en viss bokstav mot en viss annan bokstav) flera g&aring;nger.</p>

### 제한

<ul>
	<li>Svaret &auml;r mindre &auml;n 2 miljarder</li>
</ul>

### 힌트

<p>De potentiella hacker-adresserna i de tre f&ouml;rsta exemplen &auml;r:</p>

<pre>
po.pe     kartis.com      abbe
so.pe     katris.com      abbi
so.se     kartix.com      ebba
          katrix.com      ebbi
          kattix.com      ibba
          kartiz.com      ibbe
          katriz.com
          kattiz.com
</pre>

<p>Notera avsaknaden av exempelvis &quot;karris.com&quot; och &quot;ebbe&quot; d&auml;r samma fel gjorts tv&aring; g&aring;nger.</p>