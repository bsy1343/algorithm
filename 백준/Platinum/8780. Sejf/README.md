# [Platinum IV] Sejf - 8780

[문제 링크](https://www.acmicpc.net/problem/8780)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 3, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>W dzisiejszych czasach nic, co leży na wierzchu, nie jest bezpieczne. Nie inaczej jest z kartami z Ukemonami Hektora, do kt&oacute;rego jutro przyjeżdża młodszy kuzyn Olek. Hektor, nie chcąc narażać długo zbieranej kolekcji na potencjalne ryzyko spotkania z kuzynem, postanowił zamknąć ją na czas wizyty Olka w specjalnie na tę okazję kupionym sejfie.</p>

<p>Zamek sejfu jest pokrętłem o kształcie koła z zaznaczonymi na nim prawoskrętnie liczbami kolejno od 1 do&nbsp;<strong>N</strong>, z liczbą 1 na samym szczycie. Pokrętło można obracać tylko na&nbsp;<strong>M</strong>&nbsp;z g&oacute;ry ustalonych sposob&oacute;w: o kilka pozycji w prawo lub kilka w lewo. Sejf otwiera się, gdy po dokładnie&nbsp;<strong>R</strong>&nbsp;obrotach na szczycie znajduje się liczba&nbsp;<strong>k</strong>. Hektor bada bezpieczeństwo posiadanego przez siebie sejfu, dlatego tak istotna jest dla niego informacja, ile r&oacute;żnych kombinacji kolejnych&nbsp;<strong>R</strong>&nbsp;obrot&oacute;w pozwala go otworzyć.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;(&nbsp;<strong>Z</strong>&nbsp;= 1 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera parę oddzielonych spacjami, opisanych w treści liczb naturalnych&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>&nbsp;( 1 &lt;=<strong>&nbsp;N</strong>,<strong>&nbsp;M</strong>&nbsp;&lt;= 2000 ). Następne&nbsp;<strong>M</strong>&nbsp;linii opisuje dopuszczalne obroty zamka sejfu. Każda linia opisująca obr&oacute;t składa się z jednej litery -&nbsp;<strong>L&nbsp;</strong>(lewo) lub&nbsp;<strong>P</strong>&nbsp;(prawo)<strong>&nbsp;</strong>- oznaczającej kierunek obrotu, oraz po spacji jednej liczby naturalnej&nbsp;<strong>x&nbsp;</strong>( 0 &lt;<strong>&nbsp;x</strong>&nbsp;&lt;&nbsp;<strong>n</strong>&nbsp;), oznaczającej jego zasięg. Każde dwa obroty są r&oacute;żne.</p>

<p>W następnej linii znajduje się liczba naturalna&nbsp;&nbsp;<strong>T</strong>&nbsp; ( 1 &lt;=&nbsp;<strong>T</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę r&oacute;żnych par liczb (<strong>R</strong>,&nbsp;<strong>k</strong>) do przetestowania. Każda z ostatnich&nbsp;<strong>T</strong>&nbsp;linii zawiera po dwie dodatnie liczby całkowite&nbsp;<strong>R</strong>&nbsp;( 1 &lt;=&nbsp;<strong>R</strong>&nbsp;&lt;= 10<sup>9</sup>&nbsp;) oraz&nbsp;<strong>k</strong>&nbsp;( 1 &lt;=&nbsp;<strong>k&nbsp;</strong>&lt;=&nbsp;<strong>N</strong>&nbsp;).</p>

### 출력

<p>Dla każdej pary danych (<strong>R</strong>,&nbsp;<strong>k</strong>) należy wypisać w osobnej linii jedną nieujemną liczbę całkowitą, będącą resztą z dzielenia liczby r&oacute;żnych kombinacji obrot&oacute;w otwierających sejf przez 1000033.</p>