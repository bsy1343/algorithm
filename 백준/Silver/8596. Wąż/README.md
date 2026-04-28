# [Silver I] Wąż - 8596

[문제 링크](https://www.acmicpc.net/problem/8596)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 19, 맞힌 사람: 13, 정답 비율: 50.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Popularna gra w węża polega na wędr&oacute;wce tego gada po dwuwymiarowej planszy w spos&oacute;b pozwalający na zjedzenie maksymalnej liczby jabłek rozmieszczonych na polach tej planszy, tak jednak, aby głowa węża nie uderzyła w ścianę (czyli brzeg planszy) ani w ciało węża. Dodatkowym utrudnieniem jest fakt, że z każdym kolejno zjedzonym jabłkiem ciało węża wydłuża się.</p>

<p>Bajtek pisze właśnie własną wersję tej wspaniałej gry i potrzebuje Twojej pomocy. Potrzebny jest mu program, kt&oacute;ry dla danego przebiegu gry stwierdzi, w kt&oacute;rym momencie gra zostaje zakończona, czyli w kt&oacute;rym ruchu głowa węża uderzy w jego ciało bądź w ścianę.</p>

<p>Na początku wąż ma długość 1 (więc zajmuje tylko jedno pole planszy), jednak w momencie, gdy trafi na pole, na kt&oacute;rym znajduje się jabłko, wydłuża się o 1.</p>

<p>Każdy ruch rozpoczyna się od przesunięcia głowy węża. Jeżeli nowa pozycja leży poza planszą lub jest zajmowana przez ciało węża, to gra zostaje zakończona. Jeżeli natomiast na nowej pozycji głowy znajduje się jabłko, to zostaje ono zjedzone (czyli znika z planszy) i ruch jest zakończony. W przeciwnym wypadku przesuwany jest r&oacute;wnież ogon węża, tak aby wąż miał nadal tę samą długość.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się trzy liczby całkowite $n$, $m$&nbsp;oraz $r$&nbsp;($1 &le; n, m &le; 1\,000$, $0 &le; r &le; 1\,000\,000$) pooddzielane pojedynczymi odstępami, oznaczające odpowiednio liczbę wierszy i kolumn planszy oraz liczbę wykonanych ruch&oacute;w.</p>

<p>W drugim wierszu znajduje się jedna litera określająca kierunek, w kt&oacute;rym wąż rozpoczyna swoją wędr&oacute;wkę. Litera&nbsp;<code>N</code>&nbsp;oznacza kierunek p&oacute;łnocny, litera&nbsp;<code>S</code>&nbsp;- kierunek południowy,&nbsp;<code>W</code>&nbsp;- kierunek zachodni, zaś&nbsp;<code>E</code>&nbsp;- kierunek wschodni (patrz rysunek).</p>

<p>W następnych $n$&nbsp;wierszach znajduje się opis planszy. W $i$-tym z tych wierszy znajduje się $m$&nbsp;znak&oacute;w określających kolejne pola $i$-tego wiersza planszy. Kropka (<code>.</code>) oznacza puste pole, litera&nbsp;<code>W</code>&nbsp;- początkową pozycję węża, zaś litera&nbsp;<code>J</code>&nbsp;- pole, na kt&oacute;rym leży jabłko. Możesz założyć, że na planszy znajduje się dokładnie jedno pole oznaczone jako&nbsp;<code>W</code>.</p>

<p>W ostatnim wierszu znajduje się $r$&nbsp;liter pooddzielanych pojedynczymi odstępami, reprezentujących kolejne ruchy węża. Litera&nbsp;<code>N</code>&nbsp;oznacza ruch naprz&oacute;d, litera&nbsp;<code>L</code>&nbsp;oznacza skręt w lewo i przejście jednego pola naprz&oacute;d, natomiast litera&nbsp;<code>P</code>&nbsp;oznacza skręt w prawo i przejście jednego pola naprz&oacute;d.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8596.%E2%80%85W%C4%85%C5%BC/339d38d9.png" data-original-src="https://upload.acmicpc.net/6b684483-fc84-4bc4-9e0b-c05b65a0db64/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Możliwe początkowe kierunki ruchu węża.</p>

### 출력

<p>Jeżeli w żadnym z $r$&nbsp;ruch&oacute;w wąż nie uderzy ani w swoje ciało, ani w brzeg planszy, to Tw&oacute;j program powinien wypisać na standardowe wyjście jedno słowo &quot;<code>OK</code>&quot; (bez cudzysłow&oacute;w). W przeciwnym przypadku Tw&oacute;j program powinien wypisać na standardowe wyjście jedną liczbę całkowitą r&oacute;wną numerowi ruchu, kt&oacute;ry zakończy się uderzeniem głową węża w jego ciało lub w brzeg planszy (ruchy numerujemy od 1).</p>