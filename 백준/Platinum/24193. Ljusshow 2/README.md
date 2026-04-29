# [Platinum I] Ljusshow 2 - 24193

[문제 링크](https://www.acmicpc.net/problem/24193)

### 성능 요약

시간 제한: 11 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 6, 맞힌 사람: 1, 정답 비율: 1.695%

### 분류

그리디 알고리즘, 비트마스킹, 애드 혹, 해 구성하기

### 문제 설명

<p>Efter att du löst problemet <em>Ljusshow</em> så inser du att det vita bländande ljuset kan utnyttjas för att lysa upp vissa av rutorna i rutnätet. I det här problemet får du givet vilka av rutorna som ska lysa vitt och vilka som inte ska göra det, och din uppgift är att placera ut lamporna längs kanten så att så många av kraven som möjligt blir uppfyllda.</p>

### 입력

<p>Indatan består av $10$ testfall.</p>

<ul>
	<li>Den första raden innehåller ett heltal $T$ ($0 \leq T \leq 10$), numret på testfallet ($0$ är exempelfallet nedan).</li>
	<li>Den andra raden innehåller två heltal: $n$ och $m$ ($1 \le n,m \le 1000$), antalet rader och kolumner i rutnätet.</li>
</ul>

<p>De följande $n$ raderna utgör en beskrivning av vilka rutor som ska lysa i rutnätet och vilka som inte ska det. Varje rad kommer bestå av en sträng med $m$ ettor och nollor. En etta på rad $r$ och kolumn $c$ indikerar att den</p>

<ul>
	<li>rutan ska lysa vitt. En nolla indikerar att rutan inte ska lysa vitt.</li>
</ul>

### 출력

<p>Skriv ut fyra rader med en sträng på varje. Strängarna ska utgöra en utplacering av lampor, på samma format som indatan i <em>Ljusshow</em>. Notera att du inte ska skriva ut $n$ och $m$.</p>

### 힌트

<p>I exempelfallet så uppfyller lösningen alla kraven och dess poäng är därför $7.5$, vilket är det maximala möjliga.</p>