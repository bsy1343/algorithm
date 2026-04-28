# [Platinum III] Najmniejsza wspólna wielokrotność - 26824

[문제 링크](https://www.acmicpc.net/problem/26824)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 16, 맞힌 사람: 12, 정답 비율: 34.286%

### 분류

이분 탐색, 수학, 정수론

### 문제 설명

<p>Bajtazar przygotowuje się właśnie do sprawdzianu z matematyki. Sprawdzian dotyczyć będzie obliczania najmniejszej wsp&oacute;lnej wielokrotności. Dla przypomnienia, najmniejszą wsp&oacute;lną wielokrotnością (NWW) liczb a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>k</sub> jest najmniejsza dodatnia liczba całkowita d, dla kt&oacute;rej wszystkie liczby a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>k</sub> są jej dzielnikami. Dla przykładu NWW(8, 12) = 24, a NWW(2, 3, 4) = 12.</p>

<p>Bajtazar dość szybko opanował najprostsze zadania, a że temat bardzo mu się spodobał, to zaczął wymyślać własne zadania. Sprawdźmy, czy potrafisz rozwiązać jedno z nich.</p>

<p>Dla ustalonej liczby naturalnej M należy podać przedział liczb naturalnych [a, b], taki że najmniejsza wsp&oacute;lna wielokrotność wszystkich liczb naturalnych z tego przedziału jest r&oacute;wna dokładnie M. Przedział [a, b] musi zawierać co najmniej dwie liczby naturalne.</p>

<p>Aby nie było zbyt łatwo, Bajtazar ma wiele pytań do Ciebie (Twojego programu).</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita z (z &ge; 1) określająca liczbę zapytań Bajtazara. W kolejnych z wierszach znajduje się opis kolejnych zapytań, po jednym w wierszu. Opis każdego zapytania składa się z jednej liczby naturalnej M (M &ge; 1).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście dokładnie z wierszy. W i-tym z nich powinna się znaleźć odpowiedź na i-te zapytanie Bajtazara. Odpowiedź na każde zapytanie składa się z dw&oacute;ch (dodatnich) liczb naturalnych a i b oddzielonych pojedynczym odstępem, oznaczających przedział liczb [a, b].</p>

<p>Jeśli odpowiedź na zapytanie nie istnieje, zamiast tego należy wypisać jedno słowo <code>NIE</code>.</p>

<p>Jeśli istnieje więcej niż jedna odpowiedź, spośr&oacute;d wszystkich poprawnych należy wypisać tę, kt&oacute;ra ma najmniejsze a, rozstrzygając remisy na korzyść tej, kt&oacute;ra ma najmniejsze b.</p>

### 제한

<ul>
	<li>z &le; 10 000, M &le; 10<sup>18</sup></li>
</ul>

### 힌트

<p>Wyjaśnienie do przykładu: Dla pierwszego zapytania liczba 12 jest najmniejszą wsp&oacute;lną wielokrotnością dla przedziału [2, 4], zawierającego liczby 2, 3 i 4, jak r&oacute;wnież dla przedziału [1, 4] zawierającego liczby 1, 2, 3 i 4. Ten drugi przedział ma mniejsze a.</p>