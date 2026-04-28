# [Gold III] Witraż - 8850

[문제 링크](https://www.acmicpc.net/problem/8850)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

조합론, 자료 구조, 유클리드 호제법, 기하학, 해시를 사용한 집합과 맵, 수학, 정수론, 정렬, 집합과 맵

### 문제 설명

<p>Pan Wincenty jest bardzo zadowolony, że udało mu się rozwiązać problem z ogrodem. Wolny czas, kt&oacute;rego nagle mu przybyło, może wykorzystać do realizacji swoich zainteresowań (kt&oacute;rych ma nadzwyczaj wiele). Na przykład - nasz bohater od dawna chciał&nbsp; sprawdzić się w trudnej sztuce projektowania witraży.</p>

<p>Pan Wincenty usiadł do biurka z oł&oacute;wkiem i linijką, przygotował<strong>&nbsp;</strong>arkusz brystolu i zaczął kreślić. Jego pierwszy witraż był dość prosty - składał się z N prostych linii poprowadzonych przez arkusz. Po zakończonej pracy domorosły witrażysta policzył, ile kawałk&oacute;w szkła będzie potrzebnych do zbudowania witraża (na ile kawałk&oacute;w jego proste podzieliły brystol). Z pewną dozą rozczarowania pan Wincenty stwierdził, że liczba kawałk&oacute;w kt&oacute;rą uzyskał jest niższa niżby chciał.&nbsp;<em>Może powinienem poprzesuwać linie w projekcie?</em>&nbsp;- zastanawiał się wpatrzony w rysunek.</p>

<p>Znając linie narysowane przez pana Wincentego oblicz maksymalną liczbę segment&oacute;w witraża, jaką można uzyskać dowolnie przesuwając podane proste.</p>

### 입력

<p>W pierwszym wierszu znajduje się jedna liczba naturalna N (1 &lt;= N &lt;= 200 000) - liczba linii w projekcie. Następnie następuje ich opis w N kolejnych wierszach.</p>

<p>Kążdą linię opisują podane kolejno (oddzielone spacjami) cztery liczby całkowite X1, Y1, X2, Y2 (-10000000 &lt;= X1, Y1, X2, Y2 &lt;= 10000000) oznaczające prostą przechodzącą przez punkty (X1,Y1) oraz (X2,Y2) - punkt (X1,Y1) danej linii będzie r&oacute;żny od jej punktu (X2,Y2).</p>

### 출력

<p>Opisana wyżej maksymalna liczba kawałk&oacute;w witraża.</p>