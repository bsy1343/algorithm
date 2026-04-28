# [Silver II] Sumy - 26700

[문제 링크](https://www.acmicpc.net/problem/26700)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 24, 맞힌 사람: 21, 정답 비율: 55.263%

### 분류

정렬, 이분 탐색

### 문제 설명

<p>Morze Bajtockie znane jest z wielu gatunk&oacute;w ryb, niespotykanych w innych akwenach wodnych świata. Najbardziej słynie z powodu zamieszkujących je bajtockich sum&oacute;w, kt&oacute;rych okazy czasami ważą nawet kilka ton! Sumy bajtockie charakteryzuje r&oacute;wnież bardzo nietypowa dieta: gdy nadchodzi zima, zjadają one jedynie inne sumy żyjące w akwenie!</p>

<p>Algolina jest doktorantką Uniwersytetu Bajtockiego i jej projektem badawczym jest zbadanie tego zachowania sum&oacute;w. Zdążyła już wyłapać wszystkie okazy z Morza Bajtockiego, zważyć je i wypuścić z powrotem do akwenu. Masa każdego suma, wyrażona w gramach, jest dodatnią liczbą całkowitą. Ponadto, Algolina zaobserwowała, że sum może zjeść innego suma tylko wtedy, gdy jest od niego cięższy. Innymi słowy, sum może żywić się jedynie sumami o ściśle mniejszej masie. W momencie, gdy jeden sum zje drugiego, lżejszego suma, jego masa wzrasta do sumy mas obu sum&oacute;w, a zjedzony sum znika z morza.</p>

<p>Przyszedł czas na analizę wynik&oacute;w badań. Algolina zastanawia się, czy może się okazać, że w Morzu Bajtockim pozostanie tylko jeden sum. Dokładniej, jeśli w wyniku powyższego procesu żywienia się sum&oacute;w w akwenie pozostanie dokładnie jeden sum, to ryba ta staje się kr&oacute;lem Morza Bajtockiego. Naturalnie więc narzuca się pytanie: kt&oacute;re ryby mogą stać się kr&oacute;lami Morza Bajtockiego?</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą n (2 &le; n &le; 500 000) oznaczającą liczbę sum&oacute;w w Morzu Bajtockim.</p>

<p>Drugi wiersz składa się z n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>) i opisuje masy kolejnych sum&oacute;w w morzu &ndash; a<sub>i</sub> oznacza masę i-tego suma wyrażoną w gramach.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia wypisz ciąg n znak&oacute;w; i-ty znak opisu (1 &le; i &le; n) powinien być r&oacute;wny T, jeśli i-ty sum może stać się kr&oacute;lem Morza Bajtockiego, zaś N w przeciwnym przypadku.</p>

### 힌트

<p>Wyjaśnienie przykład&oacute;w: Rozważmy pierwszy przykład. Poniższy opis pokazuje scenariusz, w kt&oacute;rym drugi sum (o wadze 7 gram&oacute;w) staje się kr&oacute;lem Morza Bajtockiego:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th colspan="6">Wagi sum&oacute;w [g]</th>
			<th>Opis</th>
		</tr>
	</tbody>
	<tbody>
		<tr>
			<td>2</td>
			<td>7</td>
			<td>1</td>
			<td>8</td>
			<td>2</td>
			<td>8</td>
			<td>Początkowy stan Morza Bajtockiego.</td>
		</tr>
		<tr>
			<td>3</td>
			<td>7</td>
			<td>-</td>
			<td>8</td>
			<td>2</td>
			<td>8</td>
			<td>Pierwszy sum zjada trzeciego suma i jego masa wzrasta do 3 gram&oacute;w.</td>
		</tr>
		<tr>
			<td>-</td>
			<td>10</td>
			<td>-</td>
			<td>8</td>
			<td>2</td>
			<td>8</td>
			<td>Drugi sum zjada pierwszego suma, co zwiększa jego masę do 10 gram&oacute;w.</td>
		</tr>
		<tr>
			<td>-</td>
			<td>10</td>
			<td>-</td>
			<td>8</td>
			<td>-</td>
			<td>10</td>
			<td>Sz&oacute;sty sum zjada piątego suma i jego nowa masa wynosi 10 gram&oacute;w.</td>
		</tr>
		<tr>
			<td>-</td>
			<td>18</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>10</td>
			<td>Drugi sum zjada czwartego suma.</td>
		</tr>
		<tr>
			<td>-</td>
			<td>28</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>Drugi sum zjada sz&oacute;stego suma i staje się kr&oacute;lem Morza Bajtockiego.</td>
		</tr>
	</tbody>
</table>

<p>Można natomiast udowodnić, że pierwszy sum (o początkowej wadze 2 gram&oacute;w) nie jest w stanie stać się kr&oacute;lem.</p>

<p>Zwr&oacute;ć uwagę na to, że w drugim przykładzie drugi sum (o wadze 4 gram&oacute;w) nie może zjeść żadnego innego suma, więc nie może on stać się kr&oacute;lem Morza Bajtockiego.</p>