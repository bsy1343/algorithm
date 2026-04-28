# [Gold V] Mieszanie kolorów - 26674

[문제 링크](https://www.acmicpc.net/problem/26674)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 40, 맞힌 사람: 29, 정답 비율: 78.378%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>Bajtazar szykuje się do pomalowania płotu. Przygotował już n puszek z białą farbą, kt&oacute;re ustawił w rzędzie i ponumerował liczbami od 1 do n. Chciałby użyć tej farby, jednak nie chce pomalować płotu na biało. Zam&oacute;wił specjalist&oacute;w od mieszania kolor&oacute;w, kt&oacute;rzy dysponują trzema barwnikami: ż&oacute;łtym, niebieskim i czerwonym. Wykonali oni m operacji, z kt&oacute;rych i-ta to dosypanie pewnego barwnika do wszystkich puszek pomiędzy l<sub>i</sub>-tą, a r<sub>i</sub>-tą włącznie.</p>

<p>Wynikowy kolor farby zależy od zbioru barwnik&oacute;w, kt&oacute;re były do niej dodane co najmniej raz. Barwniki mieszają się zgodnie z poniższą tabelką i diagramem:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26674.%E2%80%85Mieszanie%E2%80%85kolor%C3%B3w/0f7d81f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26674.%E2%80%85Mieszanie%E2%80%85kolor%C3%B3w/0f7d81f0.png" data-original-src="https://upload.acmicpc.net/aa07b5ee-9a53-4dd2-b9e5-cd862784ee4d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 155px; height: 149px; float: right;" /></p>

<table class="table table-bordered table-center-30">
	<thead>
		<tr>
			<th>Barwniki</th>
			<th>Kolor</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>brak</td>
			<td>biały</td>
		</tr>
		<tr>
			<td>ż&oacute;łty</td>
			<td>ż&oacute;łty</td>
		</tr>
		<tr>
			<td>niebieski</td>
			<td>niebieski</td>
		</tr>
		<tr>
			<td>czerwony</td>
			<td>czerwony</td>
		</tr>
		<tr>
			<td>ż&oacute;łty + niebieski</td>
			<td>zielony</td>
		</tr>
		<tr>
			<td>ż&oacute;łty + czerwony</td>
			<td>pomarańczowy</td>
		</tr>
		<tr>
			<td>niebieski + czerwony</td>
			<td>fioletowy</td>
		</tr>
		<tr>
			<td>ż&oacute;łty + niebieski + czerwony</td>
			<td>brązowy</td>
		</tr>
	</tbody>
</table>

<p>Bajtazar chciałby pomalować płot jednym kolorem. Po namyśle wybrał kolor zielony, ponieważ kojarzy mu się z werdyktem &bdquo;OK&rdquo; lub &bdquo;Zaakceptowano&rdquo;, jaki można czasami zobaczyć na konkursach algorytmicznych. Zastanawia się, w ilu puszkach farba ma teraz taki kolor. Pom&oacute;ż mu i policz to!</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n i m (1 &le; n, m &le; 10<sup>6</sup>), oznaczające odpowiednio liczbę puszek w rzędzie oraz liczbę operacji wykonanych przez specjalist&oacute;w od mieszania farby. W każdym z następnych m wierszy znajdują się po trzy liczby całkowite l<sub>i</sub>, r<sub>i</sub> i k<sub>i</sub> (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; n, 1 &le; k<sub>i</sub> &le; 3) oznaczające, że i-ta operacja polegała na dodaniu barwnika do puszek od l<sub>i</sub>-tej do r<sub>i</sub>-tej włącznie, a barwnik ten był ż&oacute;łty (k<sub>i</sub> = 1), niebieski (k<sub>i</sub> = 2) lub czerwony (k<sub>i</sub> = 3).</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca liczbę puszek z zieloną farbą po zakończeniu wszystkich operacji.</p>

### 힌트

<p>Wyjaśnienie przykładu: W kolejnych puszkach farba jest odpowiednio: niebieska, zielona, ż&oacute;łta, zielona, zielona, brązowa, pomarańczowa, ż&oacute;łta i biała. Zielony kolor występuje zatem w trzech puszkach.</p>