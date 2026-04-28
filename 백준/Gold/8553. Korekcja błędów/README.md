# [Gold II] Korekcja błędów - 8553

[문제 링크](https://www.acmicpc.net/problem/8553)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Alicja i Bob, stali bohaterowi książek o kryptografii, ustalili algorytm szyfrowania, wymienili klucze i zastanawiają się nad sposobem przesyłania zaszyfrowanych wiadomości (dalej kr&oacute;tko wiadomości) po dostępnym dla nich łączu. Wiadomość jest ciągiem małych liter alfabetu angielskiego. Alicja i Bob postanowili zastosować kod binarny. Przypisali każdej literze pewien ciąg bit&oacute;w. Nie zakładali przy tym stałej długości tych ciąg&oacute;w, ani tego, że żaden ciąg nie jest prefiksem innego. Może się więc zdarzyć, że nie każdą zakodowaną wiadomość da się jednoznacznie zdekodować. Wiadomo natomiast, że ciągi bit&oacute;w przypisane r&oacute;żnym literom są r&oacute;żne. Ciąg bit&oacute;w będący zakodowaną wiadomością składa się z połączonych ciąg&oacute;w odpowiadających kolejnym literom tej wiadomości. Twoim zadaniem jest napisanie dla Alicji i Boba programu dekodującego otrzymane ciągi bit&oacute;w. Powiemy, że wiadomość <em>M</em>&nbsp;odpowiada ciągowi bit&oacute;w <em>B</em>, jeśli&nbsp;<em>B</em>&nbsp;i zakodowana wiadomość <em>M</em>&nbsp;są tej samej długości i r&oacute;żnią się co najwyżej wartością jednego bitu. Jeśli tylko jedna wiadomość odpowiada danemu ciągowi bit&oacute;w, to Tw&oacute;j program powinien ją wypisać. Jeśli nie ma takich wiadomości lub jest więcej niż jedna, program powinien o tym fakcie poinformować.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia ciągi bit&oacute;w odpowiadające kolejnym literom oraz ciągi bit&oacute;w do zdekodowania,</li>
	<li>dla każdego ciągu stwierdzi, czy da się go jednoznacznie, zdekodować i jeśli tak, to zdekoduje</li>
	<li>wypisze wyniki na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszej linii standardowego wejścia znajduje się liczba <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 26), oznaczająca liczbę wykorzystywanych liter. W każdym z kolejnych <em>n</em>&nbsp;wierszy znajduje się mała litera alfabetu angielskiego, spacja i odpowiadający tej literze ciąg bit&oacute;w (cyfr 0 i 1 bez spacji pomiędzy nimi). Każda litera jest wymieniona co najwyżej raz. Łączna długość ciąg&oacute;w bit&oacute;w nie przekracza 150. W następnym wierszu znajduje się liczba <em>m</em>&nbsp;(1 &le; <em>m</em> &le; 10), oznaczająca liczbę wiadomości do zdekodowania. W każdym z następnych&nbsp;<em>m</em>&nbsp;wierszy jest jedna wiadomość - ciąg cyfr 0 i 1 o długości nie większej niż 10 000&nbsp;bez rozdzielających spacji.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście wyniki dekodowania dla kolejnych wiadomości. Jeśli danemu ciągowi nie odpowiada żadna wiadomość, to należy wypisać w pojedynczym wierszu słowo&nbsp;<code>BLAD</code>, a jeśli więcej niż jedna, to komunikat&nbsp;<code>ZBYT WIELE</code>. Jeśli natomiast ciągowi odpowiada dokladnie jedna wiadomość, to w jednym wierszu powinno znaleźć się słowo&nbsp;<code>OK</code>, a w następnym - zdekodowana wiadomość.</p>