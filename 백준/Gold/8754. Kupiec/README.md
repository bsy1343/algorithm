# [Gold III] Kupiec - 8754

[문제 링크](https://www.acmicpc.net/problem/8754)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>W Bajtlandii sieć dr&oacute;g między miastami jest taka, że między dwoma dowolnymi miastami istnieje dokładnie jedna droga (bezpośrednia lub pośrednia). Pewien kupiec przyjechał do Bajtlandii w celach zarobokowych. Pierwszego dnia chciałby zamieszkać w dowolnym mieście (miasto początkowe), a następnie udać się do wybranego miasta (miasto końcowe). Kupiec na drodze z jednego miasta do drugiego nie może dwa razy odwiedzić tego samego miasta, ze względu na przepisy prawne Bajtalndii. Chciałby jednak wybrać miasto początkowe i końcowe w taki spos&oacute;b, aby jego zarobek był jak największy.</p>

<p>Kupiec zarabia poruszając się pomiędzy miastami. Dla każdego bezpośredniego połączenia wiemy, ile bajtalar&oacute;w kupiec zarobi lub straci. Pom&oacute;ż wybrać kupcowi dwa miasta tak, aby jego zarobek był jak największy (w szczeg&oacute;lności miasto początkowe i końcowe może być tym samym miastem).</p>

### 입력

<p>W pierwszej linii wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 10<sup>6</sup>). W następnych <em>n</em> - 1&nbsp;wierszach po trzy liczby całkowite <em>a</em>, <em>b</em>, <em>x</em>&nbsp;(-10<sup>9</sup> &le; <em>x</em> &le; 10<sup>9</sup>), oznaczające, że istnieje bezpośrednie połączenie między miastami <em>a</em>&nbsp;i <em>b</em>, w kt&oacute;rym kupiec zarobi <em>x</em>&nbsp;bajtalar&oacute;w (ujemne&nbsp;<em>x</em>&nbsp;oznacza stratę kupca).</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna znaleźć się jedna liczba cakłkowita oznaczająca maksymalny zarobek kupca.</p>