# [Platinum I] Podatek - 8266

[문제 링크](https://www.acmicpc.net/problem/8266)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Władca kr&oacute;lestwa Bajtocji, podążając za og&oacute;lnoświatowym trendem, postanowił opodatkować wszystko, co się da. Ostatnio wprowadzoną daniną jest tzw.&nbsp;<i>podatek podr&oacute;żny</i>, kt&oacute;ry musi płacić każdy, kto przemieszcza się po kraju.</p>

<p>Każdej bajtockiej drodze przypisana jest pewna stawka podatku. Gdy podczas podr&oacute;ży po Bajtocji przejeżdżamy przez miasto, musimy zapłacić w tamtejszym urzędzie podatek, kt&oacute;ry obliczany jest jako&nbsp;<b>maksimum</b>&nbsp;ze stawki obowiązującej na drodze, kt&oacute;rą wjechaliśmy do miasta, oraz stawki na drodze, kt&oacute;rą z miasta wyjedziemy. Płaci się też w początkowym i docelowym mieście na trasie podr&oacute;ży - wtedy, obliczając podatek, bierze się pod uwagę tylko jedną drogę.</p>

<p>Tw&oacute;j przyjaciel Bajtazar wybiera się w podr&oacute;ż z Bajtowa do Bajtawy. Pom&oacute;ż mu tak zaplanować trasę przejazdu, żeby zapłacił jak najniższy podatek.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite <em>n</em>&nbsp;oraz <em>m</em>&nbsp;(2 &le; <em>n</em> &le; 100 000, 1 &le; <em>m</em> &le; 200 000), oznaczające odpowiednio liczbę miast oraz liczbę dr&oacute;g w Bajtocji. Miasta są ponumerowane liczbami od 1&nbsp;do&nbsp;<em>n</em>.</p>

<p>Kolejne <em>m</em>&nbsp;wierszy zawiera opisy dr&oacute;g: w <em>i</em>-tym z tych wierszy znajdują się trzy liczby całkowite <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, <em>c<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; n, <em>a<sub>i</sub></em> &ne; <em>b<sub>i</sub></em>, 1 &le; <em>c<sub>i</sub></em> &le; 1 000 000). Oznaczają one, że miasta <em>a<sub>i</sub></em>&nbsp;i <em>b<sub>i</sub></em>&nbsp;są połączone dwukierunkową drogą, na kt&oacute;rej obowiązująca stawka podatku wynosi <em>c<sub>i</sub></em>&nbsp;bajtalar&oacute;w. Pomiędzy dowolną parą miast istnieje co najwyżej jedna droga.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą - minimalny koszt podr&oacute;ży (w bajtalarach) z Bajtowa (miasta oznaczonego numerem 1) do Bajtawy (miasta oznaczonego numerem <em>n</em>). Możesz założyć, że zawsze istnieje ciąg dr&oacute;g łączący te miasta.</p>

### 힌트

<p>W powyższym przykładzie optymalna trasa wiedzie przez miasta 1, 3, 2&nbsp;oraz 4. Kolejno zapłacimy w nich podatek w wysokości 2, max(2, 1) = 2, max(1, 4) = 4&nbsp;oraz 4, co łącznie daje 12&nbsp;bajtalar&oacute;w.</p>