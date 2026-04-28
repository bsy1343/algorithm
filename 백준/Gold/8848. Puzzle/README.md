# [Gold V] Puzzle - 8848

[문제 링크](https://www.acmicpc.net/problem/8848)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 20, 맞힌 사람: 18, 정답 비율: 85.714%

### 분류

브루트포스 알고리즘, 그래프 이론

### 문제 설명

<p>Po skończeniu codziennego grabienia liści, pan Wincenty postanowił zrelaksować się przy swojej ulubionej rozrywce - układaniu puzzli. Znalazł w szafce swojego biurka stary zestaw, i zabrał się do układania.</p>

<p>Po chwili wiedział już kt&oacute;ry kawałek pasuje do kt&oacute;rego oraz znał pierwsze dwa elementy pierwszego rzędu puzzli. Znał też - oczywiście, rozmiary obrazka. Czy ta wiedza wystarczy do jednoznacznego odtworzenia całej układanki?</p>

### 입력

<p>W pierwszej linii znajdują się dwie liczby naturalne N i M&nbsp; (3 &lt;= N &lt;= M, N*M &lt;= 1000), N oznacza liczbę wierszy układanki, M oznacza liczbę kolumn układanki.</p>

<p>Następnie w kolejnych N*M liniach znajduję się opisy kolejnych (od kawałka nr 1 do kawałka nr N*M) kawałk&oacute;w układanki. Każdy opis składa się dokładnie z czterech liczb całkowitych nieujemnych - numer&oacute;w kawałk&oacute;w, do kt&oacute;rych dany kawałek pasuje. Jeśli dany element leży na brzegu obrazka, to zamiast odpowiedniego sąsiada podawana jest liczba 0.</p>

<p>W ostatniej linii znajdują się dwie liczby naturalne A i B - numery, kolejno, dw&oacute;ch pierwszych element&oacute;w pierwszego rzędu układanki.</p>

### 출력

<p>Na wyjściu należy wypisać NIE w przypadku, gdy dla danych danych nie da się jednoznacznie określić rozwiązania układanki. W przeciwnym przypadku należy wypisać ułożoną układankę, w N kolejnych liniach, z kt&oacute;rych każda ma zawierać oddzielone spacjami M numer&oacute;w kolejnych element&oacute;w w danym rzędzie.</p>