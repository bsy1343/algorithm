# [Gold II] Urzędnicy - 8584

[문제 링크](https://www.acmicpc.net/problem/8584)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 22, 맞힌 사람: 19, 정답 비율: 67.857%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 그래프 탐색, 애드 혹, 트리, 깊이 우선 탐색, 분리 집합

### 문제 설명

<p>W Bajtocji ostatnimi czasy nie dzieje się najlepiej. Do władzy doszedł opanowany obsesyjnym strachem o swoje życie kr&oacute;l Bitogrom. Już w kilka dni po objęciu tronu ukazał on swoje bezwzględne oblicze, ścinając pięciu dworzan podejrzanych o spiskowanie przeciw niemu. Na wszystkich urzędnik&oacute;w w państwie padł strach o własne życie. Mieli oni świadomość, że każdy donos przełożonego prowadzi do szybkiej egzekucji. Sprawę pogarszał fakt, że donosiciel stawał się zaufanym człowiekiem kr&oacute;la, kt&oacute;remu tym samym nie groził już wyrok skazujący. W zastraszonym środowisku urzędnik&oacute;w państwowych była to wystarczająca motywacja, żeby donieść na kt&oacute;regoś ze swoich podwładnych.</p>

<p>Sytuacja w urzędach bardzo zmartwiła profesora Bajtoszewskiego, kt&oacute;ry przewidywał związane z nią utrudnienia w działaniu sektor&oacute;w państwowych. Poprosił Cię, abyś obliczył, ilu maksymalnie urzędnik&oacute;w może zostać straconych wskutek donos&oacute;w. Profesor wyjaśnił Ci dokładniej zasady funkcjonowania państwa:</p>

<ul>
	<li>Każdy z $n$&nbsp;urzędnik&oacute;w w państwie ma unikatowy identyfikator będący liczbą całkowitą z przedziału $[1,n]$.</li>
	<li>Każdy przełożony ma numer mniejszy od numer&oacute;w wszystkich swoich podwładnych.</li>
	<li>Przełożonym wszystkich urzędnik&oacute;w jest premier Bajtocji, kt&oacute;ry ma numer 1 i, tym samym, nie ma przełożonego.</li>
	<li>Każdy urzędnik donosi na co najwyżej jednego ze swoich podwładnych, ponieważ po pierwszym donosie jest on już zaufanym człowiekiem kr&oacute;la.</li>
	<li>W Bajtocji panuje zasada: &quot;podwładny mojego podwładnego jest moim podwładnym&quot;, co w praktyce oznacza, że urzędnik może donieść na urzędnika, dla kt&oacute;rego jest przełożonym tylko pośrednio.</li>
</ul>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczająca liczbę urzędnik&oacute;w. W drugim wierszu znajduje się $n-1$&nbsp;liczb całkowitych, z kt&oacute;rych $i$-ta oznacza numer przełożonego urzędnika o numerze $i+1$.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia powinna znaleźć się jedna liczba całkowita, będąca maksymalną liczbą urzędnik&oacute;w, kt&oacute;rzy mogą zostać straceni w wyniku donos&oacute;w.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Urzędnik numer 1 donosi na urzędnika numer 3, a urzędnik numer 2 na urzędnika numer 4.</p>