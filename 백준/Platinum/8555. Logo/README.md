# [Platinum IV] Logo - 8555

[문제 링크](https://www.acmicpc.net/problem/8555)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 구현

### 문제 설명

<p>Ostatnimi laty w Bajtocji nastąpił burzliwy rozw&oacute;j wolnego rynku i powstało wiele nowych firm. Prawie każda firma umieszcza przed wejściem do swojej siedziby wielki szyld z logo firmy. Logo firmy projektuje się na prostokątnej siatce podzielonej na kwadraty, zaczernianiając stosowne kwadraty. Następnie, na podstawie tak przygotowanego projektu tworzony jest szyld: na prostokątnym tle naklejane są płaty ze złota w taki spos&oacute;b, aby otrzymana figura miała dokładnie kształt zaprojetowanego logo (kształt figury zadanej przez czarne kwadraty w projekcie). Płaty można obracać i przyklejać dowolną stroną. Nie można jednak naklejać jednych płat&oacute;w na inne. Każdy jednostkowy kwadrat w projekcie odpowiada złotemu kwadratowi wielkości 1&nbsp;m&nbsp;&times;&nbsp;1&nbsp;m. Produkcją szyld&oacute;w zajmuje się firma LogoBajt. Do budowy szyld&oacute;w firma LogoBajt używa złotych płat&oacute;w o kilku kształtach. Płat w każdym kształcie jest w jednym kawałku i składa się z pewnej liczby jednostkowych kwadrat&oacute;w (1&nbsp;m&nbsp;&times;&nbsp;1&nbsp;m). Tutaj &quot;jeden kawałek&quot; oznacza, że w płacie można przejść od każdego kwadratu do każdego innego pokonując ciąg kwadrat&oacute;w, z k&oacute;rych każde kolejne dwa mają wsp&oacute;lną krawędź. Płaty wytłaczane są z matryc wielkości 3&nbsp;m&nbsp;&times;&nbsp;3&nbsp;m poprzez wycięcie niekt&oacute;rych spośr&oacute;d dziewięciu jednostkowych kwadrat&oacute;w. Firma LogoBajt właśnie otrzymała pewną liczbę zam&oacute;wień na nowe szyldy. Twoim zadaniem jest określenie dla każdego spośr&oacute;d nich, czy da się go wykonać mając do dyspozycji tylko płaty o zadanych kształtach. Jeśli tak, to jaka jest najmniejsza liczba płat&oacute;w, z kt&oacute;rych można zbudować szyld.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta opis kształt&oacute;w płat&oacute;w używanych w firmie LogoBajt,</li>
	<li>wczyta projekty szyld&oacute;w,</li>
	<li>dla każdego projektu stwierdzi, czy jest on wykonalny, a jeśli tak, to obliczy minimalną liczbę płat&oacute;w potrzebnych do jego wykonania,</li>
	<li>wypisze wyniki na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita <em>n</em>, r&oacute;wna liczbie opis&oacute;w kształt&oacute;w płat&oacute;w stsosowanych w firmie LogoBajt, 1 &le; <em>n</em> &le; 5. Następnie mamy pusty wiersz, a po nim opisy wszystkich stosowanych kształt&oacute;w. Między kolejnymi dwoma opisami znajduje się jeden pusty wiersz.</p>

<p>Opis jednego kształtu mieści się w trzech wierszach, zawierających po 3&nbsp;znaki: znak&nbsp;<code>#</code>&nbsp;oznacza, że odpowiadający mu kwadrat jednostkowy należy do płata, znak&nbsp;<code>.</code>&nbsp;(kropka) oznacza, że taki kwadrat jest wycinany z matrycy.</p>

<p>Po wszystkich <em>n</em>&nbsp;opisach płat&oacute;w mamy znowu pusty wiersz, a następnie pojawia się wiersz z liczbą zam&oacute;wień <em>m</em>&nbsp;(1 &le; <em>m</em> &le; 3). Dalej jest zn&oacute;w pusty wiersz oraz opisy wszystkich&nbsp;<em>m</em>&nbsp;projekt&oacute;w, oddzielone pojedynczymi pustymi wierszami.</p>

<p>Opis projektu zaczyna się od dw&oacute;ch liczb <em>x</em>, <em>y</em>&nbsp;oddzielonych odstępem (1 &le; <em>x</em> &le; 55, 1 &le; <em>y</em> &le; 5). Są to odpowiednio szerokość i wysokość projektowanego szyldu w metrach. W każdym z kolejnych <em>y</em>&nbsp;wierszy znajduje się <em>x</em>&nbsp;znak&oacute;w: znak&nbsp;<code>#</code>&nbsp;oznacza, że odpowiadający mu kwadrat powinien być złoty, znak&nbsp;<code>.</code>&nbsp;(kropka) oznacza, że to miejsce powinno pozostać puste.</p>

### 출력

<p>Na wyjściu powinno znaleźć się dokładnie <em>m</em>&nbsp;wierszy. W <em>i</em>-tym wierszu powinieneś wypisać, albo minimalną liczbę płat&oacute;w potrzebnych do wyprodukowania <em>i</em>-teg szyldu opisanego na wejściu, albo jedno słowo <code>NIE</code>, jeśli projektu nie da się zrealizować.</p>