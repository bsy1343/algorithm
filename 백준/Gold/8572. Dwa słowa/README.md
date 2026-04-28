# [Gold IV] Dwa słowa - 8572

[문제 링크](https://www.acmicpc.net/problem/8572)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 15, 맞힌 사람: 14, 정답 비율: 40.000%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Marcin osiągnął już wiek, w kt&oacute;rym zaczyna uczyć się sł&oacute;w. Dziwnym trafem (no, bo przecież nie w wyniku złośliwości rodzic&oacute;w) wszystkie słowa, jakie do tej pory poznał są tej samej długości. Gdyby znał słowa r&oacute;żnych długości m&oacute;głby bawić się w jedną z wielu zabaw, o kt&oacute;rych słyszał od starszych koleg&oacute;w. W tej chwili jednak nie pozostaje mu nic innego, jak zająć się jedyną możliwą rozrywką: zamianą liter.</p>

<p>Zabawa polega na tym, że Marcin na początku zapisuje dwa słowa, a potem wybiera po jednej literce z obu sł&oacute;w i... zamienia je miejscami. Po dokonanej zamianie pyta mamę, kt&oacute;re słowo jest p&oacute;źniejsze leksykograficznie (sam nawet nie wie, co to słowo oznacza). Mama zawsze bezbłędnie odpowiada na to pytanie, a Marcin kontynuuje swoją zabawę ze zmienionymi już słowami.</p>

<p>Niestety, mama Marcina jest ostatnio bardzo zajęta przygotowywaniem potraw świątecznych. Na szczęście Marcin zawsze może liczyć na swoje starsze rodzeństwo. Zapewne domyślasz się już, że Marcin jest Twoim bratem. Pom&oacute;ż mu i odpowiedz na jego pytania! Możesz też napisać program, kt&oacute;ry zrobi to za Ciebie.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 10^6$), oznaczającą długość sł&oacute;w.</p>

<p>Następne dwa wiersze zawierają po jednym słowie długości $n$&nbsp;składające się wyłącznie z małych liter alfabetu angielskiego. Pozycje liter w słowie ponumerowane są od $0$&nbsp;do $n-1$.</p>

<p>Następny wiersz zawiera jedną liczbę całkowitą $t$&nbsp;($1 &le; t &le; 10^5$), oznaczającą liczbę pytań Marcina.</p>

<p>W kolejnych $t$&nbsp;wierszach znajdują się po dwie liczby całkowite $a_i$&nbsp;i $b_i$, m&oacute;wiące, że przed $i$-tym pytaniem Marcin zamienił miejscami literę znajdującą się na pozycji $a_i$&nbsp;w pierwszym słowie i literę znajdującą się na pozycji $b_i$&nbsp;w drugim słowie.</p>

### 출력

<p>Standardowe wyjśce powinno zawierać dokładnie $t$&nbsp;wierszy. W każdym z nich powinna znajdować się odpowiedź na kolejne pytanie Marcina, zadane po zamianie liter:&nbsp;<code>0</code>, jeśli po zamianie słowa są r&oacute;wne,&nbsp;<code>1</code>, jeśli p&oacute;źniejsze leksykograficznie jest słowo pierwsze lub&nbsp;<code>2</code>, jeśli p&oacute;źniejsze leksykograficznie jest słowo drugie.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Po pierwszej zamianie pierwsze słowo ma postać&nbsp;<code>aabb</code>, a drugie&nbsp;<code>aaaa</code>, więc p&oacute;źniejsze leksykograficznie jest słowo pierwsze. Po drugiej zamianie oba słowa mają postać&nbsp;<code>aaba</code>.</p>