# [Bronze III] Liczenie punktów - 26714

[문제 링크](https://www.acmicpc.net/problem/26714)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 339, 정답: 233, 맞힌 사람: 216, 정답 비율: 69.231%

### 분류

구현, 문자열

### 문제 설명

<p>Jury Potyczek Algorytmicznych jest zmęczone ciągłym liczeniem punkt&oacute;w dla wszystkich zgłoszeń. Pom&oacute;ż im zautomatyzować ten proces.</p>

<p>W każdym zadaniu można zdobyć od 0 do 10 punkt&oacute;w. Do pewnego zadania przygotowane jest n test&oacute;w, gdzie n jest podzielne przez 10. Jeśli rozwiązanie poprawnie rozwiąże wszystkie spośr&oacute;d pierwszych n/10 test&oacute;w, dostaje 1 punkt. Jeśli poprawnie rozwiąże kolejne n/10 test&oacute;w, r&oacute;wnież dostaje 1 punkt. Za każdą grupę n/10 test&oacute;w można niezależnie uzyskać 1 punkt, o ile poprawnie rozwiązane zostaną wszystkie testy z tej grupy. Jeśli zrobi się choć jeden błąd w grupie, nie uzyskuje się za tę grupę punktu.</p>

<p>Uwaga: Dla uproszczenia przyjmujemy, że każda grupa test&oacute;w zawiera tyle samo test&oacute;w. W rzeczywistym konkursie może to nie być prawdą.</p>

<p>Uwaga2: Każdy kod, kt&oacute;ry napiszesz, może być użyty przeciwko Tobie.<sup>&lowast;</sup></p>

<hr />
<p><sup>&lowast;</sup>Żarcik kosmonaucik.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się liczba całkowita n (10 &le; n &le; 100; n jest podzielne przez 10), oznaczająca liczbę test&oacute;w.</p>

<p>W drugim wierszu wejścia znajduje się napis złożony z n liter &lsquo;T&rsquo; lub &lsquo;N&rsquo;. Litera &lsquo;T&rsquo; oznacza, że dany test został rozwiązany poprawnie. Litera &lsquo;N&rsquo; oznacza, że nie został rozwiązany poprawnie.</p>

### 출력

<p>W jedynym wierszu standardowego wyjścia powinna znaleźć się jedna liczba całkowita r&oacute;wna liczbie uzyskanych punkt&oacute;w.</p>

### 힌트

<p>Wyjaśnienie przykładu: Rozwiązanie powinno uzyskać po jednym punkcie za poprawnie rozwiązane grupy numer 1, 3 i 10. Za częściowo rozwiązane grupy 4 i 5 nie zostają przydzielone żadne punkty.</p>