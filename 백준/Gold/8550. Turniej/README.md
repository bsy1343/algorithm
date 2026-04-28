# [Gold II] Turniej - 8550

[문제 링크](https://www.acmicpc.net/problem/8550)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 67, 맞힌 사람: 63, 정답 비율: 78.750%

### 분류

자료 구조, 그래프 이론, 우선순위 큐, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>W Bajtocji rozegrano turniej, w kt&oacute;rym wzięło udział <em>n</em>&nbsp;zawodnik&oacute;w. Zawodnikom przydzielono numery od 1&nbsp;do&nbsp;<em>n</em>, w kolejności zgłoszeń. Planowano rozegranie pojedynk&oacute;w w każdej parze zawodnik&oacute;w, jednak ze względu na silny wiatr turniej został przerwany po rozegraniu jedynie części z nich. Niestety ze względu na zaplanowaną obecność kr&oacute;la Bajtazara na ceremonii wręczenia nagr&oacute;d, zakończenie nie mogło zostać przesunięte. Jury stanęło więc przed problemem przydzielenia miejsc. Problem jest tym większy, iż w Bajtocji nie uznaje się miejsc r&oacute;wnorzędnych. Aby przydzielić miejsca Sędzia Gł&oacute;wny ustalił następującą regułę:</p>

<ul>
	<li>Każdy zawodnik musi zajmować wyższą pozycję w rankingu niż wszyscy zawodnicy, kt&oacute;rych pokonał w bezpośrednich pojedynkach.</li>
</ul>

<p>Członkowie Jury przystąpili ochoczo do tworzenia ranking&oacute;w. Szybko okazało się jednak, że prawie wszyscy zaproponowali inny przydział miejsc. Sędzia gł&oacute;wny ustalił więc spos&oacute;b por&oacute;wnywania ranking&oacute;w:</p>

<ul>
	<li>Ranking A jest lepszy od innego rankingu, jeśli na najwyższej rozr&oacute;żniającej je pozycji ranking A posiada zawodnika, kt&oacute;ry zgłosił się wcześniej.</li>
</ul>

<p>Twoje zadanie polega na sporządzeniu najlepszego rankingu. Szczęśliwie okazało się, że wyniki dotychczas rozgrywanych pojedynk&oacute;w gwarantują istnitnie takiego rankingu.</p>

### 입력

<p>W pierwszym wierszu wejścia zapisane są dwie liczby całkowite <em>n</em>&nbsp;i <em>m</em>, oddzielone pojedynczym odstępem, 2 &le; <em>n</em> &le; 100 000, 0 &le; <em>m</em> &le; 100 000. Liczba <em>n</em>&nbsp;oznacza liczbę zawodnik&oacute;w, a <em>m</em>&nbsp;liczbę rozegranych pojedynk&oacute;w. W kolejnych <em>m</em>&nbsp;wierszach zapisane są rozegrane pojedynki. Każdy z tych wierszy zawiera dwie liczby całkowite oddzielone pojedynczym odstępem, z kt&oacute;rych pierwsza to numer zwycięzcy pojedynku, a druga numer przegranego.</p>

### 출력

<p>Na wyjściu powinieneś wypisać najlepszy ranking, czyli numery zawodnik&oacute;w, rozpoczynając od najwyższej pozycji. Numer każdego zawodnika wypisz w osobnym wierszu.</p>