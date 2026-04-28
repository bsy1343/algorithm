# [Gold I] Butelki - 26706

[문제 링크](https://www.acmicpc.net/problem/26706)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Bajtabasz ma 3 butelki częściowo wypełnione oranżadą. Chciałby teraz, przelewając oranżadę z jednej butelki do drugiej, doprowadzić do sytuacji, w kt&oacute;rej w jednej z nich będzie dokładnie k bajtolitr&oacute;w oranżady. Ponieważ nie ma w domu wagi, jedyną dozwoloną operacją jest przelewanie oranżady pomiędzy dowolnymi dwoma butelkami &ndash; albo do momentu, gdy w butelce, z kt&oacute;rej przelewamy, skończy się oranżada, albo gdy butelka, do kt&oacute;rej przelewamy oranżadę, zapełni się. Nie wolno wylewać oranżady na ziemię &ndash; w końcu oranżada jest zbyt cenna! Bajtabasz nie może też dolewać do butelek nowej oranżady, spoza jego trzech butelek.</p>

<p>Bajtabasz zastanawia się teraz, dla każdego k, ilu minimalnie przelań oranżady potrzeba, aby w dowolnej butelce znalazło się dokładnie k bajtolitr&oacute;w oranżady. Liczy na to, że Tobie uda się to zrobić!</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite A, B, C (1 &le; A &le; B &le; C &le; 10<sup>5</sup>), oznaczające pojemności odpowiednio pierwszej, drugiej i trzeciej butelki w bajtolitrach.</p>

<p>W drugim wierszu wejścia znajdują się trzy liczby całkowite: a, b, c (0 &le; a &le; A, 0 &le; b &le; B, 0 &le; c &le; C), oznaczające, ile bajtolitr&oacute;w oranżady znajduje się na początku odpowiednio w pierwszej, drugiej i trzeciej butelce.</p>

### 출력

<p>Na wyjściu powinno znaleźć się C + 1 liczb całkowitych; i-ta z nich powinna oznaczać minimalną liczbę przelań oranżady, po kt&oacute;rych w kt&oacute;rejś z butelek może znaleźć się dokładnie i &minus; 1 bajtolitr&oacute;w oranżady, albo &minus;1, jeśli się nie da uzyskać danej objętości oranżady niezależnie od wykonywanych operacji.</p>

### 힌트

<p>Wyjaśnienie przykładu: Wynik dla 1, 3 i 6 bajtolitr&oacute;w to 0 &ndash; już na początku mamy butelki z tymi objętościami oranżady.</p>

<p>Żeby uzyskać 0 bajtolitr&oacute;w, wystarczy przelać oranżadę z pierwszej butelki do drugiej lub trzeciej butelki. Wtedy pierwsza butelka się opr&oacute;żni. Moglibyśmy też przelać oranżadę z drugiej do trzeciej butelki. Wtedy z kolei druga butelka stanie się pusta.</p>

<p>Żeby uzyskać 2 bajtolitry, wystarczy przelać oranżadę z drugiej lub trzeciej butelki do pierwszej. Wtedy w pierwszej butelce będą dokładnie 2 bajtolitry.</p>

<p>Żeby uzyskać 4 bajtolitry, wystarczy przelać oranżadę z pierwszej butelki do drugiej. Wtedy w drugiej butelce będą dokładnie 4 bajtolitry.</p>

<p>Żeby uzyskać 5 bajtolitr&oacute;w, wystarczy przelać oranżadę z trzeciej butelki do pierwszej. Wtedy w trzeciej butelce będzie dokładnie 5 bajtolitr&oacute;w.</p>

<p>Żeby uzyskać 7 bajtolitr&oacute;w, wystarczy przelać oranżadę z pierwszej butelki do trzeciej. Wtedy w trzeciej butelce będzie dokładnie 7 bajtolitr&oacute;w.</p>

<p>Żeby uzyskać 9 bajtolitr&oacute;w, wystarczy przelać oranżadę z drugiej butelki do trzeciej. Wtedy w trzeciej butelce będzie dokładnie 9 bajtolitr&oacute;w.</p>

<p>Uzyskanie 8 bajtolitr&oacute;w wymaga dw&oacute;ch przelań. Najpierw przelewamy oranżadę z drugiej butelki do trzeciej, a następnie z trzeciej do pierwszej. Wtedy w trzeciej butelce zostanie nam dokładnie 8 bajtolitr&oacute;w oranżady.</p>